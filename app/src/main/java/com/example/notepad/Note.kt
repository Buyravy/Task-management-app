package com.example.notepad

import android.icu.text.CaseMap.Title
import androidx.activity.result.contract.ActivityResultContracts

data class Note(val id: Int, val title: String, val content: String)
