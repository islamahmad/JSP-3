package com.islamahmad;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime extends SimpleTagSupport {
    private String color, size;
    private StringWriter sw = new StringWriter();

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void doTag() throws IOException {
        JspWriter out = getJspContext().getOut();

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
        out.print("Current Date: " + ft.format(dNow));
    }
}

