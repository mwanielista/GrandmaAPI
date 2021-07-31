package eu.wanielista.grandmaapi.model

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class DataModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long,
    private var name: String,
    private var url: String
){
    fun getId(): Long{
        return id;
    }

    fun getName(): String{
        return name;
    }

    fun getUrl(): String{
        return url;
    }
}