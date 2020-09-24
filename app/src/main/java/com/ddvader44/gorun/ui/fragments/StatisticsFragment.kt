package com.ddvader44.gorun.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ddvader44.gorun.R
import com.ddvader44.gorun.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics){
    private val viewModel : StatisticsViewModel by viewModels()
}