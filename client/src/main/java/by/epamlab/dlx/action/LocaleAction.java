package by.epamlab.dlx.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by Sergei Astapenko on 11.06.2016.
 */
public class LocaleAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String language = request.getParameter("lang");
        if (language != null) {
            setLocale(request, new Locale(language));
        }
        return new ActionForward(mapping.findForward("success"));
    }
}
