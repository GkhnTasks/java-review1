import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] myArray={2,7,13,11};

        System.out.println("Arrays.toString(twoSum(myArray,9)) = " + Arrays.toString(twoSum(myArray, 9)));
        System.out.println("Optimal Solution .......");
        System.out.println("Arrays.toString(twoSum1(myArray,9)) = " + Arrays.toString(twoSum(myArray, 9)));
    }

    public static  int[] twoSum(int[] array, int target) {

        for (int i = 0; i < array.length-1; i++) {

            for (int j = i+1; j < array.length-1; j++)
                if (array[i]+array[j]==target) return new int[]{i,j};


        }
        return new int[]{};
    }


    public static  int[] twoSum1(int[] array, int target) {

      //create hashmap

        Map<Integer,Integer> map=new HashMap<>();

      //iterate over the array.if a potential match exist return that
      //indices else put the array value and index to map

        for (int i = 0; i < array.length; i++) {
            int potentialmatch=target-array[i];
            if (map.containsKey(potentialmatch)) return  new int[]{i,map.get(potentialmatch)};
            else map.put(array[i],i);
        }
        return  new int[]{};
    }

}
