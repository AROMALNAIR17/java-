class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>Result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                Result.add("FizzBuzz");}
            else if(i%3==0){
                Result.add("Fizz");}
              else  if( i%5==0){
                Result.add("Buzz");}
                else {
   Result.add(String.valueOf(i));
}
 



        }
        return Result;
        

        
    }
}
