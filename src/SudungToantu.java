import java.util.Scanner;

public class SudungToantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Width");
        width = sc.nextFloat();
        System.out.println("Enter the Height");
        height = sc.nextFloat();
        float area = width*height;
        System.out.println("Area is"+area);
    }
}
