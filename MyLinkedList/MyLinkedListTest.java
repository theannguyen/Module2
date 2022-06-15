package BaiTap10.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
      MyLinkedList list = new MyLinkedList(10);
      list.addFirst(1);
      list.addFirst(2);
      list.addFirst(3);
      list.add(3,99);
      list.add(4,100);
      list.printList();
    }
}
