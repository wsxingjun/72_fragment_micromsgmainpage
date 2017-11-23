package it.oztaking.com.a72_fragment_micromsgmainpage;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_weixin = (Button) findViewById(R.id.bt_weixin);
        Button bt_discover = (Button) findViewById(R.id.bt_discover);
        Button bt_me = (Button) findViewById(R.id.bt_me);
        Button bt_contact = (Button) findViewById(R.id.bt_contact);

        bt_weixin.setOnClickListener(this);
        bt_discover.setOnClickListener(this);
        bt_me.setOnClickListener(this);
        bt_contact.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        FragmentManager manager = getFragmentManager();
        transaction = manager.beginTransaction();

        int id = v.getId();
        switch (id){
            case R.id.bt_weixin:
                transaction.replace(R.id.ll,new fragment_weixin());
                break;
            case R.id.bt_contact:
                transaction.replace(R.id.ll,new fragment_contact());
                break;
            case R.id.bt_discover:
                transaction.replace(R.id.ll,new fragment_discover());
                break;
            case R.id.bt_me:
                transaction.replace(R.id.ll,new fragment_me());
                break;

            default:
                break;
        }
        transaction.commit();
    }

}
