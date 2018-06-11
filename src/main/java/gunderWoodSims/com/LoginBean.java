package gunderWoodSims.com;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name="loginBean")
@RequestScoped

public class LoginBean 
{	private String userName = null;
	private String password = null;
	private String errorMsg = null;
	
	public String getUserName()
	{	return this.userName;
	}
	
	public void setUserName(String userName)
	{	this.userName = userName;
	}
	
	public String getPassword()
	{	return this.password;
	}
	
	public void setPassword(String password)
	{	this.password = password;
	}
	
	public String getErrorMsg()
	{	return this.errorMsg;
	}
	
	public void setErrorMsg(String errorMsg)
	{	this.errorMsg = errorMsg;
	}
	
	public String validate()
	{	if("admin".equals(this.userName) && "admin".equals(this.password))
		{	this.errorMsg = null;
			return "welcome";
		}
		else
		{	this.errorMsg = "Invalid user name or password.  Please try again.";
			return null;
		}
	}
}
