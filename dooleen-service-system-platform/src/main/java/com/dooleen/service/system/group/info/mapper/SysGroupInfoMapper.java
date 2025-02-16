package com.dooleen.service.system.group.info.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dooleen.service.system.group.info.entity.SysGroupInfoEntity;

/**
 * @Copy Right Information : 成都独领创新科技有限公司
 * @Project : Dooleen平台
 * @Project No : Dooleen
 * @Version : 1.0.0
 * @CreateDate : 2020-06-12 06:08:42
 * @Description : 系统用户组管理DAO
 * @Author : apple
 * @Update: 2020-06-12 06:08:42
 */
public interface SysGroupInfoMapper extends BaseMapper<SysGroupInfoEntity> {

    /**
     * 自定义查询模板
     * @Author liqh
     * @CreateTime 2020/6/9 14:28
     * @Param  page  分页参数
     */
    @Select("SELECT * FROM sys_tables WHERE test=#/{test}")
    List<SysGroupInfoEntity> querySysGroupInfoByCondition(@Param("sysGroupInfoEntity") SysGroupInfoEntity sysGroupInfoEntity);
}
