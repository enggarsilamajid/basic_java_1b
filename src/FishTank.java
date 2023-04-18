import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Lcm = Integer.parseInt(input.nextLine());
        int Wcm = Integer.parseInt(input.nextLine());
        int Hcm = Integer.parseInt(input.nextLine());
        double percent = Double.parseDouble(input.nextLine());
        double volcm = Lcm*Wcm*Hcm;
        double vollit = volcm/1000;
        double space = percent/100;
        double liter = vollit*(1-space);
        System.out.println(liter);
    }
}

// System.out.println(vollit);
// "liters required is %f liters",