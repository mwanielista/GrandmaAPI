package eu.wanielista.grandmaapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrandmaApiApplication

fun main(args: Array<String>) {
    runApplication<GrandmaApiApplication>(*args)
}
