package hotelManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rates {

	public int dateConversion(String inDate, String outDate) {
		// TODO Auto-generated method stub
		long diff = 0;
		SimpleDateFormat myFormat=new SimpleDateFormat("ddMMMyyyy");
		try {
			Date date1=myFormat.parse(inDate);
			Date date2=myFormat.parse(outDate);
			 diff=date2.getDay()-date1.getDay();
			//System.out.println(diff);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (int)(diff+1);
	}
}
