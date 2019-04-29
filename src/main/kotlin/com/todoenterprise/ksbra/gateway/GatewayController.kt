package com.todoenterprise.ksbra.gateway
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/gateways")
class GatewayController(private val gatewayService: GatewayService) {

    @GetMapping
    fun getGateways() = gatewayService.findAll()

    @RequestMapping(path = [("/{gatewayId}")], method = [(RequestMethod.GET)])
    fun getGateway(@PathVariable("gatewayId") deviceId: Long): Gateway {
        return gatewayService.find(deviceId)
    }

    @PostMapping
    fun create(@RequestBody gateway: Gateway): Gateway {
        gatewayService.save(gateway)
        return gateway
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateGateway(gateway: Gateway) {
        gatewayService.save(gateway)
    }

    @RequestMapping(path = [("/{gatewayId}")], method = [(RequestMethod.DELETE)])
    fun deleteGateway(@PathVariable("gatewayId") gatewayId: Long) {
        gatewayService.deleteById(gatewayId)
    }
}