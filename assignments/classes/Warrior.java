public class Warrior extends Character {
    protected boolean shielded = false;

    public Warrior(String name) {
        super(name); 
        this.hp = 150;
        this.maxHp = 150;
        this.mp = 10;
        this.maxMp = 10;
    }

    public void shieldBash() {
        this.shielded = true;
    }

    @Override
    public void takeDamage(int amount) {
        if (this.shielded) {
            super.takeDamage(amount / 2);
            this.shielded = false; // Бамбай нэг удаа ажиллаад идэвхгүй болно
        } else {
            super.takeDamage(amount);
        }
    }
}