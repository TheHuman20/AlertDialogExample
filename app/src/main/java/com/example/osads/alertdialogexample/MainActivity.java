package com.example.osads.alertdialogexample;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //final int DIALOG_EXIT = 1;
    TextView mTW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTW = findViewById(R.id.textView);

    }




    @Override
    public void onBackPressed() {
        AlertDialog.Builder adb = new AlertDialog.Builder(this)
                .setTitle(getResources().getString(R.string.alert_title))
                .setMessage(getResources().getString(R.string.alert_msg))
                .setPositiveButton(getResources().getString(android.R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton(getResources().getString(android.R.string.no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mTW.setText("New text");
                    }
                })
                .setNeutralButton(getResources().getString(android.R.string.cancel), null);
        adb.show();
    }


    public void onClickAlertDialog(View view) {

        AlertDialog.Builder adb = new AlertDialog.Builder(this)
                .setTitle(getResources().getString(R.string.alert_title))
                .setMessage(getResources().getString(R.string.alert_msg))
                .setPositiveButton(getResources().getString(android.R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton(getResources().getString(android.R.string.no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mTW.setText("New text");
                    }
                })
                .setNeutralButton(getResources().getString(android.R.string.cancel), null);
        adb.show();

//        AlertDialog.Builder adb = new AlertDialog.Builder(this)
//                .setTitle("Alert dialog")
//                .setMessage("Alert dialog example")
//                .setPositiveButton("Yew", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        mTW.setText("New text");
//                    }
//                })
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        finish();
//                    }
//                })
//                .setNeutralButton("Cancel", null);
//
//        adb.show();
    }

//    public void onclick(View v) {
//        // вызываем диалог
//        showDialog(DIALOG_EXIT);
//    }
//
//    protected Dialog onCreateDialog(int id) {
//        if (id == DIALOG_EXIT) {
//            AlertDialog.Builder adb = new AlertDialog.Builder(this);
//            // заголовок
//            adb.setTitle(R.string.exit);
//            // сообщение
//            adb.setMessage(R.string.save_data);
//            // иконка
//            adb.setIcon(android.R.drawable.ic_dialog_info);
//            // кнопка положительного ответа
//            adb.setPositiveButton(android.R.string.yes, myClickListener);
//            // кнопка отрицательного ответа
//            adb.setNegativeButton(android.R.string.no, myClickListener);
//            // кнопка нейтрального ответа
//            adb.setNeutralButton(android.R.string.cancel, myClickListener);
//            // создаем диалог
//            return adb.create();
//        }
//        return super.onCreateDialog(id);
//    }
//
//    DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
//        public void onClick(DialogInterface dialog, int which) {
//            switch (which) {
//                // положительная кнопка
//                case Dialog.BUTTON_POSITIVE:
//                    saveData();
//                    finish();
//                    break;
//                // негативная кнопка
//                case Dialog.BUTTON_NEGATIVE:
//                    finish();
//                    break;
//                // нейтральная кнопка
//                case Dialog.BUTTON_NEUTRAL:
//                    break;
//            }
//        }
//    };
//
//    void saveData() {
//        Toast.makeText(this, R.string.saved, Toast.LENGTH_SHORT).show();
//    }


}


