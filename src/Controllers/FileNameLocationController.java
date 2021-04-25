package Controllers;
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
import Classes.FileHandler;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.*;

public class FileNameLocationController implements Initializable{
    @FXML
    Button cancelBtn;
    @FXML
    Button okBtn;
    @FXML
    TextField FileLocation;
    @FXML
    TextField FileName;
    @FXML
    Button fileChooser;
    FileHandler fh = new FileHandler();

    public TextField getFileLocation() {
        return FileLocation;
    }

    public void setFileLocation(TextField fileLocation) {
        FileLocation = fileLocation;
    }

    public TextField getFileName() {
        return FileName;
    }

    public void setFileName(TextField fileName) {
        FileName = fileName;
    }

    public Button getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(Button fileChooser) {
        this.fileChooser = fileChooser;
    }

    public FileHandler getFh() {
        return fh;
    }

    public void setFh(FileHandler fh) {
        this.fh = fh;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        okBtn.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String name = FileName.getText();
                String location = FileLocation.getText();
                fh.saveFile(location, name);
                fh.cancelFile(cancelBtn);
                fh.setFileLocation(location);
                fh.setFileName(name);
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


        });//ok btn handler end

        //File Chooser
        fileChooser.setOnAction(actionEvent -> {
            File selectedFile  = fh.selectFile();
           FileLocation.setText(selectedFile.toString());
        });//file chooser end
        cancelBtn.setOnAction(actionEvent ->
                fh.cancelFile(cancelBtn));// cancel btn end

        //Exit Project


    }//initialize method end

}//FileNameLocationController end

