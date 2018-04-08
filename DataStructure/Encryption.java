
public class Encryption {
	public static String encWord(String input) {
		char inputArray[] = input.toCharArray();
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 'z') {
				sBuilder.append('a');
				continue;
			}
			else if (inputArray[i] == 'Z') {
				sBuilder.append('A');
				continue;
			}
			else if (inputArray[i] < 'Z' && inputArray[i] >= 'A') {
				char c = (char)((int)inputArray[i] + 1);
				sBuilder.append(c);
				continue;
			}
			else if (inputArray[i] >= 'a' && inputArray[i] < 'z') {
				char c = (char)((int)inputArray[i] + 1);
				sBuilder.append(c);
				continue;
			}
			else {
				sBuilder.append(inputArray[i]);
			}
		}
		String end = sBuilder.toString();
		return end;
	}
}
