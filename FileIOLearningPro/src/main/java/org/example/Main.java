package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        String json = "{\"menu\": {\n" +
                "  \"id\": \"file\",\n" +
                "  \"value\": \"File\",\n" +
                "  \"popup\": {\n" +
                "    \"menuitem\": [\n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            MenuItem totalItem = objectMapper.readValue(json, MenuItem.class);
            System.out.println(totalItem);

            FileWriter fileWriter=new FileWriter("D:\\Program Strategy\\file.json");
            for(MenuList list:totalItem.getMenu().getPopup().getMenuitem()){
                fileWriter.write("Value : "+ list.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}