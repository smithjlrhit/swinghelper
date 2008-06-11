/*
 * Main.fx
 */
package stopwatch;

import javafx.gui.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Jasper
 */
var sw = StopwatchWidget{};
sw.frame = Frame { content: sw.canvas width: 500 height: 500 };
ShapedWindowHelper.makeShaped(sw.frame.getJFrame());
sw.frame.visible = true;
