package hotelManagement;

import java.util.Comparator;

public class PriceComparator implements Comparator<Hotel>
{
	public int compare(Hotel o1, Hotel o2) {
		
		if(o1.setTotalBill()==o2.setTotalBill())
			return 0;
		else if(o1.setTotalBill()>o2.setTotalBill())
			return 1;
		else
			return -1;
	}

}
