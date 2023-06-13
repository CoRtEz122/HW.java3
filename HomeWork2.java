import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class HomeWork2 {

    // Пусть дан произвольный список целых чисел.

    // 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer>
    // list))
    // 2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
    // 3) Найти максимальное значение
    // 4) Найти среднее значение

    // То есть, нужно реализовать 4 метода, каждый из которых принимает список целых
    // чисел, и делает свою работу.

    public static void main(String[] args) {

        removeEven(null);

        findMin(null);

        findMax(null);

        average(null);

    }

        public static void removeEven(ArrayList<Integer> list){
            
        
        list = new ArrayList<>();

        list.add(15);
        list.add(22);
        list.add(65);
        list.add(14);
        list.add(15);
        list.add(87);
        list.add(23);
        list.add(22);
        list.add(14);
        list.add(19);

        for (int i = 0; i < list.size(); i++) {

            int x = list.get(i);

            if (x % 2 == 0) {

                list.remove(i);
                i--;
            }
        }
        System.out.print("Задание 1:  " + list + ",");
    }    
    

   public static void findMin(ArrayList<Integer>list){

    list = new ArrayList<>();

    list.add(15);
    list.add(22);
    list.add(65);
    list.add(14);
    list.add(15);
    list.add(87);
    list.add(23);
    list.add(22);
    list.add(14);
    list.add(19);

System.out.println();
System.out.println("Задание 2: Минимальное число списка - "+Collections.min(list));

}

public static void findMax(ArrayList<Integer>list){

    list = new ArrayList<>();

    list.add(15);
    list.add(22);
    list.add(65);
    list.add(14);
    list.add(15);
    list.add(87);
    list.add(23);
    list.add(22);
    list.add(14);
    list.add(19);


System.out.println("Задание 3: Максимальное число списка - "+Collections.max(list));

}


public static void average(ArrayList<Integer>list){

    list = new ArrayList<>();
    list.add(15);
    list.add(22);
    list.add(65);
    list.add(14);
    list.add(15);
    list.add(87);
    list.add(23);
    list.add(22);
    list.add(14);
    list.add(19);

double result = 0;
for (int j = 0; j < list.size(); j++) {

int x = list.get(j);

result +=x;
}

System.out.println("Задание 4: Среднее значение списка - "+result/list.size());
}

 }
