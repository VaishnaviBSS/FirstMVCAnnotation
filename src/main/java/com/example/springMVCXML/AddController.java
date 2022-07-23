package com.example.springMVCXML;


import com.example.service.AddService;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AddController{
    @RequestMapping("/add")
    public ModelAndView add(HttpServletResponse response , HttpServletRequest request){
        int i= Integer.parseInt(request.getParameter("t1"));
        int j= Integer.parseInt(request.getParameter("t2"));
        AddService serviceImpl= new AddService();
        int k=serviceImpl.add(i,j);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",k);
        return mv;
    }
}
