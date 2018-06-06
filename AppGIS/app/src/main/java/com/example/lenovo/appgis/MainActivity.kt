package com.example.lenovo.appgis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c: Calendar = Calendar.getInstance()
        val year: Int = c.get(Calendar.YEAR)
        val month: Int = c.get(Calendar.MONTH)
        val day: Int = c.get(Calendar.DAY_OF_MONTH)

        idDay.text = "$day/$month/$year"


    }
/*( MASIH ERROR, rowid dan context butuh parameter sedangkan di materi tidak ada)


    fun readData(rowid: Any, context: Any): MutableList<ArrayModel>{
        val list = ArrayList<ArrayModel>()
        val teks : String = id_Lokasi.text.toString()
        list.add(ArrayModel( rowid : 1, lokasi: "ITATS", long:"-7.289241", lat:"112.778776"));
        list.add(ArrayModel( rowid : 2, lokasi: "NAROTAMA", long:"-7.288075", lat:"112.776449"))
        for (n : ArrayModel in list){
            if (teks == n.lokasi){
                id_Long.setText(n.long)
                id_Lati.setText(n.lat)
                Toast.makeText( context: this, text: "Data ditemukan", Toast.LENGTH_SHORT).show();
            }
        }
        return list
    }**/
}
