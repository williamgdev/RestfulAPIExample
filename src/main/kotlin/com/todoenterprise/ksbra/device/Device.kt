package com.todoenterprise.ksbra.device

import com.todoenterprise.ksbra.models.BaseModel
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name="Device")
class Device(
        @Column(nullable = true)
        val name: String): BaseModel() {}