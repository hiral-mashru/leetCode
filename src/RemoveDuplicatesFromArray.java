import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicatesFromArray {
    
    public static void main(String [] args){
        int [] nums = {1,1,2};
        
//        HashSet<Integer> hs = new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            hs.add(nums[i]);
//        }
//        System.out.println(hs.size()+", nums = "+hs);
      
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i+1);
    }
}
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2]