package uz.unzosoft.fastfoodbecasel.di

import org.koin.core.qualifier.named
import org.koin.dsl.module
import uz.unzosoft.fastfoodbecasel.MainActivity
import uz.unzosoft.fastfoodbecasel.model.CategoriesFood
import uz.unzosoft.fastfoodbecasel.model.LoookFood

val fastModule = module {
    single{

    }
}
val dataModules = {
    listOf(fastModule)
}