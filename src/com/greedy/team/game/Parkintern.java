package com.greedy.team.game;

import java.util.Random;
import java.util.Scanner;

public class Parkintern extends EscapeDTO {

	String bus = ">막차";
	int minusHp = 10;	//	각 캐릭터 마다 한번 술 마실 때 감소되는 체력 설정 값  
	int pluseHp = 20;	//	각 캐릭터 마다 안주를 한번 먹을 때 마다 증가되는 체력 설정 값  

	//안주먹
	@Override
	public void recharge() {
		if(this.hp < 100){
			System.out.println("박인턴이 안주를 먹습니다. 박인턴의 체력이 " +  pluseHp + "% 충전되었습니다.");
			this.hp += pluseHp;
			//hp가 100 이상으로 채워질 경우 100으로 표시
			if(this.hp > 100) {
				  this.hp = 100;
			}
			System.out.println("박인턴의 체력은 " + hp + "%입니다.");
		}else {
			System.out.println("이미 배가 꽉 찼습니다. 술을 마셔 주세요.");
		}
		
	}
	//술마시
	@Override
	public void drink() {
		
		if(hp >= 50) {
			System.out.println("박인턴이 소맥을 마십니다. 벌컥벌컥!!!! ");
			hp -= minusHp;
			count++; //술을 몇잔 마셨는지 카운트
			System.out.println("박인턴은 현재 소맥 " + count + "잔을 마셨습니다.");
			System.out.println("남은 체력은 " + hp + "%입니다.");
			
			if(mission == count) {
				Scanner sc = new Scanner(System.in);	
				while(true) {
					//미션 숫자와 술마시기 카운트가 동일해졌을 경우 미션성공, 탈출여부 물어보기 
					System.out.println("\n[미션성공!!!!!]");
					System.out.print("소맥을 다 마셨습니다. 막차를 타러 가시겠습니까?(y/n) : ");
					String answer = sc.nextLine();
					//equalsIgnoreCase()대소문자 구분 없이 입력 가능 
					if(answer.equalsIgnoreCase("y")) {
						System.out.println();
						System.out.println("막차를 탔습니다!'D' 를 눌러 출발해주세요!");
						for(int m = 0; m < Str.length; m++)
						{
							str += " ";
							Str[m] = str;			//공백으로 채워져 있는 배열
						}
						for(int i = 0; i < 50 ; i++) // Str[50-i] 값이 음수가 되면 오류
						{
							char num = sc.next().charAt(0);
							
							if(num == 68 | num == 100)
							{
								bus = "-"+ bus;				//막차 앞에 -> 를 추가시켜 늘린다.
								System.out.print(iarr[i] = hof + bus + Str[50-i] + "집");// '집' 키워드 고정 역할 
																						// 택시가 1칸씩 움직이므로 -1를 곱해줌
																						// Str의 공백의 수를 줄여서
								System.out.println();
								System.out.println("부릉부릉 =3 열심히 달리는 중 입니다! 'D' 를 계속 눌러서 박인턴을 빨리 귀가 시켜주세요! ");
							}																
											
						}
							System.out.println();	
							System.out.println("박인턴이 막차를 타고 무사히 집으로 귀가했습니다. 안녕히가세요.");
							System.exit(0);
						}
					
					else if (answer.equalsIgnoreCase("n")) {
							
					
						System.out.println("막차를 놓쳐버린 박인턴이 해가 뜰 때 까지 술을 마셨습니다..! 게임을 종료합니다.");
						System.exit(0);
					}else {
						System.out.println("y/n 중 하나만 입력해야 합니다. 다시 입력해주세요");
					}
				}
					
			} 
		// 체력이 50미만으로 떨어졌을 경우 술을 마실 수 없음 
		}else {
			System.out.println("[잠깐!!]");
			System.out.println("박인턴이 기운이 없어 와인을 마실 수 없습니다. 안주를 먹거나 게임을 이겨 체력을 충전하세요!");
		}
	}
	//게임하
	public void upDownGame() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean isSuccess = false;//7번만에 맞추는지 확인하기 위한 변수
		int restart;		
		
