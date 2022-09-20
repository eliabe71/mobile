package br.com.quixada.trabalho1

import android.R.*
import android.R.layout.*
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.viewbinding.ViewBindings
import kotlin.String as String


class places_page(namesPlaces: ArrayList<String>): Fragment() {

    var names = namesPlaces

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var list = view?.findViewById<ListView>(R.id.listmodel) as ListView

        var adapter = activity?.let { ArrayAdapter<String>(it, layout.simple_list_item_1, names) }

        list.adapter = adapter

        //ArrayAdapter<String>(this, layout.simple_list_item_1, list)
        return inflater.inflate(R.layout.fragment_places_page, container, false)
    }

}