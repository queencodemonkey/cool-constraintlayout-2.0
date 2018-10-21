package rt.ccl2.home

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.updateBounds
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rt.ccl2.R

/**
 * Landing screen for "Cool ConstraintLayout 2.0".
 */
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<RecyclerView>(R.id.list).apply {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = SectionAdapter(this@MainActivity)
    }
  }

  /**
   * RecyclerView adapter for mapping [Section] items to views.
   */
  class SectionAdapter(context: Context) : RecyclerView.Adapter<SectionViewHolder>() {

    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    private val sections = Section.values()

    //region RecyclerView.Adapter<SectionViewHolder> implementation

    override fun getItemCount() = sections.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        SectionViewHolder(layoutInflater.inflate(R.layout.list_item_main_section, parent, false))

    override fun onBindViewHolder(holder: SectionViewHolder, position: Int) {
      holder.bind(sections[position])
    }

    //endregion

  }

  class SectionViewHolder(
      itemView: View
  ) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    private val textView: TextView = itemView as TextView
    private var section: Section? = null

    init {
      itemView.setOnClickListener(this)
    }

    fun bind(section: Section) {
      this.section = section
      textView.setText(section.titleResId)
      textView.setCompoundDrawablesRelative(section.toIconDrawable(), null, null, null)
    }

    private fun Section.toIconDrawable(): Drawable? {
      val context = itemView.context
      val size = context.resources.getDimensionPixelSize(R.dimen.title_icon_size)
      return context.getDrawable(iconResId)?.apply {
        updateBounds(left = 0, top = 0, right = size, bottom = size)
        setTint(ContextCompat.getColor(context, R.color.gray_700))
      }
    }

    override fun onClick(view: View?) {
      section?.navigate(itemView.context)
    }
  }

}
