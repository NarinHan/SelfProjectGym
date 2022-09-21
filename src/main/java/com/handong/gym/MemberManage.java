package com.handong.gym;

import java.util.Scanner;

public class MemberManage {
    Scanner s = new Scanner(System.in);
    MemberCRUD memberCRUD;

    public MemberManage() {
        memberCRUD = new MemberCRUD(s);
    }

    public int selectMenu() {
        System.out.print("""
                *** 헬스장 회원관리 시스템 ***
                ************************
                1. 회원 전체 조회
                2. 회원 검색
                3. 카테고리별 조회
                4. 회원 추가
                5. 회원 정보 수정
                6. 회원 삭제
                7. 파일 저장
                0. 프로그램 종료
                ************************
                => 실행할 메뉴를 선택하세요 :\s""");
        return s.nextInt();
    }

    public void start() {
        while(true) {
            int menu = selectMenu();
            if(menu == 0) {
                System.out.println("프로그램을 종료합니다! 이용해주셔서 감사합니다!");
                break;
            }
            else if(menu == 1) {
                memberCRUD.listAll();
            }
        }
    }
}
