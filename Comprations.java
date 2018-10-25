class Comprations
{  
	public static void main( String[] args ) { 


String txt = "Fantastic";
String lang = "Java";
boolean state = ( txt==lang );  // Присваиваем результат проверки


System.out.println( "Проверка строк на равенство" + state );

state = ( txt != lang ); // присваиваем результат

System.out.println( "Проверка строк на равенство" + state );

int dozen = 12;

int score = 20;

state = ( dozen > score ); // присваиваем результат

System.out.println( "Проверка на больше" + state );

state = ( dozen < score ); // присваиваем результат

System.out.println( "Проверка на меньше" + state );

}
}