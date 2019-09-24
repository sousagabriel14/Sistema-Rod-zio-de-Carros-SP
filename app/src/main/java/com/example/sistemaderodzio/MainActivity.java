package com.example.sistemaderodzio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // variaveis
    EditText txtNumero; //txtLetra; -nao sera necessario pois a validação só é feita pelos 2 numeros finais
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //puxando os values para as variaveis
       // txtLetra = (EditText) findViewById(R.id.txtLetra); //nao sera necessario pois a validação só é feita pelos 2 numeros finais
        txtNumero = (EditText) findViewById(R.id.txtNumero);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = txtNumero.getText().toString(); //aqui esta atribuindo o texto do txtNumero a uma variavel num
                String numSub = num.substring(3, 4); //aqui a funçao substring está pegando os dois ultimos caracteres

                //TOAST É UMA CLASSE QUE EXIBE UM ALERTA
                //.makeText método responsável por criar toda a estrutura da mensagem que sera exibida como resposta
                //o makeText recebe 3 parâmetros: Contexto/Mensagem/Tempo de Duração da mensagem na tela
                //Toast.LENGTH_LONG.show() : exibe uma mensagem com tempo mais longo (4s)
                //Toast.LENGTH_SHORT.show() : exibe uma mensagem com tempo mais curto (2s)

                if (numSub.equals("1") || numSub.equals("2")) {
                    //Aqui o numSub que esta o texto atribuido é comparado com  a string ('1') e ('2') o .equals  faz essa comparação
                    //caso o usuario digite alguma dessas Strings ('1') e ('2') é exibido o alerta de mensagem para segunda
                    Toast.makeText(getBaseContext(), "SEGUNDA", Toast.LENGTH_LONG).show();
                }
                else if (numSub.equals("3") || numSub.equals("4")) {
                    Toast.makeText(getBaseContext(), "TERÇA", Toast.LENGTH_LONG).show();
                }
                else if (numSub.equals("6") || numSub.equals("5")) {
                    Toast.makeText(getBaseContext(), "QUARTA", Toast.LENGTH_LONG).show();
                }
                else if (numSub.equals("7") || numSub.equals("8")) {
                    Toast.makeText(getBaseContext(), "QUINTA", Toast.LENGTH_LONG).show();
                }
                else if (numSub.equals("0") || numSub.equals("9")) {
                    Toast.makeText(getBaseContext(), "SEXTA", Toast.LENGTH_LONG).show();
                }
            }
        });

        }
    }

