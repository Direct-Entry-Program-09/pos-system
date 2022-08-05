package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SplashScreenFormController {
    public Rectangle prgContainer;
    public Rectangle prgLoad;
    public Label lblStatus;

    public void initialize(){
        Timeline t1 = new Timeline();

        var frame1 = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Connecting Database...!");
                prgLoad.setWidth(prgLoad.getWidth()+25);
            }
        });
        var frame2 = new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Loading Data...!");
                prgLoad.setWidth(prgLoad.getWidth()+30);
            }
        });
        var frame3 = new KeyFrame(Duration.millis(1250), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Setting the UI...!");
                prgLoad.setWidth(prgContainer.getWidth());
            }
        });

        var frame4 = new KeyFrame(Duration.millis(1500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                prgContainer.setWidth(prgContainer.getWidth());
                URL resource = this.getClass().getResource("/view/LoginForm.fxml");
                Parent container = FXMLLoader.load(resource);
                Scene scene = new Scene(container);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Login");
                stage.show();
                lblStatus.getScene().getWindow().hide();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        t1.getKeyFrames().addAll(frame1,frame2,frame3,frame4);
        t1.playFromStart();

    }
}
