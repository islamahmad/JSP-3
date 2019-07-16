package com.islamahmad.custom;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class SeriouCustomTag extends SimpleTagSupport {
    private StringWriter sw = new StringWriter();

    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(sw); // capture body content into StringWriter
        getJspContext().getOut().println(sw.toString());
    }
}