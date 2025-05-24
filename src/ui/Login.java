package ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage stage) {
        Label heading = new Label("Job Portal Login");
        heading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label usernameLabel = new Label("Username:");
        TextField username = new TextField();
        username.setPromptText("Enter your username");
        username.setMaxWidth(Double.MAX_VALUE);
        VBox.setVgrow(username, Priority.ALWAYS);

        Label passwordLabel = new Label("Password:");
        PasswordField password = new PasswordField();
        password.setPromptText("Enter your password");
        password.setMaxWidth(Double.MAX_VALUE);
        VBox.setVgrow(password, Priority.ALWAYS);

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");

        VBox layout = new VBox(12, heading, usernameLabel, username, passwordLabel, password, loginButton);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-padding: 30; -fx-background-color: #f2f2f2;");

        Scene scene = new Scene(layout, 350, 400);
        stage.setScene(scene);
        stage.setTitle("Login - Job Portal");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}