package pl.sda.fx.hello.mvc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by Adrian on 2017-01-26.
 */
public class LoginFormFXML extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("pl/sda/fx/hello/mvc/view/login.fxml"));

        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

    public static void main(String[] args) {
       launch(LoginFormFXML.class, args);
    }

}
