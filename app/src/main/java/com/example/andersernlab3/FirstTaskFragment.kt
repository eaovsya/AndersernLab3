package com.example.andersernlab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.andersernlab3.databinding.FragmentFirstTaskBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstTaskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstTaskFragment : Fragment() {

    private var _binding: FragmentFirstTaskBinding? = null
    private val binding get() = _binding!!

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.austriaButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToAustriaFragment())
        }

        binding.colombiaButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToColombiaFragment())
        }
        binding.denmarkButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToDenmarkFragment())
        }
        binding.italyButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToItalyFragment())
        }
        binding.madagascarButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToMadagascarFragment())
        }
        binding.polandButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToPolandFragment())
        }
        binding.switzerlandButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToSwitzerlandFragment())
        }
        binding.thailandButton.setOnClickListener {
            findNavController().navigate(FirstTaskFragmentDirections.actionFirstTaskFragmentToThailandFragment())
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment task1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstTaskFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}