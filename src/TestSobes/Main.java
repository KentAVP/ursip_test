package TestSobes;


import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

   }

    public static String generateNum(List<Integer> numbers){
        return  String.format("%03d", numbers
                .stream()
                .reduce(0,(one,two) -> two - one == 1 ? two : one) + 1);
    }


}
