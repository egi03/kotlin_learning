class MapViewModel {
    val locationManager: LocationManager by lazy { LocationManager() }
}

The `lazy{}` delegate will only run once, when a property is first accessed. 
It's a great way to delay initialization of value until the point where it's actually needed.

//-------------------------------------------------------------------------------
class MapViewModel {
    var currentLocation: Location by Delegates.observable(Location(0f, 0f)) { _, old, new ->
        println("Old location = $old")
        println("New location = $new")
    }
}

The `observable{}` delegate will be run each time an observable value is updated. 
This provides an opportunity to log the value, or perform other updates using the new value.

//------------------------------------------------------------------------------------------
class MapViewModel {
    var currentLocation: Location by Delegates.vetoable(Location(0f, 0f)) { _, old, new ->
        if (new.lat > 0 && new.lon > 0) {
            true
        } else {
            println("$new was not a valid location")
            false
        }
    }
}

The `vetoable{}` delegate will be run each time a vetoable value is updated. 
However, when using `vetoable{}`, you can choose to "veto" the value if it is not valid. If a value is vetoed, 
then the property will not be updated with the new value.
//------------------------------------------------------------------------------------------
