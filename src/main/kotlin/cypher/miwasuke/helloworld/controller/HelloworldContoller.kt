package cypher.miwasuke.helloworld.controller

import cypher.miwasuke.helloworld.entity.Reply
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloworldController {

    @GetMapping("/")
    fun hello(): String = "hello world"

    @GetMapping("/hello")
    fun helloName(@RequestParam name: String) = Reply(message = "Hello, $name")
}
