import java.util.Scanner;

public class String_Coding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

//        int testCase = 1;
        while (testCase-- > 0) {
            int N = sc.nextInt();
//            int N = 9;
            String input = sc.next();
            StringBuilder sb = new StringBuilder(input);
            for (int i = 0; i < N - 1; i = i + 2) {

                int first = i;
                int second = i + 1;

                char a = sb.charAt(i);
                char b = sb.charAt(i + 1);

                sb.setCharAt(first, b);
                sb.setCharAt(second, a);

            }
            for (int j = 0; j < N; j++) {
                if (sb.charAt(j) == 'a') {
                    sb.setCharAt(j, 'z');
                } else if (sb.charAt(j) == 'b') {
                    sb.setCharAt(j, 'y');
                } else if (sb.charAt(j) == 'c') {
                    sb.setCharAt(j, 'x');
                } else if (sb.charAt(j) == 'd') {
                    sb.setCharAt(j, 'w');
                } else if (sb.charAt(j) == 'e') {
                    sb.setCharAt(j, 'v');
                } else if (sb.charAt(j) == 'f') {
                    sb.setCharAt(j, 'u');
                } else if (sb.charAt(j) == 'g') {
                    sb.setCharAt(j, 't');
                } else if (sb.charAt(j) == 'h') {
                    sb.setCharAt(j, 's');
                } else if (sb.charAt(j) == 'i') {
                    sb.setCharAt(j, 'r');
                } else if (sb.charAt(j) == 'j') {
                    sb.setCharAt(j, 'q');
                } else if (sb.charAt(j) == 'k') {
                    sb.setCharAt(j, 'p');
                } else if (sb.charAt(j) == 'l') {
                    sb.setCharAt(j, 'o');
                } else if (sb.charAt(j) == 'm') {
                    sb.setCharAt(j, 'n');
                } else if (sb.charAt(j) == 'n') {
                    sb.setCharAt(j, 'm');
                } else if (sb.charAt(j) == 'o') {
                    sb.setCharAt(j, 'l');
                } else if (sb.charAt(j) == 'p') {
                    sb.setCharAt(j, 'k');
                } else if (sb.charAt(j) == 'q') {
                    sb.setCharAt(j, 'j');
                } else if (sb.charAt(j) == 'r') {
                    sb.setCharAt(j, 'i');
                } else if (sb.charAt(j) == 's') {
                    sb.setCharAt(j, 'h');
                } else if (sb.charAt(j) == 't') {
                    sb.setCharAt(j, 'g');
                } else if (sb.charAt(j) == 'u') {
                    sb.setCharAt(j, 'f');
                } else if (sb.charAt(j) == 'v') {
                    sb.setCharAt(j, 'e');
                } else if (sb.charAt(j) == 'w') {
                    sb.setCharAt(j, 'd');
                } else if (sb.charAt(j) == 'x') {
                    sb.setCharAt(j, 'c');
                } else if (sb.charAt(j) == 'y') {
                    sb.setCharAt(j, 'b');
                } else if (sb.charAt(j) == 'z') {
                    sb.setCharAt(j, 'a');
                }
            } System.out.println(sb);
        }

    }
}
