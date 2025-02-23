package Programs.ex_21_MethodOverriding;

public class RealExample {
    public static void main(String[] args) {
        TC t = new TC();
        t.openBrowser();

        Tc2 t2 = new Tc2();
        t2.openBrowser();
    }
}

class CommonToAllTc {
    void openBrowser() {
        System.out.println("open browser in 5 sec");
    }
}

    class TC extends CommonToAllTc
    {
        void startTC()
        {
            openBrowser();
        }
   }

   class Tc2 extends CommonToAllTc
   {
       @Override
       void openBrowser()
       {
           System.out.println("open browser in 2 sec");
       }
   }

