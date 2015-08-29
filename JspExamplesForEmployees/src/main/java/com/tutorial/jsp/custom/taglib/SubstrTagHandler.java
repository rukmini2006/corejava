package com.tutorial.jsp.custom.taglib;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SubstrTagHandler extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String input;
	private int start;
	private int end;
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter  out =pageContext.getOut();
		try {
			out.println(input.substring(start, end));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	

}
