package Classes;

import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.io.IOException;

public class FileHandler {
    private String FileName;
    private String FileLocation;
    private String FileExtension;
    private String FileType;
    public File file;
    Window stage;
    //check to validate is file created already or not
    public void iscreated()
    {

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileLocation() {
        return FileLocation;
    }

    public void setFileLocation(String fileLocation) {
        FileLocation = fileLocation;
    }

    public String getFileExtension() {
        return FileExtension;
    }

    public void setFileExtension(String fileExtension) {
        FileExtension = fileExtension;
    }

    public String getFileType() {
        return FileType;
    }

    public void setFileType(String fileType) {
        FileType = fileType;
    }
    public void ImportExsistingFile()
    {

    }
    public void CheckValidFile()
    {

    }
    public void setDefaultLocation()
    {

    }
    public void saveFile(String fileLocation,String fileName)
    {
        String path = "";
        if(FileLocation.equals("")) {
            File newFolder = new File("c:/NodeMCU");
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
           path = "c:/NodeMCU";
        }
        file  = new File(path+"/"+fileName+".xml");
        try {
            if(file.createNewFile())
            {
                System.out.println("File is created");
                System.out.println(file.getPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void ExportFile()
    {

    }
    public void justCheck()
    {
        System.out.print("All done");
    }

    // cancel action to shutdown file and locations window
    public void cancelFile(Button cancelBtn) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }
    //select file
    public File selectFile()
    {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Working Directory");
        return fileChooser.showOpenDialog(null);
    }


}
