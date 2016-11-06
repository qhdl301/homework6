package homework6;

import java.util.*;

public class OnlyNumber {

	Scanner s = new Scanner(System.in);
	int num;
	int array[] = new int[10];

	void input() {
		System.out.println("1~100사이의 숫자를 입력하시오.");
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 숫자:");
			array[i] = s.nextInt();
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j] || array[i] > 100 || array[i] < 1) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					i--;
				}
			}
		}
		print();
	}

	void print() {
		for (int i = 9; i >= 0; i--) {
			System.out.println((i + 1) + "번째 숫자는" + array[i] + "입니다.");
		}

	}
}
