package com.greedy.team.game;


import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("--------* 우리팀쵝오조 제작 *---------");
		System.out.println("----------------------------------");
		while(true) {
		
		System.out.println("\n1. 게임 시작");
		System.out.println("2. 게임 Rule");
		
		System.out.print(">> 메뉴선택(숫자입력) : ");
		int no = sc.nextInt();
		
		if(no==1) {
			GameMenu menu = new GameMenu();
			menu.mainMenu();
			
		}else if (no==2) {
			howToPlay();
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	}
	
	static void howToPlay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n===== 게임설명 =====");
		System.out.println("◆ 캐릭터를 고른 후 게임을 시작합니다.");
		System.out.println("◆ 제시된 개수의 술잔을 모두 마시면 회식에서 탈출합니다.");
		System.out.println("◆ 초기 체력은 100이며 캐릭터별로 체력 증감이 다릅니다.");
		System.out.println("◆ 초기 소지금은 1000이상 10000이하로 랜덤으로 지급 됩니다.");
		System.out.println("◆ 조회 체력이 50이상일 경우 한잔 마시기, 50미만 안주먹기");
		System.out.println("◆ 체력이 40이하가 되면 미니술게임에 이겨야 합니다.");
		System.out.println("◆ 미니술게임에서 이기면 체력 100%와 2000원을 획득합니다.");
		System.out.println("◆ 마시기 : 마신횟수증가, 체력조회");
		System.out.println("◆ 안주먹기 : 체력충전, 조회");
		System.out.println("◆ 편의점 가기 : 상품구입, 조회");
		System.out.println("◆ 조회 : 현재 상황 조회");
		System.out.print("\n>>계속 읽으시려면 Enter : ");
		String check1 = sc.nextLine();
		System.out.println("\n===== 캐릭터 설명 ======");
		System.out.println("1. 김부장 : 나는 유우머러스한 사람이야~");
		System.out.println("2. 최대리 : 뭐든지 시켜만주세요!!! ");
		System.out.println("3. 박인턴 : 저는 수학을 좋아합니다.");
		
		System.out.print("\n>>처음으로 돌아가시려면 Enter : ");
		String check2 = sc.nextLine();
}
	}
