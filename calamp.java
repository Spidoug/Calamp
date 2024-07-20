package com.example.calamp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CalampActivity extends Activity {
EditText editText1;
EditText editText2;
EditText editText3;
EditText editText4;
RadioGroup radioGroup1;
RadioButton radio0;
RadioButton radio1;
RadioButton radio2;
RadioButton radio3;
RadioGroup radioGroup2;
RadioButton radio4;
RadioButton radio5;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_calamp);
editText1 = (EditText) findViewById(R.id.editText1);
editText2 = (EditText) findViewById(R.id.editText2);
editText3 = (EditText) findViewById(R.id.editText3);
editText4 = (EditText) findViewById(R.id.editText4);
radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
radio0 = (RadioButton) findViewById(R.id.radio0);
radio1 = (RadioButton) findViewById(R.id.radio1);
radio2 = (RadioButton) findViewById(R.id.radio2);
radio3 = (RadioButton) findViewById(R.id.radio3);
radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
radio4 = (RadioButton) findViewById(R.id.radio4);
radio5 = (RadioButton) findViewById(R.id.radio5);
editText3.setText("Ainda não calculado.");
editText4.setText("Ainda não calculado.");
}
public void calcular(View V) {
double area = 0, lumentotal = 0, lumen = 0, n_lampada = 0,
iluminancia = 0, largura = 0, comprimento = 0;
String p_lampada = "0";
if (editText1.getText() != null && editText1.length() != 0) {
largura = Double.parseDouble(editText1.getText().toString());
} else {
editText1.setText("0");
}
if (editText2.getText() != null && editText2.length() != 0) {
comprimento =
Double.parseDouble(editText2.getText().toString());
} else {
editText2.setText("0");
}
if (radio0.isChecked()) {
lumen = 1600;
iluminancia = 150;
}
if (radio1.isChecked()) {
lumen = 800;
iluminancia = 100;
}
if (radio2.isChecked()) {
lumen = 1600;
iluminancia = 400;
}
if (radio3.isChecked()) {
lumen = 800;
iluminancia = 150;
}
if (radio4.isChecked()) {
if (lumen == 800) {
p_lampada = "8 a 12 Watts.";
} else {
if (lumen == 1600) {
p_lampada = "16 a 20 Watts.";
}
}
}
if (radio5.isChecked()) {
if (lumen == 800) {
p_lampada = "13 a 15 Watts.";
} else {
if (lumen == 1600) {
p_lampada = "25 a 30 Watts.";
}
}
}
area = largura * comprimento;
lumentotal = iluminancia * area;
while (lumentotal >= lumen) {
lumentotal = lumentotal - lumen;
19
n_lampada = n_lampada + 1;
}
if (n_lampada < 1) {
n_lampada = 1;
}
editText3.setText(String.format("%.0f", n_lampada));
editText4.setText(p_lampada);
}
}
