import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pages = Integer.parseInt(input.nextLine());
        int phour = Integer.parseInt(input.nextLine());
        int day = Integer.parseInt(input.nextLine());
        int tread = pages / phour;
        int thour = tread / day;
        System.out.println(thour);
    }
}

// "Time spent per day to read book is %d hours",