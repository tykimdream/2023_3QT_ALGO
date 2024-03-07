import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		int heartX, heartY, head, leftArm, rightArm, leftLeg, rightLeg;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		// 머리 기준을 찾는다.
		int headXIdx = 0;
		int headYIdx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i].contains("*")) {
				for (int j = 0; j < n; j++) {
					if (arr[i].charAt(j) == '*') {
						headXIdx = j;
						headYIdx = i;
					}
				}
			}
			if (headXIdx != 0)
				break;
		}
		heartX = headXIdx + 1;

		int shoulderXIdx = headXIdx;

		head = 1;
		for (int i = headYIdx + 1; i < n; i++) {
			if (arr[i].charAt(headXIdx - 1) == '*') {
				break;
			} else {
				head++;
			}
		}
		heartY = headYIdx + head + 1;

		int shoulderYIdx = headYIdx + head;

		leftArm = 0;
		for (int i = shoulderXIdx - 1; i >= 0; i--) {
			if (arr[shoulderYIdx].charAt(i) == '*') {
				leftArm++;
			} else {
				break;
			}
		}

		rightArm = 0;
		for (int i = shoulderXIdx + 1; i < n; i++) {
			if (arr[shoulderYIdx].charAt(i) == '*') {
				rightArm++;
			} else {
				break;
			}
		}

		int leftLegXIdx = shoulderXIdx - 1;
		int legYIdx = 0;

		for (int i = shoulderYIdx + 1; i < n; i++) {
			if (arr[i].charAt(shoulderXIdx - 1) == '*') {
				legYIdx = i;
				break;
			}
		}

		leftLeg = 0;
		for (int i = legYIdx; i < n; i++) {
			if (arr[i].charAt(leftLegXIdx) == '*') {
				leftLeg++;
			} else {
				break;
			}
		}

		int rightLegXIdx = leftLegXIdx + 2;
		rightLeg = 0;
		for (int i = legYIdx; i < n; i++) {
			if (arr[i].charAt(rightLegXIdx) == '*') {
				rightLeg++;
			} else {
				break;
			}
		}

		System.out.println(heartY + " " + heartX);
		System.out.println(leftArm + " " + rightArm + " " + (legYIdx - shoulderYIdx - 1) + " " + leftLeg + " " + rightLeg);
	}

}