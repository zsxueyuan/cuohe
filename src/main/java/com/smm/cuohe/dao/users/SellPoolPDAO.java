package com.smm.cuohe.dao.users;

import java.util.List;
import java.util.Map;

import com.smm.cuohe.domain.CommodityAttr;
import com.smm.cuohe.domain.ItemAttr;
import com.smm.cuohe.domain.SellPoolPOJO;

public interface SellPoolPDAO {
	/**
	 * 最新卖盘
	 */
	public  List<SellPoolPOJO> getSellPoolList(String itemsID);
	/**
	 * 查询某个属性的名称，值
	 */
	public CommodityAttr getAttrVal(Map<String, Object> map);
}
