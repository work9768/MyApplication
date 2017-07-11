package com.example.osp160.myapplication.constatnt;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * Created by osp193 on 10/7/17.
 */

public class CustomDialog {

    public static void ExitAppDialog(final Activity activity) {
        AlertDialog.Builder alertbox = new AlertDialog.Builder(activity);
        alertbox.setTitle("Warning");
        alertbox.setMessage("Exit Application?");
        alertbox.setPositiveButton("Yes", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        activity.finish();
                    }
                });
        alertbox.setNegativeButton("No", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });
        alertbox.show();
    }


    // CALL THIS METHOD IN ACTIVITY FROM WHICH ALERT DIALOG GET CALLED

   /* public void onBackPressed()
    {
        CustomDialog.ExitAppDialog(myActivity.this );
    }*/
}
