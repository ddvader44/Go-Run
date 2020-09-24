package com.ddvader44.gorun.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ddvader44.gorun.R
import com.ddvader44.gorun.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run){
private val viewModel : MainViewModel by viewModels()
}