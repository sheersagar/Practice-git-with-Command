public class Char_to_String {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();

        int t = 1;

        while(t-->0){
//            int n = scan.nextInt();
            int n = 9;
//            String s = scan.next();
            String s = "sharechat";
            char[]c = s.toCharArray();

            for(int i=0;i<n;i++) {
                if (i == n - 1){
                    c[i] = c[i];
                }else {
                    char temp = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = temp;
                }
                i++;
            }
            for(int j=0;j<n;j++){
                c[j] = (char) ('z'+'a' - c[j]);
            }
            for(char x:c)
                System.out.print(x);
            System.out.println();

        }
    }
}
