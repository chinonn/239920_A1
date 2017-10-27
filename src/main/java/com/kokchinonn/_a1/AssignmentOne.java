//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239920
//Name: #Kok Chin Onn
package com.kokchinonn._a1;

public class AssignmentOne {
    
    public static void main(String[] args) throws Exception{
       
        CountFiles countFiles = new CountFiles();
        String[] countJavaFile =countFiles.countJavaFiles();
        
        CountIssue countIssue = new CountIssue();
        countIssue.countJava(countJavaFile);
        
        System.out.println("Number of Java Files = " + countIssue.totalJava);
        System.out.println("Number of Issues = " + countIssue.noIssue);
    }
    
}
