package com.example.svnitapp.Modal;

public class Material {

    String FileName ;
    String FileSize;

    public Material(String fileName, String fileSize) {
        FileName = fileName;
        FileSize = fileSize;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileSize() {
        return FileSize;
    }

    public void setFileSize(String fileSize) {
        FileSize = fileSize;
    }
}
