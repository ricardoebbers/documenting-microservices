package br.ufpe.cin.documentingmicroservices.domain.service

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface GreetingService {
    fun randomGreeting(): Greeting
    fun getGreetingById(id: Long): Greeting
    fun getGreetingPage(pagination: Pageable): Page<Greeting>
}
