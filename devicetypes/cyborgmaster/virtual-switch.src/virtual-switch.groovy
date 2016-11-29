metadata {
  definition (name: "Virtual Switch",
              namespace: "CyborgMaster",
              author: "Jeremy Mickelson") {
    capability "Actuator"
    capability "Switch"
  }

  tiles {
    standardTile("on", "device.switch", decoration: "flat") {
      state "default", label: 'On', action: "on", backgroundColor: "#ffffff"
    }
    standardTile("off", "device.switch", decoration: "flat") {
      state "default", label: 'Off', action: "off", backgroundColor: "#ffffff"
    }
    main "on"
    details(["on","off"])
  }
}

def parse(String description) {}

def on() {
  log.debug "${device.getName()} on()"
  sendEvent(name: "switch", value: "on", isStateChange: true)
}

def off() {
  log.debug "${device.getName()} off()"
  sendEvent(name: "switch", value: "off", isStateChange: true)
}

private getVersion() {
  "PUBLISHED"
}
