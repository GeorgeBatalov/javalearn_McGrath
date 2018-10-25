 class Logic {
  

public static void main( String[] args ) {

boolean yes = true;
boolean no = false;

System.out.println( " Результат выражения yes И yes: " + (yes&&yes));
System.out.println( " Результат выражения yes И no: " + (yes&&no));

System.out.println( " Результат выражения yes ИЛИ yes: " + (yes||yes));
System.out.println( " Результат выражения yes ИЛИ no: " + (yes||no));
System.out.println( " Результат выражения no ИЛИ no: " + (no||no));


System.out.println( " первоначальное значение переменной yes : " + yes);
System.out.println( " инвертированная переменная yes : " + !yes);


}
} 