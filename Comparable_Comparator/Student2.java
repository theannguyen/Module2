package ThucHanh12;

public class Student2 implements Comparable<Student2> {
    String name, address;
    Integer age;

    public Student2(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student2 student2) {
        return this.getName().compareTo(student2.getName());
    }
}
