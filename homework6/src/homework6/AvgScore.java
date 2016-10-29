package homework6;

import java.util.*;

public class AvgScore {

	Scanner s = new Scanner(System.in);

	int i;
	double max ;
	double min= Double.MAX_VALUE;;
	double sum = 0;
	double num = 0;
	double avg = 0.0;
	double[] array = new double[10];

	void input() {
		for (i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "번 심사점수 입력: ");
			array[i] = s.nextDouble();
			if (array[i] > max) {
				max = array[i];
				
			} else if (min > array[i]) {
				min = array[i];
				}
			num += array[i];
		}
		print();
	}

	void print() {
		sum = num - max - min;
		avg = sum / 8;
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수 평균은 %.1f 입니다.\n",avg);
	}
}