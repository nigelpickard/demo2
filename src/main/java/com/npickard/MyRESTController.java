package com.npickard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by npickard on 2/20/2017.
 */
@RestController
public class MyRESTController {

    @RequestMapping("/")
    public String index() {
        return "This is a message from MyHelloController!";
    }

    @RequestMapping("/test")
    public String test() {
        return "This is a TEST message from MyHelloController!";
    }


}