		// 무한루프로 게임 진행
		while (true) {
			System.out.println("Up Down 게임을 시작하겠습니다.");
			System.out.println("한 게임에 숫자 입력 기회는 7번 입니다.");
			System.out.println();
			// 1~100 사이의 난수생성
			int computerNum = random.nextInt(10000) % 100 + 1;
			// 실제 게임시에는 주석처리 하세요. 확인용입니다.
			//System.out.println("컴퓨터가 생성한 난수:"+ computerNum);
			// 게임은 7번 진행
			for (int i = 1; i <= 7; i++) {
				System.out.print("1~100까지 숫자를 입력하세요:");
				int userNum = scanner.nextInt();
					
				// 업 & 다운 판단후 출력
				if (userNum > computerNum) {
					System.out.println("Down, 더 낮은 숫자입니다.");
				}
				else if (userNum < computerNum) {
					System.out.println("Up, 더 높은 숫자입니다.");
				}
				else {
					//숫자가 일치하면 성공
					System.out.println("일치합니다.");
					System.out.println(i+"번 안에 성공했습니다.");
					System.out.println("---------------------------------------------");		
					hp += 100;
					coin += 2000;
					System.out.println("축하합니다!! 박인턴의 체력이 100% 충전 되었습니다! >_<");
					System.out.println("축하합니다!! 박인턴이 2000원을 얻었습니다! >_< ");
					
					//성공시 true로 변경 
					isSuccess = true;					
					//for문 탈출
					break;					 
				}
			}
			
			//7번만에 맞추지 못한 경우 실패를 출력
			if(isSuccess == false) {
				System.out.println();
				System.out.println("실패하셨습니다.");
				System.out.println();
			}
			
			//한번의 게임이 끝난후 재시작 여부 확인
			while(true) {
				System.out.println("---------------------------------------------");
				System.out.print("게임을 한번 더 하시겠습니까? ");
				System.out.println("1. 한번더  0. 종료");
				System.out.print("선택하실 번호를 입력해 주세요 : ");
				restart = scanner.nextInt();
				// 0,1 이 입력되었을때 탈출
				if (restart == 0) {
					return;
				} 
				else if (restart == 1) {
					System.out.println("게임 재시작!");
					break;
				} 
				else {
					System.out.println("잘못입력해씸..");						
				}
			}	 
		}// while end		
	}// gameStart end
	
	/* 편의점 */
	@Override
	public void mart() { 
		
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("편의점에 입장하셨습니다");
		System.out.println("-----------------------------------------");
		System.out.println("박인턴이 가지고 있는 돈은 " + coin + " 원 입니다.");
		System.out.println("1. 상쾌한(4000원)" + " *체력이 40 회복*");
		System.out.println("2. 헛개수(3000원)" + " *체력이 30 회복*");
		System.out.println("3. 여명808(5000원)" + " *체력이 50 회복*");
		System.out.println("4. 포카리(1000원)"+ " *체력이 10 회복*");
		System.out.println("9. 나가기");
		System.out.println("-----------------------------------------");
		System.out.print("구입하려는 물건을 선택해주세요 : ");
		int number = sc.nextInt();
		int exit;
		
		if(number == 9) {
			System.out.println("편의점을 나갑니다.");
			return;
		}
		
		if(this.hp == 100) {
			System.out.println("-------------------------------------");
			System.out.println("체력이 이미 가득 차 있습니다." + " 그래도 구입하겠습니까?");
			System.out.println("1. 네" + " 2. 아니오");
			int enter = sc.nextInt();
			if(enter == 1) {
				
			}else {
				System.out.println("편의점을 나갑니다.");
				break;
			}
		}
		if(number == 1) {
			
			if(this.coin < 4000) {

				System.out.println("돈이 부족합니다." + coin + "원 있습니다.");
				System.out.println("다른 상품 구매하거나 편의점을 나가 술게임으로 돈을 벌어봅시다.");
				System.out.println("1. 다른 상품 구매할래요." + " 2. 편의점을 나갈래요.");
				int exit1 = sc.nextInt();
				
				switch(exit1) {
				
				case 1 :
					System.out.println("상품을 다시 골라주세요.");
					continue;
				case 2 :
					System.out.println("편의점을 나갑니다.");
					return;
				}
			
			}
			
			
			this.coin -= 4000;
			this.hp += 40;
			System.out.println("박인턴이 4000원을 사용하고 상쾌한을 먹습니다. 박인턴의 체력이 " + "40" + "% 충전되었습니다.");
			
			if(this.hp > 100) {
				  this.hp = 100;
			}
			
			System.out.println("박인턴의 남은 돈은 " + coin + "원 입니다.");
			System.out.println("박인턴의 체력은 " + hp + "%입니다.");
		}
		if(number == 2) {
			
			
			if(this.coin < 3000) {
				System.out.println("돈이 부족합니다." + coin + "원 있습니다. 편의점을 나갑니다.");
				System.out.println("다른 상품 구매하거나 편의점을 나가 술게임으로 돈을 얻어보세요.");
				System.out.println("1. 다른 상품 구매할래요." + " 2. 편의점을 나갈래요.");
				int exit1 = sc.nextInt();
				
				switch(exit1) {
				
				case 1 :
					System.out.println("상품을 다시 골라주세요.");
					continue;
				case 2 :
					System.out.println("편의점을 나갑니다.");
					break;
				}
				
			}
			
			
			this.coin -= 3000;
			this.hp += 30;
			System.out.println("박인턴이 3000원을 사용하고 상쾌한을 먹습니다. 박인턴의 체력이 " + "30" + "% 충전되었습니다.");
			
			if(this.hp > 100) {
				  this.hp = 100;
			}
			
			System.out.println("박인턴의 남은 돈은 " + coin + "원 입니다.");
			System.out.println("박인턴의 체력은 " + hp + "%입니다.");
		}
		if(number == 3) {
			
			
			if(this.coin < 5000) {
				System.out.println("돈이 부족합니다." + coin + "원 있습니다. 편의점을 나갑니다.");
				System.out.println("다른 상품 구매하거나 편의점을 나가 술게임으로 돈을 벌어봅시다.");
				System.out.println("1. 다른 상품 구매할래요." + " 2. 편의점을 나갈래요.");
				int exit1 = sc.nextInt();
				
				switch(exit1) {
				
				case 1 :
					System.out.println("상품을 다시 골라주세요.");
					continue;
				case 2 :
					System.out.println("편의점을 나갑니다.");
					break;
				}
				
			}
			
			
			this.coin -= 5000;
			this.hp += 50;
			System.out.println("박인턴이 5000원을 사용하고 여명808을 먹습니다. 박인턴의 체력이 " + "50" + "% 충전되었습니다.");
			
			if(this.hp > 100) {
				  this.hp = 100;
			}
			
			System.out.println("박인턴의 남은 돈은 " + coin + "원 입니다.");
			System.out.println("박인턴의 체력은 " + hp + "%입니다.");
		}
		if(number == 4) {
			
			
			if(this.coin < 1000) {
				System.out.println("돈이 부족합니다." + coin + "원 있습니다. 편의점을 나갑니다.");
				System.out.println("다른 상품 구매하거나 편의점을 나가 술게임으로 돈을 벌어봅시다.");
				System.out.println("1. 다른 상품 구매할래요." + " 2. 편의점을 나갈래요.");
				int exit1 = sc.nextInt();
				
				switch(exit1) {
				
				case 1 :
					System.out.println("상품을 다시 골라주세요.");
					continue;
				case 2 :
					System.out.println("편의점을 나갑니다.");
					break;
				}
				
			}
			
			
			this.coin -= 1000;
			this.hp += 10;
			System.out.println("박인턴이 1000원을 사용하고 포카리를 먹습니다. 박인턴의 체력이 " + "10" + "% 충전되었습니다.");
			
			if(this.hp > 100) {
				  this.hp = 100;
			}
			
			System.out.println("박인턴의 남은 돈은 " + coin + "원 입니다.");
			System.out.println("박인턴의 체력은 " + hp + "%입니다.");
		}
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("상품을 계속 구입하시겠습니까? ");
			System.out.println("1. 계속  2. 나가기");
			System.out.print("선택하실 번호를 입력해 주세요 : ");
			exit = sc.nextInt();
			
			if (exit == 2) {
				return;
			} 
			else if (exit == 1) {
				System.out.println("");
				break;
			} 
			else {
				System.out.println("1,2번 선택해주세요");						
			}
		}	 
	
	}
	
	}
	
	

}

