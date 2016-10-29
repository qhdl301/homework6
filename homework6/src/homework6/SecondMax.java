package homework6;

import java.util.*;

public class SecondMax {
	Scanner s = new Scanner(System.in);
	int i;
	int maxidx;
	int max2idx;
	int max1 = 0;
	int max2 = 0;
	String queqe;
	int[] array = new int[10];

	void input() {

		for (i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "번째 수를 구하시오:");
			array[i] = s.nextInt();

			if (array[i] > max1) {
				max2 = max1;
				maxidx = max2idx;
				max1 = array[i];
				maxidx = i;
			} else if (array[i] > max2) {
				max2 = array[i];
				max2idx = i;
			}
		}
		print();
	}

	void print() {

		System.out.println("2번째큰수는" + (max2idx + 1) + "번째" + max2 + "입니다");
	}
}