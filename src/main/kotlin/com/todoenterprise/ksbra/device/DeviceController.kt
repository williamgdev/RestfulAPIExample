package com.todoenterprise.ksbra.device
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/devices")
class DeviceController(private val deviceService: DeviceService) {

    @GetMapping
    fun getDevices() = deviceService.findAll()

    @RequestMapping(path = [("/{deviceId}")], method = [(RequestMethod.GET)])
    fun getDevice(@PathVariable("deviceId") deviceId: Long): Device {
        return deviceService.find(deviceId)
    }

    @PostMapping
    fun create(@RequestBody device: Device): Device {
        deviceService.save(device)
        return device
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateDevice(device: Device) {
        deviceService.save(device)
    }

    @RequestMapping(path = [("/{deviceId}")], method = [(RequestMethod.DELETE)])
    fun deleteDevice(@PathVariable("deviceId") deviceId: Long) {
        deviceService.deleteById(deviceId)
    }
}