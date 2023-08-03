import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

class Task2 {
	public static void main(String[] args) {
		try {
			String circle = Files.readString(Path.of(args[0]));
			String point = Files.readString(Path.of(args[1]));

			int circleRadius = Integer.parseInt(circle.substring(2));

			for (int i = 0; i <= point.length() - 1; i += 2) {
				int x = Integer.parseInt(point.substring(i, i + 1));
				int y = Integer.parseInt(point.substring(i + 1, i + 2));
			
				double circleEquation = Math.pow(x - Integer.parseInt(circle.substring(0, 1)), 2) + Math.pow(y - Integer.parseInt(circle.substring(1, 2)), 2);

				if (circleEquation < Math.pow(circleRadius, 2)) System.out.print(1);
				else if (circleEquation == Math.pow(circleRadius, 2)) System.out.print(0);
				else System.out.print(2);
				System.out.println();
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		} 
	}
}
