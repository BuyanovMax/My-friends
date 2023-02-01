public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {


        System.out.println("Задача 1");

        int age = 19;
        double salary = 45_000;
        double creditLimit;

        if (age >= 23) {
            creditLimit = salary * 3;
        } else {
            creditLimit = salary * 2;
        }
        if (salary >= 50_000 && salary < 80_000) {
            creditLimit = creditLimit * 1.2;

        } else if (salary >= 80_000) {
            creditLimit = creditLimit * 1.5;

        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");


    }

    public static void task2() {
        System.out.println("Задача 2");
        int age = 25;
        double salary = 90_000;
        double wantedSum = 220_000;
        double baseBid = 10;
        int term = 12;
        double maxPayment = salary * 0.5;


        if (salary > 80_000) {
            baseBid = baseBid - 0.7;
        }
        if (age < 23) {
            baseBid = baseBid + 1;
        } else if (age >= 23 && age < 30) {
            baseBid = baseBid + 0.5;
        }

        double payment = wantedSum / term + ((wantedSum * baseBid / 100) / term);
        if (maxPayment >= payment) {
            System.out.println("«Максимальный платеж при ЗП " + salary + " равен "
                    + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
        } else {
            System.out.println("Кредит отказан");
        }
    }
}




