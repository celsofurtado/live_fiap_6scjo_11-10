package br.com.fiap.livefiap11_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NovaContaActivity : AppCompatActivity() {

    lateinit var editEmail: EditText
    lateinit var editSenha: EditText
    lateinit var buttonCriarConta: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_conta)

        editEmail = findViewById(R.id.edit_email_nova_conta)
        editSenha = findViewById(R.id.edit_senha_nova_conta)
        buttonCriarConta = findViewById(R.id.button_criar_conta)

        buttonCriarConta.setOnClickListener {
            val dados = getSharedPreferences("dados", MODE_PRIVATE)

            val edit = dados.edit()
            edit.putString("email", editEmail.text.toString())
            edit.putString("senha", editSenha.text.toString())
            if (edit.commit()) {
                Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}