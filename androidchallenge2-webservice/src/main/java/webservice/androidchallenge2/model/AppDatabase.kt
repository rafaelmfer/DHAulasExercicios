package webservice.androidchallenge2.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import webservice.androidchallenge2.model.dao.AccessComic
import webservice.androidchallenge2.model.pojo.ResultsRoom

@Database(
    entities = [ResultsRoom::class],
    version = 1,
    exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {

    abstract fun accessComics(): AccessComic
}

object DatabaseBuilder {
    private var instance: AppDatabase? = null

    @JvmStatic
    fun getAppDatabase(context: Context) = instance ?: build(context)

    private fun build(context: Context): AppDatabase {
        val database = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java, "database"
        )
        database.allowMainThreadQueries()
        val appDatabase = database.build()
        instance = appDatabase
        return appDatabase
    }

    @JvmStatic
    fun destroyInstance() {
        instance = null
    }
}
