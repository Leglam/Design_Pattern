public class ImageManager {
  private Renderer renderer;
  
	public ImageManager(Renderer renderer) {
		this.renderer = renderer;
	}

	public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}
	
	public void show() {
		renderer.showImage();
	}
}

