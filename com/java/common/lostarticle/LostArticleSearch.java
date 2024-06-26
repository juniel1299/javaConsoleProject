package com.java.common.lostarticle;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.common.LoginLogout;
import com.java.common.Validation;
import com.java.common.log.LogSave;
import com.java.view.ViewAll;

/**
 * 분실물 정보를 검색하는 클래스
 */
public class LostArticleSearch {
	/**
	 * LostArticleSearch클래스의 기본 생성자
	 */
	public LostArticleSearch() {
	}
	
	/**
	 * 분실물 정보를 페이지로 출력하는 메서드
	 * @param list 분실물 리스트
	 */
	public static void lostArticlePage(ArrayList<LostArticle> list) {
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
			/**
			 * 입력받은 값을 저장하는 변수
			 */
			String sel = "";	// 입력받는 문자열

			// View클래스 출력
			ViewAll.print("분실물");

			System.out.println("분실물 \t\t\t\t 찾은 역\t\t   보관하는 역 ");

			list.stream().skip(index * 10)
			.limit(10)
			.forEach(article -> System.out.printf("%-14s         \t%-13s\t   %-10s\r\n"
					, article.getArticle()
					, article.getLostStation() + "역"
					, article.getFindStation() + "역"));

			System.out.printf("\t\t\tPage: %s / %s\r\n", index + 1, page);
			System.out.println("\t\t\t엔터입력시 리스트보기를 종료합니다.");
			System.out.print("\t\t\t원하는 페이지: ");
			sel = scan.nextLine();

			if(sel.equals("")) {
				if(!LoginLogout.level.equals("1")) {

					LogSave.logSave(LogSave.LOSTARTICLESEARCH);

				}
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
