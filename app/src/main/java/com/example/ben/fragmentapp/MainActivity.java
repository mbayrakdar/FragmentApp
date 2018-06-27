package com.example.ben.fragmentapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;
    FragmentTransaction transaction;

    ButtonLayout buton;
    LifeCycle life;
    Intentt intent;
    Menu menu;
    Widget widget;
    XMLLayout xmlLayout;
    FragmentF fragmentF;

    // Main Activity dışındaki tüm classları fragment için oluşturdum ve gereken xml dosyalarına bağladım.
    // İlk başta görünecek olan butonları da bir fragment yapısı içinde kullandım.
    // activity değişkenini back butonu tıklandığında hangi sayfada olduğunu görebilmek için oluşturdum.

    public boolean activity = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onCreate fonksiyonu içinde butonların bulunduğu fragmenti ekledim.
        buton = new ButtonLayout();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.container, buton);
        transaction.commit();
    }

    // butonlara tıklandığında ilgili fragment görüntülendi
    // activity değişkeni false olarak atandı bunu back buton kontrolünde kullandım.
    public void attachlifecycle(View v){
        life = new LifeCycle();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.container,life);
        transaction.commit();
        activity = false;
    }
    public void attachxmllayout(View v){
        xmlLayout = new XMLLayout();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.container,xmlLayout);
        transaction.commit();
        activity = false;
    }
    public void attachwidget(View v){
        widget = new Widget();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.container,widget);
        transaction.commit();
        activity = false;
    }
    public void attachintent(View v){
        intent = new Intentt();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.container,intent);
        transaction.commit();
        activity = false;
    }
    public void attachfragment(View v){
        fragmentF = new FragmentF();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.container,fragmentF);
        transaction.commit();
        activity = false;
    }
    public void attachmenu(View v){
        menu = new Menu();
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.container,menu);
        transaction.commit();
        activity = false;
    }


    // back butona tıklandığında eğer false ise butonların olduğu xml görüntülenecek
    // eğer true ise uygulama zaten butonları görüntülüyor bu durumda uygulamadan çıkacak.
    @Override
    public void onBackPressed() {
        if (activity == false) {
            buton = new ButtonLayout();
            manager = getFragmentManager();
            transaction = manager.beginTransaction();
            transaction.replace(R.id.container, buton);
            transaction.commit();
            activity = true;
        }
        else {
            finish();
        }
    }
}
