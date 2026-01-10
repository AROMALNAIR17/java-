public class oddeven{
  public static void main(String[] args) {
    int[] arr= {3,4,5,6,76};
    int target=6;
    System.out.println(evad(arr,target));
    

      
  }

  static  boolean evad(int[]arr,int target ){
    for(int num:arr){
      if(num==target){
        return (num&1)==1;
      }
    }

     return false;

  }

}
