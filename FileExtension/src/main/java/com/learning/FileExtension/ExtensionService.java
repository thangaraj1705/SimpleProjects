package com.learning.FileExtension;

import org.springframework.stereotype.Service;

@Service
public class ExtensionService {

    public String getFileExtension(String filename){

        int index=filename.lastIndexOf('.');
        String extension="";
        for(int i=index+1;i<filename.length();i++){
            extension+=filename.charAt(i);
        }
        return extension;

    }
}
