package com.justai.jaicf.examples.citiesgame

import com.justai.jaicf.BotEngine
import com.justai.jaicf.activator.caila.CailaIntentActivator
import com.justai.jaicf.activator.catchall.CatchAllActivator
import com.justai.jaicf.activator.event.BaseEventActivator
import com.justai.jaicf.activator.regex.RegexActivator

val cailaIntentActivator = CailaIntentActivator.Factory(nluSettings)

val citiesGameBot = BotEngine(
    CitiesGameBotModule().model,
    activators = arrayOf(
        BaseEventActivator,
        RegexActivator,
        cailaIntentActivator,
        CatchAllActivator
    )
)
