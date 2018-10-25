class Car
{

private String maker;

private String color;

private String bodyType;

private String accelerate()
{

String motion = "SPEED UP DUDE";
return motion;

}

public void setCar ( String brand, String paint, String style)
{

maker = brand;
color = paint;
bodyType= style;


}
public void getCar ()
{

System.out.println( maker + " cvet " + color ) ; 
System.out.println( maker + " tip kuzova " + bodyType ) ;  
System.out.println( maker + "  " + accelerate() + "\n" ) ;

}

}