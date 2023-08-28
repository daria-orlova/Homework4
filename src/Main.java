import java.util.Scanner;
// вводить только числовые значения
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ЗАДАЧА 1");
        System.out.print("Введите ваш возраст: ");
        Integer age1 = Integer.parseInt(scan.nextLine());
        if (age1 >= 18) {
            System.out.println("Вы являетесь совершеннолетним человеком");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил");
        }

        System.out.println("ЗАДАЧА 2");
        System.out.print("Введите температуру: ");
        Integer temperature2 = Integer.parseInt(scan.nextLine());
        if (temperature2 < 5) {
            System.out.println("На улице холодно, " + temperature2 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, " + temperature2 + " градусов, можно идти без шапки");
        }

        System.out.println("ЗАДАЧА 3");
        System.out.print("Введите скорость: ");
        Integer speed3 = Integer.parseInt(scan.nextLine());
        if (speed3 > 60) {
            System.out.println("Если скорость " + speed3 + " км в час, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed3 + " км в час, то можно ездить спокойно");
        }

        System.out.println("ЗАДАЧА 4");
        System.out.print("Введите возраст: ");
        Integer age4 = Integer.parseInt(scan.nextLine());
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("В этом возрасте человек обычно ходит в детский сад");
        } else if (age4 >= 7 && age4 <= 18) {
            System.out.println("В этом возрасте человек обычно ходит в школу");
        } else if (age4 > 18 && age4 <= 24) {
            System.out.println("В этом возрасте человек обычно ходит в университет");
        } else if (age4 > 24) {
            System.out.println("В этом возрасте человек обычно ходит на работу");
        } else {
            System.out.println("Это совсем малыш, в таком возрасте он проводит время с мамой");
        }

        System.out.println("ЗАДАЧА 5");
        System.out.print("Введите возраст: ");
        Integer age5 = Integer.parseInt(scan.nextLine());
        if (age5 >= 5 && age5 <= 14) {
            System.out.println("Можно кататься на аттракционе только в сопровождении взрослого");
        } else if (age5 > 14) {
            System.out.println("Можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Нельзя кататься на аттракционе");
        }

        System.out.println("ЗАДАЧА 6");
        System.out.print("Введите количество занятых мест: ");
        Integer place6 = Integer.parseInt(scan.nextLine());
        if (place6 < 60) {
            System.out.println("В вагоне есть место для сидения");
        } else if (place6 >= 60 && place6 < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне нет мест");
        }

        System.out.println("ЗАДАЧА 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число one");
        } else if (two > one && two > three) {
            System.out.println("Самое большое число two");
        } else {
            System.out.println("Самое большое число three");
        }
    }
}