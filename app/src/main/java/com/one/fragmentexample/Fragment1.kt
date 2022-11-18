package com.one.fragmentexample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment1: Fragment(R.layout.fragment1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().findViewById<Button>(R.id.fr1_btn).setOnClickListener {
            Toast.makeText(requireContext(), "Fragment 1", Toast.LENGTH_SHORT).show()
        }
    }
}