package class19;

public class User {
    String name;
    String mobileNumber;

    public User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class userInfo extends User{
    String address;

    public userInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }
    public void userDetails(){
        System.out.println("Name:"+name+" Mobile Number:"+mobileNumber+" Address:"+address);
    }
}
class UserTester{
    public static void main(String[] args) {
        userInfo user=new userInfo("David","133-455-7489","123 Street");
        user.userDetails();


    }



}