package com.krishnaasoka.billingsoftware.service;

<<<<<<< HEAD
public class FileUploadService {
    
=======
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

    String uploadFile(MultipartFile file);

    boolean deleteFile(String imgUrl);

>>>>>>> 20418b0 (Made changes to AWS Config and File Upload)
}
