package Game.GameStates;


import Main.Handler;
import Resources.Images;
import Display.UI.ClickListlener;
import Display.UI.UIImageButton;
import Display.UI.UIManager;

import java.awt.*;

/**
 * Created by AlexVR on 7/1/2018.
 */
public class MenuState extends State {

    private UIManager uiManager;

    public MenuState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUimanager(uiManager);


//<<<<<<< HEAD
//        uiManager.addObjects(new UIImageButton(handler.getWidth()/2+70, 250, 186, 66, Images.butstart, new ClickListlener() {
//=======
        uiManager.addObjects(new UIImageButton(handler.getWidth()/2-55, 190, 186, 66, Images.butstart, new ClickListlener() {
//>>>>>>> branch 'master' of https://github.com/uprm-ciic4010-f19/pa-2-dinner-dash-exceptionalfood.git
            @Override
            public void onClick() {
                handler.getMouseManager().setUimanager(null);
                handler.getGame().reStart();
                State.setState(handler.getGame().gameState);
            }
        }));
    }

    @Override
    public void tick() {
        handler.getMouseManager().setUimanager(uiManager);
        uiManager.tick();

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(0,0,handler.getWidth(),handler.getHeight());
        g.drawImage(Images.title,0,0,handler.getWidth(),handler.getHeight(),null);
        uiManager.Render(g);

    }


}
