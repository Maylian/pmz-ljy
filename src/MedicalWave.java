import javax.swing.*;
import java.awt.*;

public class MedicalWave {

    public static MainMedicalWaveFrame _mmwf = new MainMedicalWaveFrame();

    public static void main(String[] args)
    {
        System.out.println("MedicalWave");
        Dimension _screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int _scWidth =(int)_screensize.getWidth();
        int _scHeight = (int)_screensize.getHeight();
        int _mfWidth = 1038;//MainMedicalWaveFrame-this的大小
        int _mfHeight = 774;
        int _muWidth = 660;
        int _muHeight = 550;
        int _mfHalfWidth = (int) _mfWidth / 2;
        int _mfHalfHeight = (int) _mfHeight / 2;
        int _scHalfWidth =  (int)( _scWidth / 2) ;
        int _scHalfHeight = (int)(_scHeight /2);
        //_mmwf.setBounds(-7,0,_mfWidth,_mfHeight);
        _mmwf.setBounds(Math.abs(_scHalfWidth - _mfHalfWidth),Math.abs(_scHalfHeight - _mfHalfHeight), _mfWidth, _mfHeight );
       // _mmwf.setLocationRelativeTo(null);
        _mmwf.setVisible(true);//显示MainMedicalFrame
        _mmwf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Serial_Port _sp = new Serial_Port(_mmwf);

       // _sp.StartSerial_Port();
        _mmwf.DrawStart();//Strart Draw  Graph
    //    _mmwf.RealTime();


        System.out.println("Medical Wave Demo Frame exit()");
        Serial_Port _sp = new Serial_Port(_mmwf);

        return ;

    }

}
