package Assign_1.Q5;

import Assign_1.Q4.Image;

public class ImageLibrary {
    private final Image[] imgarr;
    private int count;

    public ImageLibrary(int size) {
        this.imgarr = new Image[size];
        this.count = 0;
    }

    public void add(Image img) {
        if(count < imgarr.length) {
            imgarr[count++] = img;
        }else {
            System.out.println("Sorry Array size is full");
        }
    }

    public boolean search(Image img) {
        if(count > 0) {
            for(int i = 0; i < count; i++) {
                if(imgarr[i] == img) {
                    return true;
                }
            }
        }
        return false;
    }
}
