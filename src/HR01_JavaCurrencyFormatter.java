import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HR01_JavaCurrencyFormatter {
    public static void main(String[] args) {
        /*
        Sample Input
        12324.134

        Sample Output
        US: $12,324.13
        India: Rs.12,324.13
        China: ￥12,324.13
        France: 12 324,13 €
         */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


        // 2. yol

//        // decimal
//        Double paymentDbl = Double.valueOf(payment);
//        String paymentStr = Double.toString(paymentDbl);
//        String paymentArr[] = paymentStr.split("[.]");
//        String decimal = "";
//        if (paymentArr[1].length() == 1) {
//            decimal = paymentArr[1];
//            decimal += "0";
//        } else {
//            decimal = paymentArr[1].length() > 1 ?
//                    paymentArr[1].substring(0, 2) : paymentArr[1];
//        }
//
//        // before decimal
//        String nums[] = paymentArr[0].split("");
//        List<String> numsList = new ArrayList<>();
//        for (String w : nums) {
//            numsList.add(w);
//        }
//        List<String> numsUI = new ArrayList<>();
//        int a = numsList.size() % 3;
//        String temp = "";
//        for (int i = 0; i < a; i++) {
//            temp += numsList.get(i);
//        }
//        for (int i = 0; i < a; i++) {
//            numsList.remove(0);
//        }
//        numsUI.add(temp);
//        temp = "";
//
//        while (numsList.size() > 0) {
//            for (int i = 0; i < 3; i++) {
//                temp += numsList.get(i);
//            }
//            for (int i = 0; i < 3; i++) {
//                numsList.remove(0);
//            }
//            numsUI.add(temp);
//            temp = "";
//        }
//
//        String withComma = "";
//        String withoutComma = "";
//
//        for (String w : numsUI) {
//            withComma += w + ",";
//        }
//        for (String w : numsUI) {
//            withoutComma += w + " ";
//        }
//        withComma = withComma.substring(0, withComma.length() - 1);
//        withoutComma = withoutComma.substring(0, withoutComma.length() - 1);
//
//        // UI
//        System.out.println("US: $" + withComma + "." + decimal);
//        System.out.println("India: Rs." + withComma + "." + decimal);
//        System.out.println("China: ￥" + withComma + "." + decimal);
//        System.out.println("France: " + withoutComma + "," + decimal + " €");


    }
}
