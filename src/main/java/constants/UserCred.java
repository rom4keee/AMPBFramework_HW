package constants;

public class UserCred {

    public final static String USER_EMAIL = "romanbub3@gmail.com";
    public final static String USER_PASSWORD = "qwerty123";
    public final static String FULL_NAME = "Petro Petrovych";
    public final static String ADDRESS = "petro@gmail.com";
    public final static String ZIP_CODE = "111222333";
    public final static String ORDER_NUMBER = "99922233344422211";
    public final static String MESSAGE = "I not fully know how to open drop-down list in the previously field :)";

    private String email = null;
    private String password = null;

    public UserCred(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public static UserCred UserCredentials() {
        return new UserCred(USER_EMAIL,USER_PASSWORD);
    }

}
