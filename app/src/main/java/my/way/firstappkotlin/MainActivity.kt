package my.way.firstappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn = findViewById<Button>(R.id.myBtn)
        val myText = findViewById<TextView>(R.id.myNewApp)
        myText.text = "THIS IS MY NEW APP...."

        myBtn.setOnClickListener {
            Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
            myText.text = "Text is changed  on button  click.."
        }
    }
}