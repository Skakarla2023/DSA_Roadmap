package com.skakarla.java_Programs;

import java.util.Scanner;

package com.skakarla.java_Programs;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        Scanner obj=new Scanner(System.in);
        
        int rows=4;
        int cols=5;
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter matrix elements:");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=obj.nextInt();
            }
        }
        
        for(int a=0;a<rows;a++){
            for(int b=0;b<cols;b++){
                System.out.print(matrix[a][b]+" ");
            }
            System.out.println();
        }
        
        int flag=0;
        
        System.out.println("Enter Elements to search:");
        int num=obj.nextInt();
        for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
               if(matrix[i][j]==num){
                   flag++;
                   break;
               }
               
           }
           
    }
        
     if(flag==1){
            System.out.println("Element is found");
        }else{
            System.out.println("Element not found");
        }    
        
        
    }
}
