metadata {
  definition (name: "Virtual Switch",
              namespace: "CyborgMaster",
              author: "Jeremy Mickelson") {
    capability "Switch"
    capability "Actuator"
  }

  tiles {
    standardTile("on", "device.switch", decoration: "flat") {
      state "default", label: 'On', action: "onPhysical", backgroundColor: "#ffffff"
    }
    standardTile("off", "device.switch", decoration: "flat") {
      state "default", label: 'Off', action: "offPhysical", backgroundColor: "#ffffff"
    }
    main "on"
    details(["on","off"])
  }
}

def parse(String description) {}

def on() {
  log.debug "$version on()"
  sendEvent(name: "switch", value: "on", isStateChange: true)
}

def off() {
  log.debug "$version off()"
  sendEvent(name: "switch", value: "off", isStateChange: true)
}

private getVersion() {
  "PUBLISHED"
}
