import java.util.Scanner;

public class WaterTest {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		Information info=new Information();
		
		System.out.print("������ �Է��ϼ���: ");
		double height=input.nextDouble();
		System.out.print("�����Ը� �Է��ϼ���: ");
		double weight=input.nextDouble();
		System.out.printf("BMI������  %.2f �̸� " ,info.BMI(weight,height));
		
		info.checkBMI(info.BMI(weight, height));
		
		System.out.printf("\nȸ������ �� ���� ���뷮�� %.1f ml�Դϴ�.",info.waterCheck(weight));
	}
}
