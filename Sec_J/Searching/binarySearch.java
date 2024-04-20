public class binarySearch {

    public static int binary_Search(int []arr,int key){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == key)return mid;
            else if(arr[mid] > key)e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,78,3,8,4,7,9,23};
        int key = 4;
        int ans = binary_Search(arr,key);
        System.out.println(ans);
    }
}
