package Programs.ex_22_Encapsulation;

public class Lab137_Encapsulation {
    public static void main(String[] args) {

        VWOLogin vwo = new VWOLogin("admin","1234");
        System.out.println(vwo.password); //user is able to print password
        vwo.password = "976jh"; //user is able to change password

        // user should not be able to change variables values outside the method especially usernames and passwords
        // these variable in below class are public -> that is y they r accessible outside class
        // so Encapsulation helps us to resolve this issue
        // making them private

        GoodEncapsVWOLogin gvwo = new GoodEncapsVWOLogin("abhi","abhi875");
        //System.out.println(gvwo.userName);  // trying to access username but throws error as it is made private in below class
       // System.out.println(gvwo.password); // trying to access password but throws error as it is made private in below class

        System.out.println(gvwo.getUserName());
        System.out.println(gvwo.getPassword());
       // gvwo.password = "uyyt"; // changing paswd for private variable not possible

        //using getter & setter methods we can
        gvwo.setUserName("AbhiMegs");
        gvwo.setPassword("710303");

    }

}

class VWOLogin
{
   public String userName;
   public String password;

    public VWOLogin(String usrNme, String pswd) {
        this.userName = usrNme;
        this.password = pswd;
    }
}

class GoodEncapsVWOLogin
{
    private String userName; // making this variable private so it cannot be accessible outside class
    private String password; // making this variable private so it cannot be accessible outside class

    public GoodEncapsVWOLogin(String usr, String pswd) {
        this.userName = userName;
        this.password = pswd;

        // if user has to change values of variables made private can be done using Getter & Setter methods
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


}
