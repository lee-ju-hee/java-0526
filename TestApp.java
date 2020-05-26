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
		System.out.println("�����մϴ�.");
	}

	private static void displayScore(int[] kors) {
		// ���
		int total = 0;
		double avg = 0.0;
		for (int i = 0; i < 3; i++)
			total += kors[i];
		avg = total / 3;
		System.out.println("������������������������");
		System.out.println("��  ���� ���   ��");
		System.out.println("������������������������");

		for (int i = 0; i < 3; i++)
			System.out.printf("����%d: %d\n", i + 1, kors[i]);

		System.out.printf("����: %d\n", total);
		System.out.printf("���: %6.2f\n", avg);// ��ü 6�ڸ� �� �Ҽ��� 2��°����

		System.out.println("------------------");
	}

	private static void inputScore(int[] kors) {

		Scanner scan = new Scanner(System.in);
		// �Է�
		System.out.println("������������������������");
		System.out.println("��  ���� �Է�   ��");
		System.out.println("������������������������");

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("����%d: ", i + 1);
				kors[i] = scan.nextInt();
				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("���������� (0~100) ������ϴ�.");
			} while (kors[i] < 0 || kors[i] > 100);

		System.out.println("------------------");

	}

	private static int selectMenu() {

		// �޴�
		Scanner scan = new Scanner(System.in);

		int menu;
		System.out.println("������������������������");
		System.out.println("��  �޴� ����   ��");
		System.out.println("������������������������");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� >> ");
		menu = scan.nextInt();
		return menu;
	}
}
