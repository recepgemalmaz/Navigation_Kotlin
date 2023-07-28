package com.recepgemalmaz.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation


class SecontFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secont, container, false)
    }

    override fun onViewCreated( view : View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val userName = SecontFragmentArgs.fromBundle(it).username
            val textView : TextView = view.findViewById(R.id.textView2)
            textView.text= userName

            //ismi ikinci fragmente bir textView ekleyip goster
        }

        val button2 : Button = view.findViewById(R.id.button2)

        button2.setOnClickListener {
            val action = SecontFragmentDirections.actionSecontFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}