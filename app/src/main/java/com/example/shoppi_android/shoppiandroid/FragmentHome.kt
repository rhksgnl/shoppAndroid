package com.example.shoppi_android.shoppiandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentHome : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frgment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btn_homefragment)

        button.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.add(R.id.container_main, Fragmentdetail())
            transaction.commit()
        }


    }


}