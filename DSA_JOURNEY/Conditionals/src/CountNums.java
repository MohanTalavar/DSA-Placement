public class CountNums {

    public static void main(String[] args) {
        double num = 12221;

        int count = 0;
        while(num > 0){
           double rem = Math.floor( num % 10 ) ;
            if(rem == 1){
                count++;
            }

            num = num / 10;
        }
        System.out.println("Count :" + count);
    }
}

