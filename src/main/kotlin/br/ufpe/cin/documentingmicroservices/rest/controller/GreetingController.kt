package br.ufpe.cin.documentingmicroservices.rest.controller

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting
import br.ufpe.cin.documentingmicroservices.domain.service.GreetingService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/greetings")
@Tag(name = "Greetings API", description = "API de exemplo contendo saudações em 50 línguas " +
        "diferentes")
class GreetingController(
        private val service: GreetingService
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    @Operation(summary = "Buscar saudação aleatória")
    @GetMapping("/random")
    fun randomGreet(): Greeting {
        logger.info("I=called_random_greet")
        return service.randomGreeting()
    }

    @Operation(summary = "Buscar saudação por Id")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Greeting {
        logger.info("I=called_find_by_id")
        return service.getGreetingById(id)
    }

    @Operation(summary = "Listar saudações com paginação")
    @GetMapping("/")
    fun listPaginated(
            @RequestParam(required = false) page: Int?,
            @RequestParam(required = false) size: Int?
    ): Page<Greeting> {
        logger.info("I=called_list_paginated, page=$page, size=$size")
        val pagination = if (page != null && size != null) {
            PageRequest.of(page, size)
        } else {
            Pageable.unpaged()
        }
        return service.getGreetingPage(pagination)
    }
}
