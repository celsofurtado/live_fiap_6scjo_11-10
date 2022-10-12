package br.com.fiap.livefiap11_10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonLogin: Button
    lateinit var editEmail: EditText
    lateinit var editSenha: EditText
    lateinit var textNovaConta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin = findViewById(R.id.button_login)
        editSenha = findViewById(R.id.edit_senha)
        editEmail = findViewById(R.id.edit_email)
        textNovaConta = findViewById(R.id.text_nova_conta)

        textNovaConta.setOnClickListener {
            val intent = Intent(this, NovaContaActivity::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener {
            val dados = getSharedPreferences("dados", MODE_PRIVATE)
            val email = dados.getString("email", "E-mail não encontrado")
            val senha = dados.getString("senha", "Senha não encontrada")

            if (email == editEmail.text.toString() && senha == editSenha.text.toString()) {
                val intent = Intent(this, GamesListActivity::class.java)
                startActivity(intent)
            }
        }


    }
}