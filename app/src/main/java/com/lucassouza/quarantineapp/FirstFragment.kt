package com.lucassouza.quarantineapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    var count = 0;
    // Execute on fragment start..
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home, container, false)
    }

    // Execute on fragment start..
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.toast_button).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
            // show toast..
            myToast.show();
        }

        view.findViewById<Button>(R.id.count_button).setOnClickListener {
            count++;
            val textView = view.findViewById<TextView>(R.id.countdown_textview);
            textView.text = count.toString();
        }
    }
}
