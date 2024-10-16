package com.bnyro.clock.ui.nav

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.AvTimer
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Timer
import androidx.compose.ui.graphics.vector.ImageVector
import com.bnyro.clock.R

sealed class NavRoutes(
    val id: String,
    @StringRes val stringRes: Int,
    val icon: ImageVector
) {
    object Clock : NavRoutes("clock", R.string.clock, Icons.Default.Schedule)
    object Alarm : NavRoutes("alarm", R.string.alarm, Icons.Default.Alarm)
    object Timer : NavRoutes("timer", R.string.timer, Icons.Default.Timer)
    object Stopwatch : NavRoutes("stopwatch", R.string.stopwatch, Icons.Default.AvTimer)
}
