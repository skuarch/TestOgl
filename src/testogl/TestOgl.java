package testogl;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.swing.JFrame;

/**
 *
 * @author skuarch
 */
public class TestOgl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(new Dimension(400, 400));

        GLCapabilities glCaps = new GLCapabilities();
        glCaps.setRedBits(16); 
        glCaps.setBlueBits(16);
        glCaps.setGreenBits(16);
        glCaps.setAlphaBits(16);

        GLCanvas canvas = new GLCanvas(glCaps);

        jframe.add(canvas);

        canvas.addGLEventListener(new TestRenderer());

        final Animator animator = new Animator(canvas);
        jframe.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                animator.stop();
                System.exit(0);
            }
        });
        
        animator.start();
        jframe.setVisible(true);

    }
}
