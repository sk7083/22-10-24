package kr.kh.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class InfoVO {
	private String name;
	private int num;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	

	
	@Override
	public String toString() {
		return "InfoVO [name=" + name + ", num=" + num + "]";
	}
	
}
