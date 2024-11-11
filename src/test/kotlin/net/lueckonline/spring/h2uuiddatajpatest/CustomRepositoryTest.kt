package net.lueckonline.spring.h2uuiddatajpatest

import org.assertj.core.api.Assertions.assertThat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import kotlin.test.Test

@DataJpaTest
class CustomRepositoryTest {

    @Autowired private lateinit var customRepository: CustomRepository

    @Test
    fun test() {
        val result = customRepository.nativeProjectingQuery()
        assertThat(result[0].id).isNotNull()
    }
}