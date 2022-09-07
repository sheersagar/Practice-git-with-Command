import java.util.Scanner;

public class Chef_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            int testCase = scanner.nextInt();


            while (testCase-- > 0) {
                int N = scanner.nextInt();
                String input = scanner.next();

                for(int i = 0; i < input.length()-1;){

                    i = i + 2 ;
                    System.out.println(input);
                }

            }

    }
}
