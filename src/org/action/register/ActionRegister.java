package org.action.register;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.dao.register.DaoImplRegister;
import org.dao.register.DaoRegister;
import org.modelo.register.Register;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionRegister extends ActionSupport implements ModelDriven<Register> 
{
	private Register register = new Register();
	private DaoRegister dao = new DaoImplRegister();
	private List<Register> listRegister = new ArrayList<Register>();

	public String execute() 
	{
		return SUCCESS;
	}

	public String add() {
		dao.addRegister(register);
		return SUCCESS;

	}

	public String select() {
		setListRegister(dao.listRegisters());
		return SUCCESS;
	}
	//Servlet: requestMethodHttp (enviar peticiones), 
		//responseMethodHttp (ejecución de un servicio)
		//CUAL ES EL CICLO DE VIDA DE UN SERVLET?
		/*
		 * •	Un servidor carga e inicializa el servlet.               init()
		   •	El servlet maneja cero o más peticiones de cliente.   service()
		   •	El servidor elimina el servlet.                       destroy()
		 */
		//CUAL ES LA DIF. ENTRE UN SERVLET Y UN JSP?
		//JSP ES DINAMICO Y EL SERVLET ES ESTATICO....PrintWriter
	public String edit() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		register = dao.getRegisterById(Integer.parseInt(request.getParameter("id")));
		return SUCCESS;

	}

	public String delete() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		dao.deleteRegister(Integer.parseInt(request.getParameter("id")));
		return SUCCESS;

	}

	@Override
	public Register getModel() {
		return register;
	}
	
	
	//GETTERS AND SETTERS OF REGISTER AND LISTREGISTER
	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public List<Register> getListRegister() {
		return listRegister;
	}

	public void setListRegister(List<Register> listRegister) {
		this.listRegister = listRegister;
	}

}
