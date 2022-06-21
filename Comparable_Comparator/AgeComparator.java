package ThucHanh12;

import java.util.*;

public class AgeComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if (o1.getAge() > o2.getAge()) {
        return 1;
    } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
}

    public static void main(String[] args) {
        Student2 student2 = new Student2("Đông", "HN", 26);
        Student2 student3 = new Student2("Tây", "HN", 27);
        Student2 student4 = new Student2("Nam", "HN", 28);
        Student2 student5 = new Student2("Bắc", "HN", 29);

        List<Student2> list = new ArrayList<Student2>();
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        Collections.sort(list);
        for (Student2 st : list) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student2 st : list) {
            System.out.println(st.toString());
        }
    }
}