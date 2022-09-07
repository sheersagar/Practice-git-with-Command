import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        while(testCase-->0){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int D = scanner.nextInt();
            int E = scanner.nextInt();

            if((A+B <= D || B+C <= D || A+C <= D) && (A <= E || B <= E || C <= E)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
