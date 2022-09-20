/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21arrays;
import java.util.Random;
/**
 *
 * @author user
 */
public class SPTV21arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("--------Demo arrays--------");
        int[] arr1= new int[10];
        Random random = new Random();
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = random.nextInt(10);
        }
        int sum = 0;
        int max = 0;
        int min = 0;
        System.out.print("[");
        for(int i = 0;i<arr1.length;i++){
            System.out.printf("%3d",arr1[i]);
            sum += arr1[i];
            if((arr1[0]>=arr1[1])&(arr1[0]>=arr1[2])&(arr1[0]>=arr1[3])&(arr1[0]>=arr1[4])&(arr1[0]>=arr1[5])&(arr1[0]>=arr1[6])&(arr1[0]>=arr1[7])&(arr1[0]>=arr1[8])&(arr1[0]>=arr1[9])){
                max = arr1[0];
                        }
            if(arr1[1]>=arr1[0]&(arr1[1]>=arr1[2])&(arr1[1]>=arr1[3])&(arr1[1]>=arr1[4])&(arr1[1]>=arr1[5])&(arr1[1]>=arr1[6]&(arr1[1]>=arr1[7])&(arr1[1]>=arr1[8])&(arr1[1]>=arr1[9]))){
                max = arr1[1];
                        }
            if(arr1[2]>=arr1[0]&(arr1[2]>=arr1[1])&(arr1[2]>=arr1[3])&(arr1[2]>=arr1[4])&(arr1[2]>=arr1[5])&(arr1[2]>=arr1[6]&(arr1[2]>=arr1[7])&(arr1[2]>=arr1[8])&(arr1[2]>=arr1[9]))){
                max = arr1[2];
                        }
            if(arr1[3]>=arr1[0]&(arr1[3]>=arr1[1])&(arr1[3]>=arr1[2])&(arr1[3]>=arr1[4])&(arr1[3]>=arr1[5])&(arr1[3]>=arr1[6]&(arr1[3]>=arr1[7])&(arr1[3]>=arr1[8])&(arr1[3]>=arr1[9]))){
                max = arr1[3];
                        }
            if(arr1[4]>=arr1[0]&(arr1[4]>=arr1[1])&(arr1[4]>=arr1[2])&(arr1[4]>=arr1[3])&(arr1[4]>=arr1[5])&(arr1[4]>=arr1[6]&(arr1[4]>=arr1[7])&(arr1[4]>=arr1[8])&(arr1[4]>=arr1[9]))){
                max = arr1[4];
                        }
            if(arr1[5]>=arr1[0]&(arr1[5]>=arr1[1])&(arr1[5]>=arr1[2])&(arr1[5]>=arr1[4])&(arr1[5]>=arr1[3])&(arr1[5]>=arr1[6]&(arr1[5]>=arr1[7])&(arr1[5]>=arr1[8])&(arr1[5]>=arr1[9]))){
                max = arr1[5];
                        }
            if(arr1[6]>=arr1[0]&(arr1[6]>=arr1[1])&(arr1[6]>=arr1[2])&(arr1[6]>=arr1[4])&(arr1[6]>=arr1[5])&(arr1[6]>=arr1[3]&(arr1[6]>=arr1[7])&(arr1[6]>=arr1[8])&(arr1[6]>=arr1[9]))){
                max = arr1[6];
                        }
            if(arr1[7]>=arr1[0]&(arr1[7]>=arr1[1])&(arr1[7]>=arr1[2])&(arr1[7]>=arr1[4])&(arr1[7]>=arr1[5])&(arr1[7]>=arr1[6]&(arr1[7]>=arr1[3])&(arr1[7]>=arr1[8])&(arr1[7]>=arr1[9]))){
                max = arr1[7];
                        }
            if(arr1[8]>=arr1[0]&(arr1[8]>=arr1[1])&(arr1[8]>=arr1[2])&(arr1[8]>=arr1[4])&(arr1[8]>=arr1[5])&(arr1[8]>=arr1[6]&(arr1[8]>=arr1[7])&(arr1[8]>=arr1[3])&(arr1[8]>=arr1[9]))){
                max = arr1[8];
                        }
            if(arr1[9]>=arr1[0]&(arr1[9]>=arr1[1])&(arr1[9]>=arr1[2])&(arr1[9]>=arr1[4])&(arr1[9]>=arr1[5])&(arr1[9]>=arr1[6]&(arr1[9]>=arr1[7])&(arr1[9]>=arr1[8])&(arr1[9]>=arr1[3]))){
                max = arr1[9];
                        }
            
            if((arr1[0]<=arr1[1])&(arr1[0]<=arr1[2])&(arr1[0]<=arr1[3])&(arr1[0]<=arr1[4])&(arr1[0]<=arr1[5])&(arr1[0]<=arr1[6])&(arr1[0]<=arr1[7])&(arr1[0]<=arr1[8])&(arr1[0]<=arr1[9])){
                min = arr1[0];
                        }
            if(arr1[1]<=arr1[0]&(arr1[1]<=arr1[2])&(arr1[1]<=arr1[3])&(arr1[1]<=arr1[4])&(arr1[1]<=arr1[5])&(arr1[1]<=arr1[6]&(arr1[1]<=arr1[7])&(arr1[1]<=arr1[8])&(arr1[1]<=arr1[9]))){
                min = arr1[1];
                        }
            if(arr1[2]<=arr1[0]&(arr1[2]<=arr1[1])&(arr1[2]<=arr1[3])&(arr1[2]<=arr1[4])&(arr1[2]<=arr1[5])&(arr1[2]<=arr1[6]&(arr1[2]<=arr1[7])&(arr1[2]<=arr1[8])&(arr1[2]<=arr1[9]))){
                min = arr1[2];
                        }
            if(arr1[3]<=arr1[0]&(arr1[3]<=arr1[1])&(arr1[3]<=arr1[2])&(arr1[3]<=arr1[4])&(arr1[3]<=arr1[5])&(arr1[3]<=arr1[6]&(arr1[3]<=arr1[7])&(arr1[3]<=arr1[8])&(arr1[3]<=arr1[9]))){
                min = arr1[3];
                        }
            if(arr1[4]<=arr1[0]&(arr1[4]<=arr1[1])&(arr1[4]<=arr1[2])&(arr1[4]<=arr1[3])&(arr1[4]<=arr1[5])&(arr1[4]<=arr1[6]&(arr1[4]<=arr1[7])&(arr1[4]<=arr1[8])&(arr1[4]<=arr1[9]))){
                min = arr1[4];
                        }
            if(arr1[5]<=arr1[0]&(arr1[5]<=arr1[1])&(arr1[5]<=arr1[2])&(arr1[5]<=arr1[4])&(arr1[5]<=arr1[3])&(arr1[5]<=arr1[6]&(arr1[5]<=arr1[7])&(arr1[5]<=arr1[8])&(arr1[5]<=arr1[9]))){
                min = arr1[5];
                        }
            if(arr1[6]<=arr1[0]&(arr1[6]<=arr1[1])&(arr1[6]<=arr1[2])&(arr1[6]<=arr1[4])&(arr1[6]<=arr1[5])&(arr1[6]<=arr1[3]&(arr1[6]<=arr1[7])&(arr1[6]<=arr1[8])&(arr1[6]<=arr1[9]))){
                min = arr1[6];
                        }
            if(arr1[7]<=arr1[0]&(arr1[7]<=arr1[1])&(arr1[7]<=arr1[2])&(arr1[7]<=arr1[4])&(arr1[7]<=arr1[5])&(arr1[7]<=arr1[6]&(arr1[7]<=arr1[3])&(arr1[7]<=arr1[8])&(arr1[7]<=arr1[9]))){
                min = arr1[7];
                        }
            if(arr1[8]<=arr1[0]&(arr1[8]<=arr1[1])&(arr1[8]<=arr1[2])&(arr1[8]<=arr1[4])&(arr1[8]<=arr1[5])&(arr1[8]<=arr1[6]&(arr1[8]<=arr1[7])&(arr1[8]<=arr1[3])&(arr1[8]<=arr1[9]))){
                min = arr1[8];
                        }
            if(arr1[9]<=arr1[0]&(arr1[9]<=arr1[1])&(arr1[9]<=arr1[2])&(arr1[9]<=arr1[4])&(arr1[9]<=arr1[5])&(arr1[9]<=arr1[6]&(arr1[9]<=arr1[7])&(arr1[9]<=arr1[8])&(arr1[9]<=arr1[3]))){
                min = arr1[9];
                        }
            
        }
        int mini =100;
        int maxi =0;
        System.out.println("]");
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("----Demo arrays[][]------");
        int arr2[][] = new int[10][10];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr2[i][j] = random.nextInt(100);}}
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
            System.out.printf("%4d",arr2[i][j]);
            if(mini>arr2[i][j])mini=arr2[i][j];
            if(maxi<arr2[i][j])maxi=arr2[i][j];}
            System.out.println();}
            System.out.println("min "+mini);
            System.out.println("max "+maxi);
        
    }
    }
    
    

