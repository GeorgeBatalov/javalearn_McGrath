import java.time.LocalDateTime;

class DateTime{

public static void main (String[] args){

LocalDateTime date = LocalDateTime.now();

System.out.println("\nNow time is " + date);

date = date.withYear(2018);
System.out.println("\nTeper tekuchee vremya " + date);

String fields = "\nYear:\t\t\t" + date.getYear() ; 
fields += "\nMonth:\t\t\t" + date.getMonth() ; 
fields += "\nNum of the month:\t\t" + date.getMonthValue() ; 
fields += "\nDay of the week:\t\t" + date.getDayOfWeek() ; 
fields += "\nDay of the month:\t\t" + date.getDayOfMonth() ; 
fields += "\nDay of the year:\t\t" + date.getDayOfYear(); 
fields += "\nHour (0-23):\t\t" + date.getHour() ; 
fields += "\nMinute:\t\t\t" + date.getMinute() ; 
fields += "\nSec:\t\t" + date.getSecond() ; 
System.out.println( fields ) ;

}

}