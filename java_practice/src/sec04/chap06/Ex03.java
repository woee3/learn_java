package sec04.chap06;

public class Ex03 {
    static void upTo5 (int start) {
        System.out.println(start);
        if (start < 5) {
            upTo5(++start);
        } else {
            System.out.println("-- 종료 --");
        }
    }

    public static void main(String[] args) {
        upTo5(0);
        upTo5(2);
        upTo5(4);
    }
}
