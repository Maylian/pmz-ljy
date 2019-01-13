import java.util.*;

public class MedianFilter {
    public int[] medianFilter (int[] data) {
        List<Integer> dataY = new ArrayList<>();//数组转list
        for (int i = 0; i < data.length; i++) {
            dataY.add(data[i]);
        }
        List<Integer> newDataListY = new ArrayList<Integer>();//for循环i = 10为数组长度  中值滤波
        for(int i=10;i<dataY.size()-10;i++) {
            List<Integer> sortList = new ArrayList<Integer>(dataY.subList(i - 10, i + 10));
            Collections.sort(sortList);
            Integer mid = sortList.get(sortList.size() / 2);
            newDataListY.add((dataY.get(i) - mid));
        }
        //list转数组
        //  Integer[] DataY=newDataListY.toArray(new Integer[newDataListY.size()]);

        //使用for循环得到数组 第二种方法
        int[] DataY = new int[newDataListY.size()];
        for(int i = 0; i < newDataListY .size();i++){
            DataY [i] = newDataListY.get(i);
        }
        return  DataY;
    }


}
