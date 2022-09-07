import java.util.Arrays;
import java.util.Scanner;
public class Encoding_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int testCase = scanner.nextInt();

        int testCase = 1;
        while (testCase-- > 0) {
//            int N = scanner.nextInt();
            int N = 4;
//            String S = scanner.next();

            Character[] arr = new Character[N];
            String S = "chef";

            for (int i = 0; i < N - 1; i = i + 2) {


                char a = S.charAt(i);
                char b = S.charAt(i + 1);
                char temp = a;
                a = b;
                b = temp;

                switch (a){
                    case 'a':
                        a = 'z';
                        break;
                    case 'b':
                        a = 'y';
                        break;
                    case 'c':
                        a = 'x';
                        break;
                    case 'd':
                        a = 'w';
                        break;
                    case 'e':
                        a = 'v';
                        break;
                    case 'f':
                        a = 'u';
                        break;
                    case 'g':
                        a = 't';
                        break;
                    case 'h':
                        a = 's';
                        break;
                    case 'i':
                        a = 'r';
                        break;
                    case 'j':
                        a = 'q';
                        break;
                    case 'k':
                        a = 'p';
                        break;
                    case 'l':
                        a = 'o';
                        break;
                    case 'm':
                        a = 'n';
                        break;
                    case 'n':
                        a = 'm';
                        break;
                    case 'o':
                        a = 'l';
                        break;
                    case 'p':
                        a = 'k';
                        break;
                    case 'q':
                        a = 'j';
                        break;
                    case 'r':
                        a = 'i';
                        break;
                    case 's':
                        a = 'h';
                        break;
                    case 't':
                        a = 'g';
                        break;
                    case 'u':
                        a = 'f';
                        break;
                    case 'v':
                        a = 'e';
                        break;
                    case 'w':
                        a = 'd';
                        break;
                    case 'x':
                        a = 'c';
                        break;
                    case 'y':
                        a = 'b';
                        break;
                    case 'z':
                        a = 'a';
                        break;
                }
                switch (b){
                    case 'a':
                        b = 'z';
                        break;
                    case 'b':
                        b = 'y';
                        break;
                    case 'c':
                        b = 'x';
                        break;
                    case 'd':
                        b = 'w';
                        break;
                    case 'e':
                        b = 'v';
                        break;
                    case 'f':
                        b = 'u';
                        break;
                    case 'g':
                        b = 't';
                        break;
                    case 'h':
                        b = 's';
                        break;
                    case 'i':
                        b = 'r';
                        break;
                    case 'j':
                        b = 'q';
                        break;
                    case 'k':
                        b = 'p';
                        break;
                    case 'l':
                        b = 'o';
                        break;
                    case 'm':
                        b = 'n';
                        break;
                    case 'n':
                        b = 'm';
                        break;
                    case 'o':
                        b = 'l';
                        break;
                    case 'p':
                        b = 'k';
                        break;
                    case 'q':
                        b = 'j';
                        break;
                    case 'r':
                        b = 'i';
                        break;
                    case 's':
                        b = 'h';
                        break;
                    case 't':
                        b = 'g';
                        break;
                    case 'u':
                        b = 'f';
                        break;
                    case 'v':
                        b = 'e';
                        break;
                    case 'w':
                        b = 'd';
                        break;
                    case 'x':
                        b = 'c';
                        break;
                    case 'y':
                        b = 'b';
                        break;
                    case 'z':
                        b = 'a';
                        break;
                }

                arr[i] = a;
                arr[i + 1] = b;

                if(N % 2 != 0) {
                    char c = S.charAt(N-1);
                    switch (c){
                        case 'a':
                            c = 'z';
                            break;
                        case 'b':
                            c = 'y';
                            break;
                        case 'c':
                            c = 'x';
                            break;
                        case 'd':
                            c = 'w';
                            break;
                        case 'e':
                            c = 'v';
                            break;
                        case 'f':
                            c = 'u';
                            break;
                        case 'g':
                            c = 't';
                            break;
                        case 'h':
                            c = 's';
                            break;
                        case 'i':
                            c = 'r';
                            break;
                        case 'j':
                            c = 'q';
                            break;
                        case 'k':
                            c = 'p';
                            break;
                        case 'l':
                            c = 'o';
                            break;
                        case 'm':
                            c = 'n';
                            break;
                        case 'n':
                            c = 'm';
                            break;
                        case 'o':
                            c = 'l';
                            break;
                        case 'p':
                            c = 'k';
                            break;
                        case 'q':
                            c = 'j';
                            break;
                        case 'r':
                            c = 'i';
                            break;
                        case 's':
                            c = 'h';
                            break;
                        case 't':
                            c = 'g';
                            break;
                        case 'u':
                            c = 'f';
                            break;
                        case 'v':
                            c = 'e';
                            break;
                        case 'w':
                            c = 'd';
                            break;
                        case 'x':
                            c = 'c';
                            break;
                        case 'y':
                            c = 'b';
                            break;
                        case 'z':
                            c = 'a';
                            break;
                    }
                    arr[N - 1] = c;
                }
            }
            System.out.println(Arrays.toString(arr));
            String mm = (String) (Arrays.toString(arr));
            System.out.println(mm);
        }
    }
}
