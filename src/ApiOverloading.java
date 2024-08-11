public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");

        int max = maxValue(7, 9);
        System.out.println("max = " + max);

        int min = minValue(7, 9);
        System.out.println("min = " + min);
    }

    //두개의 정수를 매개변수로 받아서 더 큰수를 리턴하는 메서드를 정의
    public static int maxValue(int a, int b) {
        return (a > b) ? a : b;


    }

    //두개의 정수를 매개변수로 받아서 더 작은 수를 리턴하는 메서드
    public static int minValue(int a, int b) {
        return (a < b) ? a : b;
    }
}
