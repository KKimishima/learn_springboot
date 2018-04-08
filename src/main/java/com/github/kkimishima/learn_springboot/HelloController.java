package com.github.kkimishima.learn_springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @RequestMapping("/text/{num}")
  public String index(@PathVariable int num) {
    return "Hello" + String.valueOf(num) ;
  }
  @RequestMapping("/json/{varStr}")
  public DataObject index(@PathVariable String varStr){
    return  new DataObject(1,varStr,10);
  }

}
