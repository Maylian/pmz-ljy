
/*
 * 移动平均滤波功能 对心电数据进行滑动滤波，使其去除噪音
 */
public class MovingAverageFilter {
    private static final int WINDOWS = 6;
    private int[] mTemp = null; // 只声明暂时不初始化,用来记录最后得不到均值处理的点
    private int[] mBufout = null;
    private int mWindowSize = WINDOWS;

    /*public MovingAverageFilter(int size) {
        mWindowSize = size;
    }*/

    // 均值滤波方法，输入一个buf数组，返回一个buf1数组，两者下表不一样，所以定义不同的下表，buf的下表为i，buf1的下表为buf1Sub.
    // 同理，临时的winArray数组下表为winArraySub
    public int[] movingAverageFilter(int[] buf) {
        int bufoutSub = 0;
        int winArraySub = 0;
        int[] winArray = new int[mWindowSize];

        if (mTemp == null) {
            mBufout = new int[buf.length - mWindowSize + 1];
            for (int Mi1 = 0; Mi1 < buf.length; Mi1++) {
                if ((Mi1+ mWindowSize) > buf.length) {
                    break;
                } else {
                    for (int j = Mi1; j < (mWindowSize +Mi1); j++) {
                        winArray[winArraySub] = buf[j];
                        winArraySub = winArraySub + 1;
                    }

                    mBufout[bufoutSub] = mean(winArray);
                    bufoutSub = bufoutSub + 1;
                    winArraySub = 0;
                }
            }
            mTemp = new int[mWindowSize - 1];
            System.arraycopy(buf, buf.length - mWindowSize + 1, mTemp, 0,
                    mWindowSize - 1);
            return mBufout;
        } else {
            short[] bufadd = new short[buf.length + mTemp.length];
            mBufout = new int[bufadd.length - mWindowSize + 1];
            System.arraycopy(mTemp, 0, bufadd, 0, mTemp.length);
            System.arraycopy(buf, 0, bufadd, mTemp.length, buf.length); // 将temp和buf拼接到一块
            for (int Mi2 = 0; Mi2 < bufadd.length; Mi2++) {
                if ((Mi2 + mWindowSize) > bufadd.length)
                    break;
                else {
                    for (int j = Mi2; j < (mWindowSize + Mi2); j++) {
                        winArray[winArraySub] = bufadd[j];
                        winArraySub = winArraySub + 1;
                    }
                    mBufout[bufoutSub] = mean(winArray);
                    bufoutSub = bufoutSub + 1;
                    winArraySub = 0;
                    System.arraycopy(bufadd, bufadd.length - mWindowSize + 1,
                            mTemp, 0, mWindowSize - 1);
                }
            }
            return mBufout;
        }
    }

    public int mean(int[] array) {
        long sum = 0;
        for (int Mi3 = 0; Mi3 < array.length; Mi3++) {
            sum += array[Mi3];
        }
        return (int) (sum / array.length);
    }
}
