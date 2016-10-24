package test;

import org.junit.Assert;
import org.junit.Test;
import org.omg.tech.CarRentalApp;
import org.omg.tech.CarRentalApp.Vehicle;


public class CarRentalAppTest {
	
	@Test
	public void testContructor(){
		CarRentalApp instance = new CarRentalApp();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void testVehicle(){
		Assert.assertNotNull(CarRentalApp.Vehicle.BUS);
		Assert.assertNotNull(CarRentalApp.Vehicle.CAR);
		Assert.assertNotNull(CarRentalApp.Vehicle.SUV);
		Assert.assertNotNull(CarRentalApp.Vehicle.VAN);
	}
	

	@Test
	public void test_getAdditionalChargesForExtraTraveller_VAN_NO_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.VAN, 0, 0)==0);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_BUS_NO_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.BUS, 0, 0)==0);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_CAR_NO_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.CAR, 0, 0)==0);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_SUV_NO_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.SUV, 0, 0)==0);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_VAN_NO_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.VAN, 100, 10)==0);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_BUS_NO_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.BUS, 1000, 20)==0);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_CAR_NO_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.CAR, 300, 4)==0);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_SUV_NO_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.SUV, 400, 5)==0);
	}
	@Test
	public void test_getAdditionalChargesForExtraTraveller_VAN_NO_One_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.VAN, 100, 11)==100);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_BUS_NO_One_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.BUS, 1000, 21)==1000);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_CAR_NO_One_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.CAR, 300, 5)==300);
	}
	
	@Test
	public void test_getAdditionalChargesForExtraTraveller_SUV_NO_One_Extra_TRavellers(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForExtraTraveller(Vehicle.SUV, 400, 6)==400);
	}
	
	@Test
	public void test_getAdditionalChargesForAC_VAN(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForAC(100)==200);
	}
	
	@Test
	public void test_getAdditionalChargesForAC_BUS(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForAC(1000)==2000);
	}
	
	@Test
	public void test_getAdditionalChargesForAC_CAR(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForAC(300)==600);
	}
	
	@Test
	public void test_getAdditionalChargesForAC_SUV(){
		Assert.assertTrue(CarRentalApp.getAdditionalChargesForAC(100)==200);
	}
	

	@Test
	public void testgetTotal(){
		Assert.assertTrue(CarRentalApp.getTotal(Vehicle.BUS, 0, 0)==0);
	}
	
	@Test
	public void testgetTotal_SUV(){
		Assert.assertTrue(CarRentalApp.getTotal(Vehicle.SUV, 200, 5)!=0);
	}
	
	@Test
	public void testgetTotal_BUS(){
		Assert.assertTrue(CarRentalApp.getTotal(Vehicle.BUS, 1000, 22)==16700.0);
	}
	@Test
	public void testgetTotal_CAR(){
		Assert.assertTrue(CarRentalApp.getTotal(Vehicle.CAR, 2050, 4)==30750.0);
	}
	
	@Test
	public void testgetTotal_VAN(){
		Assert.assertTrue(CarRentalApp.getTotal(Vehicle.VAN, 1234.5, 10)==18517.5);
	}
	

}
