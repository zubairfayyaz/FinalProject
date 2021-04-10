package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.control.Alert.AlertType;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // the screen height


// the screen width
        System.out.print(screenSize.getHeight());
        Parent root = FXMLLoader.load(getClass().getResource("Main1.fxml"));
        Image icon =  new Image(getClass().getResourceAsStream("/images/NODE-MCU.jpg"));
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Visual Interface of NodeMCU");
        primaryStage.setScene(new Scene(root, screenSize.getWidth(),screenSize.getHeight()-80));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
