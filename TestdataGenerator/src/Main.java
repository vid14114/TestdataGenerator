

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws IOException {
		String path=args[0];
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DAY_OF_MONTH);
		int num=1;
		if(args.length>1)
		{
			year=Integer.parseInt(args[1]);
			month=Integer.parseInt(args[2]);
			day=Integer.parseInt(args[3]);
			num=Integer.parseInt(args[4]);
		}
		for(int i=0; i< num; i++)
		{
			File f=new File(path+"lehrer_"+year+month+(day+num));
			BufferedWriter w=new BufferedWriter(new FileWriter(f));
			w.write("LehrerID\tGehalt\tGebDatum\tFreierTag\tFach\tFührerschein\tSprechstunde\tGeschlecht\tRaum\tStunden_Tag\tStunden_Abend\tStunden_College");
			w.newLine();
			for(int j=0; j<30000; j++)
			{
				w.write(generateLehrerID()+"\t");
				w.write(generateGehalt()+"\t");
				w.write(generateGebDatum()+"\t");
				w.write(generateFreierTag()+"\t\t");
				w.write(generateFach()+"\t");
				w.write(generateFuehrerschein()+"\t\t");
				w.write(generateSprechstunde()+"\t\t");
				w.write(generateGeschlecht()+"\t\t");
				w.write(generateRaum()+"\t");
				w.write(generateStunden()+"\t\t");
				w.write(generateStunden()+"\t\t");
				w.write(generateStunden()+"");
				w.newLine();
			}
			w.flush();
			w.close();
			System.out.println("Numer of lines: 30000");
		}

	}
	
	public static long generateLehrerID()
	{
		return 1000000000 + ((long)(Math.random()*(9999999999l-1000000000)+1));
	}
	
	public static String generateGehalt()
	{
		return String.format("%.2f",1000+((float)Math.random()*(9999.99f-1000)+1));
	}
	
	public static char generateFach()
	{
		char[] faecher={'d', 'e', 'm', 'g', 'l'};
		return faecher[(int)(Math.random()*5)];
	}
	
	public static String generateGebDatum()
	{
		String bday="";
		int year=1950+((int)(Math.random()*(1990-1950)+1));
		bday+=year;
		int month=1+((int)(Math.random()*(12-1)+1));
		if(month < 10)
			bday+="0";
		bday+=month;
		int day=1+((int)(Math.random()*(31-1+1)));
		if(day < 10)
			bday+="0";
		bday+=day;
		return bday;
	}
	
	public static char generateFuehrerschein()
	{
		if(Math.random() > 0.5)
			return 'j';
		return 'n';
	}
	
	public static String generateFreierTag()
	{
		String spr="";
		int day=1+((int)(Math.random()*(5-1)+1));
		switch(day)
		{
		case 1:
			spr+="Mo";
			break;
		case 2:
			spr+="Di";
			break;
		case 3:
			spr+="Mi";
			break;
		case 4:
			spr+="Do";
			break;
		case 5:
			spr+="Fr";
		}
		return spr;
	}
	
	public static String generateSprechstunde()
	{
		String spr="";
		int day=1+((int)(Math.random()*(5-1)+1));
		switch(day)
		{
		case 1:
			spr+="Mo";
			break;
		case 2:
			spr+="Di";
			break;
		case 3:
			spr+="Mi";
			break;
		case 4:
			spr+="Do";
			break;
		case 5:
			spr+="Fr";
		}
		int stunde=1+((int)(Math.random()*(12-1)+1));
		spr+=stunde;
		return spr;
	}
	
	public static char generateGeschlecht()
	{
		if(Math.random() > 0.5)
			return 'm';
		return 'f';
	}
	
	public static int generateRaum()
	{
		return 100+((int)(Math.random()*(999-100)+1));
	}
	
	public static int generateStunden()
	{
		return ((int)(Math.random()*20));
	}

}
