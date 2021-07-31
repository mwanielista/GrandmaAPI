package eu.wanielista.grandmaapi.repository

import eu.wanielista.grandmaapi.model.DataModel
import org.springframework.data.jpa.repository.JpaRepository

interface DataRepository : JpaRepository<DataModel, Long> {
}