package com.example.yosha.dataClass

import androidx.compose.ui.graphics.Color
import com.example.yosha.ui.theme.amber_050
import com.example.yosha.ui.theme.amber_100
import com.example.yosha.ui.theme.amber_200
import com.example.yosha.ui.theme.amber_300
import com.example.yosha.ui.theme.amber_400
import com.example.yosha.ui.theme.amber_500
import com.example.yosha.ui.theme.amber_600
import com.example.yosha.ui.theme.amber_700
import com.example.yosha.ui.theme.amber_800
import com.example.yosha.ui.theme.amber_900
import com.example.yosha.ui.theme.amber_a100
import com.example.yosha.ui.theme.amber_a200
import com.example.yosha.ui.theme.amber_a400
import com.example.yosha.ui.theme.amber_a700
import com.example.yosha.ui.theme.blue_050
import com.example.yosha.ui.theme.blue_100
import com.example.yosha.ui.theme.blue_200
import com.example.yosha.ui.theme.blue_300
import com.example.yosha.ui.theme.blue_400
import com.example.yosha.ui.theme.blue_500
import com.example.yosha.ui.theme.blue_600
import com.example.yosha.ui.theme.blue_700
import com.example.yosha.ui.theme.blue_800
import com.example.yosha.ui.theme.blue_900
import com.example.yosha.ui.theme.blue_a100
import com.example.yosha.ui.theme.blue_a200
import com.example.yosha.ui.theme.blue_a400
import com.example.yosha.ui.theme.blue_a700
import com.example.yosha.ui.theme.blue_grey_050
import com.example.yosha.ui.theme.blue_grey_100
import com.example.yosha.ui.theme.blue_grey_200
import com.example.yosha.ui.theme.blue_grey_300
import com.example.yosha.ui.theme.blue_grey_400
import com.example.yosha.ui.theme.blue_grey_500
import com.example.yosha.ui.theme.blue_grey_600
import com.example.yosha.ui.theme.blue_grey_700
import com.example.yosha.ui.theme.blue_grey_800
import com.example.yosha.ui.theme.blue_grey_900
import com.example.yosha.ui.theme.brown_050
import com.example.yosha.ui.theme.brown_100
import com.example.yosha.ui.theme.brown_200
import com.example.yosha.ui.theme.brown_300
import com.example.yosha.ui.theme.brown_400
import com.example.yosha.ui.theme.brown_500
import com.example.yosha.ui.theme.Brown_600
import com.example.yosha.ui.theme.brown_700
import com.example.yosha.ui.theme.brown_800
import com.example.yosha.ui.theme.brown_900
import com.example.yosha.ui.theme.cyan_050
import com.example.yosha.ui.theme.cyan_100
import com.example.yosha.ui.theme.cyan_200
import com.example.yosha.ui.theme.cyan_300
import com.example.yosha.ui.theme.cyan_400
import com.example.yosha.ui.theme.cyan_500
import com.example.yosha.ui.theme.cyan_600
import com.example.yosha.ui.theme.cyan_700
import com.example.yosha.ui.theme.cyan_800
import com.example.yosha.ui.theme.cyan_900
import com.example.yosha.ui.theme.cyan_a100
import com.example.yosha.ui.theme.cyan_a200
import com.example.yosha.ui.theme.cyan_a400
import com.example.yosha.ui.theme.cyan_a700
import com.example.yosha.ui.theme.deep_purple_050
import com.example.yosha.ui.theme.deep_purple_100
import com.example.yosha.ui.theme.deep_purple_200
import com.example.yosha.ui.theme.deep_purple_300
import com.example.yosha.ui.theme.deep_purple_400
import com.example.yosha.ui.theme.deep_purple_500
import com.example.yosha.ui.theme.deep_purple_600
import com.example.yosha.ui.theme.deep_purple_700
import com.example.yosha.ui.theme.deep_purple_800
import com.example.yosha.ui.theme.deep_purple_900
import com.example.yosha.ui.theme.deep_purple_a100
import com.example.yosha.ui.theme.deep_purple_a200
import com.example.yosha.ui.theme.deep_purple_a400
import com.example.yosha.ui.theme.deep_purple_a700
import com.example.yosha.ui.theme.deep_orange_050
import com.example.yosha.ui.theme.deep_orange_100
import com.example.yosha.ui.theme.deep_orange_200
import com.example.yosha.ui.theme.deep_orange_300
import com.example.yosha.ui.theme.deep_orange_400
import com.example.yosha.ui.theme.deep_orange_500
import com.example.yosha.ui.theme.deep_orange_600
import com.example.yosha.ui.theme.deep_orange_700
import com.example.yosha.ui.theme.deep_orange_800
import com.example.yosha.ui.theme.deep_orange_900
import com.example.yosha.ui.theme.deep_orange_a100
import com.example.yosha.ui.theme.deep_orange_a200
import com.example.yosha.ui.theme.deep_orange_a400
import com.example.yosha.ui.theme.deep_orange_a700
import com.example.yosha.ui.theme.grey_050
import com.example.yosha.ui.theme.grey_100
import com.example.yosha.ui.theme.grey_200
import com.example.yosha.ui.theme.grey_300
import com.example.yosha.ui.theme.grey_400
import com.example.yosha.ui.theme.grey_500
import com.example.yosha.ui.theme.grey_600
import com.example.yosha.ui.theme.grey_700
import com.example.yosha.ui.theme.grey_800
import com.example.yosha.ui.theme.grey_900
import com.example.yosha.ui.theme.grey_1000_b
import com.example.yosha.ui.theme.grey_1000_w
import com.example.yosha.ui.theme.green_050
import com.example.yosha.ui.theme.green_100
import com.example.yosha.ui.theme.green_200
import com.example.yosha.ui.theme.green_300
import com.example.yosha.ui.theme.green_400
import com.example.yosha.ui.theme.green_500
import com.example.yosha.ui.theme.green_600
import com.example.yosha.ui.theme.green_700
import com.example.yosha.ui.theme.green_800
import com.example.yosha.ui.theme.green_900
import com.example.yosha.ui.theme.green_a100
import com.example.yosha.ui.theme.green_a200
import com.example.yosha.ui.theme.green_a400
import com.example.yosha.ui.theme.green_a700
import com.example.yosha.ui.theme.indigo_050
import com.example.yosha.ui.theme.indigo_100
import com.example.yosha.ui.theme.indigo_200
import com.example.yosha.ui.theme.indigo_300
import com.example.yosha.ui.theme.indigo_400
import com.example.yosha.ui.theme.indigo_500
import com.example.yosha.ui.theme.indigo_600
import com.example.yosha.ui.theme.indigo_700
import com.example.yosha.ui.theme.indigo_800
import com.example.yosha.ui.theme.indigo_900
import com.example.yosha.ui.theme.indigo_a100
import com.example.yosha.ui.theme.indigo_a200
import com.example.yosha.ui.theme.indigo_a400
import com.example.yosha.ui.theme.indigo_a700
import com.example.yosha.ui.theme.light_blue_050
import com.example.yosha.ui.theme.light_blue_100
import com.example.yosha.ui.theme.light_blue_200
import com.example.yosha.ui.theme.light_blue_300
import com.example.yosha.ui.theme.light_blue_400
import com.example.yosha.ui.theme.light_blue_500
import com.example.yosha.ui.theme.light_blue_600
import com.example.yosha.ui.theme.light_blue_700
import com.example.yosha.ui.theme.light_blue_800
import com.example.yosha.ui.theme.light_blue_900
import com.example.yosha.ui.theme.light_blue_a100
import com.example.yosha.ui.theme.light_blue_a200
import com.example.yosha.ui.theme.light_blue_a400
import com.example.yosha.ui.theme.light_blue_a700
import com.example.yosha.ui.theme.light_green_050
import com.example.yosha.ui.theme.light_green_100
import com.example.yosha.ui.theme.light_green_200
import com.example.yosha.ui.theme.light_green_300
import com.example.yosha.ui.theme.light_green_400
import com.example.yosha.ui.theme.light_green_500
import com.example.yosha.ui.theme.light_green_600
import com.example.yosha.ui.theme.light_green_700
import com.example.yosha.ui.theme.light_green_800
import com.example.yosha.ui.theme.light_green_900
import com.example.yosha.ui.theme.light_green_a100
import com.example.yosha.ui.theme.light_green_a200
import com.example.yosha.ui.theme.light_green_a400
import com.example.yosha.ui.theme.light_green_a700
import com.example.yosha.ui.theme.lime_050
import com.example.yosha.ui.theme.lime_100
import com.example.yosha.ui.theme.lime_200
import com.example.yosha.ui.theme.lime_300
import com.example.yosha.ui.theme.lime_400
import com.example.yosha.ui.theme.lime_500
import com.example.yosha.ui.theme.lime_600
import com.example.yosha.ui.theme.lime_700
import com.example.yosha.ui.theme.lime_800
import com.example.yosha.ui.theme.lime_900
import com.example.yosha.ui.theme.lime_a100
import com.example.yosha.ui.theme.lime_a200
import com.example.yosha.ui.theme.lime_a400
import com.example.yosha.ui.theme.lime_a700
import com.example.yosha.ui.theme.orange_050
import com.example.yosha.ui.theme.orange_100
import com.example.yosha.ui.theme.orange_200
import com.example.yosha.ui.theme.orange_300
import com.example.yosha.ui.theme.orange_400
import com.example.yosha.ui.theme.orange_500
import com.example.yosha.ui.theme.orange_600
import com.example.yosha.ui.theme.orange_700
import com.example.yosha.ui.theme.orange_800
import com.example.yosha.ui.theme.orange_900
import com.example.yosha.ui.theme.orange_a100
import com.example.yosha.ui.theme.orange_a200
import com.example.yosha.ui.theme.orange_a400
import com.example.yosha.ui.theme.orange_a700
import com.example.yosha.ui.theme.pink_050
import com.example.yosha.ui.theme.pink_100
import com.example.yosha.ui.theme.pink_200
import com.example.yosha.ui.theme.pink_300
import com.example.yosha.ui.theme.pink_400
import com.example.yosha.ui.theme.pink_500
import com.example.yosha.ui.theme.pink_600
import com.example.yosha.ui.theme.pink_700
import com.example.yosha.ui.theme.pink_800
import com.example.yosha.ui.theme.pink_900
import com.example.yosha.ui.theme.pink_a100
import com.example.yosha.ui.theme.pink_a200
import com.example.yosha.ui.theme.pink_a400
import com.example.yosha.ui.theme.pink_a700
import com.example.yosha.ui.theme.purple_050
import com.example.yosha.ui.theme.purple_100
import com.example.yosha.ui.theme.purple_200
import com.example.yosha.ui.theme.purple_300
import com.example.yosha.ui.theme.purple_400
import com.example.yosha.ui.theme.purple_500
import com.example.yosha.ui.theme.purple_600
import com.example.yosha.ui.theme.purple_700
import com.example.yosha.ui.theme.purple_800
import com.example.yosha.ui.theme.purple_900
import com.example.yosha.ui.theme.purple_a100
import com.example.yosha.ui.theme.purple_a200
import com.example.yosha.ui.theme.purple_a400
import com.example.yosha.ui.theme.purple_a700
import com.example.yosha.ui.theme.red_050
import com.example.yosha.ui.theme.red_100
import com.example.yosha.ui.theme.red_200
import com.example.yosha.ui.theme.red_300
import com.example.yosha.ui.theme.red_400
import com.example.yosha.ui.theme.red_500
import com.example.yosha.ui.theme.red_600
import com.example.yosha.ui.theme.red_700
import com.example.yosha.ui.theme.red_800
import com.example.yosha.ui.theme.red_900
import com.example.yosha.ui.theme.red_a100
import com.example.yosha.ui.theme.red_a200
import com.example.yosha.ui.theme.red_a400
import com.example.yosha.ui.theme.red_a700
import com.example.yosha.ui.theme.teal_050
import com.example.yosha.ui.theme.teal_100
import com.example.yosha.ui.theme.teal_200
import com.example.yosha.ui.theme.teal_300
import com.example.yosha.ui.theme.teal_400
import com.example.yosha.ui.theme.teal_500
import com.example.yosha.ui.theme.teal_600
import com.example.yosha.ui.theme.teal_700
import com.example.yosha.ui.theme.teal_800
import com.example.yosha.ui.theme.teal_900
import com.example.yosha.ui.theme.teal_a100
import com.example.yosha.ui.theme.teal_a200
import com.example.yosha.ui.theme.teal_a400
import com.example.yosha.ui.theme.teal_a700
import com.example.yosha.ui.theme.yellow_050
import com.example.yosha.ui.theme.yellow_100
import com.example.yosha.ui.theme.yellow_200
import com.example.yosha.ui.theme.yellow_300
import com.example.yosha.ui.theme.yellow_400
import com.example.yosha.ui.theme.yellow_500
import com.example.yosha.ui.theme.yellow_600
import com.example.yosha.ui.theme.yellow_700
import com.example.yosha.ui.theme.yellow_800
import com.example.yosha.ui.theme.yellow_900
import com.example.yosha.ui.theme.yellow_a100
import com.example.yosha.ui.theme.yellow_a200
import com.example.yosha.ui.theme.yellow_a400
import com.example.yosha.ui.theme.yellow_a700

