package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.AdminDao;
//???
@Transactional
@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Resource
	private AdminDao ad;
	public int login(String adminName, String adminPassword) {
		return ad.login(adminName, adminPassword);
	}

}
