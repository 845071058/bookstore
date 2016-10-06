package com.hzit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.entity.Orderlist;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface OrderlistMapper {

	void insertOrderlist(Orderlist orderlist);

	void deleteOrderlistByOrderid(Integer orderid);

	void updateOrderlist(Orderlist orderlist);

	Page<Orderlist> searchOrderlistByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Orderlist> searchOrderlistByParams(@Param("map") Map<String, String> map);

} 
