package di

class Injector {
    val applicationComponent: ApplicationComponent = DaggerApplicationComponent.builder().build()
}