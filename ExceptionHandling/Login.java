package ExceptionHandling;

public class Login {

    public static void signIn(String username, int password) throws InvalidCredentials {

        if (!username.equalsIgnoreCase("Kay") | password != 1234){
            throw new InvalidCredentials("Invalid Credentials \n Error: Password or Username is incorrect! \n Try again with Valid Credentials");
        }
        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {

        try {signIn ("KAy",123);

        } catch (InvalidCredentials e) {
            System.out.println(e.getMessage());;
        }
//        System.out.println("  ");
        finally {
            System.out.println("Rate Us on Playstore!");
        }
    }
}
