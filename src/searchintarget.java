public class searchintarget {
    public static void main (String [] args){
        int[]arr = {18,12,-7,3,14,28};
        int target = -7;
       System.out.println(linearSearch(arr,target,1,5));
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        //run for a loop
        for(int index=start;index<=end;index++){
            //check for element at every index = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        return -1;
    }
}
