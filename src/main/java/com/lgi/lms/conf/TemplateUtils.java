package com.lgi.lms.conf;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemplateUtils {
    public static Set<String> extractDynamicVariables(String campaignContent) {
        Set<String> variables = new HashSet<>();
        Pattern pattern = Pattern.compile("\\{\\{(.*?)\\}\\}");
        Matcher matcher = pattern.matcher(campaignContent);
        while (matcher.find()) {
            variables.add(matcher.group(1).trim());
        }
        return variables;
    }

    public static String replaceDynamicVariables(String campaignContent, Map<String, String> variableValues) {
        for (Map.Entry<String, String> entry : variableValues.entrySet()) {
            campaignContent = campaignContent.replace("{{" + entry.getKey() + "}}", entry.getValue());
        }
        return campaignContent;
    }
}