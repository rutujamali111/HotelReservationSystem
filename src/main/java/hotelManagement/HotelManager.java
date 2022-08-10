package hotelManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HotelManager {

	public int main() 
	{
		// TODO Auto-generated method stub
		ArrayList<Hotel> hotels=new ArrayList<Hotel>();
		Scanner sc=new Scanner(System.in);
		String inDate=sc.next();
		String outDate=sc.next();
		Hotel LakeWood=new Hotel("Lakewood",3,110,inDate,outDate);
		Hotel BridegWood=new Hotel("BridgeWood",4,160,inDate,outDate);
		Hotel RidgeWood=new Hotel("RidgeWood",5,220,inDate,outDate);
		hotels.add(RidgeWood);
		hotels.add(BridegWood);
		hotels.add(LakeWood);
		Collections.sort(hotels,new PriceComparator());
		int result= hotels.get(0).setTotalBill();
		return result;
		
		
	}

}
