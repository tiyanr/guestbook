/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import configure.ClassStage;
import configure.ConfigWifiAdmin;
import configure.configScene;
import controller.SharingController;
import implementSQL.ChangePass;
import implementSQL.CreateDB;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author sulistiyanto
 */
public class GuestBookServer extends Application {

    ClassStage string = new ClassStage();
    CreateDB c = new CreateDB();
    ChangePass p = new ChangePass();
    String str;
    ConfigWifiAdmin wifi = new ConfigWifiAdmin();

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(string.URL_MAIN_FXML));
        //Scene scene = new Scene(root);
        ///Maximize
        c.create();
        p.change();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent we) {
                try {
                    String fileName = "C:\\xampp\\htdocs\\guestbook\\stop.lnk";
                    Process p = Runtime.getRuntime().exec("cmd /c start " + fileName);
                    p.waitFor();
                    str = "off";
                    wifi.saveStatus(str);
                } catch (InterruptedException | IOException e1) {
                    System.out.println(e1);
                } 
            }
        });
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
        Image image = new Image(string.URL_IMAGE);
        stage.getIcons().addAll(image);
        stage.setTitle(string.URL_MAIN_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
