package com.liu.redis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.liu.pojo.User;
import com.liu.utils.JsonUtils;
import com.liu.utils.LiuResult;
import com.liu.utils.RedisOperator;

import redis.clients.jedis.Jedis;

/**
 *@Project Name:springboot 
 * @author 刘佳瑞
 * @Package Name:com.liu.redis
 * @date 2018年3月20日下午7:44:22
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
	@Autowired
	private RedisOperator redisOperator;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@RequestMapping("/test")
	public LiuResult test(){
		User user=new User();
		user.setuLoginName("liu");
		String json = com.liu.utils.JsonUtils.objectToJson(user);
		stringRedisTemplate.opsForValue().set("liu:user", json);
		stringRedisTemplate.opsForValue().set("liu:cache", "hello world");
		String helloworld=stringRedisTemplate.opsForValue().get("liu cache");
		String userString = stringRedisTemplate.opsForValue().get("liu:user");
		User userData = com.liu.utils.JsonUtils.jsonToPojo(userString, User.class);
		return LiuResult.ok(userData);
	}
	
	@RequestMapping("/test1")
	public LiuResult test1(){
		User user=new User();
		user.setuLoginName("liu");
		User user1=new User();
		user1.setuLoginName("liu");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user);
		
		redisOperator.set("json:info", JsonUtils.objectToJson(userList), 1800);
		String jsonString = redisOperator.get("json:info");
		List<User> userList1=JsonUtils.jsonToList(jsonString, User.class);
		return LiuResult.ok(userList1);
	}
	
	
}
