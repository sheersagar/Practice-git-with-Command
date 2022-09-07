import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextInt();
        double B = scanner.nextInt();
        double result = 0;
        String C = scanner.next();

        if(Objects.equals(C, "/")){
            result = (float) A/B;
        }
        if (Objects.equals(C,"*")){
            result = A*B;
        }
        if(Objects.equals(C,"-")){
            result = A-B;
        }
        if(Objects.equals(C,"+")){
            result = A+B;
        }
        System.out.println(result);

    }
}