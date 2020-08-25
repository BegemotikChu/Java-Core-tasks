package login;

public class MainLogin {
    public static void main(String[] args) {

        Login login_Mobile = new Login_Mobile();
        login_Mobile.login();

        Login login_Web = new Login_Web();
        login_Web.login();
    }
}