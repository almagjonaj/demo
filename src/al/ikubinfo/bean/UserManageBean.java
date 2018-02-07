package al.ikubinfo.bean;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import al.ikubinfo.service.Aaa;
import al.ikubinfo.service.UserService;


@ManagedBean(name = "userManageBean")
@ViewScoped
public class UserManageBean {
	/**
	 * 
	 */
	String a	=	"aaaaa";
	String b	=	"bbbbb";
	
	@ManagedProperty(value = "#{aaa}")
	public Aaa aaa;
	
	@ManagedProperty(value = "#{userService}")
	public UserService userService;
	

	@PostConstruct
	public void init() {
		FacesContext context = FacesContext.getCurrentInstance();

		System.out.println("Init 0..."+aaa);
		System.out.println("Init 1..."+userService);

	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}




	public Aaa getAaa() {
		return aaa;
	}

	public void setAaa(Aaa aaa) {
		this.aaa = aaa;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	

}
