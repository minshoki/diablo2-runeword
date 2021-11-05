package shoki.com.diabloruneword.model

import shoki.com.diabloruneword.db.rune.RuneEntity

data class RuneModel(
    val index: Int,
    val name: MultilingualModel,
    val weaponEffect: MultilingualModel,
    val etcEffect: MultilingualModel
) {

    companion object {
        fun convert(entity: RuneEntity): RuneModel {
            return RuneModel(
                index = entity.index,
                name = MultilingualModel(
                    kor = entity.korName,
                    en = entity.enName
                ),
                weaponEffect = MultilingualModel(
                    kor = entity.korWeaponEffect,
                    en = entity.enWeaponEffect
                ),
                etcEffect = MultilingualModel(
                    kor = entity.korEtcEffect,
                    en = entity.enEtcEffect
                )
            )
        }
    }
}