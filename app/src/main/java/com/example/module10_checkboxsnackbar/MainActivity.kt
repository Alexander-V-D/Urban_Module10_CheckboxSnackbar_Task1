package com.example.module10_checkboxsnackbar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var inputET: EditText
    private lateinit var outputTV: TextView

    private lateinit var saveBTN: Button
    private lateinit var deleteBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputET = findViewById(R.id.inputET)
        outputTV = findViewById(R.id.outputTV)

        saveBTN = findViewById(R.id.saveBTN)
        deleteBTN = findViewById(R.id.deleteBTN)

        saveBTN.setOnClickListener {
            outputTV.text = inputET.text
        }

        deleteBTN.setOnClickListener { view ->
            Snackbar.make(
                view,
                "Подтвердите удаление",
                Snackbar.LENGTH_LONG
            ).setAction("Удалить") { action ->
                outputTV.text = ""
                Snackbar.make(
                    action,
                    "Данные удалены",
                    Snackbar.LENGTH_LONG
                ).show()
            }.show()
        }
    }
}