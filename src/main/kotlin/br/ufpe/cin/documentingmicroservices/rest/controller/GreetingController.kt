package br.ufpe.cin.documentingmicroservices.rest.controller

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting
import br.ufpe.cin.documentingmicroservices.domain.service.GreetingService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greetings")
class GreetingController(
        private val service: GreetingService
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping
    fun randomGreet(): Greeting {
        logger.info("I=called_random_greet")
        return service.randomGreeting()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Greeting {
        logger.info("I=called_find_by_id")
        return service.getGreetingById(id)
    }
}
