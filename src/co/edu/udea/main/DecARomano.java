package co.edu.udea.main;

import java.util.HashMap;

public class DecARomano {
	
	HashMap<Integer, String> mapa = new HashMap<Integer, String>();
	
	public DecARomano()
	{
		mapa.put(0,"");
		mapa.put(1,"I");
		mapa.put(2,"II");
		mapa.put(3,"III");
		mapa.put(4, "IV");
		mapa.put(5, "V");
		mapa.put(6,"VI");
		mapa.put(7,"VII");
		mapa.put(8,"VIII");
		mapa.put(9,"IX");
		mapa.put(10, "X");
		mapa.put(20,"XX");
		mapa.put(30,"XXX");
		mapa.put(40, "XL");
		mapa.put(50,"L");
		mapa.put(60,"LX");
		mapa.put(70,"LXX");
		mapa.put(80,"LXXX");
		mapa.put(90,"XC");
		mapa.put(100,"C");
		mapa.put(200,"CC");
		mapa.put(300,"CCC");
		mapa.put(400,"CD");
		mapa.put(500,"D");
		mapa.put(600,"DC");
		mapa.put(700,"DCC");
		mapa.put(800,"DCCC");
		mapa.put(900,"CM");
		mapa.put(1000,"M");
		
	}
	
	public String decARomano(int numero)
	{
		String[] digitos = (String[])(Integer.toString(numero)).split("");
		int c = 1;
		int x = digitos.length;
		int d = 0;
		String ans = "";
		
		while(x > 0)
		{
			x = x - 1;
			d = Integer.parseInt(digitos[x]);
			ans =  mapa.get(d*c) + ans;
			c = c * 10;
		}
		
	    return ans;
	}

}
