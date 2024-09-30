

public class Recursion{
    
    //print the numbers from 1 to N
    public static void print1toN(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
       
        print1toN(i+1,n);
    }

    //print the numbers from N to 1
    public static void printNto1(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        printNto1(i-1,n);
    }

    //print n times of names
    public static void printNames(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Sailu");
        printNames(i+1,n);
    }

    //print N to 1 using backtracking
    public static void printbackNto1(int i,int n){
        if(i>n){
            return;
        }
        printbackNto1(i+1,n);
        System.out.println(i);
    }

    //print 1 to N using backtracking
    public static void printback1toN(int i, int n){
        if(i<1){
            return;
        }
        printback1toN(i-1,n);
        System.out.println(i);
    }

    //Sum of first N natural numbers using parameterized way

    public static void sumOfN(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }        
        sumOfN(i-1,sum+i);
    }

    //sum of first n natural numbers using functionalway
    public static int sumfunc(int n){
        if(n==0){
            return 0;
        }
        return n + sumfunc(n-1);
        
    }

    //factorial of n using  functional way
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }

    //factorial of n using iterative
    // public static void factorial(int n){
    //     int fact=1;
    //     for(int i=1;i<=n;i++){
    //         fact=fact*i;
            
    //     }
    //    return fact;
    // }

//reverse an array using two points approach
    public static void reverse(int []a,int l,int r){        
        while(l<=r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    } 
    
    //String is a palindrome or not
    public static boolean func(int i,String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return func(i+1,s);
    }
    public static void main(String args[]){
        // int n ;
        // Scanner sc = new Scanner(System.in);
        // n=sc.nextInt();
        // print1toN(1,n);
        // printNto1(n,n);
        // printNames(1,n);
        // printbackNto1(1,n);
        // printback1toN(n,n);
        // sumOfN(n,0);
        // System.out.println(sumfunc(n));
        // System.out.println(fact(n));
        // int ans=factorial(n);
        // System.out.println(ans);
        // int arr[]={10,20,30,40,50};
        // reverse(arr,0,n-1);
        // swap(0);
        String s="madam";
        System.out.println(func(0,s));
    }
}