# MVVM Demo for [app-projektet](https://github.com/sainsh/HOEK-helper)

Denne demo viser step-by, hvordan I kan bygge en app med MVVM arkitektur. App'ens funktion er simpel: Den viser den selvsamme tekst, som brugeren indtaster. Det er ikke meget i sig selv, men det er et godt eksempel på, hvordan data strømmer fra activity til viewmodel, og derfra til model, og tilbage den samme vej. 

## Sådan virker det
Viewet observerer string "a" i ViewModellen, og ViewModellen observerer den selvsamme string "a" i modellen. Man kan ændre stringen i Viewet (dvs. i main activity), og denne ændring vil sendes til ViewModel og derfra til Model, som vil sende data tilbage den anden vej. 

## Sådan kan du bygge dit eget MVVC
* [Begynd med at se denne video (Introduction to MVVM on Android)](https://www.youtube.com/watch?v=_T4zjIEkGOM) 
* [Læs i dokumentationen, hvad LiveData klassen kan gøre for dig](https://developer.android.com/topic/libraries/architecture/livedata)
  * [Se også dokumentation af Observable](https://developer.android.com/topic/libraries/data-binding/observability)
* Hent mit projekt fra [Github](https://github.com/andracs/MVVM-demo-for-app-projektet)
* Se på mine TODO noter i projektet
  * Det vil guide dig igennem de nødvendige skridt for at implementere MVVM i din app
* Når du har forstået konceptet, kan du prøve at implementere noget lignende i din applikation.

## Todo-listen
![Todo](https://github.com/andracs/MVVM-demo-for-app-projektet/blob/82c694f2b2074982abcb9a8681455e9957f0befc/docs/Sk%C3%A6rmbillede%202019-03-05%20kl.%2014.51.48.png?raw=true)
