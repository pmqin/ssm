package com.demo.controller;  
  
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpSession;  
  






import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
  


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.User;  
import com.demo.service.UserService;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
  
    @Resource  
    private UserService userService;  
    
    @RequestMapping(value = { "/pmqin", "qin" }) // 以上“/pmqin”和“/qin”映射到同一个函数处理。
    public ModelAndView printWelcome() {

      
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Spring3 MVC 例子");
        model.addObject("date", new SimpleDateFormat("yyyy年MM月dd日").format(new java.util.Date()));

        model.setViewName("hello");
        return model;
    }
    @RequestMapping("/login")  
    public String login(User user,HttpServletRequest request){  
        User resultUser=userService.login(user);  
        if(resultUser==null){  
            request.setAttribute("user", user);  
            request.setAttribute("errorMsg", "用户名或密码错误！");  
            return "index";  
        }else{  
            HttpSession session=request.getSession();  
            session.setAttribute("currentUser", resultUser);  
            return "redirect:/user/users";  
        }  
    }  
      
    @RequestMapping("/users")  
    public String query(Map<String, Object>map){  
    	List<User> resultUser=(List<User>) userService.query(); 
        map.put("users", resultUser);
        return "users";  
    }  
    @RequestMapping("/insert")
    public String insert(User user){
    	System.out.print("data"+user.getUserName()+user.getPassword());
    	
    	Boolean resultBoolean = userService.insertUser(user);
    	return "redirect:/user/users";
    }
    @RequestMapping("/delete")
    public String deleteUser(User user){
    	System.out.print("账号:"+user.getUserName()+"密码:"+user.getPassword());
  
    	Boolean resultBoolean = userService.deleteUser(user);
    	return "redirect:/user/users";
    }
    
    @RequestMapping(value="/update",method = RequestMethod.GET)//跟ajax的提交方式要一致
    @ResponseBody//此处不能省略 还要有jackjson依赖库 否则ajax无法解析返回值
    public  Map<String, String> updateUser(User user){
    	System.out.print("id:"+user.getId() +"账号:"+user.getUserName()+"密码:"+user.getPassword());
  
    	Boolean resultBoolean = userService.updateUser(user);
    	Map<String, String> map = new HashMap<String, String>();
    	String result = resultBoolean == true ? "success":"fail";
        map.put("result", result);  
        map.put("message", "操作成功"); 
        return map;  
    }
    
}  