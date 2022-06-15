package BaiTap10;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("0");
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        System.out.println(myList);

        myList.remove(0);
        System.out.println(myList);

        myList.add("6");
        System.out.println(myList);

        myList.get(1);
        System.out.println(myList);

        myList.set(5,"100");
        System.out.println(myList);
    }
}
