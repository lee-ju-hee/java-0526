package java02;

import java.util.Scanner;

public class TestApp {

//	static int kor1;
//	static int kor2;
//	static int kor3;
//	static int total;
//	static double avg;

	public static void main(String[] args) {

		int[] kors = new int[3];
		int menu = 0;
		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		while (flag) {

			menu = selectMenu();

			switch (menu) {
			case 1:
				inputScore(kors);
				break;

			case 2:
				displayScore(kors);
				break;

			case 3:
				flag = false;
				break;
			}
		}
		System.out.println("종료합니다.");
	}

	private static void displayScore(int[] kors) {
		// 출력
		int total = 0;
		double avg = 0.0;
		for (int i = 0; i < 3; i++)
			total += kors[i];
		avg = total / 3;
		System.out.println("┌──────────┐");
		System.out.println("│  성적 출력   │");
		System.out.println("└──────────┘");

		for (int i = 0; i < 3; i++)
			System.out.printf("국어%d: %d\n", i + 1, kors[i]);

		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %6.2f\n", avg);// 전체 6자리 중 소수점 2번째까지

		System.out.println("------------------");
	}

	private static void inputScore(int[] kors) {

		Scanner scan = new Scanner(System.in);
		// 입력
		System.out.println("┌──────────┐");
		System.out.println("│  성적 입력   │");
		System.out.println("└──────────┘");

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("국어%d: ", i + 1);
				kors[i] = scan.nextInt();
				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("성적범위를 (0~100) 벗어났습니다.");
			} while (kors[i] < 0 || kors[i] > 100);

		System.out.println("------------------");

	}

	private static int selectMenu() {

		// 메뉴
		Scanner scan = new Scanner(System.in);

		int menu;
		System.out.println("┌──────────┐");
		System.out.println("│  메뉴 선택   │");
		System.out.println("└──────────┘");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		menu = scan.nextInt();
		return menu;
	}
}
