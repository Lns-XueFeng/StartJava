import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * Create by xuefeng on 2023.1.28
 */

public class MyArray {
    protected Integer[] array;
    protected Integer arrayLength;

    public MyArray(Integer[] arrayList, Integer length) {
        array = arrayList;
        arrayLength = length;
    }

    public Integer[] printArray() {
        return array;
    }

    public Integer getArrayLength() {
        return array.length;
    }

    public Integer getMaxInArray() {
        int maxNum = 0;
        int count = 0;
        for (int i : array) {
            if (count+1 == arrayLength) {break;}

            int first = array[count];
            int second = array[count+1];
            int maxInCompare = Math.max(first, second);
            maxNum = Math.max(maxNum, maxInCompare);
            count = count + 1;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Date date = new Date();
        String nowDate = date.toString();
        System.out.println("Now is " + nowDate);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Formatted time is " + ft.format(date));
        System.out.println("\n");

        Integer[] array = {9, 0, 7, 1, 2, 3, 4, 5};
        MyArray myArray = new MyArray(array, array.length);
        Integer[] ownArray = myArray.printArray();
        Integer ownArrayLength = myArray.getArrayLength();
        Integer ownArrayMax = myArray.getMaxInArray();
        System.out.println("My Array List: " + Arrays.toString(ownArray));
        System.out.println("Its Length is " + ownArrayLength);
        System.out.println("Its Max Element is " + ownArrayMax);
    }
}
