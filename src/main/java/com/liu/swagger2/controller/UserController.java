package com.liu.swagger2.controller;
import java.nio.MappedByteBuffer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liu.mapper.UserMapper;
import com.liu.pojo.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/swagger")
@Api(value="user" ,description="针对用户的插入，删除，查看等操作")
public class UserController {
	@Autowired
	private UserMapper userMapper;
	/*
	  @Api：修饰整个类，描述Controller的作用
		@ApiOperation：描述一个类的一个方法，或者说一个接口
		@ApiParam：单个参数描述
		@ApiModel：用对象来接收参数
		@ApiProperty：用对象接收参数时，描述对象的一个字段
		@ApiResponse：HTTP响应其中1个描述
		@ApiResponses：HTTP响应整体描述
		@ApiIgnore：使用该注解忽略这个API
		@ApiError ：发生错误返回的信息
		@ApiImplicitParam：一个请求参数
		@ApiImplicitParams：多个请求参数
	  */
	//用在方法上，说明方法的作用
	@ApiOperation(value="创建用户",notes="根据User对象创建用户")
	@ApiImplicitParams({
		  @ApiImplicitParam(dataType="java.lang.Integer",name="id",value="id",required=true, paramType="path"),
		  @ApiImplicitParam(dataType="User",name="user",value="用户信息",required=true)  
	})
	@RequestMapping(value="/user/{id}",method=RequestMethod.POST)
	public User insert(@PathVariable Integer id,@RequestBody User user){
		userMapper.insert(user);
		return user;
		
	}
	
	@ApiOperation(value="获取指定id用户详细信息",notes="根据User的id来获取用户详细信息")
	@ApiImplicitParam(dataType="java.lang.Integer",name="id",value="用户id",required=true, paramType="path")
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User getUser(@PathVariable Integer id){
		return userMapper.selectByPrimaryKey(id);
	}
	
	@ApiOperation(value="删除指定id用户",notes="根据User的id删除用户信息")
			@ApiImplicitParam(dataType="java.lang.Long",name="id",value="用户id",required=true, paramType="path")
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable Integer id){
		userMapper.deleteByPrimaryKey(id);
		return "ok";
	}

	
}
