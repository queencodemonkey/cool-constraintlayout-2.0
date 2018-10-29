package rt.ccl2.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import rt.ccl2.R

class MotionLayoutActivity : AppCompatActivity() {

  private val container by lazy { findViewById<ConstraintLayout>(R.id.container) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_motion_layout)

//    container.postDelayed({ swapWithConstraintSet() }, 1000L)
  }

  private fun swapWithConstraintSet() {
    TransitionManager.beginDelayedTransition(container)
    ConstraintSet().also {
      it.clone(this, R.layout.activity_motion_layout_alt)
      it.applyTo(container)
    }
  }

}
