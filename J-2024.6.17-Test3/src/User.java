public class User {
    private String id;//用户id
    private String username;//用户名
    private String password;//用户密码
    public User(){
    }
    public User(String id,String username,String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
