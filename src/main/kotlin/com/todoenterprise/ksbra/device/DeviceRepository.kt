package com.todoenterprise.ksbra.device

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface DeviceRepository : JpaRepository<Device, Long>