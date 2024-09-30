public class BinarySearchonAns {

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

    // find the Nth root of M
    public static int func(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }
    public static int Nthroot(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int midN=func(mid,n,m);
            if(midN==1) return mid;
            else if(midN==0) low=mid+1;
            else high=mid-1;
        }
        return -1;
    } 
    public static void main(String[] args) {
        /*int n=3;
        int m=27;
        int ans=Nthroot(n, m);
        System.out.println(ans); */


        long n=28;
        long ans=sqrtnumber(n);
        System.out.println("the sqrt value i s:"+ans);
        
    }
}
