package br.com.local.appti93;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class CachorroFragment extends Fragment {

    ListView listarCachorros;

    //Simular os valores
    String nomesCachorros[] = {"Pluto", "Dogger", "Comprido", "Pug", "Puppy"};
    String racaCachorros[] = {"Maltipoo", "Boston terrier", "Galgo inglês", "Terra nova", "Chow-chow"};
    String corCachorros[] = {"Preto", "Branco", "Cinza", "Amarelo", "Vermelho"};
    String idadeCachorros[] = {"9", "10", "12", "8", "2"};
    String dmaCachorros[] = {"Meses", "Meses", "Anos", "Anos", "Meses"};
    int imgCachorros[] = {R.drawable.pluto, R.drawable.dogger, R.drawable.comprido,
            R.drawable.pug, R.drawable.puppy};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cachorro, container, false);

        //Implemetação do código.

        listarCachorros = view.findViewById(R.id.listaCachorros);

        //Instanciando a classe que cria o modelo
        AdapterCachorro adapter = new AdapterCachorro();

        //Ligação entre o modelo e a listView
        listarCachorros.setAdapter(adapter);

        return view;
    }

    public class AdapterCachorro extends BaseAdapter {

        @Override
        public int getCount() {
            return imgCachorros.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView txtNomeCachorro, txtRacaCachorro, txtCorCachorro,
                    txtIdadeCachorro, txtDMACachorro;
            ImageView imagemCachorro;

            View view = getLayoutInflater().inflate(R.layout.modelo_pets, null);

            //Apresentação do xml para o java

            txtNomeCachorro = view.findViewById(R.id.txtModeloCachorro);

            imagemCachorro = view.findViewById(R.id.imgModeloCachorro);

            //Inserir os valores

            txtNomeCachorro.setText(nomesCachorros[position]);

            imagemCachorro.setImageResource(imgCachorros[position]);


            return view;
        }
    }
}