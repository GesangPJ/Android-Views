package com.gpaudra.gesangsview;

import android.annotation.SuppressLint;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class KelasPopUp {
    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    public void showPopupWindow(final View view) {

        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.jendelapop, null);


        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        boolean focusable = true;

        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);


        TextView test2 = popupView.findViewById(R.id.titleText);
        test2.setText("This is PopUp");

        Button buttonEdit = popupView.findViewById(R.id.messageButton);
        buttonEdit.setOnClickListener(v -> Toast.makeText(view.getContext(), "This is PopUp", Toast.LENGTH_SHORT).show());

        popupView.setOnTouchListener((v, event) -> {

            popupWindow.dismiss();
            return true;
        });
    }
}
