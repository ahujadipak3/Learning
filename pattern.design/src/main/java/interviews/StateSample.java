package interviews;

public class StateSample {
	enum City {AHMEDABAD, SURAT};
	public static void main(String[] args) {
		System.out.println(State.GUJARAT.hashCode());
		System.out.println(State.MAHARASTRHA.hashCode());
		System.out.println(City.AHMEDABAD.hashCode());
		System.out.println(State.GUJARAT.getValue());
	}
}
