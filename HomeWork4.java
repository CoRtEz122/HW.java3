import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.kerberos.KeyTab;

public class HomeWork4 {

    public static void main(String[] args) {

        // Реализовать консольное приложение - телефонный справочник.
        // У одной фамилии может быть несколько номеров.
        // Пользователь может вводить команды:
        // 1. ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый
        // аргумент - фамилия, второй - номер телефона
        // 2. GET Ivanov - получить список всех номеров по фамилии
        // 3. REMOVE Ivanov - удалить все номера по фамилии
        // 4. LIST - Посмотреть все записи
        // 5. EXIT - Завершить программу
        // Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом

        // Пример взаимодействия (=> - это вывод на консоль):
        // ADD Ivanov 8 800 555 35 35
        // ADD Ivanov 8 800 100 10 10
        // GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
        // ADD Petrov 8 555 12 34
        // LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
        // REMOVE Ivanov
        // LIST => Petrov = [8 555 12 34]
        // GET NoName => Не найдена запись с фамилией "NoName"
        // REMOVE NoName => Не найдена запись с фамилией "NoName"

        HashMap<String, String> map = new HashMap<>();

        while (true) {

            System.out.println("");

            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            String[] result = command.split(" ");
            String request = result[0];

            if ("EXIT".equals(command)) {

                System.exit(0);

            }

            else if ("ADD".equals(request)) {

                String key = result[1];
                String value = result[2];

                map.put(key, value);

                System.out.println("Запись о пользователе " + key + " сохранена");

            }

            else if ("REMOVE".equals(request)) {

                String key = result[1];

                Boolean error = map.containsKey(key);

                if (error == false) {

                    System.out.println("Не найдена запись с фамилией " + result[1]);

                } else {

                    map.remove(result[1]);

                    System.out.println("номера пользователя " + result[1] + " удалены.");
                }
            }

            else if ("GET".equals(request)) {

                String key = result[1];

                Boolean error = map.containsKey(key);

                if (error == false) {

                    System.out.println("Не найдена запись с фамилией " + result[1]);

                } else {

                    String value = map.get(result[1]);
                    System.out.println(result[1] + ": " + value);
                }

            }

            else if ("LIST".equals(request)) {

                System.out.println(map);

            }

            

        }
    }

}
