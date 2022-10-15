package class21;

public class Browser {

    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("Opening url");
    }
    void test(){
        System.out.println("Testing the Website");
    }
    void closeBrowser(){
        System.out.println("Closing the Browser");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser in less than 1 sec");
    }

}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser in less than 2 seconds");
    }
}