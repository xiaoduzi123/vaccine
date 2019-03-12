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
	//这时的请求是相对web根目录
	
	/*JSP页面存在在WEB-INF下面的views文件夹里，这样是无法直接访问的，
	 * 因此需要一个controller来控制页面的跳转*/
	/*
	 * 测试查询
	 * @RequestMapping("/showUser")
    public String testtoshowUser(@RequestParam(value = "id") Integer id, Model model) {
        System.out.println("id:" + id);
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "showUser";
    }*/
	@RequestMapping("/login")
	public String testlogin(@RequestParam(value="id") Integer id) {
		return "登陆成功";
	}

}
