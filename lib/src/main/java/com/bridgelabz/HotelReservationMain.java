package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationMain {
	Map<String, Hotel> hotelResrvationMain = new HashMap();

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");
		HotelReservationMain obj = new HotelReservationMain();
		obj.addHotel();
	}

	private void addHotel() {
		Hotel obj1 = new Hotel("Marriot", 100);
		Hotel obj2 = new Hotel("Rainbow", 200);
		hotelResrvationMain.put(obj1.getName(), obj1);
		hotelResrvationMain.put(obj2.getName(), obj2);

		System.out.println(obj1.getName());
		System.out.println(obj1.getRate());
		System.out.println(obj2.getName());
		System.out.println(obj2.getRate());
	
	}

}
