public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

        public static void task1() {
            System.out.println("Задача 1");

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        double result;
        result = -1*(a * (b + (c - d * e)));
        System.out.println(result);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 5;
        int b = 7;
        a = b;
        b = a - 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int a = 567;
        int b = (a%100-a%10)/10;
        System.out.println(b);
        }
    }



