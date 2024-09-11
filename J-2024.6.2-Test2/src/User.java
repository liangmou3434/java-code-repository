public class User {//一个标准的javabean类
    //1）类名需要见名知意
    //2)成员变量要用private修饰
    //3)提供至少两个构造方法-一个不含参数的空构造方法 一个带全部参数的构造方法
    //4)成员方法 提供每一个成员变量对应的成员方法 getxxx（）/setxxx() 如果有其他行为也要写上
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;//成员变量全部都用private修饰

    public User() {//空的构造方法 不带参数
    }
    public User(String name, String password, String email, String gender, int age) {//带全部参数的构造方法
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
