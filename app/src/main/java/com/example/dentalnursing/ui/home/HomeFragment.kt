package com.example.dentalnursing.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dentalnursing.ui.akreditas.AkreditasActivity
import com.example.dentalnursing.ui.fasilitas.FasilitasActivity
import com.example.dentalnursing.ui.galeri.GaleriActivity
import com.example.dentalnursing.databinding.FragmentHomeBinding
import com.example.dentalnursing.ui.mahasiswa.PrestasiActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        setupIntentViews()
        return binding.root
    }

    private fun setupIntentViews() {
        binding.tvAkreditasi.setOnClickListener {
            startActivity(Intent(requireContext(), AkreditasActivity::class.java))
        }
        binding.tvFasilitas.setOnClickListener {
            startActivity(Intent(requireContext(), FasilitasActivity::class.java))
        }
        binding.tvGaleri.setOnClickListener {
            startActivity(Intent(requireContext(), GaleriActivity::class.java))
        }
        binding.tvPrestasi.setOnClickListener {
            startActivity(Intent(requireContext(), PrestasiActivity::class.java))
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}