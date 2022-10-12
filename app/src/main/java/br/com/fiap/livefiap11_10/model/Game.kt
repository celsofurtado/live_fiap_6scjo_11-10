package br.com.fiap.livefiap11_10.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_game")
class Game {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var titulo: String = ""
    var estudio: String = ""

    @ColumnInfo(name = "ano_lancamento", defaultValue = "1990")
    var anoLancamento: Int = 0

}