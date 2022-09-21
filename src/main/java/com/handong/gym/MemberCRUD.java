package com.handong.gym;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberCRUD implements ICRUD {
    ArrayList<Member> list;
    Scanner s;

    public MemberCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }

    @Override
    public Object add() {
        return null;
    }

    public void listAll() {
        System.out.println("=============================");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(String.format("%02d", (i+1)) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("=============================");
    }
}
