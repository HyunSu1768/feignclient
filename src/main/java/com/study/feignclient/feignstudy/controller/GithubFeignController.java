package com.study.feignclient.feignstudy.controller;

import com.study.feignclient.feignstudy.client.GithubFeignService;
import com.study.feignclient.feignstudy.dto.Contributor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GithubFeignController {

    private final GithubFeignService githubFeignService;

    @GetMapping("/v1/github/{owner}/{repo}")
    public List<Contributor> getContributors(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo
            ){
        return githubFeignService.getContributor(owner, repo);
    }
}
