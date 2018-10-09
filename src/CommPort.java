import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;

//串口类
public class CommPort extends Thread{

    //串口名称,如“COM1"
    private String commPortName = "";
    //串口所有者名称,一般为应用程序名称
    private String ownerName;
/*    private String baudRate = "";
    private String dataBit = "";
    private String parityBit = "";
    private String stopBit = "";*/

    public void setCommPortName(String commPortName)
    {
        this.commPortName = commPortName;
    }
    public String getCommPortName() {
        return commPortName;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
/*

    public void setDataBit(String dataBit)
    {
        this.dataBit = dataBit;
    }
    public String getDataBit() {
        return dataBit;
    }

    public void setBaudRate(String baudRate)
    {
        this.baudRate = baudRate;
    }
    public String getBaudRate() {
        return baudRate;
    }

    public void setPartityBit(String partityBit)
    {
        this.partityBit = partityBit;
    }
    public String getPartityBit() {
        return partityBit;
    }

    public void setStopBit(String stopBit)
    {
        this.stopBit = stopBit;
    }
    public String getStopBit() {
        return stopBit;
    }

*/

    private CommPort commPort; //串口定义
    private SerialPort serialPort; //串口对象
    private InputStream inputStream; //字节输入
    private OutputStream outputStream; //字节输出
    private boolean isUse; //串口是否在使用

    /**
     * 打开串口
     * @throws Exception
     */
    public void open() throws Exception
    {
        CommPortIdentifier commPortIdentifier = CommPortIdentifier.getPortIdentifier(commPort.getCommPortName());

        //参1：设置为你的应用程序的名字；参2：开启端口超时的毫秒数
        serialPort = (SerialPort)commPortIdentifier.open(commPort.getOwnerName(),2000);
        serialPort.setOutputBufferSize(1024);

        inputStream = serialPort.getInputStream();
        outputStream = serialPort.getOutputStream();

        //设置串口参数
        serialPort.setSerialPortParams(230400,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);

    }

    /**
     * 判断串口是否可用
     */
    public boolean commPortEnable()
    {
        boolean result = false;
        Enumeration enumeration = CommPortIdentifier.getPortIdentifiers();
        while (enumeration.hasMoreElements())
        {
            CommPortIdentifier portIdentifier = (CommPortIdentifier)enumeration.nextElement();
            if(portIdentifier.getPortType() == CommPortIdentifier.PORT_SERIAL && portIdentifier.getName().equals(commPort.getCommPortName()))
            {
                result = true;
            }
        }
        return result;
    }
/**
 * 设置串口接收超时时间
 * @param timeout 超时时间 单位秒
 * @throws Exception
 */
public void setReceiveTimeout(int timeout) throws Exception
{
    getSerialPort().enableReceiveTimeout(timeout*1000);
}
public CommPort getCommPort()
{
    return commPort;
}
public SerialPort getSerialPort()
{
    return serialPort;
}

public InputStream getInputStream()
{
    return inputStream;
}
public OutputStream getOutputStream()
{
    return outputStream;
}

public void setUse(boolean isUse)
{
    this.isUse = isUse;
}


    public CommPort ()
{
    
}


}
