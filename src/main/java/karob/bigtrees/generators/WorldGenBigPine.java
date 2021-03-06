package karob.bigtrees.generators;

import java.util.Random;

import net.minecraft.world.World;

public class WorldGenBigPine extends KWorldGenBigTree{

	public WorldGenBigPine(boolean flag) {
		super(flag);
	}
	
	public boolean generate(World world, Random random, int x, int y, int z)
    {
		heightAttenuation = 0.3D; //Trunk Percentage Height
        scaleWidth = 1.2D; //Branch Length
        trunkSize = 3; //Trunk Width
        heightLimitLimit = 3; //Height Variation
        leafDistanceLimit = 4; //Leaf Thickness
		return super.generate(world, random, x, y, z);
	}
}