package com.example.nim234311035.application30day.model

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

@SuppressLint("SupportAnnotationUsage")
data class AnimeActivity(
    @StringRes val day: String,
    @StringRes val title: String,
    @StringRes val description: String,
    @DrawableRes val imageResId: Int
)
