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
	
	public String generateGebDatum()
	{
		String bday="";
		int year=1950+((int)Math.random()*((1990-1950)+1));
		bday+=year;
		int month=1+((int)Math.random()*((12-1)+1));
		if(month < 10)
			bday+="0";
		bday+=month;
		int day=1+((int)Math.random()*((31-1)+1));
		if(day < 10)
			bday+="0";
		bday+=day;
		return bday;
	}
	
	public char generateFuehrerschein()
	{
		if(Math.random() > 0.5)
			return 'j';
		return 'n';
	}

}
