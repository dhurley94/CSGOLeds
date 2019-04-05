# CSGOLeds-arduino

> CSGO + Java + Arduino + Leds  

## Software Dependencies

* [https://github.com/Brekcel/CSGOState](https://github.com/Brekcel/CSGOState)
* [https://github.com/google/gson](https://github.com/google/gson)

## Configuration CSGO

You must also have a valid gamestate_integration_x.cfg file in your [Counter-Strike Global Offensive]\csgo\cfg\ folder. A blank gamestate_integration file is provided here:

* **CSGOState Test v0.1**
```json
{
 "uri" "http://127.0.0.1:1338"
 "timeout" "5.0"
 "data"
 {
   "provider"            "1"
   "map"                 "1"
   "round"               "1"
   "player_id"           "1"
   "player_state"        "1"
   "player_weapons"      "1"
   "player_match_stats"  "1"
 }
}
```


The CSGO data is collected thanks to the Brekcel code. Link to your repository: https://github.com/Brekcel/CSGOState

For now it does not work.
