package io.github.princeaim.template

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController {
    @GetMapping("/")
    fun index(): String = "Hello World TEST"
}