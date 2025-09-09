import java.util.Scanner;

public class LinearSearchQ3 {
    public static void main(String[] args) {
//        First and Last Position
//        Using linear search, find the first and last index of an element in the array.
        int[] arr ={2,4,5,7,4,9,4,8,1};
        Boolean index=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int fi = 0;
        int li=0;
        for (int i =0; i<arr.length;i++){
            if (arr[i]==num){
                fi=i;
                for (int j= arr.length-1;j>=0;j--){
                       if (arr[j]==num){
                           li=j;
                           index=true;
                            break;
                       }
                }
                break;
            }
        }
        if (index){
          if (fi==li){
              System.out.println("First index and last index are same i.e " +fi);
          }
          else {
              System.out.println("First index is "+fi +" last index is "+li);
          }
        }
    }
}
