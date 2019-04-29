package com.todoenterprise.ksbra.gateway

import org.springframework.stereotype.Service

@Service
class GatewayServiceImpl(private val gatewayRepository: GatewayRepository): GatewayService {

    override fun delete(entity: Gateway) {
        gatewayRepository.delete(entity)
    }

    override fun find(id: Long): Gateway {
        val optDevice = gatewayRepository.findById(id)
        return optDevice.get()
    }

    override fun findAll(): List<Gateway> {
        return gatewayRepository.findAll()
    }

    override fun save(entity: Gateway) {
        gatewayRepository.save(entity)
    }

    override fun update(entity: Gateway) {
        gatewayRepository.save(entity)
    }

    override fun deleteById(id: Long) {
        gatewayRepository.deleteById(id)
    }

}