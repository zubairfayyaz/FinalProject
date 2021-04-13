package Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class MainController implements Initializable {
    @FXML
    TreeView<String> MainTreeView;
    @FXML
    MenuItem newFile;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootNode = new TreeItem<>("Select Pins");
        TreeItem<String> rootChildA = new TreeItem<>("A0");
        TreeItem<String> rootChildB = new TreeItem<>("G");
        TreeItem<String> rootChildC = new TreeItem<>("D0");
        TreeItem<String> rootChildD = new TreeItem<>("D1");
        TreeItem<String> rootChildE = new TreeItem<>("D2");
        TreeItem<String> rootChildF = new TreeItem<>("D3");
        TreeItem<String> rootChildG = new TreeItem<>("D4");
        TreeItem<String> rootChildH = new TreeItem<>("D5");
        TreeItem<String> rootChildI = new TreeItem<>("3V");
        TreeItem<String> rootChildJ = new TreeItem<>("EN");
        TreeItem<String> rootChildK = new TreeItem<>("RST");
        TreeItem<String> rootChildL = new TreeItem<>("VIN");
        TreeItem<String> rootChildM = new TreeItem<>("S0");
        TreeItem<String> rootChildN = new TreeItem<>("S1");
        TreeItem<String> rootChildO = new TreeItem<>("S2");
        TreeItem<String> rootChildP = new TreeItem<>("S3");
        TreeItem<String> rootChildQ = new TreeItem<>("SC");
        TreeItem<String> rootChildR = new TreeItem<>("SK");
        TreeItem<String> rootChildS = new TreeItem<>("D6");
        TreeItem<String> rootChildT = new TreeItem<>("D7");
        TreeItem<String> rootChildU = new TreeItem<>("D8");
        TreeItem<String> rootChildV = new TreeItem<>("Rx");
        TreeItem<String> rootChildW = new TreeItem<>("Tx");

        rootNode.getChildren().add(rootChildA);
        rootNode.getChildren().add(rootChildB);
        rootNode.getChildren().add(rootChildC);
        rootNode.getChildren().add(rootChildD);
        rootNode.getChildren().add(rootChildE);
        rootNode.getChildren().add(rootChildF);
        rootNode.getChildren().add(rootChildG);
        rootNode.getChildren().add(rootChildH);
        rootNode.getChildren().add(rootChildI);
        rootNode.getChildren().add(rootChildJ);
        rootNode.getChildren().add(rootChildK);
        rootNode.getChildren().add(rootChildL);
        rootNode.getChildren().add(rootChildM);
        rootNode.getChildren().add(rootChildN);
        rootNode.getChildren().add(rootChildO);
        rootNode.getChildren().add(rootChildP);
        rootNode.getChildren().add(rootChildQ);
        rootNode.getChildren().add(rootChildS);
        rootNode.getChildren().add(rootChildT);
        rootNode.getChildren().add(rootChildU);
        rootNode.getChildren().add(rootChildV);
        rootNode.getChildren().add(rootChildW);
        MainTreeView.setRoot(rootNode);
        newFile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Parent root;
             /*   try {
                    root = FXMLLoader.load(getClass().getResource("FileNameLocation.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("Select File Location");
                    stage.setScene(new Scene(root, 800, 900));
                    stage.setResizable(false);
                    stage.show();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }*/
            }
        });
    }
}



