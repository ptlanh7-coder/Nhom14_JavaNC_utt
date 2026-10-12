package Main;

import Controller.LoginController;
import View.LoginView;

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            LoginView loginView = new LoginView();

            new LoginController(loginView);

            loginView.setVisible(true);

        });

    }
}