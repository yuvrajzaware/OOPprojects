import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("enter no 1");
            int a = scanner.nextInt();

            System.out.println("enter no 2");
            int b = scanner.nextInt();

            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Multi");
            System.out.println("4.Div");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            int ch = scanner.nextInt();

            if (ch == 5) {
                break;
            }

            int c;
            switch (ch) {
                case 1:
                    c = a + b;
                    System.out.println("ADD=" + c);
                    break;
                case 2:
                    c = a - b;
                    System.out.println("SUB=" + c);
                    break;
                case 3:
                    c = a * b;
                    System.out.println("MUL=" + c);
                    break;
                case 4:
                    c = a / b;
                    System.out.println("DIV=" + c);
                    break;
                default:
                    System.out.println("Invalid Choice"); 
                    break;   
            }
        }
    }
}

