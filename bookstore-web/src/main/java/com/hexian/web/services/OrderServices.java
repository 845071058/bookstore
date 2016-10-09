package com.hexian.web.services;

import com.fc.platform.commons.page.Page;
import com.hzit.entity.Orderlist;
import com.hzit.vo.OrderlistVo;

import java.util.List;


/**
 * Created by Administrator on 2016/10/8.
 */
public interface OrderServices {
    public int insertorder(OrderlistVo orderlistVo);

    public List<OrderlistVo> findall(Integer userid);

    public Page<OrderlistVo> findallAndPage(Integer userid,int page,int rowcount);

}
