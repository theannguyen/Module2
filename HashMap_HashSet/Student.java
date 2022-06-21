package ThucHanh12;

public class Student {
    String name, addess;
    int age;

    public Student() {
    }

    public Student(String name, String addess, int age) {
        this.name = name;
        this.addess = addess;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddess() {
        return addess;
    }

    public void setAddess(String addess) {
        this.addess = addess;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", addess='" + addess + '\'' +
                ", age=" + age +
                '}';
    }
}
