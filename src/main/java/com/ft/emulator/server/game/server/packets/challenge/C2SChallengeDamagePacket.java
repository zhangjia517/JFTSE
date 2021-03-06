package com.ft.emulator.server.game.server.packets.challenge;

import com.ft.emulator.server.game.server.Packet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class C2SChallengeDamagePacket extends Packet {

    private byte player;
    private int dmg;

    public C2SChallengeDamagePacket(Packet packet) {

        super(packet);

        this.player = this.readByte();
        this.dmg = this.readInt();
    }
}