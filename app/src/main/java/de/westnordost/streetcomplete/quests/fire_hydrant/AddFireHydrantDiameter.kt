package de.westnordost.streetcomplete.quests.fire_hydrant

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.data.osm.osmquests.OsmFilterQuestType
import de.westnordost.streetcomplete.data.osm.edits.update_tags.StringMapChangesBuilder
import de.westnordost.streetcomplete.data.user.achievements.QuestTypeAchievement

class AddFireHydrantDiameter : OsmFilterQuestType<FireHydrantDiameter>() {

    override val elementFilter = "nodes with emergency = fire_hydrant and !fire_hydrant:diameter"
    override val commitMessage = "Add fire hydrant diameter"
    override val wikiLink = "Tag:emergency=fire_hydrant"
    override val icon = R.drawable.ic_quest_fire_hydrant
    override val isDeleteElementEnabled = true

    override val questTypeAchievements = emptyList<QuestTypeAchievement>()

    override fun getTitle(tags: Map<String, String>) = R.string.quest_fireHydrant_diameter_title

    override fun createForm() = AddFireHydrantDiameterForm()

    override fun applyAnswerTo(answer: FireHydrantDiameter, changes: StringMapChangesBuilder) {
        changes.add("fire_hydrant:diameter", answer.osmValue)
    }
}
