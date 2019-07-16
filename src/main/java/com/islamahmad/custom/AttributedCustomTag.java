package com.islamahmad.custom;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class AttributedCustomTag extends SimpleTagSupport {
    private String message;

    public void setMessage(String msg) {
        this.message = msg;
    }

    public void doTag()
            throws IOException {
        if (message != null) {
            JspWriter out = getJspContext().getOut();
            out.println(message);
        }
    }
}
