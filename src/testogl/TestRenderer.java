/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testogl;

import javax.media.opengl.DebugGL;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLEventListener;

public class TestRenderer implements GLEventListener {

    private GL gl;
    private GLDrawable glDrawable;

    @Override
    public void init(GLAutoDrawable glad) {
        this.gl = glad.getGL();
        this.glDrawable = glad;

        glad.setGL(new DebugGL(gl));

        System.out.println("Init GL is " + gl.getClass().getName());
    }

    @Override
    public void display(GLAutoDrawable glad) {
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();

        gl.glColor3f(1.0f, 0.0f, 0.0f);

        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {
    }

    @Override
    public void displayChanged(GLAutoDrawable glad, boolean bln, boolean bln1) {
    }
}