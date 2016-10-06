package com.hzit.entity;

/**
 * 
 * @author renhao
 */
public class Book {
	/**
	 *  图书编号
	 */
	private Integer bookid;
	/**
	 *  图书名
	 */
	private String bookname;
	/**
	 *  图书价格
	 */
	private Integer bookprice;
	/**
	 *  图书库存
	 */
	private Integer bookcount;
	/**
	 *  图书图片地址
	 */
	private String picture;
	/**
	 * 图书编号
	 * @param bookid
	 */
	public void setBookid(Integer bookid){
		this.bookid = bookid;
	}
	
    /**
     * 图书编号
     * @return
     */	
    public Integer getBookid(){
    	return bookid;
    }
	/**
	 * 图书名
	 * @param bookname
	 */
	public void setBookname(String bookname){
		this.bookname = bookname;
	}
	
    /**
     * 图书名
     * @return
     */	
    public String getBookname(){
    	return bookname;
    }
	/**
	 * 图书价格
	 * @param bookprice
	 */
	public void setBookprice(Integer bookprice){
		this.bookprice = bookprice;
	}
	
    /**
     * 图书价格
     * @return
     */	
    public Integer getBookprice(){
    	return bookprice;
    }
	/**
	 * 图书库存
	 * @param bookcount
	 */
	public void setBookcount(Integer bookcount){
		this.bookcount = bookcount;
	}
	
    /**
     * 图书库存
     * @return
     */	
    public Integer getBookcount(){
    	return bookcount;
    }
	/**
	 * 图书图片地址
	 * @param picture
	 */
	public void setPicture(String picture){
		this.picture = picture;
	}
	
    /**
     * 图书图片地址
     * @return
     */	
    public String getPicture(){
    	return picture;
    }
}