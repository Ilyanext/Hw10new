import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void proverkaVisokos(int years) {
        int yearsVisokos = years % 4;
        int yearsVisokoshangred = years % 100;
        int yearsVisokoForeHangred = years % 400;
        if (yearsVisokos == 0 || yearsVisokoshangred == 0 && yearsVisokoForeHangred != 0) {
            vivod(years);
        } else {
            vivodNotVisokos(years);
        }
    }

    public static void vivod(int years) {
        System.out.println(years + " год является високосным");
    }

    public static void vivodNotVisokos(int years) {
        System.out.println(years + " год не является високосным");
    }

    public static void proverkaClientsOnLite(int yearsOS, int OS) {
        if (yearsOS <= 2015 && OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (yearsOS <= 2015 && OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void proverkaClientsOnHard(int yearsOS, int OS) {
        if (yearsOS > 2015 && OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (yearsOS > 2015 && OS == 1) {
            System.out.println("Установите версию приложения для Android по сслыке");
        }
    }

    public static void proverka(int deliveryDistance) {
        int oneday = 1;
        int twoday = 2;
        int threeday = 3;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + oneday);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + twoday);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + threeday);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        }
    }

    public static void proverkaTwoDay(int twoDay) {
        int two = 1;
        if (twoDay > 20 && twoDay <= 60) {
            System.out.println("Потребуется дней: " + two);
        }
    }

    public static void proverkaThreeDay(int threeDay) {
        int three = 1;
        if (threeDay > 60 && threeDay <= 100) {
            System.out.println("Потребуется дней: " + three);
        }
    }

    public static void task1() {
        int years = 2023;
        proverkaVisokos(years);
    }

    public static void task2() {
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        proverkaClientsOnLite(currentYear, clientOS);
        proverkaClientsOnHard(currentYear, clientOS);

    }

    public static void task3() {
        int deliveryDistance = 95;
        proverka(deliveryDistance);
    }
}

