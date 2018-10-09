

public class Parameter {




    public Parameter(byte[] data)
    {

        switch (data[2])
        {
         //   case 0x02: PARA_ECG para_ecg = new PARA_ECG(data);
            // case 0x03: PARA_RESP para_resp = new PARA_RESP(data);
            // case 0x04: PARA_TEMP para_temp = new PARA_TEMP(data);
             case 0x05:
                 PARA_SPO2 para_spo2 = new PARA_SPO2(data);

              /*   m_mwdp.pr = para_spo2.getPR();
                 m_mwdp.spo2 = para_spo2.getSPO2();
                 int[] SPO2_data = para_spo2.getSPO2_WAVE();
                 m_mwdp.setSPO2_ECG_RESPwavedata(SPO2_data);*/


        //    case 0x06: PARA_NIBP para_nibp = new PARA_NIBP(data);
            default:break;
        }

    }

}
