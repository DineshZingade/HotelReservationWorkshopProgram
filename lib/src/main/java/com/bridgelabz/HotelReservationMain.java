package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationMain {
	Map<String, Hotel> hotelResrvationMain = new HashMap();

	private void addHotel() {
		Hotel obj1 = new Hotel("Hotel Marriot", 100);
		Hotel obj2 = new Hotel("Hotel Rainbow", 200);
		hotelResrvationMain.put(obj1.getName(), obj1);
		hotelResrvationMain.put(obj2.getName(), obj2);

		System.out.println(obj1.getName());
		System.out.println(obj1.getRate());
		System.out.println(obj2.getName());
		System.out.println(obj2.getRate());

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program...");
		System.out.println("The Name of Hotels and its Rates for regular customer");
		HotelReservationMain obj = new HotelReservationMain();
		obj.addHotel();
	}

}
