package br.ufpe.cin.documentingmicroservices.domain.repository

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface GreetingRepository: JpaRepository<Greeting, Long> {

    @Query("SELECT * FROM greetings g ORDER BY RAND() LIMIT 1", nativeQuery = true)
    fun getRandomGreeting(): Greeting
}
