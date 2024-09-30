import java.util.*;

public class Arrays{

    //optimal approach
    public static int largest(int arr[]){

        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>= large){
                large=arr[i];
            }
        }
        return large;
    }

    // second largest nd second smallest element in an array

    public static int secondSmallest(int[] arr, int n)
    {

        if (n < 2)
        {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++)
        {
        if (arr[i] < small)
        {
            second_small = small;
            small = arr[i];
        }
        else if (arr[i] < second_small && arr[i] != small)
        {
            second_small = arr[i];
        }
        }
    return second_small;
    }
    public static int secondLargest(int[] arr, int n)
    {
        if(n<2)
        return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
    
    // check Array is sorted or not
    // brute force approach
    public static boolean sorted_arr(int arr[], int n){
        for(int i=0; i<n ;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
            
        }
        return true;
    }
    // optimal approach
    public static boolean sort_array(int arr[], int n){
        for(int i=1;i< n;i++){
            if(arr[i]< arr[i-1]) return false;
        }
        return true;
    }

    // remove duplicates from an array

    public static int duplicates(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    // left rotate of an array in one place

    public static void left_one(int arr[],int n){
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1] = temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    // left rotate of an array in d places

    // brute force approach
    public static void left_rotate(int arr[],int n,int k){
        if(n==0) return;
        k = k % n;
        if(k > n) return;
        int temp[] = new int[k];
        for(int i=0;i< k;i++){
            temp[i] =arr[i];
        }
        for(int i=0;i< n-k;i++){
            arr[i] = arr[i+k];
        }
        for(int i=n-k;i<n;i++){
            arr[i] =temp[i-n+k];
        }
    }

    // optimal solution for left rotate
    public static void Reverse(int arr[], int start,int end){
        while(start <= end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void left_rotate1(int arr[],int n, int k){
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        Reverse(arr,0,n-1);
    }


    // optimal solution
    
    public static void right_rotate1(int arr[],int n, int k){
        Reverse(arr,0,n-k-1);
        Reverse(arr,n-k,n-1);
        Reverse(arr,0,n-1);
    }

    // zeros move end of the array

    public static int[] move_Zeros(int arr[],int n){
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i]== 0){
                j=i;
                break;
            }
        }
        if(j == -1) return arr;

        for(int i=j+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                j++;
            }
        }
        return arr;
    }

    // linear Search
    public static int linear(int arr[],int n,int nums){
        for(int i=0;i<n;i++){
            if(arr[i] == nums) return i;
        }
        return -1;
    }

    // Missing number using xor operation
    public static int missing_number(int arr[],int n){
        int xor1 =0;
        int xor2 =0;
        for(int i=0;i<n-1;i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 =xor1^n;
        return xor1 ^ xor2;
    }

    // maximumconsecutive numbers
    public static int maximumconsecutive(int arr[]){
        int maxi =0;
        int cnt=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] ==1){
                cnt++;
                maxi = Math.max(maxi,cnt);
            }
            else{
                cnt =0;
            }
        }
        return maxi;
    }

    // the number appearance by once and othe number appereance by twice

    public static int once_number(int arr[]){
        int xor =0;
        for(int i=0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;
    }

    // longest Sumof subarray both +ve nd negative

    public static int sumOfSubarray(int a[],int k,int n){
        int sum=0;
        int maxlen = 0;
        Map<Integer,Integer>preSum = new HashMap<>();
        for(int i=0;i<n;i++){
            sum += a[i];
            
            if(sum ==k){
                maxlen = Math.max(maxlen, i+1);
            }
            int rem = sum-k;
            if(preSum.containsKey(rem)){
                int len = i - preSum.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if(!preSum.containsKey(sum)){
                preSum.put(sum, i);
            }
        }
        return maxlen;
    }
    
    
    public static void main(String args[]){
       
        // int arr[]={10,30,20,50,32};
        // int arr[]={10,20,30,40,50};
        // int n = 5;
        
        // System.out.println(largest(a));
        // int n = arr.length;
		// int sS = secondSmallest(arr, n);
		// int sL = secondLargest(arr, n);
        // System.out.println("Second smallest is "+sS);
        // System.out.println("Second largest is "+sL);
        // System.out.println(sorted_arr(arr,n));
        // System.out.println(sort_array(arr,n));

        // int arr[] = {1,1,2,2,3,3};
        // int k = duplicates(arr);
        // for(int i=0;i<k;i++){
        //     System.out.print(arr[i]+ " ");

        // int arr[] ={1,2,3,4,5};
        // int n=5;
        // left_one(arr,n);

        // int n=8;
        // int arr[] ={1,2,3,4,5,6,7,8};
        // int k=2;
        // // left_rotate(arr,n,k);
        // left_rotate1(arr,n,k);
        // // right_rotate1(arr,n,k);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // int arr[] ={1,0,3,0,5,0,4,6};
        // int n=8;
        // int res[]=move_Zeros(arr,n);
        // for(int i=0;i<n;i++){
        //     System.out.print(res[i]+" ");
        // }


        // int arr[] ={1,2,3,5};
        // int n=5;
        // int res=missing_number(arr,n);
        // System.out.print(res+" ");
        // System.out.println();


        // int arr[]={1,1,0,1,1,1,0,0,1,1};
        // int res = maximumconsecutive(arr);
        // System.out.print(res);

        // int arr[] ={1,1,2,2,3,4,4,5,5};
        // int ans = once_number(arr);
        // System.out.println(ans);

        int a[] = {1,2,1,0,1};
        int n=5;
        int k=4;
        int res= sumOfSubarray(a,k,n);
        System.out.print(res);
    }   
    
}