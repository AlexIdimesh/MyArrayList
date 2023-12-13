import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListMy<Integer> arrayListMy = new ArrayListMy<>();
        ArrayListMy<Integer> arrayListMy1 = new ArrayListMy<>();
        ArrayListMy<Integer> arrayListMy2 = ArrayListMy.of("Sasha");

        arrayListMy.addMy(1);
        arrayListMy.addMy(10);
        arrayListMy.addMy(20);
        arrayListMy.addMy(100);
        arrayListMy.addMy(5);
        arrayListMy.addMy(35);
        arrayListMy.addMy(2);
        arrayListMy.addMy(123);
        arrayListMy.addMy(8);
        arrayListMy.addMy(7);
        System.out.println(arrayListMy);

        System.out.println(arrayListMy);

        arrayListMy1.addAllMy(arrayListMy);
        System.out.println(arrayListMy);

        System.out.println(arrayListMy.getMy(2));

        arrayListMy.removeMy(2);
        System.out.println(arrayListMy);

        System.out.println(arrayListMy2);

    }
}
