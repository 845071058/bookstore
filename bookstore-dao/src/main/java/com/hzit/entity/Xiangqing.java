package com.hzit.entity;

/**
 * 
 * @author renhao
 */
public class Xiangqing {
	/**
	 *  主键
	 */
	private Integer xiangqingid;
	/**
	 *  订单ID
	 */
	private String orderid;
	/**
	 *  图书id
	 */
	private Integer bookid;
	/**
	 *  数量
	 */
	private Integer count;
	/**
	 *  价格
	 */
	private Integer price;
	/**
	 * 主键
	 * @param xiangqingid
	 */
	public void setXiangqingid(Integer xiangqingid){
		this.xiangqingid = xiangqingid;
	}
	
    /**
     * 主键
     * @return
     */	
    public Integer getXiangqingid(){
    	return xiangqingid;
    }
	/**
	 * 订单ID
	 * @param orderid
	 */
	public void setOrderid(String orderid){
		this.orderid = orderid;
	}
	
    /**
     * 订单ID
     * @return
     */	
    public String getOrderid(){
    	return orderid;
    }
	/**
	 * 图书id
	 * @param bookid
	 */
	public void setBookid(Integer bookid){
		this.bookid = bookid;
	}
	
    /**
     * 图书id
     * @return
     */	
    public Integer getBookid(){
    	return bookid;
    }
	/**
	 * 数量
	 * @param count
	 */
	public void setCount(Integer count){
		this.count = count;
	}
	
    /**
     * 数量
     * @return
     */	
    public Integer getCount(){
    	return count;
    }
	/**
	 * 价格
	 * @param price
	 */
	public void setPrice(Integer price){
		this.price = price;
	}
	
    /**
     * 价格
     * @return
     */	
    public Integer getPrice(){
    	return price;
    }
}