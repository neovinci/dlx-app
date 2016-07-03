package by.epamlab.dlx.tags;


import javax.servlet.jsp.tagext.SimpleTagSupport;


/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class AbstractTag extends SimpleTagSupport{
    private String var;

    public void setVar(String var) {
        this.var = var;
    }

    public String getVar() {
        return var;
    }
}


