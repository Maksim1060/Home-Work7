public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        int deposit = 2459000;
        int salary = 15000;
        int total = 0;
        int i = 0;

        while (total <= deposit) {
            total += salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int t = 10; t > 0; t--) {
            System.out.print(t + " ");

        }
        System.out.println(" ");

    }


    public static void task3() {
        System.out.println("Задача 3 ");
        int population = 12_000_000;
        int birthRate = 17;
        int death = 8;
        int dif = birthRate - death;
        for (int i = 1; i <= 10; i = i + 1) {
            population += population * dif / 1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int goal = 12000000;
        int deposit = 15000;
        int procent = 7;
        int mounth = 1;
        while (deposit <= goal) {
            System.out.println("Месяц " + mounth + " сумма накоплений " + deposit + " рублей");
            deposit += deposit * procent / 100;
            mounth++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5 ");
        int goal = 12000000;
        int deposit = 15000;
        int procent = 7;
        int mounth = 0;
        while (deposit <= goal) {
            deposit += deposit * procent / 100;
            mounth++;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " сумма накоплений " + deposit + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача6 ");
        int deposit = 15000;
        int procent = 7;
        int year = 9;
        int mounth = 0;
        while (mounth <= year * 12) {
            deposit += deposit * procent / 100;
            mounth++;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " сумма накоплений " + deposit + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7  ");
        int friday = 6;
        int mounthDay = 31;
        while (friday<=mounthDay){
            System.out.println("Сегодня пятница,"+ friday+" число.необходимо подготовить отчет ");
            friday+= 7;

        }
    }

    public static void task8() {
        System.out.println("Задача 8 ");
        int yearToDay =2023;
        for (int year= yearToDay-200; year<=yearToDay +100; year++){
            if (year%79==0){
                System.out.println(year);
            }
        }

    }

}






