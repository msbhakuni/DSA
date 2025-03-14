import java.util.*;

//leetcode 2529. Maximum Count of Positive Integer and Negative Integer
// Easiest way is to count pos and neg integers   O(n)
// using binary search to find lowerbound and upperboud  O(log(n))

// input array e.g [-2,-1,-1,1,2,3]   , [-3,-2,-1,0,0,1,2] , [5,20,66,1314]

class countPosNegInt {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        int ans = findCount(arr);
       System.out.println("ans is : "+ans);
       // printArray(arr);
    }

    public static void printArray(int [] arr){
        for(int x : arr)
            System.out.println(x+" ");
    }

    public static int findCount(int arr[]){
        int neg = lowerBound(arr);
        int pos = arr.length - upperBound(arr);
        return Math.max(pos,neg);
    }

    public static int lowerBound(int arr[]){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>=0)
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
    }

    public static int upperBound(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>0)
                right = mid-1;
            else
                left = mid+1;
        }
        return left;
    }
}