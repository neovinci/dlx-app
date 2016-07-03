package by.epamlab.dlx.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sergei Astapenko on 07.06.2016.
 */
public class LoginForm extends ActionForm {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        boolean isError = false;
        if (login == null || "".equals(login.trim())) {
            errors.add("login", new ActionMessage("auth.jsp.err.login.empty"));
            isError = true;
        }
        if (password == null || "".equals(password.trim())) {
            errors.add("password", new ActionMessage("auth.jsp.err.password.empty"));
            isError = true;
        }
        request.setAttribute("error", true);
        return errors;
    }
}
