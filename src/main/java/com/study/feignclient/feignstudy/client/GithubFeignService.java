package com.study.feignclient.feignstudy.client;

import com.study.feignclient.feignstudy.dto.Contributor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class GithubFeignService {

    private final GithubFeignClient githubFeignClient;

    public List<Contributor> getContributor(String owner, String repo) {
        List<Contributor> contributors = githubFeignClient.getContributors(owner, repo);
        return contributors;
    }
}
