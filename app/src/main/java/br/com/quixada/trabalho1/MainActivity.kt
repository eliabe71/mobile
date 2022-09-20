package br.com.quixada.trabalho1

import android.content.Intent
import android.R as Randroid
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import br.com.quixada.trabalho1.databinding.ActivityMainBinding
import java.io.InputStream
import java.net.URL
import java.net.URLConnection
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding
    var list:ArrayList<String> = ArrayList<String>()
    private val url = URL("https://viacep.com.br/ws/01001000/json/")
    private lateinit var  urlConnection: URLConnection
    private lateinit var inputStream: InputStream
    private val COUNTRIES = arrayOf(
        "626900-000", "62504-010", "63900-081"
    )
    private val itens = arrayOf(
        "Sul-Americano", "America-Do-Norte", "Europa",
    )

    private var m_model: ModelPlaces = ModelPlaces("6290-000", "trairi", "ok")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main)
        bind.myToolbar.setTitle("")
        val toolbar = bind.myToolbar
        setSupportActionBar(findViewById(R.id.myToolbar))

        val adapter = ArrayAdapter<String>(this, Randroid.layout.simple_dropdown_item_1line, COUNTRIES)
        bind.autoComplete.setAdapter(adapter)
        val dataAdpter = ArrayAdapter<String>(this, Randroid.layout.simple_dropdown_item_1line, itens)
        bind.spinner.adapter = dataAdpter
        bind.mModel = m_model

    }

    fun onRadioButtonClicked(view: View){
        if(view is RadioButton){
            val checked = view.isChecked
            when(view.id){
                bind.buttonYes.id ->{
                    if(checked){

                    }
                }
                bind.buttonNo.id ->{

                }
            }

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.option1 ->{

            }
            R.id.option2 ->{
                placesSave()
            }
        }
        return true
    }

    private fun placesSave() {
        val intent = Intent(this,Places::class.java)
        startActivity(intent)
    }
}