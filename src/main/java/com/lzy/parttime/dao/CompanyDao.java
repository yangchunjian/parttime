package com.lzy.parttime.dao;

import java.util.List;
import java.util.Map;

import com.lzy.parttime.entity.Company;
import com.lzy.parttime.entity.SeekUser;

/**
 * 
 * @author 李兆阳
 * @description : [公司数据接口]
 *
 * @时间: 2017年10月19日 上午11:06:32
 */
public interface CompanyDao {

	/**
	 * 
	 * @param params 
	 * @TODO: [获取公司集合]
	 * @return: List<Company>
	 * @createTime:2017年10月19日上午11:26:41
	 */
	List<Company> getCompanyList(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [公司列表数]
	 * @param params
	 * @return: int
	 * @createTime:2017年10月23日下午3:39:43
	 */
	int getCompanyListCount(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [添加公司]
	 * @param params: 
	 * @createTime:2017年10月24日下午7:04:09
	 */
	void insertCompany(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [删除公司]
	 * @param params: 
	 * @createTime:2017年10月24日下午8:06:55
	 */
	void delCompanyById(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [通过id查询公司]
	 * @param params: 
	 * @return 
	 * @createTime:2017年10月24日下午8:34:33
	 */
	Company getCompanyById(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [编辑公司]
	 * @param params: 
	 * @createTime:2017年10月25日下午7:05:59
	 */
	void updateCompanyById(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [招聘者集合]
	 * @param params
	 * @return: 
	 * @createTime:2017年11月10日上午10:27:57
	 */
	List<SeekUser> getSeekUserList(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [招聘者集合数量]
	 * @param params
	 * @return: 
	 * @createTime:2017年11月10日上午10:28:13
	 */
	int getSeekUserListCount(Map<String, Object> params);

	/**
	 * 
	 * @TODO: [删除招聘者]
	 * @param params: 
	 * @createTime:2017年11月10日上午10:28:26
	 */
	void delSeekUserById(Map<String, Object> params);

}
