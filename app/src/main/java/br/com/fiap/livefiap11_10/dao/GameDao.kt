package br.com.fiap.livefiap11_10.dao

import androidx.room.*
import br.com.fiap.livefiap11_10.model.Game

@Dao
interface GameDao {

    @Insert
    fun gravar(game: Game): Long

    @Update
    fun atualizar(game: Game): Int

    @Delete
    fun excluir(game: Game)

    @Query("SELECT * FROM tb_game")
    fun listarTodos(): List<Game>

    @Query("SELECT * FROM tb_game WHERE id = :id")
    fun buscarGamePorId(id: Int): Game

}