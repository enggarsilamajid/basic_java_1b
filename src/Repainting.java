import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nylon = Integer.parseInt(input.nextLine());
        int paint = Integer.parseInt(input.nextLine());
        int thinner = Integer.parseInt(input.nextLine());
        int hour = Integer.parseInt(input.nextLine());
        double cnylon = (2 + nylon) * 1.50;
        double cpaint = ((0.1 * paint) + paint) * 14.50;
        double cthinner = thinner * 5.00;
        double cbags = 0.40;
        double sum = cnylon + cpaint + cthinner + cbags;
        double cmast = hour * (0.3 * sum);
        double cost = sum + cmast;
        System.out.println(cost);
    }
}

//"total cost is %f USD",