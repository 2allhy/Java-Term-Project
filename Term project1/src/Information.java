import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Information {
	public String name;
	public double age;
	public double weight;
	public double height;
	
	Scanner input=new Scanner(System.in);
	
	public double BMI(double weight,double height){
		double bmi=weight/(height * height);
		return bmi;
	}
	
	public void checkBMI(double bmi){
		if(bmi<18.5){
			System.out.println("��ü���Դϴ�.");
		}else if(bmi>=18.5 && bmi<=22.9){
			System.out.println("�����Դϴ�.");
		}else if(bmi>=23 && bmi<=24.9){
			System.out.println("��ü���Դϴ�.");
		}else if(bmi>=25 && bmi<=29.9){
			System.out.println("���Դϴ�.");
		}else if(bmi>30){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("�߸��� bmi ����Դϴ�.");
		}
	}
	
	public double waterCheck(double weight){
		double water=weight * 33;
		return water;
	}
}
