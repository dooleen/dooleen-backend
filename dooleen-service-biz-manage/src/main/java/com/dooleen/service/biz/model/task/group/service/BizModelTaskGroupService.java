package com.dooleen.service.biz.model.task.group.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dooleen.service.biz.model.task.group.entity.BizModelTaskGroupEntity;
import com.dooleen.common.core.common.entity.CommonMsg;
import com.dooleen.common.core.common.entity.NullEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Copy Right Information : 成都独领创新科技有限公司
 * @Project : Dooleen平台
 * @Project No : Dooleen
 * @Version : 1.0.0
 * @CreateDate : 2022-01-04 23:10:49
 * @Description : 模型任务组管理服务接口
 * @Author : apple
 * @Author : apple
 * @Update: 2020年5月9日 下午9:57:59
 */
public interface BizModelTaskGroupService extends IService<BizModelTaskGroupEntity> {

	/**
	 * 
	 * 根据主键查询记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<BizModelTaskGroupEntity, NullEntity> queryBizModelTaskGroup(CommonMsg<BizModelTaskGroupEntity, NullEntity> commonMsg);

	/**
	 * 
	 * 获取所有记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<NullEntity,BizModelTaskGroupEntity> queryBizModelTaskGroupList(CommonMsg<NullEntity,BizModelTaskGroupEntity> commonMsg);

	/**
	 * 
	 * 根据条件分页查询
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<BizModelTaskGroupEntity,BizModelTaskGroupEntity> queryBizModelTaskGroupListPage(CommonMsg<BizModelTaskGroupEntity,BizModelTaskGroupEntity> commonMsg);

	/**
	 * 
	 * 根据条件查询Map集合
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<BizModelTaskGroupEntity,BizModelTaskGroupEntity> queryBizModelTaskGroupListMap(CommonMsg<BizModelTaskGroupEntity,BizModelTaskGroupEntity> commonMsg);

	/**
	 * 
	 * 新增记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<BizModelTaskGroupEntity, NullEntity> saveBizModelTaskGroup(CommonMsg<BizModelTaskGroupEntity, NullEntity> commonMsg);

	/**
	 * 
	 * 新增多条记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<NullEntity,BizModelTaskGroupEntity> saveBizModelTaskGroupList(CommonMsg<NullEntity,BizModelTaskGroupEntity> commonMsg);
	
	/**
	 * 
	 * 根据主键修改记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<BizModelTaskGroupEntity, NullEntity> updateBizModelTaskGroup(CommonMsg<BizModelTaskGroupEntity, NullEntity> commonMsg);

	/**
	 * 
	 * 如果存在修改录，不存在就新增记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<BizModelTaskGroupEntity, NullEntity> saveOrUpdateBizModelTaskGroup(CommonMsg<BizModelTaskGroupEntity, NullEntity> commonMsg);
	/**
	 * 
	 * 批量添加或更新记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<NullEntity, BizModelTaskGroupEntity>  saveOrUpdateBizModelTaskGroupList(CommonMsg<NullEntity, BizModelTaskGroupEntity> commonMsg);

	/**
	 * 
	 * 根据主键删除记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<BizModelTaskGroupEntity, NullEntity> deleteBizModelTaskGroup(CommonMsg<BizModelTaskGroupEntity, NullEntity> commonMsg);
	
	/**
	 * 
	 * 删除多条记录
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月9日 下午9:58:04
	 * @Param : commonMsg 
	 * @Return : CommonMsg
	 */
	CommonMsg<NullEntity, BizModelTaskGroupEntity> deleteBizModelTaskGroupList(CommonMsg<NullEntity, BizModelTaskGroupEntity> commonMsg);

	/**
	 * 导出数据
	 * 
	 * @Author : apple
	 * @CreateTime : 2020年5月20日 上午8:46:28
	 * @Param : commonMsg 
	 * @Return : 
	 */
	void exportBizModelTaskGroupExcel(CommonMsg<BizModelTaskGroupEntity,BizModelTaskGroupEntity> commonMsg,HttpServletResponse response);

	/**
	 * 批量导入数据
	 * @param file
	 * @return
	 */
	CommonMsg<BizModelTaskGroupEntity, NullEntity> uploadExcel(MultipartFile file, HttpServletRequest request) throws IOException;
}
