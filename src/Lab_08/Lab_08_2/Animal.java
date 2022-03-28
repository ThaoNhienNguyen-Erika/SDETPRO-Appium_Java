package Lab_08.Lab_08_2;

import java.security.SecureRandom;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String defaultName) {
        this.name = defaultName;
    }

    // return animal speed
    public int speed() {
        int randomSpeed = 0;

        while (true) {
            randomSpeed = new SecureRandom().nextInt(100);

            if(this.name.equals("Horse") && randomSpeed <= 75) {
                break;
            }
            else if (this.name.equals("Tiger") && randomSpeed <= 100) {
                break;
            }
            else if (this.name.equals("Dog") && randomSpeed <= 60) {
                break;
            } else {

                //! break for another animal
                break;
            }
        }

        return  randomSpeed;
    }
}
