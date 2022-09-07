import java.util.Scanner;

public class Lj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase--> 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

           if(N % 2 == 0){
               System.out.println("Yes");
           } else if(X % 2 != 0 && N % 2 != 0){
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
        }
    }
}
