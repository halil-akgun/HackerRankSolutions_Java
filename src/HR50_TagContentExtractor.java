import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
In a tag-based language like XML or HTML, contents are enclosed between a start tag and
an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents
enclosed within sequences of well-organized tags meeting the following criterion:

1- The name of the start and end tags must be same. The HTML code <h1>Hello World</h2>
is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
2- Tags can be nested, but content between nested tags is considered not valid. For example,
in <h1><a>contents</a>invalid</h1>, 'contents' is valid but 'invalid' is not valid.
3- Tags can consist of any printable characters.

Sample Input
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

Sample Output
Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
 */
public class HR50_TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            extractValidTagContents(line).forEach(System.out::println);

            testCases--;
        }
    }

    public static List<String> extractValidTagContents(String input) {
        Stack<String> tags = new Stack<>();
        boolean isLastTagOpenOrClose = false;
        List<String> result = new ArrayList<>();
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                int a = input.indexOf('>', i);
                if (a == -1) break;
                if (input.charAt(i + 1) == '/') {
                    if (!isLastTagOpenOrClose && !content.isEmpty())
                        content.setLength(0);
                    if (tags.pop().equals(input.substring(i + 2, a))) {
                        if (!content.isEmpty()) result.add(content.toString());
                        content.setLength(0);
                        isLastTagOpenOrClose = false;
                    } else {
                        content.setLength(0);
                    }
                } else {
                    if (!content.isEmpty()) content.setLength(0);
                    tags.add(input.substring(i + 1, a));
                    isLastTagOpenOrClose = true;
                }
                i = a;
            } else if (isLastTagOpenOrClose && !tags.peek().isEmpty()) {
                content.append(input.charAt(i));
            }
        }
        if (result.isEmpty()) result.add("None");
        return result;
    }
}
