/**
 * linearSearch
 */
public class linearSearch {
    public static int linear_Search(int []arr,int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,78,3,8,4,7,9,23};
        int key = 4;
        int ans = linear_Search(arr,key);
        System.out.println(ans);
    }
}