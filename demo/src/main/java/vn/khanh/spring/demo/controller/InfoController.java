package vn.khanh.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import vn.khanh.spring.demo.model.Info;
import vn.khanh.spring.demo.service.InfoService;

import java.util.List;

@Controller
public class InfoController {

    @Autowired
    public InfoService infoService;

    @GetMapping("/infos")
    public ModelAndView list(){
        List<Info> infos = this.infoService.findAll();
        ModelAndView modelAndView = new ModelAndView("info/list");
        modelAndView.addObject("infos", infos);
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("info/create");
        modelAndView.addObject("info", new Info());
        return modelAndView;
    }

    @PostMapping("/new")
    public ModelAndView createInfo(@ModelAttribute("info") Info info){
        int randomId = (int)(Math.random() * 10000);
        info.setId(randomId);//For demo purpose only

        this.infoService.save(info);

        ModelAndView modelAndView = new ModelAndView("info/create");
        modelAndView.addObject("info", new Info());
        modelAndView.addObject("message", "New product was created");
        return modelAndView;
    }

    @GetMapping(value = "/view")
    public ModelAndView view(@RequestParam("id") Integer infoId){
        Info info = this.infoService.findById(infoId);
        ModelAndView modelAndView = new ModelAndView("info/view");
        modelAndView.addObject("info", info);
        return modelAndView;
    }
}