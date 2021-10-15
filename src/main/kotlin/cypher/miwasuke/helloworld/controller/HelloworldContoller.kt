package cypher.miwasuke.helloworld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloworldController {

    @GetMapping("/")
    fun hello(): String = "hello world"
}
