package com.hzit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.entity.Xiangqing;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface XiangqingMapper {

	void insertXiangqing(Xiangqing xiangqing);

	void deleteXiangqingByXiangqingid(Integer xiangqingid);

	void updateXiangqing(Xiangqing xiangqing);

	Page<Xiangqing> searchXiangqingByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Xiangqing> searchXiangqingByParams(@Param("map") Map<String, String> map);

} 
