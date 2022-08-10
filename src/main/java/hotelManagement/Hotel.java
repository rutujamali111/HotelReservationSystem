package hotelManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Hotel 
{
	Rates r=new Rates();
	String NameOfHotel;
	int Rating;
	int ratesPerDay;
	String inDate;
	String outDate;
	
	
	public Hotel( String nameOfHotel, int rating, int ratesPerDay, String inDate, String outDate) {
		super();
		NameOfHotel = nameOfHotel;
		Rating = rating;
		this.ratesPerDay = ratesPerDay;
		this.inDate = inDate;
		this.outDate = outDate;
	}
	public String getNameOfHotel() {
		return NameOfHotel;
	}
	public void setNameOfHotel(String nameOfHotel) {
		NameOfHotel = nameOfHotel;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	
	public int getRatesPerDay() {
		return ratesPerDay;
	}
	public void setRatesPerDay(int ratesPerDay) {
		this.ratesPerDay = ratesPerDay;
	}
	@Override
	public String toString() {
		return "Hotel [NameOfHotel=" + NameOfHotel + ", Rating=" + Rating + ", ratesPerDay=" + ratesPerDay + "]";
	}
	public int setTotalBill()
	{
		int totalBill=r.dateConversion(inDate, outDate)*ratesPerDay;
		return totalBill;
	}
	
	
}
