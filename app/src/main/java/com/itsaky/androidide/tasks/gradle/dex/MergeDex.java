package com.itsaky.androidide.tasks.gradle.dex;

import com.itsaky.androidide.R;
import com.itsaky.androidide.app.StudioApp;
import com.itsaky.androidide.services.IDEService;
import com.itsaky.androidide.tasks.BaseGradleTask;
import java.io.File;
import java.util.List;
import java.util.Arrays;

public class MergeDex extends BaseGradleTask {

	@Override
	public String getName() {
		return StudioApp.getInstance().getString(R.string.task_merge_dex);
	}
    
    @Override
	public String getCommands() {
		return "mergeDexDebug";
	}

    @Override
    public List<String> getTasks() {
        return Arrays.asList("mergeDexDebug");
    }

	@Override
	public int getTaskID() {
		return IDEService.TASK_DEX;
	}

	@Override
	public boolean canOutput() {
		return true;
	}

	@Override
	public boolean buildsApk() {
		return false;
	}

	@Override
	public File getApk(String buildFolder, String moduleName) {
		return null;
	}

	@Override
	public Type getType() {
		return Type.OTHER;
	}
}
