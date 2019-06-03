package img

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
 * 生成图片
 *
 */
fun main() {
    var image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    var w = 10 ..90
    var h = 10 ..90
    image.apply {
      for (i in w ){
          for (j in h){
              setRGB(i,j,0xff00ff)
          }
      }
  }
    ImageIO.write(image,"bmp",File("a.bmp"))
}