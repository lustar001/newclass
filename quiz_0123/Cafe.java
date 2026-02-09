package quiz_0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {


	String drink;   
	int price;     
	int shot;       
	int syrup;     

	// 생성자
	Cafe(String drink, int price) {
		this.drink = drink;
		this.price = price;
		this.shot = 0;
		this.syrup = 0;
	}

	void addShot() {
		shot = 500;
	}

	void addSyrup() {
		syrup = 500;
	}

	void reset() {
		shot = 0;
		syrup = 0;
	}

	void showInfo() {
		System.out.println("선택한 커피 : " + drink);
		System.out.println("기본 가격 : " + price + "원");
		System.out.println("샷 추가 : " + shot + "원");
		System.out.println("시럽 추가 : " + syrup + "원");
		System.out.println("총 가격 : " + (price + shot + syrup) + "원");
	}
}