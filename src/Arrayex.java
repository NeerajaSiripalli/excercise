import java.util.*;
public class Arrayex {
    public static void main(String args[]){
        int arr[]=new int[10];
        Scanner in=new Scanner(System.in);
        int k=0;
        for(int i=0;i<10;i++){
            int m=in.nextInt();
            arr[i]=m;
        }
        for(int i=0;i<10;i++){
            if(arr[i]<arr[i+1]){
                k=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=k;
            }
        }
        System.out.println("arr[9]");

    }
}
