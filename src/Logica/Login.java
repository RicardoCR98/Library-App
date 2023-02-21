package Logica;

public class Login {

    public boolean loginUsers(String usuario, String password) {

        String user = usuario;
        String pass = password;
        return user.equalsIgnoreCase("Admin") && pass.equalsIgnoreCase("12345");
    }
}
