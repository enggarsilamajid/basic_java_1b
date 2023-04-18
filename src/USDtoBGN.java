import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dollar = Double.parseDouble(input.nextLine());
        double bgn = dollar * 1.79549;
        System.out.printf("%.5f USD = %.5f BGN", dollar, bgn);
    }
}
