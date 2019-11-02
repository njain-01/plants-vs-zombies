package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ChooseLevelController {
    public void level1Handler() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("level1.fxml"));
        Main.window.setTitle("Level 1");
        Main.window.setScene(new Scene(root, Main.width, Main.height));
    }

    public void level5Handler() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("level5.fxml"));
        Main.window.setTitle("Level 5");
        Main.window.setScene(new Scene(root, Main.width, Main.height));
    }
}
