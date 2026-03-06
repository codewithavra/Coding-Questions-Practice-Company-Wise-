// Wap in java to identify second largest and second smallest elements from an array (command line integer array)

// Time 15 min

public class Q2{
    static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = max;
        for(int num : arr){
            if(num > max){
                smax = max;
                max = num;
            }
            else if(num > smax && num != max){
                smax = num;
            }
        }
        return smax;
    }
    static int secondSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        int smin = min;
        for(int num : arr){
            if(num < min){
                smin = min;
                min= num;
            }
            else if(num < smin && num != min){
                smin = num;
            }
        }
        return smin;
    }
    public static void main(String[] args) {
       int[] arr = new int[args.length] ;
       for(int i=0;i<args.length;i++){
        arr[i] = Integer.parseInt(args[i]);
       }
       System.out.println(secondLargest(arr));
       System.out.println(secondSmallest(arr));
    }
}