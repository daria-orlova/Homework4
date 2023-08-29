import java.util.Scanner;
// вводить только числовые значения
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ЗАДАЧА 1");
        System.out.print("Введите ваш возраст: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Вы являетесь совершеннолетним человеком");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил");
        }

        System.out.println("ЗАДАЧА 2");
        System.out.print("Введите температуру: ");
        int temperature = scan.nextInt();
        if (temperature < 5) {
            System.out.println("На улице холодно, " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("ЗАДАЧА 3");
        System.out.print("Введите скорость: ");
        int speed = scan.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км в час, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км в час, то можно ездить спокойно");
        }

        System.out.println("ЗАДАЧА 4");
        System.out.print("Введите возраст: ");
        age = scan.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("В этом возрасте человек обычно ходит в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("В этом возрасте человек обычно ходит в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("В этом возрасте человек обычно ходит в университет");
        } else if (age > 24) {
            System.out.println("В этом возрасте человек обычно ходит на работу");
        } else {
            System.out.println("Это совсем малыш, в таком возрасте он проводит время с мамой");
        }

        System.out.println("ЗАДАЧА 5");
        System.out.print("Введите возраст: ");
        age = scan.nextInt();
        if (age >= 5 && age <= 14) {
            System.out.println("Можно кататься на аттракционе только в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Нельзя кататься на аттракционе");
        }

        System.out.println("ЗАДАЧА 6");
        int places = 102;
        int seatingPlaces = 60;
        int standingPlaces = places - seatingPlaces;
        System.out.print("Введите количество занятых сидячих мест: ");
        int occupiedSeatingPlaces = scan.nextInt();
        System.out.print("Введите количество занятых стоячих мест: ");
        int occupiedStandingPlaces = scan.nextInt();
        int freeSeatingPlaces = seatingPlaces - occupiedSeatingPlaces;
        int freeStandingPlaces = standingPlaces - occupiedStandingPlaces;
        if (occupiedSeatingPlaces < seatingPlaces || occupiedStandingPlaces < standingPlaces) {
            System.out.println("В вагоне есть места, средни них " + freeSeatingPlaces + " сидячих и " + freeStandingPlaces + " стоячих");
        } else {
            System.out.println("В вагоне нет мест");
        }

        System.out.println("ЗАДАЧА 7");
        System.out.print("Введите первое число: ");
        int one = scan.nextInt();
        System.out.print("Введите второе число: ");
        int two = scan.nextInt();
        System.out.print("Введите третье число: ");
        int three = scan.nextInt();
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }
    }
}
