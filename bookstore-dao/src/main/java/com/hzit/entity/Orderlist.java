package com.hzit.entity;

/**
 * 
 * @author renhao
 */
public class Orderlist {
	/**
	 *  订单编号
	 */
	private Integer orderid;
	/**
	 *  接收人
	 */
	private Integer userid;
	/**
	 *  订单金额
	 */
	private Integer orderprice;
	/**
	 *  下单时间
	 */
	private java.util.Date creattime;
	/**
	 *  订单状态
	 */
	private String state;
	/**
	 * 订单编号
	 * @param orderid
	 */
	public void setOrderid(Integer orderid){
		this.orderid = orderid;
	}
	
    /**
     * 订单编号
     * @return
     */	
    public Integer getOrderid(){
    	return orderid;
    }
	/**
	 * 接收人
	 * @param userid
	 */
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	
    /**
     * 接收人
     * @return
     */	
    public Integer getUserid(){
    	return userid;
    }
	/**
	 * 订单金额
	 * @param orderprice
	 */
	public void setOrderprice(Integer orderprice){
		this.orderprice = orderprice;
	}
	
    /**
     * 订单金额
     * @return
     */	
    public Integer getOrderprice(){
    	return orderprice;
    }
	/**
	 * 下单时间
	 * @param creattime
	 */
	public void setCreattime(java.util.Date creattime){
		this.creattime = creattime;
	}
	
    /**
     * 下单时间
     * @return
     */	
    public java.util.Date getCreattime(){
    	return creattime;
    }
	/**
	 * 订单状态
	 * @param state
	 */
	public void setState(String state){
		this.state = state;
	}
	
    /**
     * 订单状态
     * @return
     */	
    public String getState(){
    	return state;
    }
}