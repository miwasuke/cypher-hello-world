package cypher.miwasuke.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class HelloworldApplication

@GetMapping("/")
public fun hello(): String = "hello"

fun main(args: Array<String>) {
	runApplication<HelloworldApplication>(*args)
}
