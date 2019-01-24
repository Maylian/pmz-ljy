import java.util.*;

public class MedianFilter {


        public int[]medianFilter(int[] data1)
        {
            List<Integer> samples = new ArrayList<>();//数组转list
            for (int i1 = 0; i1 < data1.length; i1++) {
                samples.add(data1[i1]);
            }

            //小于三个就不做了
            if(samples == null || samples.size() < 3)
            {
                //使用for循环得到数组 第二种方法
                int[] samplesData = new int[samples.size()];
                for(int i2 = 0; i2 < samples .size();i2++){
                    samplesData [i2] = samples.get(i2);
                }
                return samplesData;
            }
            else {
                try {
                    //邻域的个数
                    int medianSampleCount = 7;
                    List<Integer> newSamples = new ArrayList<Integer>();

                    for(int i3=0;i3<samples.size();i3++) {
                        //定义邻域
                        List<Integer> medianSample = new ArrayList<Integer>();

                        int count = medianSampleCount;
                        int step = 1;
                        //先取左边的，再取右边的
                        boolean left = true;

                        medianSample.add(samples.get(i3));

                        while(count-- > 1) {
                            int index = 0;

                            if(left) {
                                index = i3 - step;

                                if(index < 0) {
                                    //index = samples.size() - Math.abs(index);
                                    medianSample.add(0);
                                }
                                else{
                                    medianSample.add(samples.get(index));
                                }
                            }
                            else {
                                index = i3 + step;

                                if (index >= samples.size()) {
                                    // index = index - samples.size();
                                    medianSample.add(0);
                                }
                                else{
                                    medianSample.add(samples.get(index));
                                }
                                step++;
                            }

                            left = !left;

                        }
                        //排序
                        Collections.sort(medianSample);

                        //取中值
                        if(medianSampleCount % 2 == 0) {
                            Integer avg = (medianSample.get(medianSampleCount / 2 - 1) + medianSample.get(medianSampleCount / 2)) / 2;
                            newSamples.add(avg);
                        }
                        else {
                            newSamples.add(medianSample.get(medianSampleCount / 2));
                        }
                    }
                    //使用for循环得到数组 第二种方法
                    int[] NSamples = new int[newSamples.size()];
                    for(int i4 = 0; i4 < newSamples .size();i4++){
                        NSamples [i4] = newSamples.get(i4);
                    }
                    return NSamples;
                }
                catch(Exception e) {
                    e.printStackTrace();
                    int[] NSamples2 = new int[samples.size()];
                    for(int i5 = 0; i5 < samples .size();i5++){
                        NSamples2 [i5] = samples.get(i5);
                    }
                    return NSamples2;
                }
            }
        }
}


