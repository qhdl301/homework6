package homework6;

import java.nio.channels.NetworkChannel;
import java.util.*;

public class StudentScore {
	Scanner s = new Scanner(System.in);
	int kor, eng, math;
	int num;
	int str;
	int sum[] = new int[8];
	double avg[] =new double [10];
	int[][] array = new int[5][3];
	String[] arr = { "국어", "영어", "수학" };

	void input() {
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + "번학생 국어,영어,수학의 성적: ");
			for (int j = 0; j < 3; j++) {
				array[i][j] = s.nextInt();

				if (j == 0) {
					sum[0] += array[i][0];
					avg[0] = sum[0] / 5;
				} else if (j == 1) {
					sum[1] += array[i][1];
					avg[1] = sum[1] / 5;
				} else if (j == 2) {
					sum[2] += array[i][2];
					avg[2] = sum[2] / 5;
				}
			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					sum[3] += array[0][j];
					avg[3] = sum[3] / 3;
				}
				else if (i == 1) {
					sum[4] += array[1][j];
					avg[4] = sum[4] / 3;
				}
				else if (i == 2) {
					sum[5] += array[2][j];
					avg[5] = sum[5] / 3;
				}
				else if (i == 3) {
					sum[6] += array[3][j];
					avg[6] = sum[6] / 3;
				}
				else if (i == 4) {
					sum[7] += array[4][j];
					avg[7] = sum[7] / 3;
				}
			}
		}
		print();
	}

	void print() {
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i] + "총점은" + sum[i] + "이고평균은" + avg[i] + "입니다.");
			}
		for (int j=0; j+3<8; j++){
			System.out.println((j+1)+ "번 학생의 총점은" + sum[j] + "이고평균은" + avg[j] + "이다");
		}
	}
}
