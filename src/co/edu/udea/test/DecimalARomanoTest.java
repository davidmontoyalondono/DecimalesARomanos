package co.edu.udea.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.edu.udea.main.DecARomano;
import co.edu.udea.main.DecimalARomano;

public class DecimalARomanoTest {

	private DecimalARomano dr;
	private DecARomano dcR;
	private String ans;
	
	@Test 
	public void testDec9()
	{
		dcR = new DecARomano();
		ans = dcR.decARomano(9);
		assertEquals("IX",ans);
	}
	
	@Test
	public void testDec904()
	{
		dcR = new DecARomano();
		ans = dcR.decARomano(904);
		assertEquals("CMIV",ans);
	}
	
	@Test
	public void testDec98()
	{
		dcR = new DecARomano();
		ans = dcR.decARomano(98);
		assertEquals("XCVIII",ans);
	}
	
	@Test
	public void testDec999()
	{
		dcR = new DecARomano();
		ans = dcR.decARomano(999);
		assertEquals("CMXCIX",ans);
	}
	
	@Test
	public void test4(){
		int numero = 4;
		dr = new DecimalARomano();
		ans = dr.convertirRomano(numero);
		assertEquals("IV", ans);
	}
	
	@Test
	public void test9() {
		int numero = 9;
		dr = new DecimalARomano();
		String ans = dr.convertirRomano(numero);
		assertEquals("IX",ans);
	}
	
	@Test
	public void test40() {
		int numero = 40;
		dr = new DecimalARomano();
		String ans = dr.convertirRomano(numero);
		assertEquals("XL",ans);
	}
	
	@Test
	public void test90() {
		int numero = 90;
		dr = new DecimalARomano();
		String ans = dr.convertirRomano(numero);
		assertEquals("XC",ans);
	}
	
	@Test
	public void test400() {
		int numero = 400;
		dr = new DecimalARomano();
		String ans = dr.convertirRomano(numero);
		assertEquals("CD",ans);
	}
	
	@Test
	public void test900() {
		int numero = 900;
		dr = new DecimalARomano();
		String ans = dr.convertirRomano(numero);
		assertEquals("CM",ans);
	}
	
	@Test
	public void test1000() {
		int numero = 1000;
		dr = new DecimalARomano();
		String ans = dr.convertirRomano(numero);
		assertEquals("M",ans);
	}
	

}
