public class User {
    private String userName;
    private String password;
    private String  idCarNumber;
    private String phoneNumber;
    public User(){
    }
    public User(String userName,String password,String idCarNumber,String phoneNumber){
        this.userName = userName;
        this.password = password;
        this.idCarNumber = idCarNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCarNumber() {
        return idCarNumber;
    }
    public void setIdCarNumber(String idCarNumber) {
        this.idCarNumber = idCarNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
