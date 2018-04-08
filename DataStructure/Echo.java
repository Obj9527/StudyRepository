import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter:");
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String string;
		StringBuilder sBuilder = new StringBuilder();
		while((string = bReader.readLine()) != null && string.length() != 0) {
			sBuilder.append(string.toUpperCase());
		}
		bReader.close();
		System.out.println(sBuilder.toString());
	}
}
