package net.msj.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vincent.M
 * @mail mengshaojie@188.com
 * @date 17/5/26
 * @copyright ©2017 孟少杰 All Rights Reserved
 * @desc
 */
@Slf4j
@Controller
@RequestMapping("/killphp")
public class KillPhpController {

    @RequestMapping(value = "home", method = RequestMethod.POST)
    @ResponseBody
    public String test(@RequestParam("param") String param) {
        String result = "";
        String temps[]={"Mon","Tues","Wed","Thur","Fri","Sat","Sun","任禹致"};
        String tempsTrans[]={"星期一","星期二","星期三","星期四","星期五","星期六","星期日","经过分析任禹致爱孟祥程"};
        for(int i=0;i<temps.length;i++){
            if(temps[i].toLowerCase().contains(param.toLowerCase())){
               result = tempsTrans[i];
                break;
            }
        }

        return result;
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }


}
