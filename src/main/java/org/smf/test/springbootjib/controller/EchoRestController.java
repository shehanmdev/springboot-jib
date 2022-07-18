package org.smf.test.springbootjib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoRestController {

    @GetMapping("/{name}")
    public String echoMe(@PathVariable String name) {
        return "Hello " + name;
    }
}
