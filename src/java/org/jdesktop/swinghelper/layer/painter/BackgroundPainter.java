/*
 * Copyright (C) 2006,2007 Alexander Potochkin
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.jdesktop.swinghelper.layer.painter;

import org.jdesktop.swinghelper.layer.JXLayer;

import javax.swing.*;
import java.awt.*;

public class BackgroundPainter <V extends JComponent> 
        extends AbstractPainter<V> {
    
    public void paint(Graphics2D g2, JXLayer<V> l) {
        configure(g2, l);
        V view = l.getView();
        if (view == null) {
            g2.setColor(l.getBackground());
        } else {
            g2.setColor(view.getBackground());
        }
        g2.fillRect(0, 0, l.getWidth(), l.getHeight());
    }
}
