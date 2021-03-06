package util;

import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by alex on 13.11.16.
 */
public class Utils {


    public static <T> List<T> toList(Set<T> set){
        List<T> result = new ArrayList<>();
        for (T t : set){
            result.add(t);
        }
        return result;
    }


    public static String getCurrentUser(){
        return FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    }
}
