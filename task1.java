package homework.homework_java_3;

import java.util.Arrays;
import java.util.LinkedList;

// Вывести список на экран в перевернутом виде (без массивов и ArrayList)
// Пример:
// 1 -> 2->3->4
// Вывод:
// 4->3->2->1
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4 ));
        System.out.println(ReverseList(list));
        System.out.println(list);
    }

    public static LinkedList<Integer> ReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>(list);
        while(!temp.isEmpty()) {
            result.addFirst(temp.pop());
        }
        return result;
    }
}
