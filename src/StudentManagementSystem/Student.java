package StudentManagementSystem;
/*
学生管理系统中的学生类
Alt+Insert：根据自己的需要进行选择构造方法
 */
public class Student {
    private String name;
    private String age;
    private String number;
    private String address;
    public Student(){
    }
    public Student(String name,String age,String number,String address){
        this.name=name;
        this.age=age;
        this.number=number;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
