package com.myproyect.eventos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddEventActivity extends AppCompatActivity {

    private EditText etName, etDescription, etAddress, etDate, etPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        etName = findViewById(R.id.et_name);
        etDescription = findViewById(R.id.et_description);
        etAddress = findViewById(R.id.et_address);
        etDate = findViewById(R.id.et_date);
        etPrice = findViewById(R.id.et_price);

        Button btnSave = findViewById(R.id.btn_save);
        Button btnCancel = findViewById(R.id.btn_cancel);

        btnSave.setOnClickListener(v -> saveEvent());
        btnCancel.setOnClickListener(v -> finish());
    }

    private void saveEvent() {
        String name = etName.getText().toString().trim();
        String description = etDescription.getText().toString().trim();
        String address = etAddress.getText().toString().trim();
        String date = etDate.getText().toString().trim();
        String price = etPrice.getText().toString().trim();

        if (name.isEmpty() || description.isEmpty() || address.isEmpty() || date.isEmpty() || price.isEmpty()) {
            etName.setError("Todos los campos son obligatorios");
            return;
        }

        Event event = new Event(name, description, address, date, price);
        Intent resultIntent = new Intent();
        resultIntent.putExtra("event", event);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
