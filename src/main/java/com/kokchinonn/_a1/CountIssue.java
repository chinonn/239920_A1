//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239920
//Name: #Kok Chin Onn
package com.kokchinonn._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountIssue {
  
    public int i = 0;
    public int noIssue = 0;
    public int totalJava = 0;
    String directory = System.getProperty("user.dir") + File.separator + "Folder";
    String path;
    private final String keyword = "public static void main";

    public void countJava(String[] countJavaFile) {
        for (String countJavaFileOne : countJavaFile) {
            path=directory + File.separator + countJavaFile[i];
            try (final BufferedReader br = new BufferedReader(new FileReader(path))) {
                String scanCurrentLine;
                while ((scanCurrentLine = br.readLine()) != null) {
                    if (scanCurrentLine.contains(keyword)) {
                        noIssue++;
                    }
                }
                i++ ;
            }catch (IOException e) {
                System.out.println("Error, file cannot be read.");
            }
            totalJava++;
        }  
    }   
}
