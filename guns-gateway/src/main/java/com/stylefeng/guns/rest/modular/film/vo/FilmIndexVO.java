package com.stylefeng.guns.rest.modular.film.vo;

import com.style.guns.api.film.vo.BannerVO;
import com.style.guns.api.film.vo.FilmInfo;
import com.style.guns.api.film.vo.FilmVO;
import lombok.Data;

import java.util.List;

@Data
public class FilmIndexVO {

    private List<BannerVO> bannerVOList;
    private FilmVO hotFilms;
    private FilmVO soonFilms;
    private List<FilmInfo> boxRanking;
    private List<FilmInfo> expectRanking;
    private List<FilmInfo> top100;
}
