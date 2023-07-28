package com.recepgemalmaz.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.Navigation


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated( view : View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val button1 : Button = view.findViewById(R.id.button1)

        button1.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecontFragment("recep gemalmaz")
            Navigation.findNavController(it).navigate(action)
        }
    }


}