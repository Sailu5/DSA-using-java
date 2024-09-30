import java.util.*;

public class MediumArray{

    public static String twoSumArray(int a[],int target,int n){
        int left =0;
        int right = n-1;
        while(left < right){
            int sum = a[left]+a[right];

            if(sum == target){
                return "Yes";
            }
            else if(sum < target){
                left++;
            }
            else right--;
        }
        return "No";
    }

    // DUTCH FLAG ALGORITHM or SORT AN ARRAY O's nd 1's
    
    public static void sortArray(ArrayList<Integer> a,int n){
        int low =0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(a.get(mid) == 0){
                int temp = a.get(low);
                a.set(low,a.get(mid));
                a.set(mid,temp);
                low++;
                mid++;
            }
            else if(a.get(mid) == 1){
                mid++;
            }
            else{
                int temp = a.get(mid);
                a.set(mid,a.get(high));
                a.set(high,temp);
                high--;
            }
            
        }
        return;
    }

    // MOORE'S VOTING ALOGORITHM or Majority Element
    public static int majorityele(int a[],int n){
        int cnt =0;
        int el =0;
        for(int i=0;i<n;i++){
            if(cnt ==0){
                cnt =1;
                el =a[i];
            }
            else if(a[i] == el) cnt++;
            else cnt--;
        }
        int cnt1 =0;
        for(int i=0;i<n;i++){
            if(a[i] == el) cnt1++;
        }
        if(cnt1 >(n/2)) return el;
        return -1;
    }

    // KADAN'S ALGORITHM (MAXIMUM SUBARRAY OF SUM)

    public static long max_Subarray(int arr[],int n){
        long maxi = Long.MIN_VALUE;
        long sum=0;                            //TC =O(n) and SC = O(1)
        for(int i=0;i<n;i++){
            
            sum=sum+arr[i];
            if(sum >maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum =0;
            }
        }
        return maxi;
    }

    // bruteforce approach of maximumsub array

    public static int sumOfSubarray(int arr[],int n){
        int maximum = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum +=arr[k];
                }
                maximum=Math.max(maximum,sum);
            }
        }
        return maximum;
    }

    // REARRNGE ARRAY ELEMENTS BY SIGN
    public static int[] reArrangeArray(int arr[]){
        int pos=0;
        int neg = 1;
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg+=2;
            }
            else{
                ans[pos] = arr[i];
                pos+=2;
            }
        }
        return ans;
    }

    public static void main(String args[]){

        /*int a[] = {1,2,4,6,8,9};
        int target = 5;
        int n = 6;
        String res = twoSumArray(a,target,n);
        System.out.println(res); */

        // DUTCHflag
        /*int n=6;
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(a,n);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.print(a.get(i)+ " ");
        }*/

    //    Moore's voting
        /*int a[]={5,7,5,7,7,5,5,5,5,7};
        int n=10;
        int ans =majorityele(a,n);
        
        System.out.print(ans+"");
        

        System.out.println(); */


    // kadan's algorithm
    /*int arr[] = {-2,-1,4,-1,-2,1,5,-3};
    int n=8;
    // long res=max_Subarray(arr,n);
    int res = sumOfSubarray(arr,n);
    System.out.println(res);*/

    // rearrange array
    int arr[]={3,1,-2,-5,4,-2};
    int result[]=reArrangeArray(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(result[i]+" ");
    }


    }
}