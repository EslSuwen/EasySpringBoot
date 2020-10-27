package com.cqjtu.esp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.cqjtu.esp.constant.Authority;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 用户表
 *
 * @author suwen
 * @since 2020-10-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户编号")
  @TableId(value = "uid", type = IdType.AUTO)
  private Integer uid;

  @ApiModelProperty(value = "用户名")
  private String uname;

  @ApiModelProperty(value = "用户密码")
  private String password;

  @ApiModelProperty(value = "用户权限(0:用户;1:管理员;2:超级管理员)")
  private Integer authority;

  @ApiModelProperty(value = "用户权限列表")
  @TableField(exist = false)
  private List<Authority> authorities;
}
