//package ru.bcs.test.demo.account.steps;
//
//import cucumber.api.java.ru.Дано;
//import cucumber.api.java.ru.И;
//import ru.bcs.at.library.core.core.rest.RequestParam;
//
//import java.util.List;
//
//public class ProjectNameSteps {
//    void setFieldValue(String elementName, String value) {
//
//
//    }
//
//    @И("^a (GET|POST|PUT|DELETE) запрос на URL \"([^\"]*)\" с headers и parameters из таблицы. Полученный ответ сохранен в переменную \"([^\"]*)\"$")
//    public void aaa(String method, String address, String variableName, List<RequestParam> paramsTable) throws Exception {
//        System.out.println(method);
//        System.out.println(address);
//        System.out.println(variableName);
//        System.out.println(paramsTable);
//    }
//
//
//    @И("^parameters из таблицы$")
//    public void aaa(List<RequestParam> paramsTable) throws Exception {
//        System.out.println(paramsTable);
//    }
//
//    @Дано("^в меню доступны пункты$")
//    public void вМенюДоступныПункты(List<Menu> arg) {
//        for (int i = 0; i < arg.size(); i++) {
//            System.out.print(arg.get(i).getTitle() + " ");
//            System.out.print(Boolean.toString(arg.get(i).getAvailable()) + " ");
//            System.out.println(Integer.toString(arg.get(i).getSubMenuCount()));
//        }
//    }
//}