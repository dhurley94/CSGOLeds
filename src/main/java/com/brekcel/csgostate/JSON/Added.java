
package com.brekcel.csgostate.JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

//Added is currently bugged, sometimes returning boolean values instead of the expected Object
@Generated("org.jsonschema2pojo")
public class Added {

    @SerializedName("player")
    @Expose
    private Player player;

    /**
     *
     * @return
     *     The player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     *
     * @param player
     *     The player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
}
