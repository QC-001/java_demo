package List;

public class List_Student {
    private String name;
    private  int age;

    public List_Student() {
    }

    public List_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "List_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
