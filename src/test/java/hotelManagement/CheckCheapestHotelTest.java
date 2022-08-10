package hotelManagement;

import junit.framework.TestCase;

public class CheckCheapestHotelTest extends TestCase 
{
	public void test()
	{
		HotelManager h=new HotelManager();
		
		assertEquals(220, h.main());
	}
}
