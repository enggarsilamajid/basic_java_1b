import java.util.Scanner;

public class Supplies {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pen = Integer.parseInt(input.nextLine());
        int mark = Integer.parseInt(input.nextLine());
        int dete = Integer.parseInt(input.nextLine());
        int percent = Integer.parseInt(input.nextLine());
        double bpen = pen * 5.80;
        double bmark = mark * 7.20;
        double bdete = dete * 1.20;
        double total = bpen + bmark + bdete;
        double disc = percent/100.00;
        double re = disc * total;
        double bill = total - re;
        System.out.println(bill);
    }
}

// "Total bill of pens is %f USD" +
//                "%n Total bill of markers is %f USD" +
//                "%n Total bill of detergen is %f USD" +
//                "%n The discount is %f USD" +
//                "%n so the total to be pay is %f USD", bpen, bmark, bdete, re,