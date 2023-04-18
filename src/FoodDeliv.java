import java.util.Scanner;

public class FoodDeliv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chicken = Integer.parseInt(input.nextLine());
        int fish = Integer.parseInt(input.nextLine());
        int veg = Integer.parseInt(input.nextLine());
        double cchick = chicken*10.35;
        double cfish = fish*12.40;
        double cveg = veg*8.15;
        double sum = cchick+cfish+cveg;
        double dess = 0.2*sum;
        double deliv = 2.50;
        double total = sum+dess+deliv;
        System.out.println(total);
    }
}

// "Total cost is %f USD",