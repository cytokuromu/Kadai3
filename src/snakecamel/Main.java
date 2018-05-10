package snakecamel;

public class Main {
 public static void main(String[] args){
	SnakeCamelUtil scu=new SnakeCamelUtil();
	String s="";
	scu.capitalize(s);
	scu.uncapitalize(s);
	scu.snakeToCamelcase(s);
	scu.camelToSnakecase(s);
 }
}
