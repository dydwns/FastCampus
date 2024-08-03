public class CharTest {
    public static void main(String[] args) {

        char c = 'A';
        System.out.println("c = " + c);

        int a = 'A';
        System.out.println("a = " + a);

        int b = 'B' + 1;
        System.out.println("b = " + (char) b);

        char han = '가';
        System.out.println("han = " + han);

        int hnaD = '가';
        System.out.println("hnaD = " + hnaD);

        char upper = 'A';
        char lower = (char) (upper + 32);
        System.out.println("lower = " + lower);

        char lower1 = 'u';
        int upper1 = lower1 - 32;
        System.out.println("upper1 = " + (char)upper1);

        int data = '1' +'2';
        System.out.println("data = " + data);

        char i = '1';
        char j = '2';
        int  sum = i+j;
        System.out.println("sum = " + sum);

    }
}
