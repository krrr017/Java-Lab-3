package animalkingdom.species;

import animalkingdom.Animal;

public class Reptile extends Animal {

    private String skinType;
    private String bone;
    private String eggType;

    public Reptile() {
        super(0.0d, 0.0d, "Reptule", "Cold-blooded");
        this.skinType = "Dry skin";
        this.bone = "Backbone";
        this.eggType = "Soft-shelled eggs";
    }

    public Reptile(double height, double weight, String animalType, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return skinType;
    }

    public String getBone() {
        return bone;
    }

    public String getEggType() {
        return eggType;
    }

}
