import java.util.Scanner;

public class HomeWN2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        try {
            String choice;
            char ch;
            double d1, d2;
            // Английская раскладка
            System.out.println("Выбери один из способов арифметики ниже:");
            System.out.println("A. Сложение\tS. Вычитание\tM. Умножение\tD. Деление");

            choice = s.nextLine();
            ch = choice.charAt(0);
            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 's' || ch == 'm' || ch == 'd') {
                System.out.println("Первое число: ");
                d1 = s.nextDouble();
                System.out.println("Второе число: ");
                d2 = s.nextDouble();

                // Начало операнда
                switch (ch) {
                    case 'A':
                    case 'a':
                        System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
                        break;
                    case 'S':
                    case 's':
                        System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
                        break;
                    case 'M':
                    case 'm':
                        System.out.println(d1 + " x " + d2 + " = " + (d1 * d2));
                        break;
                    case 'D':
                    case 'd':
                        System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
                        break;
                    default:
                        System.out.println("Ошибка. Только A, S, M, или D.");
                } // Конец свитча

            } else {
                System.out.println("Ошибка. Только A, S, M, или D.\n");
            }
        } finally {
            s.close();
        }
    }
}
