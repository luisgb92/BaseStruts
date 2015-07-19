package wicho.net.base.actions;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Namespaces(value={@Namespace("/")})
@Result(location="/jsp/login.jsp")
@Actions(value={@Action("")})
public class Index  extends ActionSupport {	
	
}
