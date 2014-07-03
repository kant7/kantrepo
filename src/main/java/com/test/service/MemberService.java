package com.test.service;

import com.test.mybatis.Member;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Coupang
 * Date: 14. 7. 3
 * Time: 오전 11:36
 * To change this template use File | Settings | File Templates.
 */
public interface MemberService {
    public ArrayList<Member> getMemberList();
    public void insertMember(Member member);
    public void updateMember(String name);
    public void deleteMember(String name);
}
