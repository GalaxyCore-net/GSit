package dev.geco.gsit.mcv.v1_17_R1_2.objects;

import net.minecraft.world.entity.decoration.*;
import net.minecraft.world.level.Level;

public class SeatEntity extends ArmorStand {

    public SeatEntity(Level world, double d0, double d1, double d2) {
        super(world, d0, d1, d2);
        setInvisible(true);
        setNoGravity(true);
        setMarker(true);
        setInvulnerable(true);
        setSmall(true);
        setNoBasePlate(true);
    }

    public boolean canChangeDimensions() { return false; }

    public boolean isAffectedByFluids() { return false; }

    public boolean isSensitiveToWater() { return false; }

    public boolean rideableUnderWater() { return true; }

}