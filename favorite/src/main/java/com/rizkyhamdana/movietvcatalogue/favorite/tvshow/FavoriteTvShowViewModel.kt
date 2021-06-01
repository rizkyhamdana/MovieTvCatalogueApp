package com.rizkyhamdana.movietvcatalogue.favorite.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.rizkyhamdana.movietvcatalogue.core.domain.usecase.CatalogueUseCase

class FavoriteTvShowViewModel(catalogueUseCase: CatalogueUseCase): ViewModel() {

    val getFavoriteTv = catalogueUseCase.getTvFavorite().asLiveData()

}