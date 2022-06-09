package br.com.zup.exercicio_03_aula_36.informacoes.quadrinhos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.exercicio_03_aula_36.R
import br.com.zup.exercicio_03_aula_36.databinding.FragmentMusicaBinding
import br.com.zup.exercicio_03_aula_36.databinding.FragmentQuadrinhosBinding


class QuadrinhosFragment : Fragment() {
  private lateinit var binding: FragmentQuadrinhosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuadrinhosBinding.inflate(inflater, container, false)
        return binding.root
    }
}