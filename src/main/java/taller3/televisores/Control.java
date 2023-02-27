package taller3.televisores;
public class Control {
	private TV tv;

    public Control() {

    }

    public Control(TV tv) {
        enlazar(tv);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void enlazar(TV tv) {
        setTv(tv);
        tv.setControl(this);
    }

    public void turnOn() {
        if (tv != null) {
            tv.turnOn();
        }
    }

    public void turnOff() {
        if (tv != null) {
            tv.turnOff();
        }
    }

    public void canalUp() {
        if (tv != null) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv != null) {
            tv.canalDown();
        }
    }
    
    public void setCanal(int canal) {
        if (tv != null) {
            tv.setCanal(canal);
        }
    }
}
