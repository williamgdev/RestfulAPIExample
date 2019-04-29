package com.todoenterprise.ksbra.gateway

import com.todoenterprise.ksbra.models.BaseModel
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name="Gateway")
class Gateway(
        @Column(nullable = true)
        val name: String): BaseModel() {}