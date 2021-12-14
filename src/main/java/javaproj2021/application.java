package javaproj2021;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class application extends javax.swing.JFrame {
    
    Color currentcolor;
    Color prevcolor;
    
    int isEraser;
    int isRect;
    int isOval;
    
    int sizeofbrush;
    int opacity;
    
    int rx,ry,rw,rh;
    
    static int fileNumber = 0;

    public application() {
        initComponents();
        currentcolor=Color.BLACK;
        prevcolor=Color.BLACK;
        sizeofbrush=20;
        opacity=255;
        isEraser=0;
        rx=ry=rw=rh=0;
        isRect=0;
        isOval=0;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolbar_panel = new javax.swing.JPanel();
        main_tools = new javax.swing.JPanel();
        brush_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        erase_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        color_tools = new javax.swing.JPanel();
        green_btn = new javax.swing.JButton();
        yellow_btn = new javax.swing.JButton();
        orange_btn = new javax.swing.JButton();
        red_btn = new javax.swing.JButton();
        moreColors_btn = new javax.swing.JButton();
        rect_btn = new javax.swing.JButton();
        oval_btn = new javax.swing.JButton();
        slider_tools = new javax.swing.JPanel();
        size_slider = new javax.swing.JSlider();
        opacity_slider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        canvas_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toolbar_panel.setBackground(new java.awt.Color(153, 153, 255));

        main_tools.setBackground(new java.awt.Color(255, 204, 153));

        brush_btn.setText("Brush");
        brush_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brush_btnActionPerformed(evt);
            }
        });

        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        erase_btn.setText("Eraser");
        erase_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erase_btnActionPerformed(evt);
            }
        });

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_toolsLayout = new javax.swing.GroupLayout(main_tools);
        main_tools.setLayout(main_toolsLayout);
        main_toolsLayout.setHorizontalGroup(
            main_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_toolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(brush_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(erase_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_toolsLayout.setVerticalGroup(
            main_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_toolsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(brush_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erase_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save_btn)
                .addGap(35, 35, 35))
        );

        green_btn.setBackground(new java.awt.Color(0, 153, 51));
        green_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green_btnActionPerformed(evt);
            }
        });

        yellow_btn.setBackground(new java.awt.Color(255, 255, 0));
        yellow_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellow_btnActionPerformed(evt);
            }
        });

        orange_btn.setBackground(new java.awt.Color(255, 153, 51));
        orange_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orange_btnActionPerformed(evt);
            }
        });

        red_btn.setBackground(new java.awt.Color(255, 51, 51));
        red_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red_btnActionPerformed(evt);
            }
        });

        moreColors_btn.setText("More Colors");
        moreColors_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreColors_btnActionPerformed(evt);
            }
        });

        rect_btn.setText("rectangle");
        rect_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rect_btnActionPerformed(evt);
            }
        });

        oval_btn.setText("oval");
        oval_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oval_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout color_toolsLayout = new javax.swing.GroupLayout(color_tools);
        color_tools.setLayout(color_toolsLayout);
        color_toolsLayout.setHorizontalGroup(
            color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(color_toolsLayout.createSequentialGroup()
                .addGroup(color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(color_toolsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moreColors_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(color_toolsLayout.createSequentialGroup()
                                .addGroup(color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(green_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(color_toolsLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(yellow_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(color_toolsLayout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(orange_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(color_toolsLayout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(red_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(color_toolsLayout.createSequentialGroup()
                        .addComponent(rect_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oval_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        color_toolsLayout.setVerticalGroup(
            color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(color_toolsLayout.createSequentialGroup()
                .addGroup(color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(color_toolsLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(red_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(color_toolsLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rect_btn)
                            .addComponent(oval_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(color_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orange_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yellow_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(green_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moreColors_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        size_slider.setValue(20);
        size_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                size_sliderStateChanged(evt);
            }
        });

        opacity_slider.setMaximum(255);
        opacity_slider.setValue(255);
        opacity_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opacity_sliderStateChanged(evt);
            }
        });

        jLabel1.setText("Size");

        jLabel2.setText("opacity");

        javax.swing.GroupLayout slider_toolsLayout = new javax.swing.GroupLayout(slider_tools);
        slider_tools.setLayout(slider_toolsLayout);
        slider_toolsLayout.setHorizontalGroup(
            slider_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slider_toolsLayout.createSequentialGroup()
                .addGroup(slider_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slider_toolsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opacity_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(slider_toolsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(slider_toolsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(size_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(slider_toolsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        slider_toolsLayout.setVerticalGroup(
            slider_toolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slider_toolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(size_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opacity_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout toolbar_panelLayout = new javax.swing.GroupLayout(toolbar_panel);
        toolbar_panel.setLayout(toolbar_panelLayout);
        toolbar_panelLayout.setHorizontalGroup(
            toolbar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbar_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toolbar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slider_tools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main_tools, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color_tools, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toolbar_panelLayout.setVerticalGroup(
            toolbar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbar_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(main_tools, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider_tools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(color_tools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(toolbar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        canvas_panel.setBackground(new java.awt.Color(255, 255, 255));
        canvas_panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas_panelMouseDragged(evt);
            }
        });
        canvas_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas_panelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvas_panelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout canvas_panelLayout = new javax.swing.GroupLayout(canvas_panel);
        canvas_panel.setLayout(canvas_panelLayout);
        canvas_panelLayout.setHorizontalGroup(
            canvas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        canvas_panelLayout.setVerticalGroup(
            canvas_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(canvas_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 760, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static BufferedImage createImage(JPanel panel) {

        /*
    int w = panel.getWidth();
    int h = panel.getHeight();
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = bi.createGraphics();
    panel.print(bi.getGraphics());
    g.dispose();
    return bi;
    */
    try
    {
    int x=(int)panel.getLocationOnScreen().getX();
    int y=(int)panel.getLocationOnScreen().getY();
    int w = panel.getWidth();
    int h = panel.getHeight();
    Rectangle capture = new Rectangle(x,y,w,h);
    Robot robot= new Robot();
    BufferedImage image=robot.createScreenCapture(capture);
    return image;
    }
    catch(AWTException ex)
    {
        System.out.println(ex);
    }
    return null;
    }
    
    private int SaveImage(BufferedImage image,String name)
    {
        try {
   
    File outputfile = new File(name+".png");
    ImageIO.write(image, "png", outputfile);
    } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(jPanel2, "File Could not be Saved.");
            return 0;
        }
        return 1;
    }
    
    public void setStartPoint(int x, int y) {
            rx = x;
            ry = y;
        }

        public void setEndPoint(int x, int y) {
            rw = (x-rx);
            rh = (y-ry);
        }

        public void drawPerfectRect(Graphics g, int x, int y, int x2, int y2) {
            int px = Math.min(x,x2);
            int py = Math.min(y,y2);
            int pw=Math.abs(x-x2);
            int ph=Math.abs(y-y2);
            g.drawRect(px, py, pw, ph);
        }
        
        
    
    private void moreColors_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreColors_btnActionPerformed
        if(evt.getSource()==moreColors_btn)  
        {
            javax.swing.JColorChooser colorchooser = new javax.swing.JColorChooser();
            java.awt.Color color= colorchooser.showDialog(null, "Advanced color picker", Color.black);
            prevcolor=currentcolor;
            currentcolor=color;

        }
    }//GEN-LAST:event_moreColors_btnActionPerformed

    private void erase_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erase_btnActionPerformed
        if(isEraser==0)
        prevcolor=currentcolor;
        currentcolor= Color.WHITE;
        isEraser=1;
        isRect=0;
        isOval=0;
    }//GEN-LAST:event_erase_btnActionPerformed

    private void canvas_panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas_panelMouseDragged
        java.awt.Graphics g = canvas_panel.getGraphics();
        if(isRect==0 && isOval==0)
        {
        if(isEraser==0)
	g.setColor(new Color(currentcolor.getRed(),currentcolor.getGreen(),currentcolor.getBlue(),opacity));
        else 
        g.setColor(new Color(currentcolor.getRed(),currentcolor.getGreen(),currentcolor.getBlue(),255));
	g.fillOval(evt.getX(), evt.getY(), sizeofbrush, sizeofbrush);
        }
        else
        {
            setEndPoint(evt.getX(), evt.getY());
        }
        
    }//GEN-LAST:event_canvas_panelMouseDragged

    private void brush_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brush_btnActionPerformed
        
        currentcolor=prevcolor;
        isEraser=0;
        isRect=0;
        isOval=0;
    }//GEN-LAST:event_brush_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed

        java.awt.Graphics g = canvas_panel.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvas_panel.getWidth(), canvas_panel.getHeight());
        
    }//GEN-LAST:event_clear_btnActionPerformed

    private void size_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_size_sliderStateChanged

        sizeofbrush=size_slider.getValue();
    }//GEN-LAST:event_size_sliderStateChanged

    private void opacity_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opacity_sliderStateChanged
        opacity=opacity_slider.getValue();        
    }//GEN-LAST:event_opacity_sliderStateChanged

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        
        String filename= String.format("image%d", fileNumber++);
        
        while(new File(filename).exists())
            filename= String.format("image%d", fileNumber++);
        
        BufferedImage image = createImage(canvas_panel);
        int saved=SaveImage(image,filename);
        if(saved==1)
        {
            JOptionPane.showMessageDialog(jPanel2, "File Saved");
        }
        
    }//GEN-LAST:event_save_btnActionPerformed

    private void green_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green_btnActionPerformed
        prevcolor=currentcolor;
        currentcolor=new Color(0,153,51,opacity);
    }//GEN-LAST:event_green_btnActionPerformed

    private void yellow_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellow_btnActionPerformed
        prevcolor=currentcolor;
        currentcolor=new Color(255,255,0,opacity);
    }//GEN-LAST:event_yellow_btnActionPerformed

    private void orange_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orange_btnActionPerformed
        prevcolor=currentcolor;
        currentcolor=new Color(255,153,51,opacity);
    }//GEN-LAST:event_orange_btnActionPerformed

    private void red_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red_btnActionPerformed
        prevcolor=currentcolor;
        currentcolor=new Color(255,51,51,opacity);
    }//GEN-LAST:event_red_btnActionPerformed

    private void rect_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rect_btnActionPerformed
        isRect=1;
        isOval=0;
    }//GEN-LAST:event_rect_btnActionPerformed

    private void canvas_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas_panelMousePressed
        if(isRect==1||isOval==1)
        setStartPoint(evt.getX(), evt.getY());
    }//GEN-LAST:event_canvas_panelMousePressed

    private void canvas_panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas_panelMouseReleased
        if(isRect==1)
        {
            setEndPoint(evt.getX(), evt.getY());
            java.awt.Graphics g = canvas_panel.getGraphics();
            g.setColor(new Color(currentcolor.getRed(),currentcolor.getGreen(),currentcolor.getBlue(),255));
            g.fillRect(rx, ry,rw,rh);
        }
        if(isOval==1)
        {
            setEndPoint(evt.getX(), evt.getY());
            java.awt.Graphics g = canvas_panel.getGraphics();
            g.setColor(new Color(currentcolor.getRed(),currentcolor.getGreen(),currentcolor.getBlue(),255));
            g.fillOval(rx, ry,rw,rh);
        }
    }//GEN-LAST:event_canvas_panelMouseReleased

    private void oval_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oval_btnActionPerformed
        isOval=1;
        isRect=0;
    }//GEN-LAST:event_oval_btnActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton brush_btn;
    javax.swing.JPanel canvas_panel;
    javax.swing.JButton clear_btn;
    javax.swing.JPanel color_tools;
    javax.swing.JButton erase_btn;
    javax.swing.JButton green_btn;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel main_tools;
    javax.swing.JButton moreColors_btn;
    javax.swing.JSlider opacity_slider;
    javax.swing.JButton orange_btn;
    javax.swing.JButton oval_btn;
    javax.swing.JButton rect_btn;
    javax.swing.JButton red_btn;
    javax.swing.JButton save_btn;
    javax.swing.JSlider size_slider;
    javax.swing.JPanel slider_tools;
    javax.swing.JPanel toolbar_panel;
    javax.swing.JButton yellow_btn;
    // End of variables declaration//GEN-END:variables
    }
