package vidovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public long generateLehrerID()
	{
		return 1000000000 + ((long)Math.random()*((9999999999l-1000000000)+1));
	}
	
	public float generateGehalt()
	{
		return 1000+((float)Math.random()*((9999.99f-1000)+1));
	}
	
	public char generateFach()
	{
		char[] faecher={'d', 'e', 'm', 'g', 'l'};
		return faecher[(int)(Math.random()*5)];
	}

}
