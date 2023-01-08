package com.example.stockapp.Database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface StockDao {

    @Insert
    suspend fun insertStock(stockEntity: StockEntity){
    }

    @Delete
    suspend fun deleteStock(stockEntity: StockEntity){
    }

    @Update
    suspend fun UpdateStock(stockEntity: StockEntity){
    }

    @Query("SELECT *FROM stock WHERE id = id")
    fun getStock():Flow<List<StockEntity>>

}