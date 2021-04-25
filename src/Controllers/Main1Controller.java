package Controllers;

import Classes.FileHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main1Controller implements Initializable{
    @FXML
    MenuItem newFile;
    @FXML
    MenuItem Exit;
    @FXML
    AnchorPane pane1;
    @FXML
    MenuItem save;
    @FXML
    MenuItem saveas;
    @FXML
    MenuItem export;
    @FXML
    MenuItem open;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        save.setDisable(true);
        saveas.setDisable(true);
        export.setDisable(true);
        newFile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getResource("../Layout/FileNameLocation.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("My New Stage Title");
                    stage.setScene(new Scene(root, 700, 450));
                    stage.setResizable(false);
                    stage.show();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //open Exsisting proejct
        open.setOnAction(actionEvent -> {
            FileHandler fh = new FileHandler();
            File getFile =  fh.selectFile();
            System.out.print(getFile.toString());
        });

        //for exit a window
        Exit.setOnAction(actionEvent -> {
         Stage stage = (Stage) pane1.getScene().getWindow();
            stage.close();
        });

    }
}
