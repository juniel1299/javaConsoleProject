package com.java.member.employee;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.common.Data;
import com.java.common.Validation;
import com.java.common.log.LogSave;
import com.java.member.user.UserVoice;
import com.java.view.ViewAll;

/**
 * 고객의 소리 검색하는 클래스
 */
public class UserVoiceSearch {
	
	/**
	 * UserVoiceSearch클래스의 기본 생성자
	 */
	public UserVoiceSearch() {
	}
	
	/**
	 * 고객의 소리 목록 출력하는 메서드
	 */
	protected static void userVoiceAll() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			/**
			 * 입력한 값을 저장하는 변수
			 */
			String sel = "";
			/**
			 * 아이디를 저장하는 변수
			 */
			String id = "";
			/**
			 * 제목을 저장하는 변수
			 */
			String title = "";
			
			userVoicePage(Data.userVoiceList);
			System.out.println("\t\t\t뒤로가기 엔터");
			System.out.println("\t\t\t민원의 내용을 보시려면 아무키나 입력");
			System.out.print("\t\t\t입력: ");
			sel = scan.nextLine();
			
			if(sel.equals("")) {
				
				// 모든민원보기 종료
				LogSave.logSave(LogSave.USERVOICESEARCH);
				break;
			}
			System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
			System.out.println("\t\t\t아이디와 제목을 정확히 입력하시면");
			System.out.println("\t\t\t민원의 내용을 확인합니다.");
			System.out.print("\t\t\t아이디: ");
			id = scan.nextLine();
			System.out.print("\t\t\t제목: ");
			title = scan.nextLine();
			
			if( Validation.is_Duplication_UserVoice(id, title)) {
				
				for(UserVoice voice : Data.userVoiceList) {
					
					if(voice.getTitle().equals(title)) {
						
						// 읽음으로 변경
						voice.setIsRead("읽음");
						
						// 민원의 내용 출력
						System.out.println(voice.getContent());
						ViewAll.pause();
						
						break; // 민원객체 탐색 종료
					}
					
				}
				
			}else {
				System.out.println("\t\t\t잘못된 제목");
				System.out.println("\t\t\t다시 입력하세요.");
				ViewAll.pause();
			}
			
			
		}//while루프 종료
		
	}//End of userVoiceAll()
	/**
	 * 고객의 소리를 페이지로 나눠서 출력하는 메서드
	 * @param list 고객의 소리 목록
	 */
	public static void userVoicePage(ArrayList<UserVoice> list) {
		// 리스트의 페이지수 계산
		/**
		 * 페이지 수를 나타내는 변수
		 */
		int page = (int)(Math.ceil((double)list.size() / 10));
		
		/**
		 * 현재 보고있는 페이지를 나타내는 변수
		 */
		int index = 0;		// 문자로 입력받은 숫자를 int로 변환
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			String sel = "";	// 입력받는 문자열
			
			// View클래스 출력
			ViewAll.vocListTop();
			
			list.stream().skip(index * 10)
			 							 .limit(10)
			 							 .forEach(uservoice -> System.out.printf("\t\t\t%-10s\t%-20s\t%-3s\r\n"
					 													, uservoice.getId()
					 													, uservoice.getTitle()
					 													, uservoice.getIsRead()));
			// 이름, ID, 전화번호, 직급, 호선, 역이름
			System.out.printf("\t\tPage| %s / %s\r\n", index + 1, page);
			System.out.println("\t\t\t엔터입력시 페이지모드 종료.");
			System.out.print("\t\t\t원하는 페이지: ");
			sel = scan.nextLine();
			
			if(sel.equals("")) {
				System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
				break;
			}else if (Validation.is_NumString(sel)) {
				index = Integer.parseInt(sel) - 1;
				
				if(index < 0 || index >= page) {
					System.out.println("\t\t\t페이지 범위를 벗어났습니다.");
					System.out.println("\t\t\t다시 입력해주세요.");
					index = 0;
					
				}
				
			}else {
				System.out.println("\t\t\t잘못된 입력입니다.");
				System.out.println("\t\t\t다시 입력해주세요.");
			}
			
		}//while루프 종료
		
	}//End of lostArticlePage()
	
}//End of class
