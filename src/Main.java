// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class User{
    private Integer id;
    private String userName;
    private String password;

    public User(Integer id, String userName, String password){
        this.id=id;
        this.userName=userName;
        this.password=password;
    }
    public User(){

    }

    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public  String getUserName() {
        return userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword() {
        return password;
    }
}

class userBO{
    private User[] getUsers(){
        User[] users=new User[5];
        users[0] = new User(1, " louis ", "bcdef");
        users[1] = new User(2, " BALAJI ","BCDEF");
        users[2] = new User(3, " VENKY ", "SHKSBGJ");
        users[3] = new User(4, " purna ", "73e6fgy");
        users[4] = new User(5, " anusha", "gsfkhbgor");

        return users;
    }

    private String EncryptPassword(String password){
        System.out.println(" in encrypt");
        String res="";
        for(int i=0; i< password.length();i++){
           res =  res + (char)(password.charAt(i)+1);
           System.out.println(res);
        }
        System.out.println(res);
        return res;
    }

    public boolean validate(String userName, String password){
        User[] users = getUsers();
         for(int i=0; i< users.length ; i++ ){
             String un = users[i].getUserName();
             String ps = users[i].getPassword();
             System.out.println("Inside the validate block");
             if(un.equals(userName)  &&  ps.equals(EncryptPassword(password))){
                 System.out.println("Inside the if block");
                 return true;
             }
         }
         return false;
    }
}

public class Main {
    public static void main(String[] args) {
        userBO u= new userBO();
        System.out.println(u.validate("louis", "abcde"));
        System.out.println(u.validate("VENKY", "CDEFS"));
    }
}