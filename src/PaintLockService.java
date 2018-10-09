import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PaintLockService {

    public final static Lock lock = new ReentrantLock();//创建一个ReentrantLock的实例
    public Condition condition = lock.newCondition();//返回用来与此Lock实例一起使用的condition实例

 //   private final Condition full = lock.newCondition(); //仓库满的条件变量
//    private final Condition empty = lock.newCondition();  //仓库空的条件变量


    public boolean hasValue = false;
    public void SetHasValue(boolean _v)
    {
        try
        {
            lock.lock();
            hasValue = _v;
        }
        finally
        {
            lock.unlock();
        }
    }
    public void await()//造成当前线程在接到信号或被中断之前一直处于等待状态
    {
        try
        {
            lock.lock();
            System.out.println(" await sss" + System.currentTimeMillis());//耗时
            condition.await();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }

    public void signal()//唤醒一个等待线程。
    {
        try
        {
            lock.lock();
        //    System.out.println("signalʱ��Ϊ" + System.currentTimeMillis());
            condition.signal();
        }
        finally
        {
            lock.unlock();//释放锁
        }
    }
}
