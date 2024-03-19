package fr.eseo.monmenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.mainToolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val mainMenuInflater : MenuInflater = menuInflater
        mainMenuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.bed -> {
                Toast.makeText(this, "Bed", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.bathtub -> {
                Toast.makeText(this, "Bath", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.accessible -> {
                Toast.makeText(this, "Accessible", Toast.LENGTH_SHORT).show()
                return true
            }
    }
        return super.onOptionsItemSelected(item)
    }
}