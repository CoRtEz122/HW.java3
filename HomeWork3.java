
import java.io.BufferedInputStream;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class HomeWork3 {

    // Реализовать консольное приложение, которое:
    // 1. Принимает от пользователя и “запоминает” строки.
    // 2. Если введено print, выводит строки так, чтобы последняя введенная была
    // первой в списке, а первая - последней.
    // 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
    // 4. Если введено exit, то программа завершается

    // > - ввод в консоль (stdin), < - вывод на консоль (stdout)
    // > java
    // > python
    // > c#
    // > print
    // < [c#, python, java]
    // > revert
    // > print
    // < [python, java]
    // > revert
    // > revert
    // > print
    // < []
    // > revert -> throw new NoSuchElementException
    public static void main(String[] args) {

        List<String> storage = new ArrayList();
        List<String> revstorage = new ArrayList();

        while (true) {

            Scanner scanner = new Scanner(System.in);

            String command = scanner.nextLine();

            if ("exit".equals(command)) {

                System.exit(0);

            }

            else if ("print".equals(command)) {

                // for (int i = storage.size()-1; i >= 0; i--) {

                //     revstorage.add(storage.get(i));

                // }
                 System.out.println(/*revstorage*/storage);

            }

            else if ("revert".equals(command)) {

                storage.remove(0);

            }

            else {

                storage.add(command);

            }
        }

    }

}
