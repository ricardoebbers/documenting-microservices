package br.ufpe.cin.documentingmicroservices.rest.controller

import br.ufpe.cin.documentingmicroservices.rest.dto.ValidationErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.validation.BindException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import javax.validation.ConstraintViolationException

@ControllerAdvice
class ErrorHandlingControllerAdvice {
    @ExceptionHandler(ConstraintViolationException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun onConstraintValidationException(e: ConstraintViolationException) =
            ValidationErrorResponse.of(e)

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun onMethodArgumentNotValidException(e: MethodArgumentNotValidException) =
            ValidationErrorResponse.of(e)

    @ExceptionHandler(BindException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun onBindException(e: BindException) = ValidationErrorResponse.of(e)

}
