package br.ufpe.cin.documentingmicroservices.rest.dto

import org.springframework.data.domain.PageRequest
import javax.validation.constraints.Min
import javax.validation.constraints.PositiveOrZero

data class ListGreetingQuery(
        @field:PositiveOrZero
        val page: Int,
        @field:Min(1)
        val size: Int
) {
    fun toPage() = PageRequest.of(page, size)
}
