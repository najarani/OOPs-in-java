package bank;
class Account{
    public String name;
    protected String email;
    private String password;
    //getters and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank{
public static void main(String[] args) {
    Account accoun1 = new Account();
    accoun1.name = "Nirajan Poudel";
    accoun1.email = "nirajan@gamil.com";

    System.out.println(accoun1.getPassword());
}
}
