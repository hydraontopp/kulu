package dev.hydraontopp.client.feature.module.client;

import dev.hydraontopp.client.feature.module.Category;
import dev.hydraontopp.client.feature.module.Module;
import dev.hydraontopp.client.ui.editor.GuiEditor;
import dev.hydraontopp.client.utils.client.MessageBus;
import org.lwjgl.input.Keyboard;

public class HUDEditor extends Module {

	public HUDEditor() {
		super("HUDEditor", "Enables the heads-up display editor.", Category.CLIENT, Keyboard.KEY_P);
	}

	@Override
	public void onEnable() {
		mc.displayGuiScreen(new GuiEditor());
		MessageBus.sendDebugMessage("GuiEditor enabled");
	}

	@Override
	public void onDisable() {

	}

}
