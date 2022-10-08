package 数组;

import java.util.Arrays;

/**
 * @author Albert
 * 查找数组里的最大数并返回下标
 */
public class ArrayTest {
  public static void main(String[] args) {
    int arr[] = {1,2,31,4,5,333};
    arrayMax(arr);
  }
  /**
  数组最大值
   */
  public static void arrayMax(int [] arr){
    int maxInt = arr[0],maxIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (maxInt<arr[i]){
        maxInt = arr[i];
        maxIndex = i;
      }
    }
    System.out.println("最大值为:"+maxInt+"位置："+(maxIndex+1));
  }
}
