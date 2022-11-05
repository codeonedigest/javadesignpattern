package codeonedigest.javadesignpattern.creational.prototype;

public class Customer implements Cloneable {

    public String name;

    public int age;


    public Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
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
}
