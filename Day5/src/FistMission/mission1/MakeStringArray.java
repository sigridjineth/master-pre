package FistMission.mission1;

import java.util.ArrayList;

public class MakeStringArray {

    static ArrayList<String> makeA_To_Z_StringArray(){
        ArrayList<String> stringArray = new ArrayList<String>();
        for (int i =65; i<91;i++){
            stringArray.add(Character.toString((char)i));
        }
        return stringArray;
    }

}

