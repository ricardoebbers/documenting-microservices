package br.ufpe.cin.documentingmicroservices.rest.dto

import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.validation.BindException
import javax.validation.ConstraintViolationException


data class ValidationErrorResponse(
        val violations: List<Violation> = listOf()
) {
    companion object {
        fun of(cve: ConstraintViolationException) = ValidationErrorResponse(
                cve.constraintViolations.map { Violation(it.toString(), it.message) })

        fun of(manve: MethodArgumentNotValidException) = ValidationErrorResponse(
                manve.bindingResult.fieldErrors.map { Violation(it.field, it.defaultMessage) }
        )

        fun of(be: BindException) = ValidationErrorResponse(
                be.fieldErrors.map { Violation(it.field, it.defaultMessage) }
        )

    }

    data class Violation(
            val fieldName: String?,
            val message: String?
    )
}


