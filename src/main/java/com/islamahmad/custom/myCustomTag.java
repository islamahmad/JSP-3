package com.islamahmad.custom;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class myCustomTag extends SimpleTagSupport {
    @Override
    public void doTag() throws IOException {
        JspWriter out = getJspContext().getOut();
        out.println("My Very First Custom Tag");
//        out.println("<h2>Hello There, I'm custom Tag</h2>");
    }
}
