package com.learning.FileExtension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@RestController
@RequestMapping("api")
public class ExtensionFinder {

    @Autowired
    ExtensionService extensionService;

    @PostMapping("/upload")
    public String uploader(@RequestParam ("file")MultipartFile file){

        try {
            Path path= Paths.get("D:\\Program Strategy\\", file.getOriginalFilename());
             String fileExtension= extensionService.getFileExtension(file.getOriginalFilename());
            Long fileSize=file.getSize();
            if(fileSize<10000) {
                Files.write(path, file.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                return "File " + fileExtension + " Uploaded Successfully!!!";
            }
            else {
                return "File size is too Large Cannot upload";
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return "File Upload Failure????";
        }



    }
}
