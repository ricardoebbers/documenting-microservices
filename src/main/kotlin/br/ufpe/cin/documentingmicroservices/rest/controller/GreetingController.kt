package br.ufpe.cin.documentingmicroservices.rest.controller

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting
import br.ufpe.cin.documentingmicroservices.domain.service.GreetingService
import br.ufpe.cin.documentingmicroservices.rest.dto.CreateGreetingCommand
import br.ufpe.cin.documentingmicroservices.rest.dto.ListGreetingQuery
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/greetings")
@Tag(name = "Greetings API",
        description = "API de exemplo contendo saudações em 50 línguas diferentes")
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
            @Valid @Parameter(required = false) query: ListGreetingQuery?
    ): Page<Greeting> {
        logger.info("I=called_list_paginated, query=$query")
        return service.getGreetingPage(query?.toPage() ?: Pageable.unpaged())
    }


    @Operation(summary = "Criar saudação")
    @PostMapping("/")
    fun createGreeting(
            @Valid @RequestBody greeting: CreateGreetingCommand
    ): Greeting {
        logger.info("I=called_create_greeting, greeting=$greeting")
        return service.createGreeting(greeting.toEntity())
    }
}
