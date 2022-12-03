package internalization;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class Date_Formate {

	public static void currency(Locale l) {
		DateFormat df = DateFormat.getTimeInstance(DateFormat.DEFAULT, l);
		Date d = new Date();
		String time = df.format(d);
		System.out.println(time + " "+ l);
	}
	public static void main(String arg[]) {
		
		currency(Locale.CANADA);
		currency(Locale.CHINA);
		currency(Locale.FRANCE);
		currency(Locale.US);
		
		
	}
}
