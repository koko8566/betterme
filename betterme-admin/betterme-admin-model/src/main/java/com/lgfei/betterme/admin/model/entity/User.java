package com.lgfei.betterme.admin.model.entity;

import com.lgfei.betterme.framework.model.entity.BaseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author lgfei
 * @since 2019-04-07
 */
@ApiModel(value = "User对象", description = "用户信息表")
public class User extends BaseEntity<Long>

{
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "用户编码")
    private String userNo;
    
    @ApiModelProperty(value = "账号")
    private String account;
    
    @ApiModelProperty(value = "姓名")
    private String name;
    
    @ApiModelProperty(value = "密码")
    private String password;
    
    @ApiModelProperty(value = "性别", example = "1")
    private Integer gender;
    
    @ApiModelProperty(value = "电话")
    private String tell;
    
    @ApiModelProperty(value = "电子邮件")
    private String email;
    
    public String getUserNo()
    {
        return userNo;
    }
    
    public void setUserNo(String userNo)
    {
        this.userNo = userNo;
    }
    
    public String getAccount()
    {
        return account;
    }
    
    public void setAccount(String account)
    {
        this.account = account;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public Integer getGender()
    {
        return gender;
    }
    
    public void setGender(Integer gender)
    {
        this.gender = gender;
    }
    
    public String getTell()
    {
        return tell;
    }
    
    public void setTell(String tell)
    {
        this.tell = tell;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    @Override
    public String toString()
    {
        return "User{" + "userNo=" + userNo + ", account=" + account + ", name=" + name + ", password=" + password
            + ", gender=" + gender + ", tell=" + tell + ", email=" + email + "}";
    }
}
