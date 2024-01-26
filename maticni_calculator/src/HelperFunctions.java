import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class HelperFunctions {

   static Map<Integer, String> republicMap = new TreeMap<>();
   static Map<String, String> regionMap = new TreeMap<>();

   static Map<String, String> getRegions() {
      republicMap.put(0, "foreigner");
      republicMap.put(1, "Bosnia and Herzegovina");
      republicMap.put(2, "Montenegro");
      republicMap.put(3, "Croatia");
      republicMap.put(4, "North Macedonia");
      republicMap.put(5, "Slovenia");
      republicMap.put(6, "temporary residence");
      republicMap.put(7, "wider Serbia");
      republicMap.put(8, "Vojvodina");
      republicMap.put(9, "Kosovo and Metohija");

      regionMap.put("00", "mixed use");
      regionMap.put("01", "foreigners in Bosnia and Herzegovina");
      regionMap.put("02", "foreigners in Montenegro");
      regionMap.put("03", "foreigners in Croatia");
      regionMap.put("04", "foreigners in North Macedonia");
      regionMap.put("05", "foreigners in Slovenia");
      regionMap.put("07", "foreigners in wider Serbia");
      regionMap.put("08", "foreigners in Vojvodina");
      regionMap.put("09", "foreigners in Kosovo and Metohija");
      regionMap.put("10", republicMap.get(1) + ", Banja Luka");
      regionMap.put("11", republicMap.get(1) + ", Bihać");
      regionMap.put("12", republicMap.get(1) + ", Doboj");
      regionMap.put("13", republicMap.get(1) + ", Goražde");
      regionMap.put("14", republicMap.get(1) + ", Livno");
      regionMap.put("15", republicMap.get(1) + ", Mostar");
      regionMap.put("16", republicMap.get(1) + ", Prijedor");
      regionMap.put("17", republicMap.get(1) + ", Sarajevo");
      regionMap.put("18", republicMap.get(1) + ", Tuzla");
      regionMap.put("19", republicMap.get(1) + ", Zenica");
      regionMap.put("21", republicMap.get(2) + ", Podgorica");
      regionMap.put("22", republicMap.get(2) + ", Bar, Ulcinj");
      regionMap.put("23", republicMap.get(2) + ", Budva, Kotor, Tivat");
      regionMap.put("24", republicMap.get(2) + ", Herceg Novi");
      regionMap.put("25", republicMap.get(2) + ", Cetinje");
      regionMap.put("26", republicMap.get(2) + ", Nikšić");
      regionMap.put("27", republicMap.get(2) + ", Berane, Rožaje, Plav, Andrijevica");
      regionMap.put("28", republicMap.get(2) + ", Bijelo Polje, Mojkovac");
      regionMap.put("29", republicMap.get(2) + ", Pljevlja, Žabalj");
      regionMap.put("30", republicMap.get(3) + ", Osijek");
      regionMap.put("31", republicMap.get(3) + ", Bjelovar, Virovitica, Koprivnica, Pakrac");
      regionMap.put("32", republicMap.get(3) + ", Varaždin, Međimurje");
      regionMap.put("33", republicMap.get(3) + ", Zagreb");
      regionMap.put("34", republicMap.get(3) + ", Karlovac");
      regionMap.put("35", republicMap.get(3) + ", Lika");
      regionMap.put("36", republicMap.get(3) + ", Istria, Primorje");
      regionMap.put("37", republicMap.get(3) + ", Sisak, Banija");
      regionMap.put("38", republicMap.get(3) + ", Dalmatia");
      regionMap.put("39", republicMap.get(3) + ", mixed use");
      regionMap.put("41", republicMap.get(4) + ", Bitola");
      regionMap.put("42", republicMap.get(4) + ", Kumanovo");
      regionMap.put("43", republicMap.get(4) + ", Ohrid");
      regionMap.put("44", republicMap.get(4) + ", Prilep");
      regionMap.put("45", republicMap.get(4) + ", Skopje");
      regionMap.put("46", republicMap.get(4) + ", Strumica");
      regionMap.put("47", republicMap.get(4) + ", Tetovo");
      regionMap.put("48", republicMap.get(4) + ", Veles");
      regionMap.put("49", republicMap.get(4) + ", Štip");
      regionMap.put("50", republicMap.get(5));
      regionMap.put("60", republicMap.get(6));
      regionMap.put("70", republicMap.get(7) + ", Citizens registered in the Birth Registry of the Diplomatic Consular Representation of the Republic of Serbia");
      regionMap.put("71", republicMap.get(7) + ", Belgrade");
      regionMap.put("72", republicMap.get(7) + ", Kragujevac, Jagodina");
      regionMap.put("73", republicMap.get(7) + ", Nis, Pirot, Toplica");
      regionMap.put("74", republicMap.get(7) + ", Leskovac, Vranje");
      regionMap.put("75", republicMap.get(7) + ", Zaječar, Bor");
      regionMap.put("76", republicMap.get(7) + ", Smederevo, Pozarevac");
      regionMap.put("77", republicMap.get(7) + ", Macva, Kolubara");
      regionMap.put("78", republicMap.get(7) + ", CaCak, Kraljevo, Krusevac");
      regionMap.put("79", republicMap.get(7) + ", Uzice");
      regionMap.put("80", republicMap.get(8) + ", Novi Sad");
      regionMap.put("81", republicMap.get(8) + ", Sombor");
      regionMap.put("82", republicMap.get(8) + ", Subotica");
      regionMap.put("83", republicMap.get(8) + ", Vrbas");
      regionMap.put("84", republicMap.get(8) + ", Kikinda");
      regionMap.put("85", republicMap.get(8) + ", Zrenjanin");
      regionMap.put("86", republicMap.get(8) + ", Pančevo");
      regionMap.put("87", republicMap.get(8) + ", Vrsac");
      regionMap.put("88", republicMap.get(8) + ", Ruma");
      regionMap.put("89", republicMap.get(8) + ", Sremska Mitrovica");
      regionMap.put("91", republicMap.get(9) + ", Pristina");
      regionMap.put("92", republicMap.get(9) + ", Kosovska Mitrovica");
      regionMap.put("93", republicMap.get(9) + ", Pec");
      regionMap.put("94", republicMap.get(9) + ", Dzakovica");
      regionMap.put("95", republicMap.get(9) + ", Prizren");
      regionMap.put("96", republicMap.get(9) + ", Gnjilane, Kosovska Kamenica, Vitina, Novo Brdo");
      return regionMap;
   }


   public static void toStringMap() {
      for (var entry : regionMap.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
      }
   }
}
