package Overload;

public class Person {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }
}

/*
方法重载：方法名相同，参数不同（个数，类型，位置）

重载方法返回值类型相同
 */
