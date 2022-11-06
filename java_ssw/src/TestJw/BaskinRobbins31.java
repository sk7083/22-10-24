package TestJw;

import java.util.Scanner;

public class BaskinRobbins31 {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int playerWin = 0;
	        int playerLose = 0;

	        while(true){
	            System.out.println("==============================================");
	            System.out.println("1.게임 시작 | 2. 순위 보기 | 3. 게임종료");
	            System.out.println("==============================================");
	            int select = sc.nextInt();
	            System.out.println("==============================================");

	            if(select == 1){
	                int result =  startGame();
	                if(result == 0){
	                    playerLose++;
	                }else{
	                    playerWin++;
	                }
	            }else if(select == 2){
	                recordGame(playerLose,playerWin);
	            }else if(select == 3){
	                System.out.println("게임 및 기록을 종료합니다.");
	                break;
	            }else{
	                System.out.println("잘못 입력 하셧습니다. 다시 입력해주십시오.");
	            }
	        }

	    }

	    public static int startGame() throws Exception{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("게임시작!");
	        System.out.println("==============================================");

	        int lastNum = 31;
	        int num = 0;

	        while(true){
	            int comIndex = (int)((Math.random()*3)+1);
	            System.out.print("컴퓨터 : ");
	            for(int i = 0; i<comIndex; i++){
	                num = num+1;
	                if(i<comIndex-1){
	                    System.out.print(num +" , " );
	                }else{
	                    System.out.print(num);
	                }
	                
	                if(num == lastNum){
	                    System.out.println("컴퓨터 패배!");
	                    return 1;
	                }
	            }
	            System.out.println();
	            System.out.println("==============================================");
	            System.out.println("몇번 입력 하시겠습니까? 최대 3회");
	            int playerIndex = sc.nextInt();
	            System.out.println("==============================================");
	            if(playerIndex < 4){
	                System.out.print("플레이어 : ");
	                for(int p=0; p<playerIndex; p++){
	                    num = num+1;
	                    if(p<playerIndex-1){
	                        System.out.print(num +" , " );
	                    }else{
	                        System.out.print(num);
	                    }

	                    if(num == lastNum){
	                        System.out.println("플레이어 패배!");
	                        return 0;
	                    }
	                }
	                System.out.println();
	            }else{
	                System.out.println("3회 이상 숫자를 말하셨습니다 패배!");
	                return 0;
	            }
	            
	        }

	    }

	    public static void recordGame(int lose , int win) throws Exception{
	        System.out.println("==============31 Gaem Record===============");
	        System.out.println("플레이어의 승리 : "+win +" 회 | 패배 : "+lose +" 회");
	    }
}
