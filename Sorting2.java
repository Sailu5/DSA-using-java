import java.util.*;

class Solution{

     public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
     }
    public static void mergesort(int arr[],int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
            
    }

    public static int partition(List<Integer>arr,int low,int high){
        int pivot=arr.get(low);
        int i=low;
        int j= high;
        while(i<j){
            while(arr.get(i)<=pivot && i<= high-1){
                i++;
            }
            while(arr.get(j) > pivot && j>=low+1){
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp=arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j,temp);
        return j;
    }
     public static void qs(List<Integer>arr,int low,int high){
        if(low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
}
public class Sorting2{
    public static void main(String args[]){
       
        // int arr[]={20,87,56,80,10,15,65};
        // int n=arr.length;
        // System.out.println("Before swapping:");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // // Solution.mergesort(arr,0,n-1);


        List<Integer> arr=new ArrayList<>();
        // arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
         System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = Solution.quickSort(arr);        
        System.out.println("After Swapping:");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}