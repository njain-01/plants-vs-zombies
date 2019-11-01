package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    public Button exitButton;

    public void buttonHandler(ActionEvent e) {
        System.out.println("Here");
    }

    public void exitButtonHandler(ActionEvent e) {

//        System.exit(0);
    }
}
