package webservice.androidchallenge2.model.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import webservice.androidchallenge2.model.pojo.ResultsRoom

@Dao
interface AccessComic {

    @Query("SELECT * FROM comic where id LIKE  :id")
    fun findThisId(id: Int): ResultsRoom

    @Query("SELECT COUNT(*) from comic")
    fun countAll(): Int

    @Insert
    fun insert(vararg comic: ResultsRoom)

    @Delete
    fun delete(comic: ResultsRoom)

    @Update
    fun update(comic: ResultsRoom)
}