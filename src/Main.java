public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 5};
        String[] words = {"Fizz" , "Buzz"};

        for(int i = 1; i <= 100; i++){
            String result = "";

            for(int j = 0; j < nums.length; j++){
                if(i % nums[j] == 0){
                    result += words[j];
                }
            }

            if(result.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(result);
            }
        }
    }
}