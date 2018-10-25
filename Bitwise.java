class Bitwise {

public static void main ( String[] args ) {

int fs = 53; // הגמטקםמו ןנוהסעאגכוםטו 00110101



System.out.println( " Ôכאד 1: " + (( (fs&1)>0) ? "ÂÊË" : "ÂÛÊË")) ;

System.out.println( " Ôכאד 2: " + (( (fs&2)>0) ? "ÂÊË" : "ÂÛÊË")) ;
System.out.println( " Ôכאד 3: " + (( (fs&4)>0) ? "ÂÊË" : "ÂÛÊË")) ;
System.out.println( " Ôכאד 4: " + (( (fs&8)>0) ? "ÂÊË" : "ÂÛÊË")) ;
System.out.println( " Ôכאד 5: " + (( (fs&16)>0) ? "ÂÊË" : "ÂÛÊË")) ;
System.out.println( " Ôכאד 6: " + (( (fs&32)>0) ? "ÂÊË" : "ÂÛÊË")) ;
System.out.println( " Ôכאד 7: " + (( (fs&64)>0) ? "ÂÊË" : "ÂÛÊË")) ;
System.out.println( " Ôכאד 8: " + (( (fs&128)>0) ? "ÂÊË" : "ÂÛÊË")) ;

}
}