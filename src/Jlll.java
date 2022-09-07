import java.util.Scanner;

public class Jlll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        while (testCase-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int D = scanner.nextInt();
            int E = scanner.nextInt();

            if(A <= E ){
                if(B+C <= D){
                    System.out.println("Yes");
                }
            } else if(B <= E){
                if(A+C <= D){
                    System.out.println("Yes");
                }
            } else if(C <= E){
                if(A+B <= D){
                    System.out.println("Yes");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}


