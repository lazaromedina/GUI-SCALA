package org.luis

import scala.swing._

/**
 * Created by luislazaro on 24/9/15.
 * lalazaro@keedio.com
 * Keedio
 */
object FirsSwingApp extends SimpleSwingApplication{
    def top = new MainFrame {
        title = "First swing app"
        contents = new Button {
            text = "Click me"
        }
    }
}
