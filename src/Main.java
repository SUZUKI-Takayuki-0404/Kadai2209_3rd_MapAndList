import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> airportCodes = new HashMap<>();
        airportCodes.put("CTS", "新千歳空港");
        airportCodes.put("NRT", "成田空港");
        airportCodes.put("HND", "羽田空港");
        airportCodes.put("NGO", "中部空港");
        airportCodes.put("KIX", "関西空港");
        airportCodes.put("FUK", "福岡空港");
        airportCodes.put("OKA", "那覇空港");

        List<String> codeList = new ArrayList<>();
        codeList.add("CTS");
        codeList.add("NRT");
        codeList.add("NKM"); //名古屋空港
        codeList.add("KIX");

        System.out.println("--<国内空港の3レターコード集>-----");
        for (Map.Entry<String, String> entry : airportCodes.entrySet()) {
            System.out.print("  " + entry.getKey() + " : ");
            System.out.println(entry.getValue());
        }
        System.out.println("-----------------------------");

        System.out.println(System.getProperty("line.separator") + "上記のコード集から空港名を調べる");
        for (String airportCode : codeList) {
            System.out.print("  " + airportCode + " : ");
            System.out.println(airportCodes.getOrDefault(airportCode, "該当する空港は登録されていません"));
        }

    }
}