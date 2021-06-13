
public class RemoveElementFromArr {
    public static void main(String[] args){
        int [] nums = {3,2,2,3};
        int val = 3;
        /////////////////////////////////////////
//        int j=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==val){
//                nums[i]=0;
//            } else {
//                j++;
//            }
//        }
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
//        System.out.println(j);
        /////////////////////////////////////////
        int j = 0;
        for(int i=1;i<j;i++){
            if(nums[j]==val){
                nums[j]=nums[i];
                j++;
            } 
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
