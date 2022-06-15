package ThucHanh10;

public class MyLinkedListTest {
    //Tạo lớp TestMyLinkedList chứa hàm main
    //Tạo đối tượng thuộc lớp MyLinkedList.
    //Lần lượt gọi các phương thức addFist(), add(), printList()
    //chạy ứng dụng quan sát kết quả.
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(90);
        ll.addFirst(91);
        ll.addFirst(92);

        ll.add(4,93);
        ll.add(5,94);
        ll.printList();
    }
}
