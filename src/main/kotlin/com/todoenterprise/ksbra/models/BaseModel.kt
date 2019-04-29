package com.todoenterprise.ksbra.models

import javax.persistence.GenerationType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseModel protected constructor() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long?

    init {
        id = null
    }
}