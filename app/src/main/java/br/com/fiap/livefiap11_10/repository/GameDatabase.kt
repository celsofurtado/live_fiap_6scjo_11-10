package br.com.fiap.livefiap11_10.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.livefiap11_10.dao.GameDao
import br.com.fiap.livefiap11_10.model.Estudio
import br.com.fiap.livefiap11_10.model.Game

@Database(entities = [Game::class], version = 1)
abstract class GameDatabase : RoomDatabase() {

    abstract fun gameDao() : GameDao

    companion object {

        private lateinit var instance: GameDatabase

        // Singleton
        fun getDataBase(context: Context) : GameDatabase {

            if(!::instance.isInitialized) {
                instance = Room.databaseBuilder(
                    context, GameDatabase::class.java, "game_db")
                    .allowMainThreadQueries()
                    .build()
            }

            return instance
        }

    }

}