package com.todoenterprise.ksbra.device

import org.springframework.stereotype.Service

@Service
class DeviceServiceImpl(private val deviceRepository: DeviceRepository): DeviceService {

    override fun delete(entity: Device) {
        deviceRepository.delete(entity)
    }

    override fun find(id: Long): Device {
        val optDevice = deviceRepository.findById(id)
        return optDevice.get()
    }

    override fun findAll(): List<Device> {
        return deviceRepository.findAll()
    }

    override fun save(entity: Device) {
        deviceRepository.save(entity)
    }

    override fun update(entity: Device) {
        deviceRepository.save(entity)
    }

    override fun deleteById(id: Long) {
        deviceRepository.deleteById(id)
    }

}