package theoptimisers.project.model;

public class Vegetable {
    private String id;
    public String title;
    private String description;
    private String thumbnail_url;
    private int quantity;
    private float price;

    public Vegetable(){

    }

    public Vegetable(String id, String title, String description, String thumbnail_url, int quantity, float price){
        super();
        setId(id);
        setTitle(title);
        setDescription(description);
        setThumbnail_url(thumbnail_url);
        setQuantity(quantity);
        setPrice(price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id==null || id.trim().isEmpty()){
           throw new IllegalArgumentException("Id can not be empty");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title==null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title can not be empty");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description==null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Discription can not be empty");
        }
        this.description = description;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        if (thumbnail_url==null || thumbnail_url.trim().isEmpty()){
            throw new IllegalArgumentException("Thumbnail_url can not be empty");
        }
        this.thumbnail_url = thumbnail_url;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            throw new IllegalArgumentException("Quantity can not be negative");
        }
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price<0){
            throw new IllegalArgumentException("Price can not be negative");
        }
        this.price = price;
    }


}
