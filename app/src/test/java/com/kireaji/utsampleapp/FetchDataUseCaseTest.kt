package com.kireaji.utsampleapp

import org.junit.Assert.*

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class FetchDataUseCaseTest {
    // DataRepository のモック化
    @Mock
    private lateinit var dataRepository: DataRepository

    @Test
    fun fetchData_lengthGreaterThan10() {
        // 期待されるデータの定義
        val inputData = "Sample Data with a length greater than 10"
        val expectedData = "Length is greater than 10: $inputData"

        // モックデータの設定
        `when`(dataRepository.fetchData()).thenReturn(inputData)

        // UseCase のインスタンス化
        val fetchDataUseCase = FetchDataUseCase(dataRepository)

        // UseCase の実行
        val result = fetchDataUseCase.execute()

        // 結果の検証
        assertEquals(expectedData, result)
    }

    @Test
    fun fetchData_lengthLessThanOrEqualTo10() {
        // 期待されるデータの定義
        val inputData = "Sample"
        val expectedData = "Length is less than or equal to 10: $inputData"

        // モックデータの設定
        `when`(dataRepository.fetchData()).thenReturn(inputData)

        // UseCase のインスタンス化
        val fetchDataUseCase = FetchDataUseCase(dataRepository)

        // UseCase の実行
        val result = fetchDataUseCase.execute()

        // 結果の検証
        assertEquals(expectedData, result)
    }
}
