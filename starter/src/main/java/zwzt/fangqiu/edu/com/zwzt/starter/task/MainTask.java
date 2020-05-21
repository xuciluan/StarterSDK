package zwzt.fangqiu.edu.com.zwzt.starter.task;

public abstract class MainTask extends Task {

    @Override
    public boolean runOnMainThread() {
        return true;
    }
}
