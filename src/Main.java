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
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Задача 1. С помощью цикла for выведите в консоль все числа от 1 до 10
        for (int i = 1; i < 11; i++) {
        System.out.println("Число " + i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Задача 2. С помощью цикла for выведите в консоль все числа от 10 до 1
        for (int i = 10; i < 11 && i > 0; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Задача 3. Выведите в консоль все четные числа от 0 до 17.
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Число " + i);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Задача 4. Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int i = 10; i > -11; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Задача 5. Напишите программу, которая выводит в консоль все високосные года,
        // начиная с 1904 года до 2096
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Задача 6. ННапишите программу, которая выводит в консоль последовательность чисел:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("Число " + i);
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Задача 7. ННапишите программу, которая выводит в консоль последовательность чисел:
        // 1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println("Число " + i);
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Задача 8. Сумма накомплений
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
    }

    public static void task9 () {
        System.out.println("Задача 9");
        // Задача 9. Перепишите решение задачи выше.
        // При условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
    }

    public static void task10 () {
        System.out.println("Задача 10");
        // Задача 10. Напишите программу, которая выводит в консоль таблицу умножения на 2.
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
     }