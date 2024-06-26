package com.java.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.java.common.LoginLogout;
import com.java.station.management.StationManagement;
/**
 * 출력문을 담당하는 클래스
 */
public class ViewAll {

	/**
	 * ViewAll클래스의 기본 생성자
	 */
	public ViewAll() {
	}
	
	/**
	 * 콘솔 화면에서 화면을 넘기기 위해 사용하는 메서드
	 */
	public static void clear() { //화면 넘기기 명령어
		
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
//	public static void trainSide() {
//System.out.println("\t\t		___________   _______________________________________^__");
//System.out.println("\t\t		 ___   ___ |||  ___   ___   ___    ___ ___  |   __  ,----\\");
//System.out.println("\t\t		|   | |   |||| |   | |   | |   |  |   |   | |  |  | |_____\\");
//System.out.println("\t\t		|___| |___|||| |___| |___| |___|  | O | O | |  |  |        \\");
//System.out.println("\t\t		           |||                    |___|___| |  |__|         )");
//System.out.println("\t\t		___________|||______________________________|______________/");
//System.out.println("\t\t		           |||                                        /--------");
//System.out.println("\t\t		-----------'''---------------------------------------'");
//	}
	
//	public static void trainFront() {//메인 이모 (아마)
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//
//
//System.out.println("⠀⠀⠀⠀⠀⢀⢤⣔⢷⡾⣞⣿⣻⣟⣿⢯⣷⡿⣯⣿⣻⣟⣿⣻⣯⡿⣷⣟⣿⣻⣟⣿⢯⣿⣻⣿⣻⣿⣽⣾⣶⣶⣢⣄⡀⠀⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⢰⣪⢷⢽⢽⣟⣿⣽⣯⡿⣾⣟⣯⣿⣻⡾⣯⣿⣽⢷⣿⣽⡷⣿⣽⣯⡿⣾⣟⣯⣷⣿⣽⡾⣷⣟⣾⣗⣗⣗⢷⢄⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠐⣽⡺⡽⣝⣯⣿⢷⣿⡾⣿⣯⣿⣯⣿⣽⢿⣟⣷⣿⢿⡷⣿⢿⣻⣷⢿⣻⣿⡽⣿⢷⡿⣾⡿⣷⡿⣷⣻⢮⢞⡽⡽⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀ ⣗⢯⢯⡳⣯⣿⢿⣯⣿⣿⣽⣾⣗⡷⣯⣟⡷⣯⣿⣿⣕⣪⣿⣿⢯⣟⣷⣳⢿⡽⡯⣟⣯⣿⡿⣿⣟⣯⢯⢯⢯⣻⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⣫⢿⣾⢿⣻⣽⣾⢿⣽⣟⣿⣻⡾⣟⣯⣷⢿⣯⣿⣻⣽⢿⣻⡾⣟⣿⣻⡿⣟⣿⢯⣿⢿⣽⡯⣯⡳⡯⣞⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⣫⢯⢿⣞⡯⣟⣾⣺⣻⣺⣞⣗⡯⣯⢯⡷⡯⣟⣾⣺⣳⢯⣟⣗⡿⡽⣞⣗⡿⡽⣞⣟⡾⣽⣞⣿⣪⢯⢯⣳⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⣯⣻⣗⡿⣽⣺⣳⣻⣺⣞⡾⣽⢽⡽⡽⣯⣻⣺⣞⣗⣿⣺⣳⣻⡽⣯⢾⡽⡯⣟⡾⣽⣳⣽⡾⣺⣝⢷⢽⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⣞⣾⣳⢯⢷⣻⣺⣳⣗⣷⣻⢽⡽⡽⡯⣗⣟⣾⣺⣞⣾⣺⣳⣗⣯⢷⣻⡽⣽⣳⢟⣗⣷⣳⣟⣗⣗⢯⢯⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⣞⡾⡯⡿⣽⣳⣻⣺⣞⣾⣺⢯⣟⣽⢯⣟⣾⣺⣞⣾⣺⣞⣗⡷⡯⣯⢷⣻⣳⢯⣟⣗⡷⣯⡷⣳⡳⡯⣻⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⣞⣗⢿⣻⣽⣳⣻⣺⡵⣗⡷⡯⣟⣞⣗⣿⣺⣞⣾⣺⣞⣾⣺⢾⢽⡽⣽⢽⢾⢽⡽⣞⣗⣯⢷⣟⢷⢽⣝⢷⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⣯⣻⣺⡺⣽⡷⣳⣻⣺⡽⣽⢯⡯⣟⣗⣟⣾⣺⣞⣾⣺⣞⣾⣺⣞⣯⢯⡯⣯⢿⡽⡯⣟⣗⣟⣞⣯⡯⣯⣳⡳⣯⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⣗⣗⡵⡯⡷⣿⢯⣷⣯⣯⣷⢿⣽⣽⣾⣳⡷⣷⢷⡷⣷⢷⡷⣷⢷⣯⣯⣿⣽⣽⣽⣯⡷⣟⣾⣳⣿⢽⡺⡮⡯⣞⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⣗⢷⢽⢽⢽⣟⣟⣷⣻⣾⣻⡿⣽⣾⢯⣷⣿⣻⡿⣽⣟⣿⣻⣽⣟⣷⢿⣞⣷⢿⡾⣷⢿⣟⣯⢿⢾⡯⡯⡯⣻⣺⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⣫⢯⢯⣷⠫⢀⠐⣹⢷⡿⣿⢾⣟⣿⣞⣯⣿⢿⡽⣯⣿⡽⣟⣾⣟⣯⣿⣻⣟⣿⡝⠠⠐⢹⣻⡽⡽⡽⡵⣳⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⡯⣻⣾⣳⡴⣬⢾⣻⣟⣿⣻⣽⠇⠫⡭⠢⠫⠏⢍⡞⡙⡏⡏⣯⣿⢾⣯⢿⣳⣻⡴⣬⣞⣯⡯⣯⣫⢯⣗⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⣞⣗⣿⣺⡫⡭⣝⣯⣿⡽⣯⡿⣞⣷⣳⢠⢒⡗⡓⡖⣗⢶⡷⣶⣟⣿⣽⢿⡯⡗⣭⢳⣻⢾⡽⣺⢮⢗⡷⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⣞⢾⣽⣾⣳⣽⣺⢾⡷⣿⣻⣟⣿⣽⢷⣵⢷⡷⣷⣻⣽⣾⣟⣿⢾⣻⣾⢿⣻⣳⣵⣻⢾⡿⡽⡵⡯⣻⣺⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⡯⡾⡽⣞⣯⣿⢾⣯⣿⣻⣯⣿⣽⣷⢿⣻⣽⣿⣻⣯⣿⣽⣾⢿⣾⡿⣯⣿⣻⣿⣽⢷⣿⣻⣯⢯⢯⢯⣳⣳⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⡯⡯⣫⢯⣞⢿⣽⣟⡿⣷⢿⣽⡷⣿⣻⣾⣿⣿⣿⢿⢯⢟⣿⢿⣻⣿⣯⣿⣿⡽⣟⣾⣯⣿⣻⣽⡾⡽⡽⣵⣳⣳⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⢯⢯⢯⣿⣻⣽⣯⣿⣻⣟⣿⢷⡿⣿⣟⣿⣽⣾⣯⣿⣽⣿⣾⢿⣿⢿⣾⡿⣾⣿⣻⡿⣞⣯⣿⣯⢿⡝⢽⣺⡺⡮⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⢽⢽⢵⣻⣟⣞⣷⣟⣿⣽⣟⣿⡻⢟⣿⣻⣿⣻⣗⡿⣝⢽⣻⡽⣿⣿⣯⣿⢿⣽⣟⣿⣟⣿⢷⣟⡯⣟⣟⢷⢽⢝⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⠸⣝⣗⢷⢽⢼⢷⣟⣷⢿⣽⢷⡪⣺⣟⣿⣻⣿⣽⡿⣿⡿⣿⢿⣻⣷⢿⣽⣿⣻⣽⡷⣿⣽⢿⣽⢽⢵⣫⢯⢯⠃⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⠀⠁⠉⠉⢫⣿⣿⣽⣟⡯⣿⣻⣿⣻⣽⣯⡿⣺⣷⢿⣿⣽⢿⣻⣯⣿⣻⣷⡿⣯⣷⣿⢿⣾⢿⣯⣿⡝⠈⠉⠁⠀⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⠈⣿⣻⣿⣽⣯⣿⣯⣷⡿⣷⡿⣿⢷⣿⢿⣿⣻⣽⣟⣷⣿⢿⣽⣾⡿⣯⠉⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⢺⡗⠛⠓⠋⠓⠛⠋⠛⠛⠛⠙⠛⠙⠋⠛⠙⠛⠚⠛⢯⡗⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠝⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
//System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void successThumbUpEmo() { //정상실행 이모 
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		.　　　n Λ＿Λ");
//System.out.println("\t\t		　　　(ﾖ(´･ω･｀) 따봉!!");
//System.out.println("\t\t		　 　≡　y　 と丿");
//System.out.println("\t\t		　 　 ≡（_ﾉ　ノ");
//System.out.println("\t\t		　　　　≡(ノ´");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void successVEmo() { //정상실행 이모 
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("		.     .    °※+•☆            ☆•+※°   .");
//System.out.println("		  *.•☆          •°.★   ★.°•           ☆•.*");
//System.out.println("		★*                   ∧_∧                   *★");
//System.out.println("		☆                  v •∀< )                   ☆");
//System.out.println("		※                   \\    o                   ※");
//System.out.println("		°*.                   O  |                 .*°");
//System.out.println("		       °.             `  ᒍ                  .°");
//System.out.println("		            *  .                     .  *");
//System.out.println("		                    *    .     .    *");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
//	
//	public static void lostarticleEmo() { //분실물 이모
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		. ∧_∧");
//System.out.println("\t\t		( ´･ω･)∧∧");
//System.out.println("\t\t		./⌒ ,つ⌒ヽ) 토닥토닥");
//System.out.println("\t\t		(___ (＿＿)");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void safetyEmployeeSetEmo() { //안전 요원 배치 이모 
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		.　＿");
//System.out.println("\t\t		　 /～ヽ");
//System.out.println("\t\t		　(｡･０･) 저기요저기요..");
//System.out.println("\t\t		　ﾟし-Jﾟ");
//System.out.println();
//System.out.println("\t\t		　　＿");
//System.out.println("\t\t		　 /～ヽ");
//System.out.println("\t\t		　(｡･o･)　보고싶어요");
//System.out.println("\t\t		　ﾟし-Jﾟ");
//System.out.println("\t\t		　　＿");
//System.out.println();
//System.out.println("\t\t		　 /～ヽ");
//System.out.println("\t\t		　(｡･-･)　어디에 계신거에요♡");
//System.out.println("\t\t		　ﾟし-Jﾟ");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void safetyEmployeeUnlockEmo() { //안전 요원 배치  해제 이모
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		전 먼저 떠납니다!!!");
//System.out.println("\t\t　　　　　　　　 ∧_∧");
//System.out.println("\t\t　　　　　　　∩(　　 ) 야호~");
//System.out.println("\t\t　　　　　　　 〉　　つ");
//System.out.println("\t\t　　　　   ∴ ‥⊂ 、 ノ");
//System.out.println("\t\t￣\"~⌒゛   \"'ゞ　　 し'");
//System.out.println("\t\t゛ ゛ T\"~￣Y\" ");
//System.out.println("\t\t＼＼｜/／/");
//System.out.println("\t\t／｜＼／/");
//System.out.println("\t\t｜＼｜／");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void trainEmo() { //열차 이모 
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		.　　　*,':");
//System.out.println("\t\t		　　,:\"\"\"\"");
//System.out.println("\t\t		  // ");
//System.out.println("\t\t		`i｜");
//System.out.println("\t\t		｜ ､");
//System.out.println("\t\t		､＼ ヽ_");
//System.out.println("\t\t		　､＼　二_     ∧∞_∧");
//System.out.println("\t\t		　　 ｀-_ ￣(｀ ･ω ･)");
//System.out.println("\t\t		　　　　 ー(.. O┳O");
//System.out.println("\t\t		　　　　　 ◎ ) `J_))");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void timeEmo() { //시간 이모 
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t			 	/ ￣￣￣￣￣￣￣￣￣￣￣\\");
//System.out.println("\t\t				|　　　몇 시 지 ?	| ");
//System.out.println("\t\t				＼　　　　　　　	/");
//System.out.println("\t\t				　￣￣￣￣∨￣￣￣￣￣￣");
//System.out.println("\t\t				　　　　　　。");
//System.out.println("\t\t				　　　 ∧ ∧　.?　");
//System.out.println("\t\t				|￣￣( ´Д｀)￣|");
//System.out.println("\t\t				|＼⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒＼");
//System.out.println("\t\t				|　＼⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒＼");
//System.out.println("\t\t				＼　｜⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒⌒|");
//System.out.println("\t\t				　 ＼|＿＿＿＿＿＿＿|");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void roadSearchEmo() { // 길찾기 이모
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		. 🐭");
//System.out.println("\t\t		╔╝╚══╦══════╦══╗");
//System.out.println("\t\t		╠═══╗║╠═══╦╗║╚╗║");
//System.out.println("\t\t		║╔═╗║╠═╦═╣║║╚═║║");
//System.out.println("\t\t		║╚╗╠╩╗║║╔═╣╚═╦╝║");
//System.out.println("\t\t		║║╠╝╔═╩╝║╠╝║╔╝╔╣");
//System.out.println("\t\t		║║╚═║╔══╣╔═╝║╚╣║");
//System.out.println("\t\t		║╚═╗╚╝║═╝║══╩╚╩╩🧀");
//System.out.println("\t\t		╚══╩══╩══╩══════");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void seasonPassEmo() { //정기권 이모 
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		＿人人人＿");
//System.out.println("\t\t	       ＞표줘요!!＜");
//System.out.println("\t\t		￣Y^Y^Y￣");
//System.out.println("\t\t		　 _n");
//System.out.println("\t\t		　( ｜　 ハ_ハ");
//System.out.println("\t\t		　 ＼＼ ( ‘-^　)");
//System.out.println("\t\t		　　 ＼￣￣　 )");
//System.out.println("\t\t		　　　 ７　　/");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
	
//	public static void massageWriteEmo() { //메세지 입력 이모 1
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t  ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
//System.out.println("\t\t        메세지를 입력해 주세요.");
//System.out.println("\t\t  ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ╯");
//System.out.println("\t\tO °");
//System.out.println("\t\tᕱ ᕱ");
//System.out.println("\t\t( ･ω･)");
//System.out.println("\t\t/ つΦ . .. . ﹢ ⃰ ଂ ಇ");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}


//	public static void rankUpEmo() { //직급 변경 이모  1
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t	． 　 　 ∧ ∧");
//System.out.println("\t\t	　 　　(´･ω･ ∩　레벨 UP！");
//System.out.println("\t\t	　　　o.　　 ,ﾉ.");
//System.out.println("\t\t	　 　　Ｏ＿ .ﾉ");
//System.out.println("\t\t	　 　 　 　(ノ");
//System.out.println("\t\t	　 　 　　i｜|");
//System.out.println("\t\t	　　　　 	━━");
//System.out.println();
//System.out.println();
//System.out.println();
//
//
//
//	}
//	
//	
	/**
	 * 에러 이모티콘을 출력 메서드
	 */
	public static void errorQuestionEmo() { //에러 이모
		System.out.println();
		System.out.println();
		System.out.println();
		
System.out.println("\t\t		┏━━━━━━━┓");
System.out.println("\t\t		┃ 　　　┃");
System.out.println("\t\t		┃ ┏━━━┓ ┃");
System.out.println("\t\t		┗━┛　 ┃ ┃");
System.out.println("\t\t		　　┏━┛ ┃");
System.out.println("\t\t		　　┃ ┏━┛");
System.out.println("\t\t		　　┗━┛");
System.out.println("\t\t		　　┏━┓");
System.out.println("\t\t		　　┃ ┃");
System.out.println("\t\t		　　┗━┛");
System.out.println("\t\t		　　　〇");
System.out.println("\t\t		　　　ｏ");
System.out.println("\t\t		　　　　(・ д ・)");
System.out.println();
System.out.println();
System.out.println();

		
	}
//	public static void errorFeelEmo() { //에러 이모
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//System.out.println("\t\t		.⠀⠀⠀⠀➵⠀➵");
//System.out.println("\t\t		⠀⠀➶⠀⠀⠀⠀⠀⠀➴⠀");
//System.out.println("\t\t		➶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀➴⠀");
//System.out.println("\t\t		　　　　　　　∧_∧");
//System.out.println("\t\t		　　　　　　 (;・Д・)");
//System.out.println("\t\t		　　　　뭔가 불길한 예감이 든다");
//System.out.println();
//System.out.println();
//System.out.println();
//
//	}
//	
	/**
	 * 에러 이모티콘을 출력하는 메서드
	 */
	public static void errorFailEmo() { //에러 이모
		System.out.println();
		System.out.println();
		System.out.println();
		
System.out.println("\t\t		▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
System.out.println("\t\t		████▌▄▌▄▐▐▌█████");
System.out.println("\t\t		████▌▄▌▄▐▐▌▀████");
System.out.println("\t\t		▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
System.out.println();
System.out.println();
System.out.println();

	}
//	
//
//
	/**
	 * 에러 이모티콘을 출력하는 메서드
	 */
	public static void errorHmmEmo() { //에러 이모 
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("\t\t		.⠀⠀⠀⠰⡿⠿⠛⠛⠻⠿⣷");
		System.out.println("\t\t		⠀⠀⠀⠀⠀⠀⣀⣄⡀⠀⠀⠀⠀⢀⣀⣀⣤⣄⣀⡀");
		System.out.println("\t\t		⠀⠀⠀⠀⠀⢸⣿⣿⣷⠀⠀⠀⠀⠛⠛⣿⣿⣿⡛⠿⠷");
		System.out.println("\t\t		⠀⠀⠀⠀⠀⠘⠿⠿⠋⠀⠀⠀⠀⠀⠀⣿⣿⣿⠇");
		System.out.println("\t\t		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁");
		System.out.println("\t\t		⠀⠀⠀⠀⣿⣷⣄⠀⢶⣶⣷⣶⣶⣤⣀");
		System.out.println("\t\t		⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀⠀⠈⠙⠻⠗");
		System.out.println("\t\t		⠀⠀⠀⣰⣿⣿⣿⠀⠀⠀⠀⢀⣀⣠⣤⣴⣶⡄");
		System.out.println("\t\t		⠀⣠⣾⣿⣿⣿⣥⣶⣶⣿⣿⣿⣿⣿⠿⠿⠛⠃");
		System.out.println("\t\t		⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄");
		System.out.println("\t\t		⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁");
		System.out.println("\t\t		⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁");
		System.out.println("\t\t		⠀⠀⠛⢿⣿⣿⣿⣿⣿⣿⡿⠟");
		System.out.println("\t\t		⠀⠀⠀⠀⠀⠉⠉⠉");
		System.out.println();
		System.out.println();
		System.out.println();


	}
	
	/**
	 * 매개변수로 받은 title을 사용해서 제목을 출력하는 메서드
	 * @param title 제목
	 */
	public static void print(String title) {
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.printf("\t\t\t\t%s\n", title);
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	/**
	 * 요금표를 출력하는 메서드
	 */
	public static void costTimeTable() { //고객 > 요금표 1
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t\t     요금표");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t [운임]\t\t[연령]\t\t[이용방법]\t[수도권 가격]");
		System.out.println("\t\t [기본운임]\t[일반]\t\t[교통카드]\t[1400원]");
		System.out.println("\t\t [기본운임]\t[일반]\t\t[1회권]\t\t[1500원]");
		System.out.println("\t\t [기본운임]\t[청소년]\t[교통카드]\t[800원]");
		System.out.println("\t\t [기본운임]\t[청소년]\t[1회권]\t\t[1500원]");
		System.out.println("\t\t [기본운임]\t[어린이]\t[교통카드]\t[500원]");
		System.out.println("\t\t [기본운임]\t[어린이]\t[1회권]\t\t[500원]");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t만 6세 미만 또는 만 65세 이상, 장애인, 국가 유공자, 보훈 보상대상자 무료");
		
	}
	/**
	 * 즐겨찾기 노선으로 길찾기를 할때 출력하는 메서드
	 */
	public static void roadSearchFavoriteList() { //길찾기 > 즐겨 찾기 목록 라벨 (입력 필요) 1
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t     길 찾기 (즐겨찾기 노선)");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		
	}
	
	
//	public static void roadSearchRouteOtherTimeTop() {//길찾기> 경로입력> 다른 날짜 보기 상단 1 
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t         다른 날짜 보기");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		
//	}
	
	/**
	 * 길찾기 이후 즐겨찾기 노선 추가 질문 출력하는 메서드
	 */
	public static void roadSearchRouteTimeBottom() {//길찾기 >  경로 입력 > 현재 시간 보기 , 다른 날짜 보기  >하단 라벨  1
		
		System.out.println("\t\t\t 1. 현재 노선 즐겨 찾기에 추가하기");
		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");		
	}
	
//	public static void roadSearchRouteNowTimeTop() { //길 찾기 >경로 입력> 현재 시간 보기 > 상단 라벨 1
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t          현재 시간 보기");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		
//		
//	}
	
	/**
	 * 길찾기 > 경로입력 메뉴 출력 메서드
	 */
	public static void roadSearchRouteBottom() { //길 찾기> 경로 입력 하단 라벨  1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           길 찾기");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t      1. 현재 시간 보기");
		System.out.println();
		System.out.println("\t\t\t      2. 다른 날짜 보기");
		System.out.println();
		System.out.println("\t\t   뒤로 가기를 원할 시 엔터키를 눌러주세요");		
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

	}
	/**
	 * 길찾기 경로 입력 출력문
	 */
	public static void roadSearchRouteTop() { //길 찾기 >경로 입력 상단 라벨 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           경로 입력");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 길찾기시 출발역과 도착역이 같이 출력되는 메서드
	 * @param start 출발역
	 * @param end 도착역
	 */
	public static void findWay(String start, String end) { //길 찾기 >경로 입력 상단 라벨 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.printf("\t\t\t   길 찾기 (%s역 -> %s역)\n",start,end);
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
	}
	/**
	 * 길찾기 메인 메뉴 출력 메서드
	 */
	public static void roadSearchMain() { //길찾기 메뉴 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           길 찾기");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t       1. 경로 입력");
		System.out.println();
		System.out.println("\t\t\t       2. 즐겨 찾기 노선");
		System.out.println();
		System.out.println("\t\t   뒤로 가기를 원할 시 엔터키를 눌러주세요");	
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	}
	
//	public static void seasonPassCodeBottom() { //정기권 코드 입력 하단 (if문으로 해야 할 거 같습니다.)
//		
//	}
	
//	public static void seasonPassCodeTop() { //정기권 코드 입력 상단 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t         정기권 코드 입력 ");
//		System.out.println("\t\t       (정기권은 영어 대문자로만 이뤄져있습니다.)");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void seasonPassRegisterBottom() { // 정기권 등록하기 하단 2
//		System.out.println("\t\t\t 1. 코드 입력하기 ");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");		
//	}
	
//	public static void seasonPassRegisterTop() { //정기권 등록하기 상단1
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.printf("\t\t\t      \"%s\"님의 정기권 확인하기 \n",LoginLogout.authName);
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void seasonPassCheck() {// 나의 정기권 확인하기 1 2 
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t      나의 정기권 확인하기 ");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		//뒤에 입력 받아야 함
//			}
	
//	public static void seasonPassMain() { //정기권 메인 메뉴  1 2 
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t            정기권");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println("\t\t\t    1. 나의 정기권 확인하기");
//		System.out.println("\t\t\t    2. 정기권 등록");
//		System.out.println("\t\t\t    뒤로 가기를 원할 시 엔터키를 눌러주세요");		
//		
//	}
	
//	public static void lostarticleSearchBottom() { // 분실물 검색 하단 라벨1  안쓸듯 
//		System.out.println("\t\t\t 1. 다음 페이지");
//		System.out.println("\t\t\t 2. 이전 페이지");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");	
//	}
	
	/**
	 * 분실물 검색 출력문 메서드
	 */
	public static void lostarticleSearchTop() { // 분실물 검색 상단 라벨  1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t       분실물 검색");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
//	public static void lostarticleListCheckBottom() {//분실물 목록 확인 아래 라벨 1 2
//		System.out.println("\t\t\t 1. 검색하기");
//		System.out.println("\t\t\t 2. 다음 페이지");
//		System.out.println("\t\t\t 3. 이전 페이지");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");	}
	
//	public static void lostarticleListCheckTop() { // 분실물 목록 확인 라벨 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       분실물 목록 확인");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void userVocWrite() { //민원 내용 입력하기 (쓰기) 이거 기준으로 맞춰서 감1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      민원 내용 입력하기");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
	/**
	 * 민원 접수 출력문 메서드
	 */
	public static void userVoc() { // 고객의 소리 민원 접수 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           민원 접수");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t뒤로 가기를 원할 시 엔터키를 눌러주세요");		
	}
	
	/**
	 * 고객의 소리 메인 메뉴 출력문 메서드
	 */
	public static void userVocMain() { //고객의 소리 메뉴  
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t         고객의 소리");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t    1. 일반 민원 접수");
		System.out.println("\t\t\t    2. 분실물 목록 확인");
		System.out.println("\t\t\t    뒤로 가기를 원할 시 엔터키를 눌러주세요");	}
	
	
	/**
	 * 열차 시간표 출력문 메서드
	 */
	public static void trainTimeTableSearch() { //열차 시간표 , 검색 후  0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           열차 시간표");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
		
	}
	
//	public static void trainTimeTable() { // 고객 열차 시간표 0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t           열차 시간표");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//
//	}
	
//	public static void userResign() {//회원 탈퇴 0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t           회원 탈퇴");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.print("\t\t\t 회원 탈퇴 시 등록된 정보는 모두 삭제되며\n\t\t\t 등록된 정기권은 소모되며 환불되지 않습니다.\n\t\t\t 정말 탈퇴하시겠습니까?\n");
//		System.out.println();
//		System.out.println();
//		System.out.println("\t\t\t 1. 탈퇴 하기");
//		System.out.println("\t\t\t뒤로 가기를 원할 시 엔터키를 눌러주세요");	}

	/**
	 * 즐겨찾기 삭제 출력문 메서드
	 */
	public static void favoriteDelete(){ //즐겨찾기 삭제 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t        즐겨찾기 삭제");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t뒤로 가기를 원할 시 엔터키를 눌러주세요");	}


	/**
	 * 즐겨찾기 등록 출력문 메서드
	 */
	public static void favoriteAdd() { // 즐겨찾기 등록 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t        즐겨찾기 등록");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	/**
	 * 즐겨찾기 목록 출력문 메서드
	 */
	public static void favoriteView() { // 즐겨찾기 등록 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t        즐겨찾기 목록");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
	
	/**
	 * 즐겨찾기 편집 출력문 메서드
	 */
	public static void favoriteChange() {//즐겨찾기 편집 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t         즐겨찾기 편집");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t      1.즐겨찾기 등록");
		System.out.println();
		System.out.println("\t\t\t      2.즐겨찾기 삭제");
		System.out.println();
		System.out.println("\t\t       뒤로 가기를 원할 시 엔터키를 눌러주세요");		
		
	}
	

	
	
//	public static void favoriteList() { //즐겨찾기 목록01 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      길 찾기(즐겨찾기 노선)");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
	
	/**
	 * 노선 즐겨찾기 목록 출력문 메서드
	 */
	public static void lineFavorite() {//노선 즐겨찾기01 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t         노선 즐겨찾기");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t      1. 즐겨찾기 목록");
		System.out.println();
		System.out.println("\t\t\t      2. 즐겨찾기 편집");
		System.out.println();
		System.out.println("\t\t      뒤로 가기를 원할 시 엔터키를 눌러주세요");		
	}
	
	/**
	 * 전화번호 변경 출력문 메서드
	 */
	public static void phoneNumChange() {//전화번호 재설정0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t          전화번호 변경");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	}  
	
//	public static void bottomReceive() { //아래에 있는 접수 2 
//		clear();
//		System.out.println("\t\t\t        접수 되었습니다.");
//	}
	
//	public static void bottomResign() { //아래에 있는 탈퇴 2 
//		clear();
//		System.out.println("\t\t\t        탈퇴를 완료했습니다.");
//	}
//	public static void bottomDelete() { // 아래에 있는 삭제 2 
//		clear();
//		System.out.println("\t\t\t        삭제가 완료되었습니다.");
//	}
	
//	public static void bottomAdd() { // 아래에 있는 등록2
//		clear();
//		System.out.println("\t\t\t        등록이 완료되었습니다.");
//	}
	
//	public static void bottomChange() { //아래에 있는 작은 변경이 완료되었습니다.2
//		clear();
//		System.out.println("\t\t\t        변경이 완료되었습니다.");
//	}
	
	/**
	 * 비밀번호 재설정 출력문 메서드
	 */
	public static void pwChange() { //pw 재설정 라벨 02
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t        비밀번호 변경");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
	
//	public static void userInfoChange() { //회원정보 수정 메뉴 화면  01 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t           회원정보 수정");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println("\t\t\t     1.PW 재설정하기");
//		System.out.println("\t\t\t     2.전화번호 재설정하기");
//		System.out.println("\t\t\t     뒤로 가기를 원할 시 엔터키를 눌러주세요");		
//	}
	
//	public static void userMyInfo() { //고객 > 마이페이지 > 내 정보 보기 01 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t              내 정보");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//		
//	}
//	public static void employeeMyPage() {//직원의 마이페이지 (모름)
//		
//	}
//	
	/**
	 * 마이페이지 출력문 메서드
	 */
	public static void userMyPage() { //고객 마이 페이지  0 2 
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t          마이 페이지");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println("\t\t\t         1. 비밀번호 변경");
//		System.out.println("\t\t\t         2. 전화번호 변경");
//		System.out.println("\t\t\t         3. 회원탈퇴");
//		System.out.println("\t\t\t         4. 북마크");
//		System.out.println("\t         뒤로 가기를 원할 시 엔터키를 눌러주세요");		
	}
	
	/**
	 * 고객 메인 메뉴 출력문 메서드
	 */
	public static void userMainView() { //고객 메인 메뉴 화면 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.printf("\t\t\t         SEOUL METRO\n");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t 1.열차 시간표");
		System.out.println("\t\t\t\t 2.고객의 소리");
		System.out.println("\t\t\t\t 3.정기권");
		System.out.println("\t\t\t\t 4.길 찾기");
		System.out.println("\t\t\t\t 5.요금표");
		System.out.println("\t\t\t\t 6.마이 페이지");
		System.out.println("\t\t\t\t 7.로그 아웃");
		System.out.println("\t\t\t\t 0.종료");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	}
	
	/**
	 * 비밀번호 찾기 출력문 메서드
	 */
	public static void signupFindPw() { // PW 찾기 01 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t           PW 찾기");
		System.out.println("\t(본인의 아이디,이름 그리고 주민등록번호를 차례대로 입력해주세요)");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		
	}
	
	/**
	 * 아이디 찾기 출력문 메서드
	 */
	public static void signupFindId() { // ID 찾기 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t           ID 찾기");
		System.out.println("             (본인의 이름과 주민등록번호를 차례대로 입력해주세요)");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		
	}
	
	/**
	 * 아이디 비밀번호 찾기 출력문 메서드
	 */
	public static void signupFindMain() { //ID/PW 찾기 메인 화면 01 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t          ID/PW 찾기");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t 1. ID 찾기");
		System.out.println("\t\t\t 2. PW 찾기");
		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");	}
	
	/**
	 * 관리자용 회원가입 출력문 메서드
	 */
	public static void signupEmployee() { // 회원가입 관리자용 가입 01 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t          관리자용 가입");
		System.out.println(" (관리자는 관리자 가입코드를 정확하게 입력하여야 합니다.");
		System.out.println(" (아이디는 4~12자 이내, 영어 소문자와 숫자만 입력 가능하며 숫자로 시작할 수 없습니다.)");
		System.out.println(" (비밀번호는 8~15자, 영어 대소문자,숫자 그리고 특수문자(!~*)만 입력 가능합니다.");
		System.out.println(" (이름은 2~5글자 , 한글만 입력 가능합니다.)");
		System.out.println(" (주민등록번호는 6자리, 7자리 총 13개의 숫자가 입력되어야 합니다.)");
		System.out.println(" (주민등록번호 유효성 검사가 존재하므로 정확한 주민등록번호를 입력하여야 합니다.)");
		System.out.println(" (전화번호는 3자리,  4자리 그리고 4자리 총 11개의 숫자가 입력되어야 합니다.)");
		System.out.println("( \"-\" 의 경우 포함 또는 미포함하여도 됩니다.)");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	
	}

//	public static void userName() { // 사용자 로그인 이름 띄우는 거 
//		clear();
//		System.out.printf("%s님 ",LoginLogout.authName);
//	}
	
//	public static void userNameHello() { // 사용자 로그인 이름 띄우는 거 
//		clear();
//		System.out.printf("%s님 환영합니다.",LoginLogout.authName);
//	}
	
		
	/**
	 * 고객 회원가입 출력문 메서드
	 */
	public static void signupUser() {//회원가입 개인회원 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t           개인회원 가입");
		System.out.println(" (아이디는 4~12자 이내, 영어 소문자와 숫자만 입력 가능하며 숫자로 시작할 수 없습니다.)");
		System.out.println(" (비밀번호는 8~15자, 영어 대소문자,숫자 그리고 특수문자(!,~,*,@)만 입력 가능합니다.");
		System.out.println(" (이름은 2~5글자 , 한글만 입력 가능합니다.)");
		System.out.println(" (주민등록번호는 6자리, 7자리 총 13개의 숫자가 입력되어야 합니다.)");
		System.out.println(" (주민등록번호 유효성 검사가 존재하므로 정확한 주민등록번호를 입력하여야 합니다.)");
		System.out.println(" (전화번호는 3자리,  4자리 그리고 4자리 총 11개의 숫자가 입력되어야 합니다.)");
		System.out.println(" (\"-\"의 경우 포함 또는 미포함하여도 됩니다.)");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	
	}
	/**
	 * 첫 화면 출력문 메서드
	 */
	public static void 	realMain() { // 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t         SEOUL METRO");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

		System.out.println();
		System.out.println("\t\t\t\t 1. 로그인");
		System.out.println("\t\t\t\t 2. 회원가입");
		System.out.println("\t\t\t\t 3. ID/PW 찾기");
		System.out.println("\t\t\t\t 4. 종료");
		System.out.println();

		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.print("\t\t\t선택 (번호): ");
	}
	/**
	 * 회원가입 메뉴 출력문 메서드
	 */
	public static void signupMain() { //회원가입 메인 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           회원가입");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t 1. 개인회원 가입");
		System.out.println();
		System.out.println("\t\t\t 2. 관리자용 가입");
		System.out.println();
		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");	}
	
	
	/**
	 * 로그인 화면 상단 출력문 메서드 
	 */
	public static void loginTop() { //로그인 화면 상단 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           로그인");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
		//밑에 입력 읽어야 함 
		
	}

	
	////////////////////////여기부터 관리자 화면 메서드
	
//	public void nameRank(String authName, String employeeRank) { //상단에 뜰 이름과 직급
//		System.out.printf("\t\t  이름:                   %s                          \n",LoginLogout.authName); //이름 변수 받아서 넣으세요
//		System.out.printf("\t\t  직급:                   %s                          \n",employeeRank); //직급 변수 받아서 넣으세요
//		
//	}
	
//	public static void logTotal() { //행동로그 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t     관리자가 로그인 이후 작업한 내역입니다.");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		//데이터 계속 이어 받아야 함..
//	}

//	public static void statisticsLineTotalMonthMoney() { // 호선 별 월 전체 매출 결과 값0
//		//데이터 받아서 그래프 그려야함 
//	}


//	public static void statisticsTotalMonthMoney() { //전체 호선 월 매출 0
//		//데이터 받아서 그래프 그려야함 
//	}
	
//	public static void statisticsMoneyMain() { // 매출 통계 메인 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t         원하는 기능을 선택하세요");
//		System.out.println("\t\t\t         (숫자로 입력해주세요)");
//		System.out.println("\t\t\t         현재 메뉴: 매출 통계");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t 1. 전체 호선 월 매출");
//		System.out.println("\t\t\t 2. 호선 별 월 매출");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");		
//	}
	
//	public static void statisticsLineTotalUserResult() { // 호선 별 월 전체 이용 인원 결과 0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.printf("\t\t\t      %s의 월 전체 이용 인원은 %s명 입니다.\n"); //받을 값 예시:2호선,  전체 이용 인원 계산 값
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}

//	public static void statisticsLineTotalUser() { //호선 별 월 전체 이용 인원 입력 , 호선 별 월 전체  매출 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       호선을 입력해주세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public void statisticsMonthTotalUserResult(String monthTotalUser) { // 월 전체 이용 인원 결과 0 
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.printf("\t\t\t 월 전체 이용 인원은 %s명 입니다.\n",monthTotalUser); //그냥 계산 결과 넣으면 됩니다. 
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void statisticsUserMain() { //이용객 통계 메인  02
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t         원하는 기능을 선택하세요");
//		System.out.println("\t\t\t         (숫자로 입력해주세요)");
//		System.out.println("\t\t\t         현재 메뉴: 이용객 통계");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t 1. 월 전체 이용 인원");
//		System.out.println("\t\t\t 2. 특정 호선 인원");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");		
//	}
	
//	public static void statisticsChaosFour() { //혼잡도 4번째 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       시간대를 입력해주세요");
//		System.out.println("\t\t\t (5~24까지의 수를 입력) (단위: 시)");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		//마지막 결과는 데이터라 따로 빼야함 
//	}
	
	/**
	 * 요일 선택 출력문 메서드
	 */
	public static void statisticsChaosThree() { //혼잡도 3번째 라벨 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t       요일을 선택해주세요");
		System.out.println("\t\t\t (평일 또는 주말을 입력해주세요)");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
//	public static void statisticsChaosTwo() { // 혼잡도 2번째 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       방향을 입력해주세요");
//		System.out.println("\t\t\t       (상행 또는 하행 기입)");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}public static void statisticsChaosTwoLine2() { // 혼잡도 2번째 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      방향을 입력해주세요");
//		System.out.println("\t\t\t      (외선 또는 내선 기입)");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	
//	public static void statisticsChaosOne() { //혼잡도 1번째 라벨 0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       호선을 입력해주세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
	/**
	 * 혼잡도 통계 출력문 메서드
	 */
	public static void busyStatMain() { // 혼잡도 통계
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t        혼잡도 통계");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	/**
	 * 통계 메뉴 출력문 메서드
	 */
	public static void busyStat() {
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t\t1. 혼잡도 통계");
		System.out.println("\t\t\t\t2. 이용객 통계");
		System.out.println("\t\t\t\t3. 매출 통계");
		System.out.println("\t\t   뒤로 가기를 원할 시 엔터키를 눌러주세요");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
//	public static void statisticsMain() { // 통계 정보 메인 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      원하는 기능을 선택하세요");
//		System.out.println("\t\t\t      (숫자로 입력해주세요)");
//		System.out.println("\t\t\t      현재 메뉴: 통계 정보");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t 1. 혼잡도 통계");
//		System.out.println("\t\t\t 2. 이용객 통계");
//		System.out.println("\t\t\t 3. 매출 통계");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");
//		
//	}
	
//	public static void calDeleteResult() { // 캘린더 일정 삭제 결과 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       삭제되었습니다.");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void calDeleteMid() { //캘린더 일정 삭제 중간 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t   제거 할 일정의 내용을 동일하게 작성해주세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void calAddResult() { //캘린더 일정 추가 결과 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t      일정이 성공적으로 추가되었습니다.");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
	/**
	 * 캘린더 일정 추가 출력문 메서드
	 */
	public static void calAdd() {//캘린더 일정 추가 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t   추가 할 일정을 작성해주세요");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
	/**
	 * 캘린더 전체 일정 보기 출력문 메서드
	 */
	public static void calList() { // 캘린더 전체 일정 보기 , 일정 제거 윗부분 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t           전체 일정");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		//일정 데이터 밑에 붙여야함
	}
	
	/**
	 * 행사 캘린더 메인 메뉴 출력문 메서드
	 */
	public static void calMain() { //행사 캘린더 메인 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t      원하는 기능을 선택하세요");
		System.out.println("\t\t\t      (숫자로 입력해주세요)");
		System.out.println("\t\t\t      현재 메뉴: 행사 캘린더");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t\t1. 전체 일정 보기");
		System.out.println("\t\t\t\t2. 일정 추가");
		System.out.println("\t\t\t\t3. 일정 제거");
		System.out.println("\t\t\t뒤로 가기를 원할 시 엔터키를 눌러주세요");
		
	}
	

	
//	public static void vocListBottom() { //전체 민원 보기 아래부분 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("    특정 민원인의 민원 내용을 확인하려면 민원인의 아이디와 제목을 입력하세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//	
//	}
	
	/**
	 * 민원 목록 출력문 메서드
	 */
	public static void vocListTop() { //전체 민원 보기 윗 부분 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t              민원 목록");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		// 민원 데이터 나와야함 
	}
	
//	public static void adminLostarticleSearchTop() { // 분실물 검색 상단 0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t      찾고자 하는 분실물의 이름을 적어주세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//	//밑에 입력 받으면 분실물 리스트 불러오기 해야함 
//	}
	/**
	 * 분실물 삭제 결과 출력문 메서드
	 */
	public static void lostarticleDeleteResult() { //분실물 삭제 결과 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t     [등록된 분실물 정보를 삭제 하였습니다.]");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	
	}
	
//	public static void lostarticleDelete() { //분실물 삭제 상단 라벨 01 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t        삭제 할 분실물의 분실물,호선 그리고 역을 입력해주세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//	
//	}
	
	/**
	 * 분실물 추가 결과 출력문 메서드
	 */
	public static void lostarticleAddResult() { //분실물 추가 결과 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t     [분실물이 정상적으로 등록되었습니다.]");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	
	}
	/**
	 * 분실물 추가 입력하는 메서드
	 */
	public static void lostarticleAdd() { //분실물 추가 라벨 0 1 2 
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t 추가 할 분실물의 분실물,호선 그리고 역을 입력해주세요");
		System.out.println("\t\t (호선 입력 시 \"호선\"까지 포함하여 입력해주세요.)");
		System.out.println("\t\t                   (예시: 2호선)");
		System.out.println("\t\t (역 입력 시 (역)을 제외하고 작성해주세요.)");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	
	}
	
	
	
//	public static void lostarticleList() { //분실물 추가 , 제거  상단 부분 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t            분실물 목록");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//	}
	
	/**
	 * 행동 로그 출력하는 메서드
	 */
	public static void logView() { //분실물 추가 , 제거  상단 부분 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t          행동 로그");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	}
	
	/**
	 * 분실물 관리하는 메뉴 출력하는 메서드
	 */
	public static void lostarticleMain() { //전체 분실물 보기 화면 01 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t      원하는 기능을 선택하세요");
		System.out.println("\t\t\t      (숫자로 입력해주세요)");
		System.out.println("\t\t\t      현재 메뉴: 전체 분실물 보기");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t     1. 분실물 검색");
		System.out.println("\t\t\t     2. 분실물 추가");
		System.out.println("\t\t\t     3. 분실물 제거");
		System.out.println("\t\t\t     뒤로 가기를 원할 시 엔터키를 눌러주세요");
		
	}
	
	/**
	 * 고객의 소리 메인화면 출력문 메서드
	 */
	public static void vocMain() { //고객의 소리 메인화면  01 2 
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t     원하는 기능을 선택하세요");
		System.out.println("\t\t\t     (숫자로 입력해주세요)");
		System.out.println("\t\t\t     현재 메뉴: 고객의 소리");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t 1. 전체 분실물 보기");
		System.out.println("\t\t\t 2. 전체 민원 보기");
		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");
		
	}
	
//	public static void safetyEmployeeUnlockResultBottom() { //부서해제 결과 하단 라벨 0  2
//
//		clear();
//		System.out.println("\t\t\t\t  [부서 해제]");
//	}
	
	
//	public static void safetyEmployeeSetUnlockBottom() { //안전요원 배치, 해제 아래 부분 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t ID,호선 그리고 역을 입력해주세요");
//		System.out.println("\t\t         (호선 입력 시 \"호선\"까지 포함하여 입력해주세요.)");
//		System.out.println("\t\t\t           (예시: 2호선)");
//		System.out.println("\t\t\t (역 입력 시 (역)을 제외하고 작성해주세요.)");		
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
	
//	public static void safetyEmployeeUnlockList() { //안전요원 해제 상단 라벨 0 2 
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       배치된 안전 요원 목록");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		//데이터 추가
//	}
	
//	public static void safetyEmployeeSetResultBottom() { //안전요원 배치 결과 하단 0 2 
//		clear();
//		System.out.println("\t\t\t\t     [배치 완료]");
//	}
//	
//	public static void safetyEmployeeSetListMid() { //안전 요원 배치 목록 상단 출력 후 다음 출력 0 2
//		clear();
//		System.out.println("\t\t\t ID,호선 그리고 역을 입력해주세요.");
//		System.out.println("\t\t\t (호선 입력 시 \"호선\"까지 포함하여 입력해주세요.)");
//		System.out.println("\t\t\t             (예시: 2호선)");
//		System.out.println("\t\t\t (역 입력 시 (역)을 제외하고 작성해주세요.)");
//	}

	 
//	public static void safetyEmployeeSetListTop() {//안전 요원 배치 목록 상단  0 2 
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      배치 안 된 안전 요원 목록");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		//데이터 추가
//	}
	
//	public static void safetyEmployeeSearchStation() { // 안전 요원 역으로 검색 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t    안전 요원 목록을 확인 할 역을 입력해주세요");
//		System.out.println("\t\t    (역 입력 시 (역)을 제외하고 작성해주세요.)");
//		System.out.println("\t\t    현재 메뉴: 역 이름으로 안전 요원 검색");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//		
//	}
	
	
//	public static void safetyEmployeeSearchLine() { //호선으로 안전 요원 검색 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t   안전 요원 목록을 확인 할 호선을 입력해주세요");
//		System.out.println("\t\t   (호선 입력 시 \"호선\"까지 포함하여 입력해주세요.)");
//		System.out.println("\t\t   (예시: 2호선)");
//		System.out.println("\t\t   현재 메뉴: 호선으로 안전 요원 검색");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void safetyEmployeeSearchResult() { //안전 요원 검색 출력 결과 라벨 0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("  [이름]     [아이디]     [직급]     [전화번호]     [담당하는 역(호선)]");
//	}
	
//	public static void safetyEmployeeSee() { //전체 안전 요원 보기 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      원하는 기능을 선택하세요");
//		System.out.println("\t\t\t      (숫자로 입력해주세요)");
//		System.out.println("\t\t\t      현재 메뉴: 전체 안전 요원 보기");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t 1. 호선으로 안전 요원 검색");
//		System.out.println("\t\t\t 2. 역 이름으로 안전 요원 검색");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");
//		
//	}
	
//	public static void safetyEmployeeMain() { //안전 요원 관리 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t       원하는 기능을 선택하세요");
//		System.out.println("\t\t\t       (숫자로 입력해주세요)");
//		System.out.println("\t\t\t       현재 메뉴: 안전 요원 관리");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t 1. 전체 안전 요원 보기");
//		System.out.println("\t\t\t 2. 안전 요원 배치");
//		System.out.println("\t\t\t 3. 안전 요원 부서 해제");
//		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");
//	}
	
	
//	public static void employeeDeleteResult() { //직원 삭제 (예) 결과 값 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t         삭제되었습니다.");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
	
//	public static void employeeDeleteTwo() { //직원 삭제 2번째 라벨 0 2
//		clear();
//		System.out.println("\t\t\t\t     [해당 직원 정보]");
//		System.out.println("\t\t 1. %s의 이름: %s \n"); //id와 이름 넣어주세요
//		System.out.println("\t\t 2. %s의 호선: %s \n"); //id와 호선 넣어주세요
//		System.out.println("\t\t 3. %s의 역: %s\n"); //id와 역 넣어주세요
//		System.out.println("\t\t 4. %s의 직급: %s\n"); //id와 직급 넣어주세요
//		System.out.println("해당 직원을 삭제하시겠습니까? (예 또는 아니오를 작성해주세요)");
//	}
	
//	public static void employeeDeleteOne() { //직원 삭제 1번째 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t         삭제하고자 하는 직원의 ID를 입력해주세요");
//		System.out.println("\t\t\t\t   현재 메뉴: 직원 삭제 ");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	
	
//	public static void employeerankChangeTwo() { // 직원 직급 변경 2번째 라벨  02
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t          변경 할 직급을 입력해주세요.");
//		System.out.println("       (직급은 [안전요원], [사원], [대리], [과장], [부장], [사장]이 존재합니다.)");
//		System.out.println("\t\t\t            현재 메뉴: 직급 변경 ");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
	/**
	 * 직원 직급 변경 출력문 메서드
	 */
	public static void employeerankChangeOne() { // 직원 직급 변경 1번째 라벨 02
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t 직급 변경이 필요한 직원의 ID를 입력해주세요.");
		System.out.println("\t\t\t           현재 메뉴: 직급 변경 ");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
//	public static void employeeChangeResult() { // 출력결과 라벨 0 1
//		clear();
//		System.out.println("\t\t\t\t       [출력결과]");
//		//데이터 따로 추가
//	}
	
//	public static void employeeOfficeChangeThree() { // 직원 근무지 변경 3번째 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t      변경하고자 하는 근무지의 역을 입력해주세요.");
//		System.out.println("\t\t      (역 입력 시 (역)을 제외하고 작성해주세요.)");
//		System.out.println("\t\t\t      현재 메뉴: 근무지 변경 ");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void employeeOfficeChangeTwo() { //직원 근무지 변경 2번째 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t    변경하고자 하는 근무지의 호선을 입력해주세요.");
//		System.out.println("\t\t    (호선 입력 시 \"호선\"까지 포함하여 입력해주세요.)");
//		System.out.println("\t\t\t          (예시: 2호선)");
//		System.out.println("\t\t\t      현재 메뉴: 근무지 변경 ");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	/**
	 * 직원 리스트 출력문 메서드
	 */
	public static void employeeSearch() { //  2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t      직원 리스트");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	/**
	 * 고객 리스트 출력문 메서드
	 */
	public static void userSearch() { // 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t          고객 리스트");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
	/**
	 * 직원 근무지 변경 출력문 메서드
	 */
	public static void employeeOfficeChangeOne() { // 직원 근무지 변경 1번째 라벨 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t      근무지 변경이 필요한 직원의 ID를 입력해주세요.");
		System.out.println("\t\t\t      현재 메뉴: 근무지 변경 ");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	
	/**
	 * 직원 정보 수정 메뉴 출력문 메서드
	 */
	public static void employeeInfoChangeMain() { //직원 정보 수정 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t      원하는 기능을 선택하세요");
		System.out.println("\t\t\t      (숫자로 입력해주세요)");
		System.out.println("\t\t\t      현재 메뉴: 직원 정보 수정");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t 1. 근무지 변경");
		System.out.println("\t\t\t 2. 직급 변경");
		System.out.println("\t\t\t 3. 권한 변경");
		System.out.println("\t\t\t 4. 계정 삭제");
		System.out.println("\t\t\t 뒤로 가기를 원할 시 엔터키를 눌러주세요");
	
	}
	
	/**
	 * 직원 권한 부여 출력문 메서드
	 */
	public static void employeeHan() { //2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t    권한 부여가 필요한 직원의 ID를 입력해주세요.");
		System.out.println("\t\t\t    현재 메뉴: 권한 부여 ");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	}
	
	/**
	 * 직원 검색 결과 출력문 메서드
	 */
	public static void employeeSearchNameResult() { // 이름으로 직원 검색 결과0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t 검색하고자 하는 호선,이름 또는 직원이름을 입력해주세요");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
	}
	/**
	 * 이름으로 직원 검색 출력문 메서드
	 */
	public static void employeeSearchName() { // 이름으로 직원 검색 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");		
		System.out.println();
		System.out.println("\t\t\t    확인 할 직원의 이름을 입력해주세요");
		System.out.println("\t\t\t    (성 포함 이름 입력해주세요)");
		System.out.println("\t\t\t    현재 메뉴: 이름으로 직원 검색");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");	
	}
	
	/**
	 * 역으로 직원 검색 출력문 메서드
	 */
	public static void employeeSearchStation() { // 역으로 직원 검색 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");		
		System.out.println();
		System.out.println("\t\t\t    직원 목록을 확인 할 역을 입력해주세요");
		System.out.println("\t\t\t    (역 입력 시 (역)을 제외하고 작성해주세요.)");		
		System.out.println("\t\t\t    현재 메뉴: 역으로 직원 검색");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");	
	}
	
	
//	public static void employeeSearchLineResult() {//일반직원 검색 결과 라벨 , 안전요원 검색 결과 라벨0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t      현재 해당 호선에 근무 중인 직원 목록입니다.");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("[이름]     [아이디]     [직급]     [전화번호]     [담당하는 역(호선)]");
//		//밑에는 따로 데이터 추가 
//	}
	
	
//	public static void employeeSearchLine() { //전체 직원 정보 보기 > 호선으로 직원 검색 0 1 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t  직원 목록을 확인 할 호선을 입력해주세요");
//		System.out.println("\t\t\t  (호선 입력 시 \"호선\"까지 포함하여 입력해주세요.)");
//		System.out.println("\t\t\t  (예시: 2호선)");		
//		System.out.println("\t\t\t  현재 메뉴: 호선으로 직원 검색");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");	
//		}
	
//	public static void employeeTotalInfo() { //전체 직원 정보 보기 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      원하는 기능을 선택하세요");
//		System.out.println("\t\t\t      (숫자로 입력해주세요)");
//		System.out.println("\t\t\t      현재 메뉴: 전체 직원 정보 보기");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t   1. 호선으로 직원 검색");
//		System.out.println("\t\t\t   2. 역 이름으로 직원 검색");
//		System.out.println("\t\t\t   3. 이름으로 직원 검색");
//		System.out.println("\t\t\t   뒤로 가기를 원할 시 엔터키를 눌러주세요");
//	}
//	
	
	/**
	 * 직원 관리 메뉴 출력문 메서드
	 */
	public static void employeeMain() { //직원 관리 메뉴 0 1 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t      원하는 기능을 선택하세요");
		System.out.println("\t\t\t      (숫자로 입력해주세요)");
		System.out.println("\t\t\t      현재 메뉴: 직원 관리");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t   1. 전체 직원 정보 보기");
		System.out.println("\t\t\t   2. 직원 정보 수정");
		System.out.println("\t\t\t   3. 안전 요원 관리");
		System.out.println("\t\t\t   뒤로 가기를 원할 시 엔터키를 눌러주세요");
	}
	/**
	 * 관리자 메인화면 출력문 메서드
	 */
	public static void adminMainView() { //관리자 메인 화면 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t         SEOUL METRO");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t    선택하고자 하는 메뉴의 번호를 입력해주세요. ");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t\t 1. 역 관리");
		System.out.println("\t\t\t\t 2. 직원 관리");
		System.out.println("\t\t\t\t 3. 고객의 소리");
		System.out.println("\t\t\t\t 4. 행사 캘린더");
		System.out.println("\t\t\t\t 5. 통계 정보");
		System.out.println("\t\t\t\t 6. 요금표");
		System.out.println("\t\t\t\t 7. 열차 시간표");		
		System.out.println("\t\t\t\t 8. 행동 로그 보기");
		System.out.println("\t\t\t\t 9. 마이페이지");
		System.out.println("\t\t\t\t 10. 로그아웃");
		System.out.println("\t\t\t\t 0. 종료");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

	
	}
	/**
	 * 역 관리 메인 화면 출력문 메서드
	 */
	public static void stationMain() { //역 관리 메인 화면 0
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t    원하는 기능을 선택하세요");
		System.out.println("\t\t\t      (숫자로 입력해주세요)");
		System.out.println("\t\t\t      현재 메뉴: 역 관리");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t     1. 일반 열차 추가");
		System.out.println();
		System.out.println("\t\t\t     2. 의자 없는 열차 변경");
		System.out.println();
		System.out.println("\t\t\t뒤로 가기를 원할 시 엔터키를 눌러주세요");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	}
	
	/**
	 * 일반 열차 추가 출력문 메서드
	 */
	public static void trainAddOne() { // 역관리 >  열차 추가 > 추가 할 호선 0 수정했음222222222222222222222222  
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.printf("\t\t\t        일반 열차 추가    (예비 열차 대수 : %d)\n",StationManagement.spareTrain);
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

	}
	/**
	 * 의자 없는 열차 변경 출력문 메서드
	 */
	public static void changeNoChairTrain() { // 역관리 >  열차 추가 > 추가 할 호선 수정했음 22222222222222222
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t     의자 없는 열차 변경");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

	}
	/**
	 * 
	 */
//	public static void trainAddTwo() { // 역 관리 >  열차 추가 > 추가 할 열차 수 0
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      추가 할 열차 수를 입력해주세요");
//		System.out.println("\t\t\t (숫자로 입력해주세요)");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
	
//	public static void trainAddThree() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 0
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      확인 할 구간의 시작역을 입력해주세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
//	public static void trainAddFour() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 > 확인 종료 역 0
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      확인 할 구간의 종료역을 입력해주세요");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
	
	
//	public static void trainAddFive() {// 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 > 확인 종료 역 > 추가 시간대 0
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t      열차를 추가 할 요일을 입력해주세요");
//		System.out.println("\t\t\t ( 가능 시간대 : 05:00 ~ 24:00)");
//		System.out.println("\t\t\t      (5~24까지의 수를 입력) (단위: 시)");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
//	public static void trainAddSix() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 > 확인 종료 역 > 추가 시간대 > 요일0
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t     열차를 추가 할 시간대를 입력해주세요.");
//		System.out.println("\t\t\t (평일 또는 주말로 입력해주세요)");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	/**
	 * 개선 혼잡도 결과 출력문 메서드
	 */
	public static void trainAddResult() { // 역 관리 열차 추가의 혼잡도 결과물  0
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t\t    개선된 혼잡도의 결과입니다.");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");


	}
//	public static void changeNoChairTrainResult() { // 역 관리 열차 추가의 혼잡도 결과물  0
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println();
//		System.out.println("\t\t\t열차 변경 시에 개선된 혼잡도의 결과입니다.");
//		System.out.println();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//
//	}
	

	/**
	 * 에러 문구 출력하는 메서드
	 */
	public static void trainAddError() { //애매할 때 쓰는 에러 문구0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t   올바르지 않은 값 입니다. 다시 입력해주세요");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

	}
	
	/**
	 * 에러문구 출력하는 메서드
	 */
	public static void dayError() { // 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t   주말,평일을 잘못 입력하셨습니다.");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
	}
	
//	public static void calError() { // 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t      존재하지 않는 일정입니다.");
//System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//	}
//	public static void seasonPassError() { // 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t   존재하지 않는 정기권 코드입니다.");
//		System.out.println("\t\t      (정기권은 영어 대문자로만 이뤄져있습니다.)");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//	}
	/**
	 * 에러 문구 출력하는 메서드
	 */
	public static void noIdError() { //존재하지 않는 아이디를 입력할 시 에러 0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t     존재하지 않는 아이디입니다. ");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

	}
//	public static void stationError() { //역 이름을 잘못 작성한 경우 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t     존재하지 않는 역입니다. ");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//	}
	
//	public static void twiceIdError() { // 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t        중복된 아이디입니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	public static void RRNError() { // 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t  유효하지 않은 주민등록번호입니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	public static void rRNFormatError() { // 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t   주민등록번호 형식이 틀렸습니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	public static void twiceRRNError() { // 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t    중복된 주민등록번호입니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	/**
	 * 에러 문구 출력하는 메서드
	 */
	public static void hoLineError() { //잘못된 호선을 집어넣을 경우0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t   존재하지 않는 호선 또는 역입니다.");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
	/**
	 * 에러 문구 출력하는 메서드
	 */
	public static void lineError() { //잘못된 호선을 집어넣을 경우0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t     존재하지 않는 호선입니다.");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		
	}
//	public static void twicePhoneNumberError() { //2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t       중복된 전화번호입니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	public static void noPhoneNumberError() { //2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t   유효하지 않은 전화번호입니다..");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//	}
	
//	public static void phoneNumberFormatError() { //2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t  존재하지 않는 번호거나 전화번호 형식이 틀렸습니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void codeError() { //2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t      회원코드가 틀렸습니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	public static void rankNameError() { // 존재하지 않는 직급을 주었을 때 에러 22
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t     존재하지 않는 직급입니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
//	public static void idFormatError() {//2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t    아이디 형식이 틀렸습니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	public static void pwFormatError() { //2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t     비밀번호 형식이 틀렸습니다.");
//		System.out.println("\t비밀번호는 8~15자, 대소문자,숫자,특수문자(!~*로 이루어져있습니다.)");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
//	public static void nameError() { //이름을 잘못 입력한 경우 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("\t\t\t     이름 형식이 틀렸습니다.");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		
//	}
	
	/**
	 * 권한 없음 출력하는 메서드
	 */
	public static void rankError() { //최고 관리자가 아닐 시 (권한이 안 될 시 )0 2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println("\t\t\t   해당 페이지 접근 권한이 없습니다.");
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		pause();
		
	}
	
//	public static void page() { // 페이지 넘기기 라벨 0 2
//		clear();
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.println("    (이전 페이지를 보고 싶으면 q, 다음 페이지를 보고 싶으면 e를 입력해주세요.)");
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//
//		
//	}
	/**
	 * 일시정지 메서드
	 */
	public static void pause() { // 일시 정지 2
		Scanner scan = new Scanner(System.in);

		System.out.println("\t\t\t 계속하려면 엔터를 입력하세요.");
		scan.nextLine();
	}
	/**
	 * 에러 문구 출력하는 메서드
	 */
	public static void noIDDataError() { //2
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.println("\t\t   해당 데이터를 통해 가입한 회원이 없습니다.");
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");

	}
	
	/**
	 * 입력 문구 출력하는 메서드
	 */
	public static void chooseNum() {

		
//		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.print("\t\t\t\t선택 (번호): ");

	}
	
//	public  static void insertRabel() {
//
//		
//		//System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.print("\t\t\t\t      입력: ");
//	}
//	public static void chooseline() {
//		
//		//System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.print("\t\t\t      호선: ");
//	}
//	public static void choosestartStation() {
//		
//		//System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.print("\t\t\t    시작역: ");
//	}
//	public static void chooseentStation() {
//		
//		//System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
//		System.out.print("\t\t\t    도착역: ");
//	}
	
	/**
	 * 역 리스트 출력하는 메서드
	 * @param line 호선
	 */
	public static void stationNamePageTable(String line) { // 
		clear();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		System.out.println();
		System.out.printf("\t\t\t         %s 역리스트\n", line);
		System.out.println();
		System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
		

	}
	
	/**
	 * 에러 문구 출력하는 메서드
	 * @param error 에러 문구 ArrayList
	 * @return 다시 진행 true 뒤로가기 false
	 */
	public static boolean errorPrint(ArrayList<String> error) {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			/**
			 * 에러 문구의 번호를 저장하는 인덱스 변수
			 */
			int index = 1;
			error.remove(error.size()-1);
			ViewAll.trainAddError();
			System.out.println();
			for(String log : error) {
				System.out.printf("  \t\t%d. %s\n\n",index++,log);
			}
			System.out.println();

			System.out.println("\t\t뒤로 가기를 원한다면 엔터를 입력하세요.");
			System.out.println("\t\t다시 진행을 원한다면 엔터제외 아무키나 입력하세요.");
			System.out.println("╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬═════════════╬╬");
			System.out.println();
			System.out.print("\t\t\t입력: ");
			
			/**
			 * 입력한 값을 저장하는 변수
			 */
			String sel = reader.readLine();
			if(sel.equals("")) {
				return false; //뒤로가기 false
			} 
			 
			
		} catch (Exception e) {
			System.out.println("ViewAll.errorPrint");
			e.printStackTrace();
		}
		
		return true;      //다시 진행 true
		
		
		
		
	}
}
	

