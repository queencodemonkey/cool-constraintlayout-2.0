package rt.ccl2.features

import android.os.Bundle
import android.transition.TransitionManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Placeholder
import rt.ccl2.R

/**
 * Screen for demoing ConstraintLayout 1.1 features.
 */
class FeaturesActivity : AppCompatActivity() {

  private val constraintLayout by lazy { findViewById<ConstraintLayout>(R.id.constraint_layout) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_features)

    findViewById<Button>(R.id.button_change_places).setOnClickListener { placeholderSwap() }
  }








  //
  //   _____   _                    _             _      _
  //  |  __ \ | |                  | |           | |    | |
  //  | |__) || |  __ _   ___  ___ | |__    ___  | |  __| |  ___  _ __  ___
  //  |  ___/ | | / _` | / __|/ _ \| '_ \  / _ \ | | / _` | / _ \| '__|/ __|
  //  | |     | || (_| || (__|  __/| | | || (_) || || (_| ||  __/| |   \__ \
  //  |_|     |_| \__,_| \___|\___||_| |_| \___/ |_| \__,_| \___||_|   |___/
  //
  //


  // Placeholder properties
  private val placeholderPrimary: Placeholder by lazy {
    findViewById<Placeholder>(R.id.placeholder_image_primary) }
  private val placeholderAlt: Placeholder by lazy {
    findViewById<Placeholder>(R.id.placeholder_image_alt) }

  private var swapped = false

  private fun placeholderSwap() {
    TransitionManager.beginDelayedTransition(constraintLayout)
    if (swapped) {
      placeholderPrimary.setContentId(R.id.placeholder_image_view)
      placeholderAlt.setContentId(R.id.placeholder_image_view_02)
    } else {
      placeholderAlt.setContentId(R.id.placeholder_image_view)
      placeholderPrimary.setContentId(R.id.placeholder_image_view_02)
    }
    swapped = !swapped
  }

}
