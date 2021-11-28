package mx.edu.utng.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declarar un Recycler y un Adaptador
    RecyclerView recyclerUsuario;
    UsuarioAdaptador usuarioAdaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarElementos();
    }

    private void inicializarElementos() {
        recyclerUsuario = findViewById(R.id.recycler);
        recyclerUsuario.setLayoutManager(new LinearLayoutManager(this));
        //Se declara la lista sin datos
        List<Usuario> usuarioList = new ArrayList<>();
        //Cargar los datos por medio de un ciclo for
        for(int i=0; i<20; i++){
            usuarioList.add(new Usuario(i, "nombre " + i, "apellido",
                     "https://cdn.icon-icons.com/icons2/1154/PNG/128/1486564400-account_81513.png",
                    "email@gmail.com"));

            Log.d("Msg", "Se ha creado el objeto"+i);
        }//fon del for

        //Preparando el objeto Adaptador con la lista y contexto
        usuarioAdaptador = new UsuarioAdaptador(usuarioList, this);
        //Se utiliza el adaptador
        recyclerUsuario.setAdapter(usuarioAdaptador);
        Log.d("Msg", "El tamaño de la lista es: " + usuarioList.size());

    }
}