package com.kalernest.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class RegisterFragment : Fragment() {
    registerViewModel.errotoast.observe(this, Observer { hasError->
        if(hasError==true){
            Toast.makeText(requireContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show()
            registerViewModel.donetoast()
        }
    })

        }



