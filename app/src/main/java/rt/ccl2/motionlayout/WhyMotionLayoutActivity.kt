package rt.ccl2.motionlayout

import android.os.Bundle
import android.transition.TransitionManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import rt.ccl2.R

/**
 * Screen showing examples of differences in animation transitions
 * between [androidx.constraintlayout.widget.ConstraintLayout] and
 * [androidx.constraintlayout.motion.widget.MotionLayout].
 */
class WhyMotionLayoutActivity : AppCompatActivity() {

  private val constraintLayout by lazy { findViewById<ConstraintLayout>(R.id.constraint_layout) }

  private lateinit var constraintSetPrimary: ConstraintSet
  private lateinit var constraintSetAlt: ConstraintSet
  private var swapped = false

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_why_motion_layout)

    constraintSetPrimary = ConstraintSet().apply {
      clone(constraintLayout)
    }
    constraintSetAlt = ConstraintSet().apply {
      clone(this@WhyMotionLayoutActivity, R.layout.activity_why_motion_layout_alt)
    }

    findViewById<Button>(R.id.button_swap).setOnClickListener { swapLayouts() }
  }

  private fun swapLayouts() {
    TransitionManager.beginDelayedTransition(constraintLayout)
    if (swapped) {
      constraintSetPrimary.applyTo(constraintLayout)
    } else {
      constraintSetAlt.applyTo(constraintLayout)
    }
    swapped = !swapped
  }

}
