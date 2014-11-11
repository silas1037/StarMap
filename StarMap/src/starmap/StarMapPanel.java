/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import starmap.Constellation.Line;

/**
 * A JPanel that displays a set of stars and constellations
 * @author John Brink
 */
public class StarMapPanel extends JPanel
{
    private ArrayList<Constellation> constellations = new ArrayList<>();
    private double latitude = 0;
    private double longitude = 0;
    private double altitude = 0;
    private double azimuth = 0;

    public void setPosition(double lat, double lon, double alt, double az)
    {
        this.latitude = lat;
        this.longitude = lon;
        this.altitude = alt;
        this.azimuth = az;
        updatePositions();
    }
    
    public void loadConstellations(ArrayList<Constellation> constellations)
    {
        this.constellations = constellations;
        updatePositions();
    }
    
    private void updatePositions()
    {
        for(Constellation c : constellations)
        {
            for(Star s : c.stars)
            {
                s.computePosition(latitude, longitude, altitude, azimuth);
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.black);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        for(Constellation c : constellations)
        {
            if(c.name != null)
            {
                g.setColor(Color.red);
                c.findCenter();
                g.drawString(c.name,
                        (int)(c.centerX * getScale()),
                        this.getHeight() - (int)(c.centerY * getScale()));
            }
            
            g.setColor(Color.gray);
            for(Line l : c.lines)
            {
                g.drawLine(getStarX(l.star1), getStarY(l.star1),
                    getStarX(l.star2), getStarY(l.star2));
            }
            
            //g.setColor(Color.white);
            for(Star s : c.stars)
            {
                g.setColor(getColor(s));
                if(s.isVisible())
                {
                    int diameter = getDiameter(s);
                    int x = getStarX(s);
                    int y = getStarY(s);
                    g.fillOval(x, y, diameter, diameter);
                    if(s.commonName != null)
                        g.drawString(s.commonName, x + 4, y - 4);
                }
            }
        }
    }
    
    private Color getColor(Star s)
    {
        if(s.magnitude <= 1)
            return new Color(0.6f, 0.6f, 1.0f);
        if(s.magnitude <= 2)
            return new Color(0.7f, 0.7f, 1.0f);
        if(s.magnitude <= 3)
            return new Color(0.8f, 0.8f, 1.0f);
        if(s.magnitude <= 4)
            return new Color(0.9f, 0.9f, 1.0f);
        return Color.white;
    }
    
    private int getScale()
    {
        if(this.getHeight() < this.getWidth())
            return this.getHeight();
        return this.getWidth();
    }
    
    private int getStarX(Star s)
    {
        double scaledX = s.getX() * getScale();
        return (int)scaledX;
    }
    
    private int getStarY(Star s)
    {
        double scaledY = s.getY() * getScale();
        return this.getHeight() - (int)scaledY;
    }
    
    private int getDiameter(Star s)
    {
        return 9 - (int)s.magnitude;
    }
}
