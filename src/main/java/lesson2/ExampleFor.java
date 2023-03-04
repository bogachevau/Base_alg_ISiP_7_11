package lesson2;

public class ExampleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i; // sum = sum + i
            System.out.println("i = " + i + "  sum = " + sum);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + "  j = " + j);
            }
        }
    }
}
