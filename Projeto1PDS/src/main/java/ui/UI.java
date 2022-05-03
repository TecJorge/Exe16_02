package ui;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface UI {
    public void run(List<String> listStringController) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
    public String getMenuDescription();
}
