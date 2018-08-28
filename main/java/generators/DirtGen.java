package generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class DirtGen implements IWorldGenerator {

	private Block block;
	
	public DirtGen(Block block) {
		// TODO Auto-generated constructor stub
		this.block= block;
	}
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World
			world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		for(int i=0;i < 450;i++ ) {
			
			int x = chunkX * 16 + random.nextInt(16);
			int y = 15 + random.nextInt(145);
			int z = chunkZ * 16 + random.nextInt(16);
			WorldGenMinable wgm = new
		WorldGenMinable(block.getDefaultState(),7);
			wgm.generate(world, random, new BlockPos(x,y,z));	
			
		}
	}
}
