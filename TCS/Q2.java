/***
 * Problem Statement –
 * Joseph is learning digital logic subject which will be for his next semester. He usually tries
 * to solve unit assignment problems before the lecture. Today he got one tricky question. The
 * problem statement is “A positive integer has been given as an input. Convert decimal value to
 * binary representation. Toggle all bits of it after the most significant bit including the most
 * significant bit. Print the positive integer value after toggling all bits”.
 * 
 * Constrains-
 * 
 * 1<=N<=100
 * 
 * Example 1:
 * 
 * Input :
 * 
 * 10  -> Integer
 * 
 * Output :
 * 
 * 5    -> result- Integer
 * 
 * Explanation:
 * 
 * Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which
 * represents “5”. Hence output will print “5”.
 */

/**
 * import java.util.*;
class Main{

    static int func(int num){
        String binStr = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(char ch: binStr.toCharArray()){
            if(ch == '1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
        sc.close();
    }
}
 */
import java.util.*;
class Main{

    static int func(int num){
        int bitlength = (int)(Math.log(num)/Math.log(2)) + 1;
        
        int mask = (1<< bitlength) -1;
        
        return num ^ mask;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
        sc.close();
    }
}
