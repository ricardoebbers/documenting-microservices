package br.ufpe.cin.documentingmicroservices.rest.dto

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class CreateGreetingCommand(
        @field:Size(max = 50)
        @field:NotEmpty
        @field:NotBlank
        val language: String,

        @field:Size(max = 150)
        @field:NotEmpty
        @field:NotBlank
        val content: String
) {
    fun toEntity() = Greeting(id = null, language = language, content = content)
}
