import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Login {
    public static boolean Login(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            if (password.length() > 20) {
                throw new WrongPasswordException();
            }
            if (!(password.equals(confirmPassword))) {
                throw new WrongPasswordException();
            }
            if (!(match(password))) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            System.out.println("Неправильный логин");
            return false;

        } catch (WrongPasswordException e) {
            System.out.println("Неправильный пароль");
            return false;

        }
        return true;
    }
    public static boolean match(String password) {
        return password.matches("\\w+");
    }
}
