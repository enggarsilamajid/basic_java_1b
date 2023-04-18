import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double depo = Double.parseDouble(input.nextLine());
        int months = Integer.parseInt(input.nextLine());
        double rate = Double.parseDouble(input.nextLine());
        double amount = depo + months * ((depo * rate/100)/12);
        System.out.println(amount);
    }
}
