import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fee = Integer.parseInt(input.nextLine());
        double csneak = fee-(fee*0.4);
        double coutfit = csneak-(csneak*0.2);
        double cball = coutfit*0.25;
        double cacc = cball*0.2;
        double total = fee+csneak+coutfit+cball+cacc;
        System.out.println(total);
    }
}

// "The total price is %f USD",