package Assign_2.Part2.Q2;

public class User implements Comparable {
    private String name;
    private int age;

    public User(String name, int age) {
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

    public String toString() {
        return name+"--"+age;
    }

    public int compareTo(Object obj) {
        int a = this.getAge();
        User u = (User)obj;
        int b = ((User) obj).getAge();
        if(a < b) {
            return +1;
        }else if(a > b) {
            return -1;
        }else {
            return 0;
        }
    }
}
