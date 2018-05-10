package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test

	public void snakecase文字列abc_def_ghiをcamelcaseへ変換(){ 

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="AbcDefGhi"; 

	String actual=scu.snakeToCamelcase("abc_def_ghi"); 

	assertThat(actual, is(expected)); 

	}

	 

	@Test

	public void snakecase文字列a_b_cdefをcamelcaseへ変換(){

	SnakeCamelUtil scu=new SnakeCamelUtil(); 

	String expected="ABCdef";

	String actual=scu.snakeToCamelcase("a_b_cdef"); 

	assertThat(actual, is(expected));

	}

	 

	@Test

	public void snakecase文字列abcdefをcamelcaseへ変換(){ 

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="Abcdef";

	String actual=scu.snakeToCamelcase("abcdef");

	assertThat(actual, is(expected));

	}

	 

	@Test

	public void camelcase文字列AbcDefGhiをsnakecaseへ変換(){

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="abc_def_ghi";

	String actual=scu.camelToSnakecase("AbcDefGhi");

	assertThat(actual, is(expected));

	}

	 

	@Test

	public void camelcase文字列ABcDeFGhiJをsnakecaseへ変換() {

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="a_bc_de_f_ghi_j";

	String actual=scu.camelToSnakecase("ABcDeFGhiJ");

	assertThat(actual, is(expected));

	}

	 

	@Test

	public void camelcase文字列Abcdefghをsnakecaseへ変換() {

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="abcdefgh";

	String actual=scu.camelToSnakecase("Abcdefgh");

	assertThat(actual, is(expected));

	}

	 

	@Test

	public void camelcase文字列abcDeFghiをsnakecaseへ変換() {

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="abc_de_fghi";

	String actual=scu.camelToSnakecase("abcDeFghi");

	assertThat(actual, is(expected));

	}

	 

	@Test

	public void 最初の文字を大文字にする(){

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="Abcd";

	String actual=scu.capitalize("abcd");

	assertThat(actual, is(expected));

	}

	 

	@Test

	public void 最初の文字を小文字にする(){

	SnakeCamelUtil scu=new SnakeCamelUtil();

	String expected="abcd";

	String actual=scu.uncapitalize("Abcd");

	assertThat(actual, is(expected));

	}

}
