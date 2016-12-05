package br.com.rafaelherbst.censoibge;

/**
 * Created by herbi on 14/10/2016.
 */

public class FormularioActivity {
    Button cadastro = (Button) findViewById(R.id.cadastro);
    cadastro.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent it = new Intent(MainActivity.this, activity_formulario.class);
            startActivity(it);
        }
    });

}
