package de.westnordost.streetcomplete.quests.fire_hydrant

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AImageListQuestAnswerFragment
import de.westnordost.streetcomplete.quests.fire_hydrant.FireHydrantDiameter.*
import de.westnordost.streetcomplete.view.image_select.Item

class AddFireHydrantDiameterForm : AImageListQuestAnswerFragment<FireHydrantDiameter, FireHydrantDiameter>() {

    override val items = listOf(
        Item(H80, R.drawable.fire_hydrant_underground, R.string.quest_fireHydrant_diameter_80),
        Item(H100, R.drawable.fire_hydrant_underground, R.string.quest_fireHydrant_diameter_100),
        Item(H150, R.drawable.fire_hydrant_underground, R.string.quest_fireHydrant_diameter_150),
        Item(H200, R.drawable.fire_hydrant_underground, R.string.quest_fireHydrant_diameter_200)
    )

    override val itemsPerRow = 2

    override fun onClickOk(selectedItems: List<FireHydrantDiameter>) {
        applyAnswer(selectedItems.single())
    }
}
