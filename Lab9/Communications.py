class Communications:
    def __init__(self, gas=False, water="COLD", electricity=False):
        self.gas = gas
        self.water = water
        self.electricity = electricity

    def get_gas(self):
        return self.gas

    def get_water(self):
        return self.water

    def get_electricity(self):
        return self.electricity

    def turn_on_gas(self):
        self.gas = True

    def turn_off_gas(self):
        self.gas = False

    def turn_on_cold_water(self):
        self.water = "COLD"

    def turn_on_hot_water(self):
        self.water = "HOT"

    def turn_off_water(self):
        self.water = "NONE"

    def turn_on_electricity(self):
        self.electricity = True

    def turn_off_electricity(self):
        self.electricity = False

    def turn_on_all(self):
        self.turn_on_gas()
        self.turn_on_cold_water()
        self.turn_on_electricity

    def turn_off_all(self):
        self.turn_off_gas()
        self.turn_off_water()
        self.turn_off_electricity