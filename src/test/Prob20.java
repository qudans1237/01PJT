package test;

import java.util.Vector;

public class Prob20 {
    public Vector<String> dataChange(String[] strData) {
        Vector<String> result = new Vector<String>();
        String changedStr = "";

        for(String str : strData) {
            for(int i = str.length()-1; i >= 0; i--) {
                changedStr += str.charAt(i);
            }
            result.add(0, changedStr);
            changedStr = "";
        }
        return result;
    }

    public static void main(String[] args) {
        Prob20 st = new Prob20();
        String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
        Vector<String> v = st.dataChange(strData);

        for(int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }


//        // forEach loop
//        for(String s : v) {
//            System.out.println(s);
//        }
    }
}