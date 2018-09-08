package erikafelippe.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Criar cada item que tem no layout
    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // No OnCreate criar o findByID de cada item do layout citado acima
        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        //Se tiver botão, criar o OnClickListener
        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar o que foi digitado e converter para String
                String textoDigitado = caixaTexto.getText().toString();

                //Verificar se algo foi digitado
                if(textoDigitado.isEmpty()){
                    //String vazia = mensagem de erro
                    resultadoIdade.setText("Digite a idade de seu cachorro.");

                }else {

                    //Converter o numero digitado para numero inteiro
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int calculoFinal = valorDigitado * 7;

                    //Exibir na tela o resultado
                    resultadoIdade.setText("A idade do cachorro em anos humanos é  " + calculoFinal + "  anos.");
                }

            }
        });

    }
}
