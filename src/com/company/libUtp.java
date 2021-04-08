package com.company;

import java.net.*;
import java.io.*;


import org.json.JSONObject;

public class  libUtp {

public String port;
public String token;



    public static void main(String[] args) throws IOException {

      // libUtp lol = new libUtp();

        //lol.port = "20000";
        //lol.token =  "1E741C78681D9002DD0A3F445E7D28AA";

        //System.out.println(lol.getSystemInfo());
        //System.out.println(lol.getReleaseNotes());

    } //test main

public String getSystemInfo() throws IOException {


    String flimp; //return



    JSONObject jo = new JSONObject();

    jo.put("method", "getSystemInfo");
    jo.put("token", this.token);


    String jsonInputString;
    jsonInputString = jo.toString();




         flimp = respAll(jsonInputString);
        return flimp;
    }

    public String getProfileStatus() throws IOException {


        String flimp; //return


        JSONObject jo = new JSONObject();

        jo.put("method", "getProfileStatus");
        jo.put("token", this.token);


        String jsonInputString;
        jsonInputString = jo.toString();


        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String setProfileStatus(String Status, String Mood) throws IOException {


        String flimp; //return


        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();



       ji.put("status", Status);
       ji.put("mood", Mood);
        System.out.println(ji.toString());

        jo.put("method", "setProfileStatus");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String getReleaseNotes() throws IOException {


        String flimp; //return


        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();




        System.out.println(ji.toString());

        jo.put("method", "getReleaseNotes");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String getSettingInfo(String settingId) throws IOException {


        String flimp; //return




        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();



       ji.put("settingId", settingId);

        System.out.println(ji.toString());

        jo.put("method", "setProfileStatus");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String setSettingInfo(String settingId, String newValue) throws IOException {


        String flimp; //return


        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();



        ji.put("settingId", settingId);
        ji.put("newValue", newValue);

        System.out.println(ji.toString());

        jo.put("method", "setProfileStatus");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String getOwnContact() throws IOException {


        String flimp; //return



        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();

        System.out.println(ji.toString());

        jo.put("method", "getOwnContact");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);
        return flimp;
    }
    public String getContactGroups() throws IOException {


        String flimp; //return


        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();


        System.out.println(ji.toString());

        jo.put("method", "getContactGroups");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());

        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String getContactsByGroup(String groupName) throws IOException {


        String flimp; //return


        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();

        ji.put("groupName", groupName);



        System.out.println(ji.toString());

        jo.put("method", "getContactsByGroups");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());

        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String getContacts(String filter) throws IOException {


        String flimp; //return



        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();

        ji.put("filter", filter);


        System.out.println(ji.toString());

        jo.put("method", "getContacts");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String ucodeEncode(String hex_code, String size_image, String coder,String format) throws IOException {


        String flimp; //return



        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();

        ji.put("hex_code", hex_code);
        ji.put("size_image", size_image);
        ji.put("coder", coder);
        ji.put("format", format);



        System.out.println(ji.toString());

        jo.put("method", "ucodeEncode");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());

        flimp = respAll(jsonInputString);
        return flimp;
    }

    public String ucodeDecode(String base64_image) throws IOException {


        String flimp; //return



        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();

        ji.put("base64_image", base64_image);


        System.out.println(ji.toString());

        jo.put("method", " ucodeDecode");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);
        return flimp;
    }
    public String getBalance() throws IOException {


        String flimp; //return

        JSONObject jo = new JSONObject();


        jo.put("method", "getBalance");

        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());


        flimp = respAll(jsonInputString);

        return flimp;
    }
    public String sendPayment(String cardid, String to, String amount, String comment /*String fromCard*/) throws IOException {


        String flimp; //return




        // create json
        JSONObject jo = new JSONObject();

        JSONObject ji = new JSONObject();

        ji.put("to", to);
        ji.put("amount", amount);
        ji.put("comment", comment);
        ji.put("cardid", cardid);



        jo.put("method", "sendPayment");
        jo.put("params", ji);
        jo.put("token", this.token);

        String jsonInputString;
        jsonInputString = jo.toString();

        System.out.println(jo.toString());

        flimp = respAll(jsonInputString);

        return flimp;
    }

    public String respAll(String jsonInputString ) throws IOException {

        String flimp = null;

        URL url = new URL ("http://127.0.0.1:" + this.port + "/api/1.0");

        HttpURLConnection con = (HttpURLConnection)url.openConnection();

        con.setRequestMethod("POST");

        con.setRequestProperty("Content-Type", "application/json; utf-8");

        con.setRequestProperty("Accept", "application/json");

        con.setDoOutput(true);



        try(OutputStream os = con.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);


        }



        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            // System.out.println(response.toString());
            flimp = response.toString();
        }


        return flimp;
    }





}


