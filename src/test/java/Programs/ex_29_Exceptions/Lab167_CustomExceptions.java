package Programs.ex_29_Exceptions;

public class Lab167_CustomExceptions {
    public static void main(String[] args) {
        Bank sbi = new Bank("inr",1000);
        Bank icic = new Bank("inr",2000);

        Bank jp = new Bank("usd",89);

        //int res = sbi.add(icic);
        int res = sbi.add(jp); // we are having currency mismatch here-> trying to add inr and $
        //practically this is not possible
        //we dont have inbuilt exception for this case
        // so we create are own exception
        System.out.println(res);
    }
}
