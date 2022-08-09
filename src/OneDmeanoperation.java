import java.util.*;
public class OneDmeanoperation {
    public static void main(String args[]){
        int size = 6;
        int array[] = new int[6];
        Scanner in =new Scanner(System.in);
        int sum=0;
        float mean=0;
        float median=0;
        int count =0,mode=0;
        int maximumcount=0;
        for(int i=0;i<6;i++){
            int elements= in.nextInt();
            array[i]=elements;
        }
        for(int i=0;i<6;i++) {
            sum = sum + array[i];
        }
        mean=(sum/6);

        System.out.println("Mean is : %.2f",mean);
        Arrays.sort(array);
        median=(array[(6/2)]+array[(6/2)+1])/2;
        System.out.println("Median is : %.2f",median);
        for(int i=0;i<6;i++){
            count=0;
            for(int j=1;j<6;j++){
                if(array[i]==array[j]) {
                    count = count + 1;
                }
                if(count>maximumcount) {
                    maximumcount = count;
                    mode = array[i];
                }
                }
            System.out.println(mode);

            }


        }


    }

