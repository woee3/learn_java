import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();

        System.out.println(a == b ? "==" :
                a > b ? ">" : "<");

    }
}