package com.dooleen.service.system.custom.org.info.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dooleen.service.system.custom.org.info.entity.SysCustomOrgInfoEntity;

/**
 * @Copy Right Information : 成都独领创新科技有限公司
 * @Project : Dooleen平台
 * @Project No : Dooleen
 * @Version : 1.0.0
 * @CreateDate : 2021-02-27 17:35:07
 * @Description : 客户机构登记管理DAO
 * @Author : apple
 * @Update: 2021-02-27 17:35:07
 */
@Service
public interface SysCustomOrgInfoMapper extends BaseMapper<SysCustomOrgInfoEntity> {

    /**
     * 自定义查询模板
     * @Author liqh
     * @CreateTime 2020/6/9 14:28
     * @Param  page  分页参数
     */
    @Select("SELECT * FROM sys_tables WHERE test=#/{test}")
    List<SysCustomOrgInfoEntity> querySysCustomOrgInfoByCondition(@Param("sysCustomOrgInfoEntity") SysCustomOrgInfoEntity sysCustomOrgInfoEntity);
}
