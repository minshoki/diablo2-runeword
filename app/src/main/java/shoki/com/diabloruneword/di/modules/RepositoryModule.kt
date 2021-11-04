package shoki.com.diabloruneword.di.modules

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import shoki.com.diabloruneword.repository.HomeRepository
import shoki.com.diabloruneword.repository.RuneWordRepository
import javax.inject.Singleton

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
}