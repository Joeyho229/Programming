package BankingApplication;

public class Administrator {

    private String password;
    private String username;

    public Administrator(String username, String password){
        this.username = username;
        this.password = password;
    }

    protected String getUsername(){
        return this.username;
    }

    protected String getPassword(){
        return this.password;
    }
}
