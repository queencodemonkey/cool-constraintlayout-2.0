package rt.ccl2.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.widget.SeekBar
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import rt.ccl2.R

class MotionLayoutActivity : AppCompatActivity() {

  private val container by lazy { findViewById<ConstraintLayout>(R.id.container) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_motion_layout)

    findViewById<SeekBar>(R.id.seek_bar)
        .setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
          override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            findViewById<MotionLayout>(R.id.container).progress = progress / 100f
          }

          override fun onStartTrackingTouch(seekBar: SeekBar?) = Unit

          override fun onStopTrackingTouch(seekBar: SeekBar?) = Unit
        })

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
