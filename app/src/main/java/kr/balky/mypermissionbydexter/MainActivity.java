  package kr.balky.mypermissionbydexter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

  public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


      public void requestAll(View view) {
      }

      public void requestContact(View view) {
      }

      public void requestStorage(View view) {
      }

      public void requestCamera(View view) {
      }

      public void showPermissionGranted(String permissionName) {

      }
  }
