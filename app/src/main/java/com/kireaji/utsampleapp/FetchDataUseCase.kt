package com.kireaji.utsampleapp

class FetchDataUseCase(private val dataRepository: DataRepository) {

    fun execute(): String {
        val data = dataRepository.fetchData()

        return if (data.length > 10) {
            "Length is greater than 10: $data"
        } else {
            "Length is less than or equal to 10: $data"
        }
    }
}
