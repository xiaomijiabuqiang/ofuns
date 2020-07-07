package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.User;
import com.example.onlineshop.service.UserService;
import com.example.onlineshop.utils.JWTUtil;

import com.example.onlineshop.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RestController:返回的数据都是json格式
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public ResponseData login(@RequestBody User user, HttpServletRequest request){//请求中传递json格式的对象，转为java中的对象
        User loginUser = userService.login(user);
        ResponseData responseData = ResponseData.ok();
        if(loginUser!=null) {
            //生成token
            String token = JWTUtil.generToken("1", "Jersey-Security-Basic", loginUser.getId().toString());
            //向浏览器返回token，客户端受到此token后存入cookie中，或者h5的本地存储中
            responseData.putDataValue("token", token);
            //以及用户
            responseData.putDataValue("user", loginUser);
            HttpSession session = request.getSession();
            session.setAttribute("loginUser",loginUser);
//			session.setAttribute("cart",cartService.getCartListByUserId(loginUser.getId()));
        }else {
            //用户或者密码错误
            responseData=ResponseData.customerError();
        }
        return responseData;
    }
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map<String,Object> getUserList(@RequestBody Map<String, Object> userMap,HttpServletRequest request) {
        HttpSession session = request.getSession();
        int count = userService.getCount(userMap);
        List<User> userList = userService.getUserList(userMap);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("list", userList);
        returnMap.put("count",count);
        session.setAttribute("returnMap",returnMap);
        return returnMap;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public User getUser(@RequestParam Integer id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public RespBean saveUser(@RequestBody User user){
        int result =0;
        if (user.getId()==null){
            result = userService.addUser(user);
        }else {
            result = userService.updateUser(user);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteCar(@RequestBody Integer id){
        int result =0;
        if (id==null){
            result = userService.deleteUser(id);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}

