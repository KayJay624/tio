package com.example.tags;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;


public class MojTagHandler extends SimpleTagSupport {

    private String header;
    private String alignment;
    private String color;

    @Override
    public void doTag() throws JspException {

        JspWriter out = getJspContext().getOut();

        try {
            out.println("<h2>" + header + "</h2>");
            out.println("<p");
            if(alignment != null){
            	out.println("align=" + alignment + "> ");
            } 
            
            if(color != null){
            	out.println("<font color=" + color +">");
            } 
            
            JspFragment f=getJspBody();
             if (f != null) f.invoke(out);

             if(color != null){
             	out.println("</font>");
             } 
            out.println("</p>");

        } catch (java.io.IOException ex) {
            throw new JspException(ex.getMessage());
        }

    }

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

   
    
}
