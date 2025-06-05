package curso_Udemy.Practice_Time_5_16

import curso_Udemy.Practice_Time_5_11.Materials.BaseBuildingMaterial
import curso_Udemy.Practice_Time_5_11.Materials.Building

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

