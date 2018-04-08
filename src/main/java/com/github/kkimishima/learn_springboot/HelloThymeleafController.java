package com.github.kkimishima.learn_springboot;

import javafx.scene.effect.Bloom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class HelloThymeleafController {
  @RequestMapping("/mv/{varStr}")
  public ModelAndView mvindex(@PathVariable String varStr, ModelAndView modelAndView) {
    modelAndView.addObject("msg", varStr);
    modelAndView.setViewName("index");
    return modelAndView;

  }

//  @RequestMapping("/")
//  public String index() {
//    return "index";
//  }

//  @RequestMapping("/{varStr}")
//  public String index(@PathVariable String varStr, Model model) {
//    model.addAttribute("msg", varStr);
//    return "index";
//  }

  @RequestMapping("/other")
  public String Other(){
    return "redirect:/demopost";
  }

  @RequestMapping(value = "/demopost", method = RequestMethod.GET)
  public String postindex() {
    return "demopost";
  }

  @RequestMapping(value = "/demopost", method = RequestMethod.POST)
  public ModelAndView send(
      @RequestParam("text") String text,
      @RequestParam(value = "ch",required = false) String ch,
      @RequestParam(value = "ra",required = false) String ra,
      @RequestParam(value = "se",required = false) String se,
      ModelAndView mav
  ) {
    StringBuilder sb = new StringBuilder();
    try {
      sb.append("結果 \n");
      sb.append("テキスト :" + text + "\n");
      sb.append("チェックボック :" + ch + "\n");
      sb.append("ラジオボックス : " + ra + "\n");
      sb.append("選択 : " + se + "\n");
    }catch (NullPointerException e){
      e.printStackTrace();
    }
    mav.addObject("msg",
        sb.toString());
    mav.setViewName("demopost");
    return mav;
  }

  @RequestMapping("/th")
  public String Th(){
    return "th";
  }

}
