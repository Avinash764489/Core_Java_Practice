package defaultinterface;

public interface java_interface {

	int square(int x);
	
	default String wellcome() {
		return "Well Come";
	}
	
	static String thanks() {
		return "Thanks";
	}
}
