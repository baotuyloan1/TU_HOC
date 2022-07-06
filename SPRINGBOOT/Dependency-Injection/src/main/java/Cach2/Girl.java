package Cach2;

//Bây giờ Girl chỉ phụ thuộc vào Outfit.nếu muốn thay đổi đồ của cô gái,chúng ta chỉ cần cho Outfit một thể hiện mới.
public class Girl {
	private Outfit outfit;

	public Girl() {
		outfit = new Uniform();
	}
}