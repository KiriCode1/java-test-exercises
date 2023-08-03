class Task4 {
	public static void main(String[] args) {
		int avg = Math.round(sumArgs(args) / args.length);
		int count = 0;

		for (int i = 0; i <= args.length - 1; i++) {
			int intArg = Integer.parseInt(args[i]);
			while (intArg != avg) {
				if (intArg < avg) {
					intArg += 1;
					count += 1;
				} else if (intArg > avg) {
					intArg -= 1;
					count += 1;
				} else {
					args[i] = Integer.toString(intArg);
				}
			}
		}

		System.out.print(count);
	}

	private static int sumArgs(String[] ints) {
		int res = 0;

		for (int i = 0; i <= ints.length - 1; i++) {
			res += Integer.parseInt(ints[i]);
		}

		return res;
	}
}
