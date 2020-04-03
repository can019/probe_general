package view;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		loop: while (true) {

			System.out.println("1:삽입 | 2 :삭제 | 3:사이즈 출력");
			System.out.println("종료 -> 1, 2 외 아무거나 입력");
			try {
				a = input.nextInt();
				switch (a) {
				case 1:
					//add가 성공했다면 성공했다는 message 출력
					break;
				case 2:
					//pop한 데이터 출력
					break;
				case 3:
					break;
				default:
					break loop;
				}

			} catch (Exception e) {
				System.out.println("종료");
				break;
			}
		}
	}

}
