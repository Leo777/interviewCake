package com.interviewcake.algolearn;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAdress {
    public int uniqueAdresses(String[] emails) {
        Set<String> adresses = new HashSet<>();

        for (String adress : emails) {
            String[] names =adress.split("@");
            String local=names[0];
            if(local.contains("+")){
                String[] splited = local.split("\\+");
                local=splited[0];
            }
            if(local.contains(".")) {

                local = names[0].replaceAll(".", "");
            }

            String uniqueAdress = local+"@"+names[1];
            adresses.add(uniqueAdress);
        }

        return adresses.size();
    }


    public int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');
            String rest = email.substring(i);
            seen.add(rest);
        }
        return seen.size();
    }
}
