package homework6;

import java.util.*;

public class StudentScore {
	Scanner s = new Scanner(System.in);
	int kor, eng, math;
	int num = 0;
	int str;
	int sum[] = new int[8];
	double avg[] = new double[8];
	int[][] array = new int[5][3];
	String[] arr = { "국어", "영어", "수학" };

	void input() {
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번학생 국어,영어,수학의 성적: ");
			for (int j = 0; j < 3; j++) {
				array[i][j] = s.nextInt();

				sum[j] += array[i][j];
				avg[j] = sum[j] / 5.0;

			}
			num = 1;
			if (num == 1) {
				for (int j = 0; j < 3; j++) {
					if (i == 0) {
						sum[3] += array[0][j];
						avg[3] = sum[3] / 3.0;

					} else if (i == 1) {
						sum[4] += array[1][j];
						avg[4] = sum[4] / 3.0;

					} else if (i == 2) {
						sum[5] += array[2][j];
						avg[5] = sum[5] / 3.0;

					} else if (i == 3) {
						sum[6] += array[3][j];
						avg[6] = sum[6] / 3.0;

					} else if (i == 4) {
						sum[7] += array[4][j];
						avg[7] = sum[7] / 3.0;

					}
				}
			}
		}
		print();
	}

	void print() {
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i] + "총점은" + sum[i] + "이고,평균은" + String.format("%.1f", avg[i]) + "입니다.");
		}
		for (int k = 3; k < 8; k++) {
			if (num == 1) {
				System.out.println((k - 2) + "번 학생의 총점은" + sum[k] + "평균은" + String.format("%.1f", avg[k]) + "입니다.");
			}
		}
	}
}