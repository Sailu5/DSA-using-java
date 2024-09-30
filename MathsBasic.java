import java.util.*;

public class MathsBasic{
    public static void countdigit(int n){
        int count=0;
        while(n > 0){
            int digit = n%10;
            count =count+1;
            n = n/10;
        }
        System.out.println(count);
    }
    //reverse of a number
    public static void reverse(int n){
        int rev=0;
        while(n>0){
            int lastdigit=n % 10;
            rev=rev*10+lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }

    //palindrome
    public static void palindrome(int n){
        int rev=0;
        int temp= n;
        while(n>0){
            int ld = n%10;
            rev= rev*10+ld;
            n = n/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    
    // Armstrong
    public static void armstrong(int n){
        int sum=0;
        int temp= n;
        int k = String.valueOf(n).length();
        while(n>0){
            int ld = n%10;
            sum = sum +(int)Math.pow(ld,k);
            n= n/10;
        }
        if(temp==sum){
            System.out.println("it is a armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
    }
    //prime numbers
    public static void prime(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }            
        }
        if(cnt==2) System.out.println("prime");
        else System.out.println("not prime");
    }

    //print all divisiorss
    public static ArrayList<Integer> finddivisior(int n){
        ArrayList<Integer> divisor =new ArrayList<>();
        int sqrtN = (int)Math.sqrt(n);
        for(int i=1;i<=sqrtN;i++){
            if(n%i ==0){
                divisor.add(i);
                if(n/i!=i){
                    divisor.add(n/i);
                }
            }
             
        }
       return divisor;       
    }

    //Euclidean Algorithm [GCD and HCF]
    public static void euclidean(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }            
        }
        if(a==0){
           System.out.println(b);
        }
        System.out.println(a);
    }




    public static void main(String args[]){
        
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int n=121;
        // countdigit(n);
        // reverse(n);
        // palindrome(n);
        // int n=371;   //1634
        // armstrong(n);
        // prime(n);
        // finddivisior(n);
        euclidean(15,10);
    }
}