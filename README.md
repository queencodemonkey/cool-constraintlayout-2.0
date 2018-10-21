# Cool ConstraintLayout 2.0
Source code for the app and examples from Huyen's talk "Cool ConstraintLayout 2.0"

## Branches
Each branch represents a completed step in the `MotionLayout` demos.
`master`: code before live coding demo.

- [`01_new_features_barrier`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/01_new_features_barrier): add `Barrier` for positioning image relative to title and description text.
- [`02_new_features_group`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/02_new_features_group): use `Group` for toggling visibility of previous barrier example code.
- [`03_new_features_percent_constraints`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/03_new_features_percent_constraints): change view widths using percent constraints
- [`04_new_features_circular_constraints`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/04_new_features_circular_constraints): position icons using circular constraints. Add a second `ImageView` constrained to the first using circular constraints as well.
- [`05_new_Features_placeholders`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/05_new_Features_placeholders): use placeholders to swap an `ImageView` between two positions. Add a second `ImageView` and use placeholders to swap positions.
- [`06_motionlayout_layout_refs`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/06_motionlayout_layout_refs): switch from using a pair of `ConstraintSet` instances toggled in code to using a `MotionScene` where `app:constraintSetStart` and `app:constraintSetEnd` are the layouts we used with the `ConstraintSet` in code.
- [`07_motionlayout_all_in_one_scene`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/07_motionlayout_all_in_one_scene): switch to using a `MotionScene` where we define the start and end states as `ConstraintSet` tags inside of the `MotionScene`. Here we animate just `icon_android`.
- [`08_motionlayout_all_in_one_scene_complete`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/08_motionlayout_all_in_one_scene_complete): add `<Constraint>` tags that we did not animate in `07_motionlayout_all_in_one_scene`. Basically, we are recreating the transition from `06_motionlayout_layout_refs` completely in a `MotionScene`.
- [`09_motionlayout_custom_attribute`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/09_motionlayout_custom_attribute): use a `<CustomAttribute>` tag inside a `<Constraint>` to interpolate the color of an `ImageView`.
- [`10_motionlayout_keyposition`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/10_motionlayout_keyposition): add a keyframe to have `icon_cloud_02` move to 100% across the parent's X-axis at key position 20.
- [`11_motionlayout_keyattribute`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/11_motionlayout_keyattribute): add a keyframe to have `icon_android` become red at key position 50.
- [`12_motionlayout_onclick`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/12_motionlayout_onclick): add transition toggle trigger for when user clicks on `icon_cloud_01`.
- [`13_motionlayout_imagefilterview`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/13_motionlayout_imagefilterview): change `icon_android` to use `ImageFilterView` that crossfades between two image drawables.
- [`14_motionlayout_seekbar`](https://github.com/queencodemonkey/cool-constraintlayout-2.0/tree/14_motionlayout_seekbar): link the changes in a `SeekBar` to the `MotionLayout` to drive the transition.

## Contact
Huyen Tue Dao  
[Twitter](https://twitter.com/queencodemnkey) | [Android Dialogs](https://youtube.com/androiddialogs) | [Randomly Typing](https://randomlytyping.com)