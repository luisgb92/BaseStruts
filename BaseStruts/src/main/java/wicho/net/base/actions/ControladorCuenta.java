package wicho.net.base.actions;

import javax.servlet.ServletContext;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;

import wicho.net.base.beans.Cuenta;
import wicho.net.base.dao.CuentaDao;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("json-default")
public class ControladorCuenta extends ActionSupport implements ServletContextAware{

	private static final long serialVersionUID = -2023017751150765974L;

	String jsonData;
	ServletContext context;

	@Action(value = "/validarCuenta", results = { @Result(name = "success", type = "json") })
	public String validarCuenta() {
		
		Cuenta bean = new Cuenta();
		bean = new Gson().fromJson(getJsonData(), Cuenta.class);
		
		CuentaDao dao = new CuentaDao((SessionFactory)context.getAttribute("SessionFactory"));
		if(dao.validar(bean))
			setJsonData("true");
		else
			setJsonData("false");
		
		return SUCCESS;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	
	public String getJsonData() {
		return jsonData;
	}

	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context = context;
	}

}
