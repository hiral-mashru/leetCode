import java.util.*;
public class twoSum {
    public int[] twoSum1(int[] arr, int target) {
        HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++) {
            hmap.put(arr[i],i);
        }        
        for(int i=0;i<arr.length;i++){
            int c = target-arr[i];
            if(hmap.containsKey(c) && hmap.get(c) !=i){
                return new int[] {i, hmap.get(c)};
            }
        }
        return null;
    }
    public static void main(String[] args){
        System.out.println("Enter array: ");
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        twoSum s = new twoSum();
        int[] ans = s.twoSum1(arr, target);
        System.out.println(ans[0]+" "+ans[1]);
        
    }   
}