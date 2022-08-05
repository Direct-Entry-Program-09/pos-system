package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.sun.prism.impl.paint.PaintUtil;
import javafx.event.ActionEvent;

public class AdminLoginFormController {
    public JFXButton btnLogin;
    public JFXTextField txtPassword;
    public JFXTextField txtAdminUserNme;

    public void initialize(){


    }


    public void btnLoginOnAction(ActionEvent actionEvent) {
        txtAdminUserNme.getText();
    }

    public void txtPasswordOnAction(ActionEvent actionEvent) {
    }

    public void txtAdminUserNameOnAction(ActionEvent actionEvent) {
    }
}
