package net.lueckonline.spring.h2uuiddatajpatest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.UUID

@SpringBootApplication
class H2UuidDatajpatestApplication

fun main(args: Array<String>) {

    println(UUID.randomUUID())
    val context = runApplication<H2UuidDatajpatestApplication>(*args)
    context.getBean(CustomRepository::class.java).nativeProjectingQuery().forEach {
        println(it.id)
    }
}
