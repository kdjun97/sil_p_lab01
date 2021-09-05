package com.example.lab1;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Main lab01 = new Main();
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello World!!!\n");
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		lab01.yourName(name);
		sc.close();
	}
	
	// print your name
	void yourName(String n)
	{
		System.out.println("[" + n + "]님 환영합니다~");
	}
}
