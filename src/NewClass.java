/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasintha
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NewClass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String result="";
        int t=Integer.parseInt(sc.next());
        int n=Integer.parseInt(sc.next());
        int g=Integer.parseInt(sc.next());
        
        int arr[][]=new int[t][n];
        
        for(int i=0;i<t;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(sc.next());
            }
            
        }
        int count=0;
        for(int i=0;i<t-1;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==arr[i+1][j]){
                    count++;
                }
            }
            
        }
        if(count==g){
            System.out.println("Safe");
        }else{
             System.out.println("Not Safe");
        }
        
        
        
        
        
        
    }
}
