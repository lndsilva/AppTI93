package br.com.local.appti93;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class PetsActivity extends AppCompatActivity {

    MaterialToolbar idToolBarpets;
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem item_cachorro;
    PageAdapter adapterPets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets_layout);

        tabLayout = findViewById(R.id.idTabPets);
        viewPager = findViewById(R.id.idViewPagerPets);
        item_cachorro = findViewById(R.id.idTabItemCachorro);


        idToolBarpets = findViewById(R.id.idToolBarpets);

        idToolBarpets.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        MenuActivity.class));
                finish();
            }
        });

        adapterPets = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        //Ligar o viewPager ao adaptador
        viewPager.setAdapter(adapterPets);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //posição da seleção atual
                viewPager.setCurrentItem(tab.getPosition());
                //status da seleção para o adapterPages
                adapterPets.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //implementando o viewPager ao fragment
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}