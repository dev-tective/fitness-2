package com.gatodev.fitness.services.impl;

import com.gatodev.fitness.entities.Site;
import com.gatodev.fitness.repositories.SiteRepository;
import com.gatodev.fitness.services.SiteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteServiceImpl implements SiteService {
    private final SiteRepository siteRepository;

    public SiteServiceImpl(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    @Override
    public Site addSite(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public Site updateSite(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public Site getSite(Long id) {
        return siteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sitio no encontrado"));
    }

    @Override
    public void deleteSite(Long id) {
        siteRepository.findById(id).ifPresentOrElse(
                site -> {
                    site.setActive(false);
                    siteRepository.save(site);
                },
                () -> {
                    throw new RuntimeException("Sitio no encontrado");
                }
        );
    }

    @Override
    public List<Site> getSites() {
        return siteRepository.findAll();
    }
}
