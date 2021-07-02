package br.com.local.appti93;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //Criando variáveis globais que irão representar os objetos do xml
    TextView txtRecuperarSenha, txtTermoUso;
    TextInputEditText txtNomeUsuario, txtSenhaUsuario;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //apontar para o java o objeto do xml
        txtRecuperarSenha = findViewById(R.id.txtRecuperarSenha);
        txtTermoUso = findViewById(R.id.txtTermoUso);
        txtNomeUsuario = findViewById(R.id.txtNomeUsuario);
        txtSenhaUsuario = findViewById(R.id.txtSenhaUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        //Ações para os objetos
        btnSair.setOnClickListener(this);
        btnEntrar.setOnClickListener(this);
        txtTermoUso.setOnClickListener(this);
        txtRecuperarSenha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEntrar:
                acessarJanelaMenu();
                break;
            case R.id.txtRecuperarSenha:
                startActivity(new Intent(getApplicationContext(),
                        RecuperarSenhaActivity.class));
                break;
            case R.id.txtTermoUso:
                startActivity(new Intent(getApplicationContext(),
                        TermoUsoActivity.class));
                break;
            case R.id.btnSair:
                finish();
                break;
        }

    }

    public void acessarJanelaMenu() {
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
    }
}