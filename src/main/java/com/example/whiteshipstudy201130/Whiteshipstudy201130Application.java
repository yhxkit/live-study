package com.example.whiteshipstudy201130;

import org.kohsuke.github.*;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Whiteshipstudy201130Application {

    public static void main(String[] args) throws IOException {

        Whiteshipstudy201130Application app = new Whiteshipstudy201130Application();
        app.print();

    }

    private void print() throws IOException {
        GitHub github = new GitHubBuilder().withOAuthToken("").build();
        GHRepository repo = github.getRepository("whiteship/live-study");

        List<GHIssue> issues = repo.getIssues(GHIssueState.ALL);

        Map<String, int[]> map = new HashMap<>();

        for (int i = 0; i < issues.size(); i++) {
            GHIssue issue = issues.get(i);
            List<GHIssueComment> comments = issue.getComments();
            for (GHIssueComment comment : comments) {
                if (map.containsKey(comment.getUser().getName())) {
                    map.get(comment.getUser().getName())[i] = 1;
                } else {
                    map.put(comment.getUser().getName(), new int[issues.size()]);
                    map.get(comment.getUser().getName())[i] = 1;
                }
            }
        }

        for (Map.Entry<String, int[]> a : map.entrySet()) {
            System.out.print(a.getKey() + ":");
            float per = 0;

            for (int b : a.getValue()) {
                per +=100f/18f * b;
            }
            System.out.println(String.format("%.2f",per));
        }

    }

}
