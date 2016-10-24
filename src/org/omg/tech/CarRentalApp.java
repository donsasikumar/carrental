package org.omg.tech;

public class CarRentalApp {
	
	public enum Vehicle{
		SUV(5),CAR(4),VAN(10), BUS(20);
		
		private final int limit;
		private final char fuelType;
		private final boolean ac;
		
		Vehicle(int limit){
			this.limit = limit;
			this.fuelType = 'p';
			this.ac = false;
		}
		
		Vehicle(int limit, char fuelType, boolean ac){
			this.limit = limit;
			this.fuelType = fuelType;
			this.ac = ac;
		}
		
	}
	
/**
 * getTotal Method calculates the rental amount for a given vehicle based on the distance
 * to destination and number of travelers
 * @param vehicle type
 * @param distance in km
 * @param travellers - Total number of travelers
 * @return total price for rental including additional charges
 */
	public static double getTotal(Vehicle vehicle, double distance, int travelers){
		double standardTripTotal = (vehicle.fuelType=='p') ? (distance * 15) : (distance * 14);
		if(vehicle==Vehicle.BUS){
			standardTripTotal = standardTripTotal - (standardTripTotal *0.02);
		}
		double additionalCharges = getAdditionalChargesForExtraTraveller(vehicle, distance, travelers);
		additionalCharges = (vehicle.ac)? (additionalCharges + getAdditionalChargesForAC(distance)) : additionalCharges;
		return standardTripTotal + additionalCharges;
	}
	
	/**
	 * getAdditionalChargesForExtraTraveller Method
	 * @param vehicle type
	 * @param distance in km
	 * @param travellers  - Total number of travelers
	 * @return additionalCharge per extra passengers per km.
	 */
	
	public static double getAdditionalChargesForExtraTraveller(Vehicle vehicle, double distance, int travelers){
		if(travelers>vehicle.limit){
			return distance * (travelers-vehicle.limit);
		}
		return 0;
	}
	
	/**
	 * getAdditionalChargesForAC calculates the charge per km for AC vehicle
	 * @param distance
	 * @return
	 */
	
	public static double getAdditionalChargesForAC(double distance){
		return 2*distance;
	}

}
