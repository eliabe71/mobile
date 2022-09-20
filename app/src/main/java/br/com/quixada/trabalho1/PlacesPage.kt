package br.com.quixada.trabalho1

import android.R.*
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class PlacesPage(array: ArrayList<String>): Fragment() {

    private val COUNTRIES = arrayOf(
        "626900-000", "62504-010", "63900-081"
    )
    private val array = array

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_places_page, container, false)
        var bind = view.findViewById<ListView>(R.id.liste)
        val adapter = activity?.let { ArrayAdapter<String>(it, layout.simple_list_item_1, array)}
        bind.adapter = adapter
        return view
    }

}