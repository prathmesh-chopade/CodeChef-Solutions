import java.util.Scanner;

class LADDU {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			String input[] = sc.nextLine().split(" ");
			int activityNum = Integer.parseInt(input[0]);
			String origin = input[1];
			String[] activities = new String[activityNum];
			for (int j = 0; j < activities.length; j++) {
				activities[j] = sc.nextLine();
			}

			int laddu = 0;
			for (String activity : activities) {
				String[] parts = activity.split(" ");
				if (parts[0].equals("CONTEST_WON")) {
					int rank = Integer.parseInt(parts[1]);

					laddu += 300 + Math.max(0, 20 - rank);
				} else if (parts[0].equals("TOP_CONTRIBUTOR")) {
					laddu += 300;
				} else if (parts[0].equals("BUG_FOUND")) {
					int severity = Integer.parseInt(parts[1]);

					laddu += severity;
				} else if (parts[0].equals("CONTEST_HOSTED")) {
					laddu += 50;
				}
			}
			System.out.println(laddu / (origin.equals("INDIAN") ? 200 : 400));

		}
	}

}
