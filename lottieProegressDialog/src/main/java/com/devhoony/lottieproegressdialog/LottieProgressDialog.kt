package com.devhoony.lottieproegressdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.lottie.LottieAnimationView
import kotlin.math.roundToInt

class LottieProgressDialog(
    context: Context,
    // setting cancelable
    private val isCancel: Boolean,
    // if you want change dialog size input value not null
    private val dialogWidth: Int? = 200,
    private val dialogHeight: Int? = 180,
    // if you want change animation size input value not null
    private val animationViewWidth: Int? = 90,
    private val animationViewHeight: Int? = 90,
    // if you want change animation in samples refer to companion object
    // if you want specific file input file name not null
    private val fileName: String,
    // if you want change title input string not null
    private val title: String? = "Loading...",
    // if you want change title visible input visible value not null
    private val titleVisible: Int? = View.VISIBLE
) :
    Dialog(context) {
    private var mContext: Context = context
    private lateinit var lottieContainer: ConstraintLayout
    private lateinit var lottieAnimationView: LottieAnimationView
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_lottie_progress)

        setCancelable(isCancel)

        lottieContainer = findViewById(R.id.lottieContainer)
        lottieAnimationView = findViewById(R.id.lottieAnimationView)
        titleTextView = findViewById(R.id.titleTextView)

        lottieContainer.layoutParams.apply {
            dialogWidth?.let {
                width = dpToPx(it)
            }
            dialogHeight?.let {
                height = dpToPx(it)
            }
        }

        lottieAnimationView.layoutParams.apply {
            animationViewWidth?.let {
                width = it
            }

            animationViewHeight?.let {
                height = it
            }
        }

        lottieAnimationView.setAnimation(fileName)

        titleTextView.apply {
            title?.let {
                text = it
            }
            titleVisible?.let {
                visibility = it
            }
        }
    }

    private fun dpToPx(dp: Int): Int {
        val density = mContext.resources.displayMetrics.density
        return (dp * density).roundToInt()
    }

    companion object {
        // young_loading.json
        const val SAMPLE_1 = "young_loading.json"

        // cam92_loading.json
        const val SAMPLE_2 = "cam92_loading.json"

        // // emir_loading.json
        const val SAMPLE_3 = "emir_loading.json"

        // guangxia_loading.json
        const val SAMPLE_4 = "guangxia_loading.json"

        // jieun_choi_loading.json
        const val SAMPLE_5 = "jieun_choi_loading.json"

        // luisa_loading.json
        const val SAMPLE_6 = "luisa_loading.json"

        // saagar_shrest_loading.json
        const val SAMPLE_7 = "saagar_shrest_loading.json"

        // sara_diaz_loading.json
        const val SAMPLE_8 = "sara_diaz_loading.json"

        // sarowar_loading.json
        const val SAMPLE_9 = "sarowar_loading.json"

        // siyuan_qiu_loading.json
        const val SAMPLE_10 = "siyuan_qiu_loading.json"
    }
}