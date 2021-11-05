package shoki.com.diabloruneword.di.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import shoki.com.diabloruneword.db.AppDatabase
import shoki.com.diabloruneword.repository.HomeRepository
import shoki.com.diabloruneword.repository.RuneRepository
import shoki.com.diabloruneword.repository.RuneWordRepository

@InstallIn(ViewModelComponent::class)
@Module
object RepositoryModule {

    @ViewModelScoped
    @Provides
    fun provideHomeRepository(): HomeRepository {
        return HomeRepository()
    }

    @ViewModelScoped
    @Provides
    fun provideRuneWordRepository(): RuneWordRepository {
        return RuneWordRepository()
    }

    @ViewModelScoped
    @Provides
    fun provideRuneRepository(appDatabase: AppDatabase): RuneRepository {
        return RuneRepository(runeDao = appDatabase.runeDao())
    }
}