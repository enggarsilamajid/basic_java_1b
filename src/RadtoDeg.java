import java.util.Scanner;

public class RadtoDeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radian = Double.parseDouble(input.nextLine());
        double degree = radian * 180 / Math.PI;
        System.out.println(degree);
    }
}

//"%f radian =