package net.lueckonline.spring.h2uuiddatajpatest

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomRepository : JpaRepository<CustomEntity, UUID> {

    @Query("select id from CUSTOM_ENTITY_TABLE", nativeQuery = true)
    fun nativeProjectingQuery() : List<CustomProjection>
}

interface CustomProjection {
    var id : UUID
}

@Table(name = "CUSTOM_ENTITY_TABLE")
@Entity
data class CustomEntity (
    @Id
    val id: UUID,
    val someData : String
){}
