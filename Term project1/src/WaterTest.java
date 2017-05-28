import java.util.Scanner;

public class WaterTest {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		Information info=new Information();
		
		System.out.print("신장을 입력하세요: ");
		double height=input.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		double weight=input.nextDouble();
		System.out.printf("BMI지수는  %.2f 이며 " ,info.BMI(weight,height));
		
		info.checkBMI(info.BMI(weight, height));
		
		System.out.printf("\n회원님의 물 권장 섭취량은 %.1f ml입니다.",info.waterCheck(weight));
	}
}
