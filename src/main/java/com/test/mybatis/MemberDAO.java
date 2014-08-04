package com.test.mybatis;

import java.util.ArrayList;

public interface MemberDAO {

	public ArrayList<Member> getMembers();
	public void insertMember(Member member);
	public void updateMember(String name);
	public void deleteMember(String name);

    //BCH-1 에서 작업 (work)

    //develop
}
