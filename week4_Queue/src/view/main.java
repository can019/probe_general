package view;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		loop: while (true) {

			System.out.println("1:���� | 2 :���� | 3:������ ���");
			System.out.println("���� -> 1, 2 �� �ƹ��ų� �Է�");
			try {
				a = input.nextInt();
				switch (a) {
				case 1:
					//add�� �����ߴٸ� �����ߴٴ� message ���
					break;
				case 2:
					//pop�� ������ ���
					break;
				case 3:
					break;
				default:
					break loop;
				}

			} catch (Exception e) {
				System.out.println("����");
				break;
			}
		}
	}

}
