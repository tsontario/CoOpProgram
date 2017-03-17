package Controller;

/**
 * Created by timothysmith on 2017-03-17.
 */
public class UserLogInController extends AbstractController {

    AbstractController controller;
    AbstractController parent;

    @Override
    protected void initFrame(AbstractController controller, AbstractController parent) {
        this.parent = parent;
        this.controller = controller;
        initFrame();
    }

    private void initFrame() {

    }
}
