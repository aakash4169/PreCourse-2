class BinarySearch {

    // Time Complexity : O(logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
    // Returns index of x if it is present in arr[l.. r], else return -1
    //implement in leetcode as well
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Write your code here
        int mid;
        while(l<=r)
        {
            mid=l + (r - l)/2;
            //mid=(l + r)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            if(x>arr[mid])
            {
                l=mid + 1;
            }
            else
            {
                r=mid - 1;
            }
        }
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
