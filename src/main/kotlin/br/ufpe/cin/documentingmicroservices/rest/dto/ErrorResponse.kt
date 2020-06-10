package br.ufpe.cin.documentingmicroservices.rest.dto

import org.springframework.validation.BindException
import org.springframework.web.bind.MethodArgumentNotValidException
import javax.persistence.EntityNotFoundException
import javax.validation.ConstraintViolationException


data class ErrorResponse(
        val message: String,
        val details: List<ErrorDetails> = listOf()
) {
    companion object {
        private const val VALIDATION_MESSAGE = "Erro de validação"
        private const val NOT_FOUND_MESSAGE = "Não encontrado"

        fun of(cve: ConstraintViolationException) = ErrorResponse(message = VALIDATION_MESSAGE,
                details = cve.constraintViolations.map {
                    ErrorDetails(it.propertyPath.toString()
                            , it.message)
                })

        fun of(manve: MethodArgumentNotValidException) = ErrorResponse(message = VALIDATION_MESSAGE,
                details = manve.bindingResult.fieldErrors.map {
                    ErrorDetails(it.field, it.defaultMessage)
                }
        )

        fun of(be: BindException) = ErrorResponse(message = VALIDATION_MESSAGE,
                details = be.fieldErrors.map { ErrorDetails(it.field, it.defaultMessage) }
        )

        fun of(enfe: EntityNotFoundException) = ErrorResponse(message = NOT_FOUND_MESSAGE)

    }

    data class ErrorDetails(
            val fieldName: String?,
            val message: String?
    )
}


