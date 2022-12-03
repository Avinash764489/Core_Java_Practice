package internalization;
import java.text.NumberFormat;
import java.util.Locale;
public class CurrencyesFormate {

	public static void currency(Locale l) {
		double amt = 8923536.566f;
		//NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		NumberFormat nf = NumberFormat.getNumberInstance(l);
		String c = nf.format(amt);
		System.out.println(c + " for "+ l);
	}
	public static void main(String arg[]) {
		
		currency(Locale.CANADA);
		currency(Locale.CHINA);
		currency(Locale.FRANCE);
		currency(Locale.US);
		
		
	} 
}
