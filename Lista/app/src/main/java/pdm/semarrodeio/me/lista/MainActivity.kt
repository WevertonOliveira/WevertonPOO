package pdm.semarrodeio.me.lista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var lista : ListView
    lateinit var btAdd : Button
    lateinit var etNome : EditText

    var nomes  = arrayListOf<String>("Thalita",
            "Gilberto",
            "Alex",
            "Junior",
            "Lucas",
            "Raimundo",
            "Mateus")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.lista = findViewById(R.id.lista)
        this.etNome = findViewById(R.id.etNome)
        this.btAdd = findViewById(R.id.btAdd)


        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes)
        this.lista.adapter =  adapter
        this.btAdd.setOnClickListener({ add(it)})

   adapter.add("fdg")
        Log.i("APP", nomes.toString())
    }
    fun add(view: View){
        val st = this.etNome.text.toString()
        this.nomes.add(st)
    }



}
