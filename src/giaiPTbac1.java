import java.util.Scanner;

public class giaiPTbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a!=0){
            double answer = (c-b)/a;
            System.out.printf("nghiệm của PT x: "+answer);
        }else
                if (b==0){
                    System.out.printf("PT Vô Số Nghiệm");
                }else {
                    System.out.print("PT Vô nghiệm");
                }



    }
}