data class DataTextColorButton(val name:String,val color:Color)
val ListDataColor= listOf(

            DataTextColorButton("amber_050",amber_050),
            DataTextColorButton("amber_100",amber_100),
            DataTextColorButton("amber_200",amber_200),
            DataTextColorButton("amber_300",amber_300),
            DataTextColorButton("amber_400",amber_400),
            DataTextColorButton("amber_500",amber_500),
            DataTextColorButton("amber_600",amber_600),
            DataTextColorButton("amber_700",amber_700),
            DataTextColorButton("amber_800",amber_800),
            DataTextColorButton("amber_900",amber_900),
            DataTextColorButton("amber_a100",amber_a100),
            DataTextColorButton("amber_a200",amber_a200),
            DataTextColorButton("amber_a400",amber_a400),
            DataTextColorButton("amber_a700",amber_a700),
            DataTextColorButton("blue_050",blue_050),
            DataTextColorButton("blue_100",blue_100),
            DataTextColorButton("blue_200",blue_200),
            DataTextColorButton("blue_300",blue_300),
            DataTextColorButton("blue_400",blue_400),
            DataTextColorButton("blue_500",blue_500),
            DataTextColorButton("blue_600",blue_600),
            DataTextColorButton("blue_700",blue_700),
            DataTextColorButton("blue_800",blue_800),
            DataTextColorButton("blue_900",blue_900),
            DataTextColorButton("blue_a100",blue_a100),
            DataTextColorButton("blue_a200",blue_a200),
            DataTextColorButton("blue_a400",blue_a400),
            DataTextColorButton("blue_a700",blue_a700),
            DataTextColorButton("blue_grey_050",blue_grey_050),
            DataTextColorButton("blue_grey_100",blue_grey_100),
            DataTextColorButton("blue_grey_200",blue_grey_200),
            DataTextColorButton("blue_grey_300",blue_grey_300),
            DataTextColorButton("blue_grey_400",blue_grey_400),
            DataTextColorButton("blue_grey_500",blue_grey_500),
            DataTextColorButton("blue_grey_600",blue_grey_600),
            DataTextColorButton("blue_grey_700",blue_grey_700),
            DataTextColorButton("blue_grey_800",blue_grey_800),
            DataTextColorButton("blue_grey_900",blue_grey_900),
            DataTextColorButton("brown_050",brown_050),
            DataTextColorButton("brown_100",brown_100),
            DataTextColorButton("brown_200",brown_200),
            DataTextColorButton("brown_300",brown_300),
            DataTextColorButton("brown_400",brown_400),
            DataTextColorButton("brown_500",brown_500),
            DataTextColorButton("Brown_600",Brown_600),
            DataTextColorButton("brown_700",brown_700),
            DataTextColorButton("brown_800",brown_800),
            DataTextColorButton("brown_900",brown_900),
            DataTextColorButton("cyan_050",cyan_050),
            DataTextColorButton("cyan_100",cyan_100),
            DataTextColorButton("cyan_200",cyan_200),
            DataTextColorButton("cyan_300",cyan_300),
            DataTextColorButton("cyan_400",cyan_400),
            DataTextColorButton("cyan_500",cyan_500),
            DataTextColorButton("cyan_600",cyan_600),
            DataTextColorButton("cyan_700",cyan_700),
            DataTextColorButton("cyan_800",cyan_800),
            DataTextColorButton("cyan_900",cyan_900),
            DataTextColorButton("cyan_a100",cyan_a100),
            DataTextColorButton("cyan_a200",cyan_a200),
            DataTextColorButton("cyan_a400",cyan_a400),
            DataTextColorButton("cyan_a700",cyan_a700),
            DataTextColorButton("deep_purple_050",deep_purple_050),
            DataTextColorButton("deep_purple_100",deep_purple_100),
            DataTextColorButton("deep_purple_200",deep_purple_200),
            DataTextColorButton("deep_purple_300",deep_purple_300),
            DataTextColorButton("deep_purple_400",deep_purple_400),
            DataTextColorButton("deep_purple_500",deep_purple_500),
            DataTextColorButton("deep_purple_600",deep_purple_600),
            DataTextColorButton("deep_purple_700",deep_purple_700),
            DataTextColorButton("deep_purple_800",deep_purple_800),
            DataTextColorButton("deep_purple_900",deep_purple_900),
            DataTextColorButton("deep_purple_a100",deep_purple_a100),
            DataTextColorButton("deep_purple_a200",deep_purple_a200),
            DataTextColorButton("deep_purple_a400",deep_purple_a400),
            DataTextColorButton("deep_purple_a700",deep_purple_a700),
            DataTextColorButton("deep_orange_050",deep_orange_050),
            DataTextColorButton("deep_orange_100",deep_orange_100),
            DataTextColorButton("deep_orange_200",deep_orange_200),
            DataTextColorButton("deep_orange_300",deep_orange_300),
            DataTextColorButton("deep_orange_400",deep_orange_400),
            DataTextColorButton("deep_orange_500",deep_orange_500),
            DataTextColorButton("deep_orange_600",deep_orange_600),
            DataTextColorButton("deep_orange_700",deep_orange_700),
            DataTextColorButton("deep_orange_800",deep_orange_800),
            DataTextColorButton("deep_orange_900",deep_orange_900),
            DataTextColorButton("deep_orange_a100",deep_orange_a100),
            DataTextColorButton("deep_orange_a200",deep_orange_a200),
            DataTextColorButton("deep_orange_a400",deep_orange_a400),
            DataTextColorButton("deep_orange_a700",deep_orange_a700),
            DataTextColorButton("grey_050",grey_050),
            DataTextColorButton("grey_100",grey_100),
            DataTextColorButton("grey_200",grey_200),
            DataTextColorButton("grey_300",grey_300),
            DataTextColorButton("grey_400",grey_400),
            DataTextColorButton("grey_500",grey_500),
            DataTextColorButton("grey_600",grey_600),
            DataTextColorButton("grey_700",grey_700),
            DataTextColorButton("grey_800",grey_800),
            DataTextColorButton("grey_900",grey_900),
            DataTextColorButton("grey_1000_b",grey_1000_b),
            DataTextColorButton("grey_1000_w",grey_1000_w),
            DataTextColorButton("green_050",green_050),
            DataTextColorButton("green_100",green_100),
            DataTextColorButton("green_200",green_200),
            DataTextColorButton("green_300",green_300),
            DataTextColorButton("green_400",green_400),
            DataTextColorButton("green_500",green_500),
            DataTextColorButton("green_600",green_600),
            DataTextColorButton("green_700",green_700),
            DataTextColorButton("green_800",green_800),
            DataTextColorButton("green_900",green_900),
            DataTextColorButton("green_a100",green_a100),
            DataTextColorButton("green_a200",green_a200),
            DataTextColorButton("green_a400",green_a400),
            DataTextColorButton("green_a700",green_a700),
            DataTextColorButton("indigo_050",indigo_050),
            DataTextColorButton("indigo_100",indigo_100),
            DataTextColorButton("indigo_200",indigo_200),
            DataTextColorButton("indigo_300",indigo_300),
            DataTextColorButton("indigo_400",indigo_400),
            DataTextColorButton("indigo_500",indigo_500),
            DataTextColorButton("indigo_600",indigo_600),
            DataTextColorButton("indigo_700",indigo_700),
            DataTextColorButton("indigo_800",indigo_800),
            DataTextColorButton("indigo_900",indigo_900),
            DataTextColorButton("indigo_a100",indigo_a100),
            DataTextColorButton("indigo_a200",indigo_a200),
            DataTextColorButton("indigo_a400",indigo_a400),
            DataTextColorButton("indigo_a700",indigo_a700),
            DataTextColorButton("light_blue_050",light_blue_050),
            DataTextColorButton("light_blue_100",light_blue_100),
            DataTextColorButton("light_blue_200",light_blue_200),
            DataTextColorButton("light_blue_300",light_blue_300),
            DataTextColorButton("light_blue_400",light_blue_400),
            DataTextColorButton("light_blue_500",light_blue_500),
            DataTextColorButton("light_blue_600",light_blue_600),
            DataTextColorButton("light_blue_700",light_blue_700),
            DataTextColorButton("light_blue_800",light_blue_800),
            DataTextColorButton("light_blue_900",light_blue_900),
            DataTextColorButton("light_blue_a100",light_blue_a100),
            DataTextColorButton("light_blue_a200",light_blue_a200),
            DataTextColorButton("light_blue_a400",light_blue_a400),
            DataTextColorButton("light_blue_a700",light_blue_a700),
            DataTextColorButton("light_green_050",light_green_050),
            DataTextColorButton("light_green_100",light_green_100),
            DataTextColorButton("light_green_200",light_green_200),
            DataTextColorButton("light_green_300",light_green_300),
            DataTextColorButton("light_green_400",light_green_400),
            DataTextColorButton("light_green_500",light_green_500),
            DataTextColorButton("light_green_600",light_green_600),
            DataTextColorButton("light_green_700",light_green_700),
            DataTextColorButton("light_green_800",light_green_800),
            DataTextColorButton("light_green_900",light_green_900),
            DataTextColorButton("light_green_a100",light_green_a100),
            DataTextColorButton("light_green_a200",light_green_a200),
            DataTextColorButton("light_green_a400",light_green_a400),
            DataTextColorButton("light_green_a700",light_green_a700),
            DataTextColorButton("lime_050",lime_050),
            DataTextColorButton("lime_100",lime_100),
            DataTextColorButton("lime_200",lime_200),
            DataTextColorButton("lime_300",lime_300),
            DataTextColorButton("lime_400",lime_400),
            DataTextColorButton("lime_500",lime_500),
            DataTextColorButton("lime_600",lime_600),
            DataTextColorButton("lime_700",lime_700),
            DataTextColorButton("lime_800",lime_800),
            DataTextColorButton("lime_900",lime_900),
            DataTextColorButton("lime_a100",lime_a100),
            DataTextColorButton("lime_a200",lime_a200),
            DataTextColorButton("lime_a400",lime_a400),
            DataTextColorButton("lime_a700",lime_a700),
            DataTextColorButton("orange_050",orange_050),
            DataTextColorButton("orange_100",orange_100),
            DataTextColorButton("orange_200",orange_200),
            DataTextColorButton("orange_300",orange_300),
            DataTextColorButton("orange_400",orange_400),
            DataTextColorButton("orange_500",orange_500),
            DataTextColorButton("orange_600",orange_600),
            DataTextColorButton("orange_700",orange_700),
            DataTextColorButton("orange_800",orange_800),
            DataTextColorButton("orange_900",orange_900),
            DataTextColorButton("orange_a100",orange_a100),
            DataTextColorButton("orange_a200",orange_a200),
            DataTextColorButton("orange_a400",orange_a400),
            DataTextColorButton("orange_a700",orange_a700),
            DataTextColorButton("pink_050",pink_050),
            DataTextColorButton("pink_100",pink_100),
            DataTextColorButton("pink_200",pink_200),
            DataTextColorButton("pink_300",pink_300),
            DataTextColorButton("pink_400",pink_400),
            DataTextColorButton("pink_500",pink_500),
            DataTextColorButton("pink_600",pink_600),
            DataTextColorButton("pink_700",pink_700),
            DataTextColorButton("pink_800",pink_800),
            DataTextColorButton("pink_900",pink_900),
            DataTextColorButton("pink_a100",pink_a100),
            DataTextColorButton("pink_a200",pink_a200),
            DataTextColorButton("pink_a400",pink_a400),
            DataTextColorButton("pink_a700",pink_a700),
            DataTextColorButton("purple_050",purple_050),
            DataTextColorButton("purple_100",purple_100),
            DataTextColorButton("purple_200",purple_200),
            DataTextColorButton("purple_300",purple_300),
            DataTextColorButton("purple_400",purple_400),
            DataTextColorButton("purple_500",purple_500),
            DataTextColorButton("purple_600",purple_600),
            DataTextColorButton("purple_700",purple_700),
            DataTextColorButton("purple_800",purple_800),
            DataTextColorButton("purple_900",purple_900),
            DataTextColorButton("purple_a100",purple_a100),
            DataTextColorButton("purple_a200",purple_a200),
            DataTextColorButton("purple_a400",purple_a400),
            DataTextColorButton("purple_a700",purple_a700),
            DataTextColorButton("red_050",red_050),
            DataTextColorButton("red_100",red_100),
            DataTextColorButton("red_200",red_200),
            DataTextColorButton("red_300",red_300),
            DataTextColorButton("red_400",red_400),
            DataTextColorButton("red_500",red_500),
            DataTextColorButton("red_600",red_600),
            DataTextColorButton("red_700",red_700),
            DataTextColorButton("red_800",red_800),
            DataTextColorButton("red_900",red_900),
            DataTextColorButton("red_a100",red_a100),
            DataTextColorButton("red_a200",red_a200),
            DataTextColorButton("red_a400",red_a400),
            DataTextColorButton("red_a700",red_a700),
            DataTextColorButton("teal_050",teal_050),
            DataTextColorButton("teal_100",teal_100),
            DataTextColorButton("teal_200",teal_200),
            DataTextColorButton("teal_300",teal_300),
            DataTextColorButton("teal_400",teal_400),
            DataTextColorButton("teal_500",teal_500),
            DataTextColorButton("teal_600",teal_600),
            DataTextColorButton("teal_700",teal_700),
            DataTextColorButton("teal_800",teal_800),
            DataTextColorButton("teal_900",teal_900),
            DataTextColorButton("teal_a100",teal_a100),
            DataTextColorButton("teal_a200",teal_a200),
            DataTextColorButton("teal_a400",teal_a400),
            DataTextColorButton("teal_a700",teal_a700),
            DataTextColorButton("yellow_050",yellow_050),
            DataTextColorButton("yellow_100",yellow_100),
            DataTextColorButton("yellow_200",yellow_200),
            DataTextColorButton("yellow_300",yellow_300),
            DataTextColorButton("yellow_400",yellow_400),
            DataTextColorButton("yellow_500",yellow_500),
            DataTextColorButton("yellow_600",yellow_600),
            DataTextColorButton("yellow_700",yellow_700),
            DataTextColorButton("yellow_800",yellow_800),
            DataTextColorButton("yellow_900",yellow_900),
            DataTextColorButton("yellow_a100",yellow_a100),
            DataTextColorButton("yellow_a200",yellow_a200),
            DataTextColorButton("yellow_a400",yellow_a400),
            DataTextColorButton("yellow_a700",yellow_a700),



































































































































































































































































)