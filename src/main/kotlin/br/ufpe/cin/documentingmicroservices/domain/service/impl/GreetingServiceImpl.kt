package br.ufpe.cin.documentingmicroservices.domain.service.impl

import br.ufpe.cin.documentingmicroservices.domain.entity.Greeting
import br.ufpe.cin.documentingmicroservices.domain.repository.GreetingRepository
import br.ufpe.cin.documentingmicroservices.domain.service.GreetingService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class GreetingServiceImpl(
        private val repository: GreetingRepository
) : GreetingService {
    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    override fun randomGreeting(): Greeting {
        logger.info("I=fetching_random_greeting")
        return repository.getRandomGreeting().also {
            logger.info("I=returning_random_greeting, greeting=$it")
        }
    }

    override fun getGreetingById(id: Long): Greeting {
        logger.info("I=fetching_greeting_by_id, id=$id")
        return repository.findById(id)
                .orElseThrow {
                    EntityNotFoundException().also {
                        logger.error("E=failed_greeting_by_id, id=$id", it)
                    }
                }.also {
                    logger.info("I=returning_greeting, id=$id, greeting=$it")
                }
    }

    override fun getGreetingPage(pagination: Pageable): Page<Greeting> {
        logger.info("I=fetching_greeting_page, isPaged=${pagination.isPaged}")
        return repository.findAll(pagination).also {
            logger.info("I=returning_page, totalElements=${it.totalElements}")
        }
    }

    override fun createGreeting(greeting: Greeting): Greeting {
        logger.info("I=creating_greeting, greeting=$greeting")
        return repository.save(greeting).also {
            logger.info("I=saved_greeting, greeting=$it")
        }
    }
}
