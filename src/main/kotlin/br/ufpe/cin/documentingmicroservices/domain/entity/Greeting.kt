package br.ufpe.cin.documentingmicroservices.domain.entity

import javax.persistence.*

@Entity
@Table(name = "greetings")
data class Greeting(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        @Column(name = "lang")
        val language: String,
        @Column
        val content: String
)
