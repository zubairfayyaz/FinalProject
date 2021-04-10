package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.*;
import javafx.scene.control.Alert.AlertType;

public class FileNameLocationController  implements Initializable {
    @FXML
    Button cancelBtn;
    @FXML
    Button okBtn;
    @FXML
    TextField FileLocation;
    @FXML
    TextField FileName;


    public void cancelFile() {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cancelBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cancelFile();
            }
        });
        okBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String name = FileName.getText();
                String location = FileLocation.getText();
                FileHandler fh = new FileHandler(name, location);
                fh.saveFile(location, name);
                cancelFile();
                Parent root;
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                try {
                    root = FXMLLoader.load(getClass().getResource("Robot.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("Select Robot");
                    stage.setScene(new Scene(root, screenSize.getWidth(), screenSize.getHeight()-80));
                    stage.show();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }


        });

    }


}

