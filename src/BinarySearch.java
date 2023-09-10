
//Implement Binary Search in Java using recursion.
// The array should be sorted for this already

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 13, 17, 21, 30};
        if(binarySearch(arr, 0, arr.length-1, 30))
            System.out.println(" Element Found. ");
        else
            System.out.println(" Element not Found.");
    }

    private static boolean binarySearch(int[] arr, int start, int end, int searchElement) {

        if(start > end)
            return false;

        int midpoint = (start+end)/2;

        if(searchElement == arr[midpoint]){
            return true;
        }
        if(searchElement < arr[midpoint]) {
            return binarySearch(arr,start,midpoint-1,searchElement);
        }

        return binarySearch(arr,midpoint+1,end,searchElement);

    }
}
