class Garage:
    def __init__(self, is_opened="CLOSED", cars_in_the_garage=0, car_capacity=0):
        self.is_opened = is_opened
        self.cars_in_the_garage = cars_in_the_garage
        self.car_capacity = car_capacity

    def is_opened(self):
        return self.is_opened

    def get_cars_in_the_garage(self):
        return self.cars_in_the_garage

    def get_car_capacity(self):
        return self.car_capacity

    def open_garage_remote(self):
        self.is_opened = "OPEN"

    def open_garage_by_key(self):
        self.is_opened = "OPEN"

    def close_garage(self):
        self.is_opened = "CLOSED"

    def park_car(self):
        self.cars_in_the_garage += 1

    def take_car(self):
        self.cars_in_the_garage -= 1

    def add_car_capacity(self):
        self.car_capacity += 1
