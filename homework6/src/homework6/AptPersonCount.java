package homework6;
import java.util.*;

public class AptPersonCount {
	Scanner s = new Scanner(System.in);
	int sum;
	int ho[] = new int[3];
	int floor[] = new int[5];
	int[][] array = new int[5][3];

	void input() {
		System.out.println("5층아파트의거주자 인원 파악하기");
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < ho.length; j++) {
				System.out.println((i + 1) + "0" + (j + 1) + "호에 살고있는 사람의 숫자:");
				array[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < ho.length; j++) {
				ho[j] += array[i][j];
				floor[i] += array[i][j];
			}
			sum += floor[i];
		}
		print();
	}
void print(){
	System.out.println("이 아파트의 거주자는 모두"+sum+"입니다.");
	for(int i=0; i<floor.length; i++){
		System.out.println((i+1)+"층에 사는 거주자는 모두"+floor[i]+"입니다.");
	}
	for(int j=0; j<ho.length; j++){
		System.out.println((j+1)+"호에 라인에 거주자는 모두"+ho[j]+"입니다.");
	}
}
}
