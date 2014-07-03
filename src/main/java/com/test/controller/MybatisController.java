package com.test.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import com.test.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.mybatis.Member;
import com.test.mybatis.MemberDAOService;

@Controller
public class MybatisController {

    //
    //@Autowired
    //private MemberDAOService memberDAOService;

    @Autowired
    private MemberService memberService;

    private static final Logger logger = LoggerFactory.getLogger(MybatisController.class);


    //시작 메인화면.
    @RequestMapping("/main")
    public ModelAndView main(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view 화면인 main.jsp에 DB로부터 읽어온 데이터를 보여준다.
        ModelAndView result = new ModelAndView();
        //addObject view에 넘어가는 데이터
        //List<Member> memberList = memberDAOService.getMembers();
        List<Member> memberList = memberService.getMemberList();
        result.addObject("result", memberList);
        result.setViewName("main");

        return result;
    }

    //insert 버튼 클릭시 값을 가져와서 result.jsp로 화면전환 해준다.
    @RequestMapping(value ="/insert", method = RequestMethod.POST)
    public ModelAndView insert(HttpServletRequest request){

        // HttpServletRequest를 이용하여 main.jsp로부터
        Member member = new Member();
        member.set_name((String) request.getParameter("name"));
        member.set_email((String) request.getParameter("email"));
        member.set_phone((String) request.getParameter("phone"));

        memberService.insertMember(member);
        System.out.println("insert complet");

        //아래부분은 select값을 result.jsp파일에 보여주기 위해 또사용.
        ModelAndView result = new ModelAndView();
        List<Member> memberList = memberService.getMemberList();
        result.addObject("result", memberList);
        result.setViewName("result");
        return result;
    }

    @RequestMapping(value = "/members.json", method = RequestMethod.GET)
    @ResponseBody
    public List<Member> getMembers() {
        List<Member> memberList = memberService.getMemberList();
        return memberList;
    }
}
