package com.github.kkimishima.learn_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RepoDemo {
  @Autowired
  MyDateRepository repository;

  @RequestMapping(value = "/repo", method = RequestMethod.GET)
  public ModelAndView Repo(
      @ModelAttribute("formModel") Mydata mydate,
      ModelAndView mav
  ) {
    mav.setViewName("repo");
    Iterable<Mydata> list = repository.findAll();
    mav.addObject("dataList", list);
    return mav;
  }

  @RequestMapping(value = "/repo", method = RequestMethod.POST)
  @Transactional(readOnly = false)
  public ModelAndView RepoForm(
      @ModelAttribute("formModel") Mydata mydata,
      ModelAndView mav
  ) {
    repository.save(mydata);
    return new ModelAndView("redirect:/repo");
  }
}
