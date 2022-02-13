package example1;

import java.util.Arrays;


//Написать метод, который меняет два элемента массива местами.
// (массив может быть любого ссылочного типа);
public class Swap {
    public static void main(String[] args) {
        String[] arr = {"культурный", "двигатель", "отдыхать", "индивидуальный",
                "преступление", "мучитьcя", "лежать", "фамилия"};
        System.out.println(Arrays.deepToString(arr));
        swap(arr, 7, 0);
        System.out.println(Arrays.deepToString(arr));
    }

    private static <T> void swap(T[] arr, int first, int second) {
        var a = arr[first];
        var b = arr[second];
        arr[first] = b;
        arr[second] = a;
    }
}
