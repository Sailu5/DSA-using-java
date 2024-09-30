

public class Sorting1{

    public static void selection(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }                
            }
            int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            
            }
            System.out.println("After selection sort:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubble_sort(int arr[], int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Swapping:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertion_sort(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp= arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println("After Swapping:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

   
    
    public static void main(String args[]){
        int arr[]={30,80,70,10,50,43};
        int n= arr.length;
        System.out.println("before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // selection(arr,n);
        // bubble_sort(arr,n);
        // insertion_sort(arr,n);
        
    }
}