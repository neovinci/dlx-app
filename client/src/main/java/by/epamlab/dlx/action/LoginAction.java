package by.epamlab.dlx.action;

import by.epamlab.dlx.form.LoginForm;
import by.epamlab.dlx.model.beans.User;
import by.epamlab.dlx.model.factories.DAOFactory;
import by.epamlab.dlx.model.impl.SQLUserImpl;
import by.epamlab.dlx.model.interfaces.IUserDAO;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Sergei Astapenko on 07.06.2016.
 */
public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        String login = loginForm.getLogin();
        String password = loginForm.getPassword();
        IUserDAO userDAO = DAOFactory.getDAO(SQLUserImpl.class);

        if (!userDAO.isRegisteredUser(login, password)) {
            ActionMessages errors = new ActionErrors();
            errors.add("login", new ActionMessage("auth.jsp.err.data.invalid"));
            saveErrors(request, errors);
            request.setAttribute("error", true);
            return mapping.getInputForward();
        } else {
            User user = new User(login);
            request.getSession().setAttribute("user", user);
            return mapping.findForward("success");
        }
    }
}
