class CharacterSwap{

public static void main (String [] args){

String txt = "";

if (txt.isEmpty())txt = " ���������";

System.out.print( "������: " + txt ) ;
System.out.println( "����� �������������� ������: " + txt.length() ) ;

txt = txt.trim();

System.out.println("������: " + txt);

System.out.println("����� ������: " + txt.length());

char initial = txt.charAt(0);
System.out.println("������ ����� : "+ initial);

txt=txt.replace('�', '�');

System.out.println("������: " + txt);


}
}