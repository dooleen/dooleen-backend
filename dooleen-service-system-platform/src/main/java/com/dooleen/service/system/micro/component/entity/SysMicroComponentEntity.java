package com.dooleen.service.system.micro.component.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.*;
import com.dooleen.common.core.common.entity.BaseEntity;
import com.dooleen.common.core.aop.annos.DataName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @Copy Right Information : 成都独领创新科技有限公司
 * @Project : Dooleen平台
 * @Project No : Dooleen
 * @Version : 1.0.0
 * @CreateDate : 2021-12-03 21:38:41
 * @Description : 组件管理实体
 * @Author : name
 * @Update : 2021-12-03 21:38:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("sys_micro_component")
@ApiModel(value = "组件管理实体")
@ToString(callSuper = true)
public class SysMicroComponentEntity  extends BaseEntity implements Serializable  {
	//@Excel(name = "状态", replace = {"初始化_0", "正常_1", "注销_2"}, addressList = true)下拉框支持
	private static final long serialVersionUID = 1L;

    /**
    * id
    */
    @DataName(name = "主键", isKeyId = true, isRecordHistory = true)
    @ApiModelProperty(value = "id", required=true, position = 0)
	@TableId(type = IdType.INPUT)
	@NotBlank(message = "ID不能为空")
	@TableField(updateStrategy = FieldStrategy.NEVER)
	public String id; 
	
	/**
	* 租户ID
	*/
	@DataName(name = "租户ID")
	@ApiModelProperty(value = "租户ID", required=true, position = 1)
	@NotBlank(message = "租户ID不能为空")
	@TableField(updateStrategy = FieldStrategy.NEVER)
	public String tenantId;
   
	
	/**
	* 所属应用ID
	*/
	@Excel(name ="所属应用ID")
	@DataName(name = "所属应用ID", isRecordHistory = true)
	@ApiModelProperty(value = "所属应用ID", required=true, position = 2)
	@Length(max=20,message="所属应用ID长度不能大于20")
	@NotBlank(message = "所属应用ID不能为空")
	private String belongAppId;	  
   
	
	/**
	* 微服务编码
	*/
	@Excel(name ="微服务编码")
	@DataName(name = "微服务编码", isRecordHistory = true)
	@ApiModelProperty(value = "微服务编码", required=true, position = 3)
	@Length(max=50,message="微服务编码长度不能大于50")
	@NotBlank(message = "微服务编码不能为空")
	private String microServiceCode;	  
   
	
	/**
	* 组件编码
	*/
	@Excel(name ="组件编码")
	@DataName(name = "组件编码", isRecordHistory = true)
	@ApiModelProperty(value = "组件编码", required=true, position = 4)
	@Length(max=50,message="组件编码长度不能大于50")
	@NotBlank(message = "组件编码不能为空")
	private String componentCode;	  
   
	
	/**
	* 微服务名称
	*/
	@Excel(name ="微服务名称")
	@DataName(name = "微服务名称", isRecordHistory = true)
	@ApiModelProperty(value = "微服务名称", required=true, position = 5)
	@Length(max=50,message="微服务名称长度不能大于50")
	@NotBlank(message = "微服务名称不能为空")
	private String microServiceName;	  
   
	
	/**
	* 组件名称
	*/
	@Excel(name ="组件名称")
	@DataName(name = "组件名称", isRecordHistory = true)
	@ApiModelProperty(value = "组件名称", required=true, position = 6)
	@Length(max=50,message="组件名称长度不能大于50")
	@NotBlank(message = "组件名称不能为空")
	private String componentName;	  
   
	
	/**
	* 组件描述
	*/
	@Excel(name ="组件描述")
	@DataName(name = "组件描述", isRecordHistory = true)
	@ApiModelProperty(value = "组件描述", required=false,  position = 7)
	@Length(max=2000,message="组件描述长度不能大于2000")
	private String componentDesc;	  
   
	
	/**
	* 访问路径
	*/
	@Excel(name ="访问路径")
	@DataName(name = "访问路径", isRecordHistory = true)
	@ApiModelProperty(value = "访问路径", required=false,  position = 8)
	@Length(max=500,message="访问路径长度不能大于500")
	private String accessPath;	  
   
	
	/**
	* 接口包名
	*/
	@Excel(name ="接口包名")
	@DataName(name = "接口包名", isRecordHistory = true)
	@ApiModelProperty(value = "接口包名", required=true, position = 9)
	@Length(max=200,message="接口包名长度不能大于200")
	@NotBlank(message = "接口包名不能为空")
	private String interfacePackageName;	  
   
	
	/**
	* 访问方法名称
	*/
	@Excel(name ="访问方法名称")
	@DataName(name = "访问方法名称", isRecordHistory = true)
	@ApiModelProperty(value = "访问方法名称", required=true, position = 10)
	@Length(max=50,message="访问方法名称长度不能大于50")
	@NotBlank(message = "访问方法名称不能为空")
	private String accessMethodName;	  
   
	
	/**
	* 访问方式
	*/
	@Excel(name ="访问方式")
	@DataName(name = "访问方式", isRecordHistory = true)
	@ApiModelProperty(value = "访问方式", required=false,  position = 11)
	@Length(max=30,message="访问方式长度不能大于30")
	private String accessWay;	  
   
	
	/**
	* 输入报文体
	*/
	@Excel(name ="输入报文体")
	@DataName(name = "输入报文体", isRecordHistory = true)
	@ApiModelProperty(value = "输入报文体", required=false,  position = 12)
	@Length(max=5000,message="输入报文体长度不能大于5000")
	private String inputMsgBody;	  
   
	
	/**
	* 输出报文体
	*/
	@Excel(name ="输出报文体")
	@DataName(name = "输出报文体", isRecordHistory = true)
	@ApiModelProperty(value = "输出报文体", required=false,  position = 13)
	@Length(max=5000,message="输出报文体长度不能大于5000")
	private String outputMsgBody;	  
   
	
	/**
	* 显示序号
	*/
	@Excel(name ="显示序号")
	@DataName(name = "显示序号", isRecordHistory = true)
	@ApiModelProperty(value = "显示序号", required=true, position = 14)
    @DecimalMax(value="9999999999",message="显示序号不能大于9999999999")
	@DecimalMin(value="0",message="显示序号不能小于0")
	@NotBlank(message = "显示序号不能为空")
	private int showSeq;	  
 }
