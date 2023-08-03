class Task1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int m = Integer.parseInt(args[1]);

		int[] circleArray = makeCircle(n);
		makePath(n, m, circleArray);
	}

	private static int[] makeCircle(int len) {
		int[] circle = new int[len];

		for (int i = 0; i < len; i++) {
			circle[i] = i + 1;
		}

		return circle;
	}

	private static void makePath(int len, int interval, int[] arr) {
		int i = 1;

		while (true) {
			System.out.print(i);
			i = 1 + (i + interval - 2) % len;

			if (i == 1) break;
		}
		System.out.println();
	}
}
