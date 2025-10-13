package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Site;

import java.util.List;

public interface SiteService {
    Site addSite(Site site);

    Site updateSite(Site site);

    Site getSite(Long id);

    void deleteSite(Long id);

    List<Site> getSites();
}
