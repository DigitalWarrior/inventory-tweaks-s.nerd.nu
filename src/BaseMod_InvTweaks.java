import net.minecraft.client.Minecraft;

public abstract class BaseMod_InvTweaks {

	public abstract void load();

	public abstract String getVersion();

	public abstract void keyboardEvent(afp keyBinding);

	public abstract boolean onTickInGame(float clock, Minecraft minecraft);

	public abstract boolean onTickInGUI(float clock, Minecraft minecraft, vl guiScreen);

	public abstract void onItemPickup(yr entityplayer, aai stack);

}