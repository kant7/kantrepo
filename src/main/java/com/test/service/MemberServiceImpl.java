package com.test.service;

import com.test.mybatis.Member;
import com.test.mybatis.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Coupang
 * Date: 14. 7. 3
 * Time: 오전 11:37
 * To change this template use File | Settings | File Templates.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public ArrayList<Member> getMemberList() {
        return memberDAO.getMembers();
    }

    @Transactional
    @Override
    public void insertMember(Member member) {
        memberDAO.insertMember(member);
    }

    @Transactional
    @Override
    public void updateMember(String name) {
        memberDAO.updateMember(name);
    }

    @Override
    public void deleteMember(String name) {
        memberDAO.deleteMember(name);
    }
}
