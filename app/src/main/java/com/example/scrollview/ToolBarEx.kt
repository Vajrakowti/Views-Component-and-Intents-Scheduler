package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class ToolBarEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar_ex)

        // GO TO THEMES AND SEE I HAVE WRITTEN NEW STYLE and IN MANIFEST ALSO.

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setLogo(R.drawable.spalsh_image);
        toolbar.title = "My ToolBar"
        setSupportActionBar(toolbar)                                               // replace tool bar as ActionBar
        toolbar.setNavigationOnClickListener{
            Toast.makeText(this,"Back Arrow",Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menutollbar,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id:Int = item.itemId
        if(id==R.id.action_settings)
        {
            Toast.makeText(applicationContext,"Setting Menu",Toast.LENGTH_LONG).show()
            return true
        }
        else if(id==R.id.action_email)
        {
            Toast.makeText(applicationContext,"Email",Toast.LENGTH_LONG).show()
            return true
        }
        else if(id==R.id.action_add)
        {
            Toast.makeText(applicationContext,"Add",Toast.LENGTH_LONG).show()
            return true
        }
        return super.onOptionsItemSelected(item)

    }
}