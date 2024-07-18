package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataVerify {
    public java.sql.Date convertDatatosql(java.util.Date data){
        java.sql.Date sqlDate = new java.sql.Date(data.getTime());
        return sqlDate;
    }
    public String DateSQLtoUtil (Date data){
        SimpleDateFormat rtra = new SimpleDateFormat("yyyy-MM-dd");
        String dataf = rtra.format(data);
        String[] dataS = dataf.split("");
        String dataC = dataS[8] + dataS[9] + dataS[7] + dataS[5] + dataS[6] + dataS[4] + dataS[0] + dataS[1] + dataS[2] + dataS[3]; 
        return dataC;
    }
}
