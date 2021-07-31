package eu.wanielista.grandmaapi.controller

import eu.wanielista.grandmaapi.model.DataModel
import eu.wanielista.grandmaapi.repository.DataRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class AppController(
    private val dataRepo: DataRepository
) {

    @GetMapping("/example")
    fun returnExample(): DataModel{
        return DataModel(1213L, "Example", "http://example.com")
    }

    @PostMapping("/radio")
    fun addRadioURL(@RequestBody radio: DataModel) = dataRepo.save(radio)

    @GetMapping("/radio/all")
    fun listRadios() = dataRepo.findAll();

}