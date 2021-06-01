package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField log;

    @FXML
    private PasswordField passw;

    @FXML
    private Button ButtonOne;

    @FXML
    private Label type;

    @FXML
    public void auth(ActionEvent actionOne){
        String loginText = log.getText();
        String loginPassword = passw.getText();

        if(loginText.equals("admin") && loginPassword.equals("pass")) {
            type.setText("Hello Admin!");
        }else{
            type.setText("Ошибка авторизации!");
        }

    }
}
