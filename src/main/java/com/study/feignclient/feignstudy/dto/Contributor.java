package com.study.feignclient.feignstudy.dto;

import lombok.Data;

@Data
public class Contributor {
    String login;
    String id;
    String avatar_url;
    String html_url;
    String follower_url;
    String following_url;
    String gists_url;
    String starred_url;
    String subscription;
    String organization_url;
    String repos_url;
    String events_url;
    String received_events_url;
    String type;
    String site_admin;
    int contributions;
}
