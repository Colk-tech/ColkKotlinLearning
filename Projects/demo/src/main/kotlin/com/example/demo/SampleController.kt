package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/")
    fun getHello() :String {
        return "Hello World"
    }
}

@RestController
class IndexController {
    @GetMapping("/index")
    fun testString() :String {
        return "This is first test of spring boot"
    }
}