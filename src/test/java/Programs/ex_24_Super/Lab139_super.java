package Programs.ex_24_Super;

public class Lab139_super {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1("Chrome");
        t1.openBrowser();
        System.out.println("running test cases");
        t1.closeBrowser();

        System.out.println(t1.getBrowser());
    }

}

class BaseClass
{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin)
        {
            this.browser = browser;
        }
        else {
            System.out.println("u r not admin so u cannot change browser");
        }

    }

    public String getBrowser() {
        return browser;
    }

    void openBrowser()
    {
        System.out.println("Open browser");
    }

    void closeBrowser()
    {
        System.out.println("closing browser");
    }

}

class TestCase1 extends BaseClass
{

    public TestCase1(String browser) {
        super(browser); // call parent constructor
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin); // overriding setBrowser method in parent class
    }
}
