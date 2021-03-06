import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

// 2019311737 이진영 작성
public class BigCoin extends Coin {

	private static BufferedImage bigCoinSprite;

	public BigCoin(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			bigCoinSprite = ImageIO.read(getClass().getResource("/image/bigcoin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// setBounds(x, y, 27, 27);
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(bigCoinSprite, x, y, null);
	}
}
