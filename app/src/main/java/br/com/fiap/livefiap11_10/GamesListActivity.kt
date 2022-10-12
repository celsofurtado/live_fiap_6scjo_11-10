package br.com.fiap.livefiap11_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GamesListActivity : AppCompatActivity() {

    lateinit var textEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_list)

        textEmail = findViewById(R.id.text_email_games_list)
        val dados = getSharedPreferences("dados", MODE_PRIVATE)
        textEmail.text = dados.getString("emaill", "não encontrado")
    }
}