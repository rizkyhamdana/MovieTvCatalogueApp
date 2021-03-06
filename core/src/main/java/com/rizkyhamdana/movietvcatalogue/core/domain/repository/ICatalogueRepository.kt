package com.rizkyhamdana.movietvcatalogue.core.domain.repository

import com.rizkyhamdana.movietvcatalogue.core.data.Resource
import com.rizkyhamdana.movietvcatalogue.core.domain.model.Movies
import com.rizkyhamdana.movietvcatalogue.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface ICatalogueRepository {

    fun getMoviePopular(): Flow<Resource<List<Movies>>>

    fun getTvPopular(): Flow<Resource<List<TvShow>>>

    fun getDetailsMovie(id: Int) : Flow<Resource<Movies>>

    fun getDetailsTv(id: Int) : Flow<Resource<TvShow>>

    fun getMovieFavorite(): Flow<List<Movies>>

    fun getTvFavorite(): Flow<List<TvShow>>

    fun setMovieFavorite(movies: Movies, state: Boolean)

    fun setTvFavorite(tvShow: TvShow, state: Boolean)


}