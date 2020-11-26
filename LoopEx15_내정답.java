package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int allScore = 0;
		int pass = 0;
		int maxScore = 0;
		int studentNum = 0;
		int studentScore = 0;
		int i = 1;
		while( i <= 10) {
			int score = ran.nextInt(101);
			if (score > maxScore) {
				maxScore = score;
				studentNum = i;
				studentScore = score;
			}
			allScore +=score;
			if (score >= 60) {
				pass += 1;
			}
			System.out.println("학생" + i + " 점수 : " +score);
			i++;
		}
		System.out.println();
		System.out.println("전교생 총점: " + allScore);
		System.out.println("전교생 평균: " + allScore/10);
		System.out.println("합격자 수: " + pass);
		System.out.println("1등학생 번호: " + studentNum);
		System.out.println("1등학생 성적: " + studentScore);
		
		scan.close();
		
		
	}
	

}
