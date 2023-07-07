#include <stdio.h>
#include <string.h>

int main() {
	char name[50];
	float credit;
	char grade[5];

	// 과목 수 카운팅
	int count = 0;

	// 총 점수 카운팅 ex) 3.0 학점짜리 A+ -> 13.5 카운트
	float sumgrade = 0.0;

	// 총 학점 카운팅 ex) 3.0 학점짜리 -> 3.0 카운트
	float sumhakjeom = 0.0;

	// 20개 과목 입력받는 for문
	for (int i = 0; i < 20; i++) {
		// 과목 이름, 몇 학점짜리 수업인지, 받은 등급 입력받기
		scanf("%s %f %s", name, &credit, grade);

		// P일경우 그대로 진행
		if (grade[0] == 'P') {
			continue;
		}
		
		// A일 경우
		if (grade[0] == 'A') {

			// 총학점에 학점을 더함
			sumhakjeom += credit;

			// 학점과 4(A0기준)를 곱한 것을 총 점수에 더함
			sumgrade += (4.0 * credit);

			//과목 수를 하나 늘림
			count++;
		}

		// A가 아닐 경우 다른 경우의 수 반복
		else if (grade[0] == 'B') {
			sumhakjeom += credit;
			sumgrade += (3.0 * credit);
			count++;
		}
		else if (grade[0] == 'C') {
			sumhakjeom += credit;
			sumgrade += (2.0 * credit);
			count++;
		}
		else if (grade[0] == 'D') {
			sumhakjeom += credit;
			sumgrade += (1.0 * credit);
			count++;
		}
		else if (grade[0] == 'F') {
			sumhakjeom += credit;
			count++;
		}

		// 두 번째 자릿수가 +일 경우
		if (grade[1] == '+') {
			// 학점에 0.5를 곱한 것을 총 점수에 더함 (카운트는 X)
			sumgrade += (0.5 * credit);
		}

	}
	// count가 0이라면 (F 혹은 P만 있거나 과목이 없을 경우)
	if (count == 0) {
		printf("0.000000\n");
	}
	// 그 외 나머지일 경우 출력
	else {
		printf("%.6f\n", sumgrade / sumhakjeom);
	}

	return 0;
}