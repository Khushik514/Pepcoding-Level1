import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        int r=sc.nextInt();
        rotateShell(arr,s,r);
        display(arr);
    }
    public static void rotateShell(int[][] arr,int s,int r){
        int[] oned=fillOnedfromShell(arr,s);
        rotate(oned,r);
        fillShellfromOned(arr,s,oned);
    }
    public static int[] fillOnedfromShell(int[][] arr,int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int sz=2*(maxr-minr+maxc-minc);
        int[] oned=new int[sz];
        int idx=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            oned[idx]=arr[i][j];
            idx++;
        }
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            oned[idx]=arr[i][j];
            idx++;
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            oned[idx]=arr[i][j];
            idx++;
        }
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            oned[idx]=arr[i][j];
            idx++;
        }
        return oned;
    }
    public static void fillShellfromOned(int[][] arr,int s,int[] oned){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int idx=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[i][j]=oned[idx];
            idx++;
        }
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j]=oned[idx];
            idx++;
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[i][j]=oned[idx];
            idx++;
        }
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            arr[i][j]=oned[idx];
            idx++;
        }
    }
    public static void rotate(int []oned,int r){
        r=r%oned.length;
        if(r<0)
        r=r+oned.length;
        reverse(oned,0,oned.length-r-1);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }
    public static void reverse(int []oned,int li,int ri){
        while(li<ri){
            int temp=oned[li];
            oned[li]=oned[ri];
            oned[ri]=temp;
            li++;
            ri--;
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r
Output Format
output is handled by display function
*/