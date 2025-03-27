package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) { // 게임 전체 반복
            int gameCount = 0; // 게임 횟수 초기화

            while (gameCount < 5) { // 5번의 게임 진행
                int computerChoice = random.nextInt(3) + 1; // 1~3 중 랜덤 값 생성
                int userChoice = getUserChoice(scanner); // 사용자 입력 받기

                if (userChoice != 1 && userChoice != 2 && userChoice != 3) { // 유효하지 않은 입력이면 다시 입력
                    System.out.println("오류발생:잘못된 입력입니다.");
                }

                // 승부 판별 및 출력
                judgeGame(userChoice, computerChoice);
                
                if (userChoice==1 && computerChoice==3 ||
            		userChoice==2 && computerChoice==1 ||
            		userChoice==3 && computerChoice==2) {
                	System.out.println("플레이어가 이겼습니다.");
                }
                else {
                	System.out.println("컴퓨터가 이겼습니다.");
                }

                gameCount++; // 정상적인 게임 진행 시 횟수 증가
            }

            // 5번의 게임 후 다시할지 여부 확인
            if (!askRestart(scanner)) {
                System.out.println("게임이 종료되었습니다. 감사합니다.");
                break;
            }
        }
    }

    // 사용자 입력 받기 (1~3이 아닌 경우 예외 처리)
    public static int getUserChoice(Scanner scanner) {
        // while문과 if문을 사용하여 1~3 입력 검증
        return 0; // 임시 반환
    }

    // 승부 판별
    public static void judgeGame(int user, int computer) {
        // if문을 사용하여 가위바위보 결과 판단
    }

    // 게임 재시작 여부 확인 (0 또는 1 입력 받기)
    public static boolean askRestart(Scanner scanner) {
        // while문을 사용하여 0 또는 1 입력 검증
        return true; // 임시 반환
    }
}

