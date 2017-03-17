package Controller;

import java.awt.event.ActionListener;

/**
 * Created by timothysmith on 2017-03-16.
 */
public abstract class AbstractController {
    // Controller-tree mechanism
    abstract protected void initFrame(AbstractController controller, AbstractController parent);
}
