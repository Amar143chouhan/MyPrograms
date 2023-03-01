package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestPatient {

	public static void main(String[] args) {

		Patient p1 = new Patient("amar", "typhoid", 32, 20000);
		Patient p2 = new Patient("ankit", "corona", 31, 25000);
		Patient p3 = new Patient("vivek", "fever", 28, 32000);
		Patient p4 = new Patient("praveen", "corona", 45, 30000);
		Patient p5 = new Patient("yogesh", "dairiya", 38, 45000);
		Patient p6 = new Patient("vipin", "corona", 26, 40000);

		List<Patient> list = Arrays.asList(p1, p2, p3, p4, p5, p6);

		// list.stream().filter(p-> p.getDisease().equalsIgnoreCase("corona") &&
		// p.getAge() > 30).forEach(System.out::println);

		// avearge bill amount paid by corona patient
		Double collect = list.stream().filter(p -> p.getDisease().equals("corona"))
				.collect(Collectors.averagingDouble(Patient::getAmount));

		System.out.println(collect);

	}
}
