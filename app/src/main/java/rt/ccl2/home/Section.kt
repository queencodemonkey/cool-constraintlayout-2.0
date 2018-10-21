package rt.ccl2.home

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import rt.ccl2.R
import rt.ccl2.motionlayout.WhyMotionLayoutActivity
import rt.ccl2.features.FeaturesActivity
import rt.ccl2.motionlayout.MotionLayoutActivity

/**
 * Enumeration of the different app/presentation sections.
 */
enum class Section(
    @DrawableRes val iconResId: Int,
    @StringRes val titleResId: Int,
    private val activityClass: Class<out Activity>
) {
  NEW_FEATURES(R.drawable.ic_new_releases_24dp, R.string.title_new_features, FeaturesActivity::class.java),
  WHY_MOTION_LAYOUT(R.drawable.ic_help_24dp, R.string.title_why_motion_layout, WhyMotionLayoutActivity::class.java),
  MOTION_LAYOUT(R.drawable.ic_movie_24dp, R.string.title_motion_layout, MotionLayoutActivity::class.java),
  REFERENCES(R.drawable.ic_book_24dp, R.string.title_references, ReferencesActivity::class.java);

  /**
   * Navigate to this Section from the given [context].
   */
  fun navigate(context: Context) {
    context.startActivity(Intent(context, activityClass))
  }
}