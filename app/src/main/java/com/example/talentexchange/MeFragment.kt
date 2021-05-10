package com.example.talentexchange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [MeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MeFragment : Fragment() {
    lateinit var username:EditText
    lateinit var talent1:EditText
    lateinit var talent2:EditText
    lateinit var talent3:EditText
    lateinit var talent4:EditText
    lateinit var experience1:EditText
    lateinit var experience2:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root:View = inflater.inflate(R.layout.fragment_me, container, false)
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MeFragment.
         */
        @JvmStatic
        fun newInstance() =
            MeFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}