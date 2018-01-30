package cn.sst.oa.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.sst.oa.entity.Privilege;
import cn.sst.oa.service.IPrivilegeService;

/**
 * 首页Action
 * 
 * @author zhaoqx
 * 
 */
@Controller
public class HomeAction extends ActionSupport {
	@Resource
	private IPrivilegeService privilegeService;

	public String index() {
		return "index";
	}

	public String top() {
		return "top";
	}

	public String left() {
		/*List<Privilege> topList = privilegeService.findTopList();
		ActionContext.getContext().getValueStack().set("topList", topList);*/
		return "left";
	}

	public String right() {
		return "right";
	}

	public String bottom() {
		return "bottom";
	}

}
