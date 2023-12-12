
public class Main {
    public static void main(String[] args) {

        ArrayListMy<Integer> arrayListMy = new ArrayListMy<>();

        arrayListMy.addMy(1);
        arrayListMy.addMy(10);
        arrayListMy.addMy(22);
        arrayListMy.addMy(5);
        arrayListMy.addMy(3);
        arrayListMy.addMy(12);
        arrayListMy.addMy(40);
        arrayListMy.addMy(22);
        arrayListMy.addMy(8);
        arrayListMy.addMy(2);

        System.out.println(arrayListMy);

        arrayListMy.bubbleSort();
        System.out.println(arrayListMy);

        arrayListMy.clearMy();
        System.out.println(arrayListMy);

    }
}
