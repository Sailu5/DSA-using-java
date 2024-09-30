


public class BinarySearch1D{
    public static int bs1DSorted(int arr[],int target,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>=target) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }

    // LOWER BOUND
    public static int lowerBound(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    // UPPER BOUND
    public static int upperBound(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    // Search insert position
    public static int searchInsert(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    // Floor and Ceil 
    public static int findFloor(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] <= target) {
                ans = arr[mid];
                //look for smaller index on the left
                low = mid + 1;
            } else {
                high = mid - 1; // look on the right
            }
        }
        return ans;
    }

    public static int findCeil(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= target) {
                ans = arr[mid];
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public static int[] getFloorAndCeil(int[] arr, int n, int target) {
        int f = findFloor(arr, n, target);
        int c = findCeil(arr, n, target);
        return new int[] {f, c};
    }


    public static int firstOccurence(int arr[],int n,int k){
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    // last occurence
    public static int lastOccurence(int arr[],int n,int k){
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }

    // number of occurence
   public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = firstOccurence(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurence(arr, n, k);
        return new int[] {first, last};
    }

    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    // serach in rotated sorted array

    public static int searchrotated(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;

            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target <= arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]< target && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    // search in sorted array II

    public static boolean searchrotatedII(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return true;

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low = low+1;
                high = high-1;
                continue;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target <= arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]< target && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }


    // minimumnumber od rotated sorted array

    public static int findMin(int []arr) {
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                ans=Math.min(ans,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }


    // Find out how many times the array has been rotated
    public static int findKRotation(int []arr){
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }
        return index;
    }

    // to find single element from sorted array
    public static int singleSorted(int arr[],int n){

        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int low=1;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if((mid%2==1 && arr[mid]==arr[mid-1] ) || (mid%2==0 && arr[mid]==arr[mid+1])){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    // SQUARE Root of a numbers

    public static long sqrtnumber(long n){
        long low=1;
        long high=n;
        while(low<=high){
            long mid=(low+high)/2;
            long val=(mid*mid);
            if(val<=n){
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }

    // find the peak element index
    public static int peekelmnt(int arr[],int n){
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=arr[mid+1] && arr[mid]>=arr[mid-1]){
                return mid;
            }
           
            else if(arr[mid]<arr[mid+1]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    



    public static void main(String args[]){
        
        /*int arr[] = {10,20,30,40,60,80,88,90,120,125};
        int target =58 ;
        int n=10;
        // int res=bs1DSorted(arr,target,n);
        /*if(res==-1){
            System.out.println("The target is not present.");
        }
        else{
             System.out.println("the target present in index:"+res);
        } //
        // int res=lowerBound(arr,n,target);
        // int res=upperBound(arr,n,target);
        // int res=searchInsert(arr,n,target);
        int res[] = getFloorAndCeil(arr,n,target);
         System.out.println("the target present in index:"+res[0]+ " " +res[1]); */
        
        /*int arr[]={1,2,3,5,5,5,5,6,7,8};
        int k=5;
        int n=10;
        // System.out.println(firstOccurence(arr,n,k));
        // System.out.println(lastOccurence(arr,n,k));
        System.out.println(count(arr,n,k)); */

        /* int arr[]={7,8,9,1,2,3,4,5,6};
        
        int n=9;
        int target=2;
        System.out.println(searchrotated(arr,n,target));*/

        /*int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int n=10;
        int target = 3;
        boolean ans = searchrotatedII(arr,n, target);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");*/


       /*int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans ); */

        /*int arr[]={4,5,1,2,3};
        int ans=findKRotation(arr);
        System.out.println("the number of rotatations occurs "+ans);*/

       /* int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        int n=11;
        int result=singleSorted(arr, n);
        System.out.println("the single element from the array:"+result+" ");  */


       /* long n=28;
        long ans=sqrtnumber(n);
        System.out.println("the sqrt value i s:"+ans); */

        int arr[]={1,2,3,4,5,6,7,8,1,2};
        int n=10;
        int ans=peekelmnt(arr, n);
        System.out.println(ans);
       
       
    }
}