package com.constanta;

public enum Pages {
	INDEX(0, "index", "index", "index"),
	PAGE_1(1, "Page 1", "page-1", "page-1"),
	PAGE_2(2, "Page 2", "page-2", "page-2");
    
	int number;
	String jsp;
	String path;
	String string;
	
    private Pages(int number,String string, String jsp, String path){
    	this.string = string;
	    this.number = number;
        this.jsp = jsp;
        this.path = path;		
	}
    
    public Integer getNumber() {
        return this.number;
    }

    public String getJsp() {
        return this.jsp;
    }

    public String getPath() {
        return this.path;
    }
}