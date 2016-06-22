package com.ttnd.bootcamp;

public class EnumExample {

	public static void main(String...args){
		Day day1 = Day.MONDAY;
		Day day2 = Day.SUNDAY;
		
		System.out.println("Day 1: " + day1.getDayOfWeek());
		System.out.println("Day 2: " + day2.getDayOfWeek());
		
		System.out.println("Day 1 comparedto Day2: " + day1.compareTo(day2));
	}
}

enum Day
	{MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private final Integer dayOfWeek;       
    private Day(Integer value) {
    	dayOfWeek = value;
    }

    public Integer getDayOfWeek() {
       return this.dayOfWeek;
    }
    }
