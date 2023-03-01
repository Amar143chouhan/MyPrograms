package rays;

public class DemoString {

	public static void main(String[] args) {

		String s = "welcome sorry wish thanks well";

		String st = "";

		String[] s2 = s.split(" ");

		for (int i = 0; i < s2.length; i++) {

			st = s2[i];

			if (st.startsWith("w")) {

				System.out.println(st);

			}

		}
	}

}
