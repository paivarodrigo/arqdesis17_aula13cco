package br.usjt.meuprimeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    //constante static para identificar a mensagem
    public final static String EXTRA_MESSAGE = "br.usjt.meuprimeiroapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
