package controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.AdminService;

@Controller

public class AdminController {
	@Resource
	private AdminService as ;
	//��ʱ�����������web��Ŀ¼
	
	/*JSPҳ�������WEB-INF�����views�ļ�����������޷�ֱ�ӷ��ʵģ�
	 * �����Ҫһ��controller������ҳ�����ת*/
	/*
	 * ���Բ�ѯ
	 * @RequestMapping("/showUser")
    public String testtoshowUser(@RequestParam(value = "id") Integer id, Model model) {
        System.out.println("id:" + id);
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "showUser";
    }*/
	@RequestMapping("/login")
	public String testlogin(@RequestParam(value="id") Integer id) {
		return "��½�ɹ�";
	}

}
