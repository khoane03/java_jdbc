package model;

public class user {
    private int id;
    private String userName;
    private String passWord;
    //
    public user(){
        
    }
    public user(int id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public user(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
