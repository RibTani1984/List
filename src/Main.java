import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> purchase = new ArrayList<>();

        while (true) {
            System.out.println("Выберите одну из операций: 1. Добавить, 2. Показать, 3. Удалить");
            Integer number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    String s = scanner.nextLine();
                    purchase.add(scanner.next());
                    System.out.println("Итого в списке покупок в количестве: " + purchase.size());
                    break;
                case 2:
                    System.out.println("Список покупок: ");
                    for (int i = 0; i < purchase.size(); i++) {
                        System.out.println((i + 1) + ") " + purchase.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Список покупок: ");
                    for (int i = 0; i < purchase.size(); i++) {
                        System.out.println((i + 1) + ") " + purchase.get(i));
                    }
                    System.out.println("Какую покупку вы хотели бы удалить? (Введите номер или название.)");
                    scanner.nextLine();
                    s = scanner.nextLine();
                    try {
                        int b = Integer.parseInt(s);
                        purchase.remove(b - 1);
                    } catch (NumberFormatException e) {
                        purchase.remove(s);
                    }
                    System.out.println("Покупка " + purchase.size() + " удалена, список покупок: ");
                    for (int i = 0; i < purchase.size(); i++) {
                        System.out.println((i + 1) + ". " + purchase.get(i));
                    }
                    break;
                default:
                    System.out.println("Данной операции нет" + "\n");
            }
        }
    }
}



