package com.winson.winsoneurekaclient001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author winson
 * @date 2022/6/15
 **/
@RestController
public class WinsonEurekaClientController001 {

    @GetMapping("/hello")
    public void sayHello(){
        System.out.println("v1 hello invoke ... ");
    }

}
