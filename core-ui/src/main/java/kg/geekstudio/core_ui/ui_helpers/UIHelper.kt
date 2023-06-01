package kg.geekstudio.core_ui.ui_helpers

import android.content.res.ColorStateList
import androidx.core.content.ContextCompat
import com.google.android.material.textfield.TextInputLayout
import kg.geekstudio.kitsu.core_ui.R

fun TextInputLayout.showError(text: String, duration: Long = 2000L) {
    isErrorEnabled = true
    boxStrokeErrorColor = ContextCompat.getColorStateList(this.context, R.color.errorColor)
    setErrorTextColor(
        ColorStateList.valueOf(
            ContextCompat.getColor(
                this.context,
                R.color.errorColor
            )
        )
    )
    error = text
    postDelayed(
        {
            error = null
            isErrorEnabled = false
        },
        duration
    )
}