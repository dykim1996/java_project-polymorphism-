package com.greedy.team.game;
import java.util.Scanner;

public class GameMenu {


	public void mainMenu() {
		
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n 하이미디어 회식에 오신것을 환영합니다!");
		System.out.println();
		System.out.println(" ******** 플레이어 선택 *********");
		System.out.println(" *                          *");
		System.out.println(" *  1.김부장  2.최대리  3.박인턴  *");
		System.out.println(" *                          *");
		System.out.println(" ****************************");
		System.out.println();
		System.out.print("가장 술을 잘 마실 것 같은 사람을 선택해 주세요 : ");
		int selectPerson = sc.nextInt();
		sc.nextLine(); 
		System.out.println();
		String person = "";
		int infoHp = EscapeDTO.hp;
		int infoCoin = EscapeDTO.coin;
		
		switch(selectPerson) {
		  case 1 :
				person = "김부장";
				Kimbujang bujang = new Kimbujang();
				System.out.println("----------------------------------------------");
				System.out.println("* " +person + "을 선택하셨습니다! 능력치를 소개합니다 *");
				System.out.println("----------------------------------------------");
				System.out.println("[초기 체력] : " + infoHp + " 입니다.");
				System.out.println("[초기 소지금] : " + infoCoin + "원 입니다.");
				System.out.println("[고유 능력] : 술 한잔에 체력 " + bujang.minusHp + "감소, 안주 한입에 체력 " + bujang.pluseHp +"충전");
				System.out.println("----------------------------------------------");
				System.out.println();
				System.out.println("* Mission : [" + bujang.mission + "] 잔의 술을 마신 후 "+ person + "을 귀가시키세요!! *");
				System.out.print("\n>> Game Start (Enter) <<");
				String start = sc.nextLine();
					while(true) {
					System.out.println();
					System.out.println("=====================" + person + "의 행동을 선택하세요=======================");
					System.out.println("|  1.안주먹기  2.술마시기  3.술게임시작  4.편의점 가기  9.조회  0.게임종료하기 |");
					System.out.println("==============================================================");
					System.out.println();
					System.out.print("선택하실 메뉴에 해당하는 숫자를 입력해 주세요! : ");
					int num = sc.nextInt();
					System.out.println();				
						switch(num) {
						case 1 : bujang.recharge(); break;
						case 2 : bujang.drink(); break;
						case 3 : bujang.upDownGame(); break;	
						case 4 : bujang.mart(); break;
						case 9 : 
						System.out.println("[" + person + "의 미션"+"]" + " : " + bujang.mission + "잔");	
						System.out.println("[먹은 잔 수] : " + EscapeDTO.count + "잔");	
						System.out.println("[남은 잔 수] : " + (bujang.mission - EscapeDTO.count) + "잔");		
						System.out.println("[현재 체력] : " + EscapeDTO.hp + "%");
						System.out.println("[현재 소지금] : " + EscapeDTO.coin  + "원");
						System.out.println("[고유 능력] 술 한잔에 체력 " + bujang.minusHp + "감소, 안주 한입에 체력 " + bujang.pluseHp +"충전"); break;
						case 0 : System.out.println("게임을 종료합니다."); System.exit(0);
						default : System.out.println("잘못 입력하셨습니다. 1,2,3,4,9,0 번 중 하나의 번호를 다시 입력해 주세요!"); break;
						}
				   }
				
			case 2 : 
					person = "최대리";
					Choidaeri daeri = new Choidaeri();
					System.out.println("----------------------------------------------");
					System.out.println("* " +person + "을 선택하셨습니다! 능력치를 소개합니다 *");
					System.out.println("----------------------------------------------");
					System.out.println("[초기 체력] : " + infoHp + " 입니다.");
					System.out.println("[초기 소지금] : " + infoCoin + "원 입니다.");
					System.out.println("[고유 능력] : 술 한잔에 체력 " + daeri.minusHp + "감소, 안주 한입에 체력 " + daeri.pluseHp +"충전");
					System.out.println("----------------------------------------------");
					System.out.println();
					System.out.println("* Mission : [" + daeri.mission + "] 잔의 술을 마신 후 "+ person + "을 귀가시키세요!! *");
					System.out.print("\n>> Game Start (Enter) <<");
					String start1 = sc.nextLine();
					while(true) {
						System.out.println();
						System.out.println("=====================" + person + "의 행동을 선택하세요=======================");
						System.out.println("|  1.안주먹기  2.술마시기  3.술게임시작  4.편의점 가기  9.조회  0.게임종료하기 |");
						System.out.println("==============================================================");
						System.out.println();
						System.out.print("선택하실 메뉴에 해당하는 숫자를 입력해 주세요! : ");
						int num = sc.nextInt();
						System.out.println();
					switch(num) {
					case 1 : daeri.recharge(); break;
					case 2 : daeri.drink(); break;
					case 3 : daeri.upDownGame(); break;
					case 4 : daeri.mart(); break;
					case 9 : 
					System.out.println("[" + person + "의 미션"+"]" + " : " + daeri.mission + "잔");	
					System.out.println("[먹은 잔 수] : " + EscapeDTO.count + "잔");	
					System.out.println("[남은 잔 수] : " + (daeri.mission - EscapeDTO.count) + "잔");	
					System.out.println("[현재 체력] : " + EscapeDTO.hp + "%");
					System.out.println("[현재 소지금] : " + EscapeDTO.coin + "원");
					System.out.println("[고유 능력] 술 한잔에 체력 " + daeri.minusHp + "감소, 안주 한입에 체력 " + daeri.pluseHp +"충전"); break;
					case 0 : System.out.println("게임을 종료합니다."); System.exit(0);
					default : System.out.println("잘못 입력하셨습니다. 1,2,3,4,9,0 번 중 하나의 번호를 다시 입력해 주세요!"); break;
				}
			}
		    case 3 : 
			person = "박인턴";
			Parkintern intern = new Parkintern();
			System.out.println("----------------------------------------------");
			System.out.println("* " +person + "을 선택하셨습니다! 능력치를 소개합니다 *");
			System.out.println("----------------------------------------------");
			System.out.println("[초기 체력] : " + infoHp + " 입니다.");
			System.out.println("[초기 소지금] : " + infoCoin + "원 입니다.");
			System.out.println("[고유 능력] : 술 한잔에 체력 " + intern.minusHp + "감소, 안주 한입에 체력 " + intern.pluseHp +"충전");
			System.out.println("----------------------------------------------");
			System.out.println();
			System.out.println("* Mission : [" + intern.mission + "] 잔의 술을 마신 후 "+ person + "을 귀가시키세요!! *");
			System.out.print("\n>> Game Start (Enter) <<");
			String start2 = sc.nextLine();
			while(true) {
				System.out.println();
				System.out.println("=====================" + person + "의 행동을 선택하세요=======================");
				System.out.println("|  1.안주먹기  2.술마시기  3.술게임시작  4.편의점 가기  9.조회  0.게임종료하기 |");
				System.out.println("==============================================================");
				System.out.println();
				System.out.print("선택하실 메뉴에 해당하는 숫자를 입력해 주세요! : ");
				int num = sc.nextInt();
				System.out.println();
				switch(num) {
				case 1 : intern.recharge(); break;
				case 2 : intern.drink(); break;
				case 3 : intern.upDownGame(); break;
				case 4 : intern.mart(); break;
				case 9 :
				System.out.println("[" + person + "의 미션"+"]" + " : " + intern.mission + "잔");	
				System.out.println("[먹은 잔 수] : " + EscapeDTO.count + "잔");	
				System.out.println("[남은 잔 수] : " + (intern.mission - EscapeDTO.count) + "잔");	
				System.out.println("[현재 체력] : " + EscapeDTO.hp + "%");
				System.out.println("[현재 소지금] : " + EscapeDTO.coin + "원");
				System.out.println("[고유 능력] 술 한잔에 체력 " + intern.minusHp + "감소, 안주 한입에 체력 " + intern.pluseHp +"충전"); break;
				case 0 : System.out.println("게임을 종료합니다."); System.exit(0);
				default : System.out.println("잘못 입력하셨습니다. 1,2,3,4,9,0 번 중 하나의 번호를 다시 입력해 주세요!"); break;
				}
			}
			
			
		
		}
		

	}


	

}
