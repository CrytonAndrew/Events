package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
 
    public TextField nameField;
    public Label labelField;

    @FXML
    public void handleButtonClick(ActionEvent keyEvent) {
        DialogPane dialogPane = new DialogPane();
        dialogPane.prefHeight(100);
        dialogPane.prefWidth(50);

        Label heading  = new Label("Hello");
        dialogPane.getChildren().add(heading);
    }
}
