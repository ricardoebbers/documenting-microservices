package br.ufpe.cin.documentingmicroservices.rest.controller

import br.ufpe.cin.documentingmicroservices.rest.dto.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.validation.BindException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import javax.persistence.EntityNotFoundException
import javax.validation.ConstraintViolationException

@ControllerAdvice
class ErrorHandlingControllerAdvice {
    @ExceptionHandler(ConstraintViolationException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun onConstraintValidationException(e: ConstraintViolationException) =
            ErrorResponse.of(e)

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun onMethodArgumentNotValidException(e: MethodArgumentNotValidException) =
            ErrorResponse.of(e)

    @ExceptionHandler(BindException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun onBindException(e: BindException) = ErrorResponse.of(e)

    @ExceptionHandler(EntityNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    fun onEntityNotFound(e: EntityNotFoundException) = ErrorResponse.of(e)

}
