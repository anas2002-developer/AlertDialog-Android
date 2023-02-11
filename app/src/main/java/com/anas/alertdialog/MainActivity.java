package com.anas.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTC=findViewById(R.id.btnTC);
        Button btnDelete=findViewById(R.id.btnDelete);

        btnTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog alert1=new AlertDialog.Builder(MainActivity.this).create();

                alert1.setTitle("Terms & Conditions");
                alert1.setIcon(R.drawable.ic_tc);
                alert1.setMessage("Have you read Terms and Conditions ?");

                //setButton contains button,button text, click listener for 1 button alertdialog
                alert1.setButton(Dialog.BUTTON_NEGATIVE,"Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Yes Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                alert1.show();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert2=new AlertDialog.Builder(MainActivity.this);

                alert2.setTitle("Delete Item");
                alert2.setIcon(R.drawable.ic_delete);
                alert2.setMessage("Are you sure ?");

                //setPositiveButton contains button text, click listener for 2,3 button alertdialog
                alert2.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Proceed Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                alert2.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Decline Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                alert2.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert3=new AlertDialog.Builder(MainActivity.this);

        alert3.setTitle("Exit App");
        alert3.setIcon(R.drawable.ic_delete);
        alert3.setMessage("Are you sure ?");

        //setPositiveButton contains button text, click listener for 2,3 button alertdialog
        alert3.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Yes Clicked",Toast.LENGTH_SHORT).show();
                MainActivity.super.onBackPressed();
            }
        });

        alert3.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"No Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alert3.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Cancel Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alert3.show();
    }
}