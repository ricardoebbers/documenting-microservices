package br.ufpe.cin.documentingmicroservices.domain.service

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting

interface GreetingService {
    fun randomGreeting(): Greeting
    fun getGreetingById(id: Long): Greeting
}
