package sample;

import java.io.File;
import java.io.IOException;

public class FileHandler {
    private String FileName;
    private String FileLocation;
    private String FileExtension;
    private String FileType;

    public FileHandler(String fileName, String fileLocation) {
        FileName = fileName;
        FileLocation = fileLocation;
    }

    public FileHandler(String fileName, String fileLocation, String fileExtension, String fileType) {
        FileName = fileName;
        FileLocation = fileLocation;
        FileExtension = fileExtension;
        FileType = fileType;
    }

    //check to validate is file created already or not
    public void iscreated()
    {

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
        File file  = new File(path+"/"+fileName+".xml");
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
}
