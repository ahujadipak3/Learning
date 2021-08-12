package interviews;

import java.time.Instant;
import java.util.Date;

public class InstantDemo {
	public static void main(String[] args) {
		Instant createdDate = Instant.now();
		System.out.println(createdDate);
		System.out.println(Date.from(createdDate));
	}
}
