package com.todoenterprise.ksbra.core

import com.todoenterprise.ksbra.models.BaseModel


interface AbstractService<T:BaseModel> {
    fun findAll(): List<T>

    fun find(id: Long): T

    fun save(entity: T)

    fun delete(entity: T)

    fun update(entity: T)

    fun deleteById(id: Long)
}