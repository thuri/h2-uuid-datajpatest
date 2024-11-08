package net.lueckonline.spring.h2uuiddatajpatest

import org.assertj.core.api.Assertions.assertThat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.Test

@SpringBootTest
class CustomRepositoryTest {

    @Autowired private lateinit var customRepository: CustomRepository

    @Test
    fun test() {
        val result = customRepository.nativeProjectingQuery()
        assertThat(result[0].id).isNotNull()
    }
}