public class WithoutLambda {
    public static void main(String[] args) {
        int width =10;
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("drawing" + width);
            }
        };
        d.draw();
        }

    }

