import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchQ1 {
    public static void main(String[] args) {
//        Question 1 :Search for a key in a 2D array.
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3,4},{6,7,8,9}};
        Boolean found=false;
        System.out.println("Enter a key to find");
        int num=sc.nextInt();
        for (int i=0; i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==num){
                    found=true;
                    System.out.println(num+ " is found at "+arr[i][j]);
                }
            }
        }
        if (!found){
            System.out.println(num+" not found!");
        }
    }
}
