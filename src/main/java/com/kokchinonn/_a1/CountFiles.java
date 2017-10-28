//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239920
//Name: #Kok Chin Onn
package com.kokchinonn._a1;

import java.io.File;

public class CountFiles {
    String[] countJavaFile = new String[4];
    String directory = "C://Users//User//Documents//NetBeansProjects//239920_A1//Folder";
    final File folder = new File(directory);
    
    public String[] countJavaFiles() {
        int i=0;
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                countJavaFiles();
            } else {
                if (fileEntry.getName().contains("java")){
                countJavaFile[i]= fileEntry.getName();
                i++;
                }
            }
        }
        return countJavaFile;
    }
}

