package com.handong.gym;

public interface ICRUD {
    public Object add();
    public int updateMember(Object obj);
    public int deleteMember(Object obj);
    public void loadFile();
    public void saveFile();
}
