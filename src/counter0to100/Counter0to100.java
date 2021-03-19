package counter0to100;

import java.awt.*;

public class Counter0to100 extends Panel {
    private long count=0;
    private Label label;
    private long maxValue=100;
    private long minValue=0;
    public void setMaxValue(long max) {
        maxValue = max;
    }
    public void setMinValue(long min) {
        minValue = min;
    }
    public long getMaxValue() { 
        return maxValue; 
    }
    public long getMinValue() { 
        return minValue; 
    }
    public Counter0to100() {
        setBackground(Color.blue); setForeground(Color.white);
        label = new Label(count+"%");
        add(label);
    }
    public void increment () {
        if ((count < maxValue)&&(count >= minValue)) {
            count++;
            label.setText(count+"%");
        }
        else label.setText("!!");
    }
    public void decrement () {
        if ((count <= maxValue)&&(count > minValue)) {
            count--;
            label.setText(count+"%");
        }
        else label.setText("!!");
    }
    
}
