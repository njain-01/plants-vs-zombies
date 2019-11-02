package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    public Button exitButton;

    public void startButtonHandler(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chooselevel.fxml"));
        Main.window.setTitle("Scene 2");
        Main.window.setScene(new Scene(root, Main.width, Main.height));
    }

    public void exitButtonHandler(ActionEvent e) {
        System.exit(0);
    }
}
