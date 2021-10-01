package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button login;
    @FXML
    private Text message;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void Login(ActionEvent event) {
        /*
        if(username.getText().equals(password.getText())){
            message.setText("Welcome to Technercia");
        }else{
            message.setText("Wrong Credentials! Try Again...");
        }
        */
        String UN, PS;
        UN=username.getText();
        PS=password.getText();
        
        if(UN.equals(PS)){
            message.setText("Welcome to Technercia");
        }else{
            message.setText("Wrong Credentials! Try Again...");
        }
    }

    
}
