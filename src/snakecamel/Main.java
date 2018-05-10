package snakecamel;

public class Main {
 public static void main(String[] args){
	SnakeCamelUtil scu=new SnakeCamelUtil();
	String s="";
	String re="";
	re=SnakeCamelUtil.capitalize(s);
	re=scu.uncapitalize(s);
	re=scu.snakeToCamelcase(s);
	re=scu.camelToSnakecase(s);
 }
}
