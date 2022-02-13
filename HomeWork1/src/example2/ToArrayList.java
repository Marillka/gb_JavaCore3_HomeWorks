package example2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayList {
    public static void main(String[] args) {

        String[] arr = {"культурный", "двигатель", "отдыхать", "индивидуальный",
                "преступление", "мучитьcя", "лежать", "фамилия"};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.getClass().getTypeName());

        System.out.println(toList(arr));
        System.out.println(toList(arr).getClass().getTypeName());

    }

    private static <T> List<T> toList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
          return list;
    }
}

