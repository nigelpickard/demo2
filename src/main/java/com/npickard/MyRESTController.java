package com.npickard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by npickard on 2/20/2017.
 */
@RestController
public class MyRESTController {

    @Autowired
    MySample mySample;

    @RequestMapping("/")
    public String index() {
        return "This is a message from MyHelloController!";
    }

    @RequestMapping("/test")
    public String test() {

        mySample.doThis();

        return "This is a TEST message from MyHelloController!";
    }


}
