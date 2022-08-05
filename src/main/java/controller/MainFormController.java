package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public JFXTextField txtAdminUserNme;
    public JFXTextField txtReenterPassword;
    public JFXTextField txtPassword;
    public JFXButton btnCreateUser;
    private String adminName;
    private String password;

    public void initialize(){
        Platform.runLater(txtAdminUserNme::requestFocus);

        txtReenterPassword.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

            }
        });


    }

    public void txtAdminUserNameOnAction(ActionEvent actionEvent) {
    }

    public void txtReenterPasswordOnAction(ActionEvent actionEvent) {
    }

    public void txtPasswordOnAction(ActionEvent actionEvent) {
    }

    public void btnCreateUserOnAction(ActionEvent actionEvent) throws IOException {
        if (!txtReenterPassword.getText().equals(txtPassword.getText())){
            new Alert(Alert.AlertType.ERROR,"Passwords do not match").showAndWait();
            txtReenterPassword.clear();
            txtReenterPassword.requestFocus();
        }else {
            adminName=txtAdminUserNme.getText();
            password=txtPassword.getText();
            new Alert(Alert.AlertType.CONFIRMATION,"Successfully Registered..!").showAndWait();
//            URL resource = this.getClass().getResource("view/AdminLogin.fxml");
//            AnchorPane load = FXMLLoader.load(resource);
//            Scene scene=new Scene(load);
//            pr


        }
    }

}
