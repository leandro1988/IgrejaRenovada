package br.com.leandrohenrique.igrejarenovada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {


            // Função do botão login
            @Override
            public void onClick(View view) {

                TextView tlogin = (TextView) findViewById(R.id.edtlogin);
                TextView tsenha = (TextView) findViewById(R.id.edtSenha);

                String login = tlogin.getText().toString();
                String senha = tsenha.getText().toString();

                // Senha salva direto no código. Usar o banco de dados.

                if (login.equals("admin") && senha.equals("renovada")) {

                    alert("Login realizado com sucesso");

                    setContentView(R.layout.activity_main);

                }else {

                        alert("Senha ou Login incorreto!");


                    }
                }
        });
    }
    private void alert(String s) {

        Toast.makeText(this,s,Toast.LENGTH_LONG).show();


    }
}
