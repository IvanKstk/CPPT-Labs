import os
from Garage import Garage
from Dimensions import Dimensions
from Communications import Communications

class House:
    def __init__(self, area=None, floors=None, rooms=None, gas=None, water=None, electricity=None, isOpened=None, carsInTheGarage=None, carCapacity=None):
        self.dimensions = Dimensions(area, floors, rooms)
        self.communications = Communications(gas, water, electricity)
        self.garage = Garage(isOpened, carsInTheGarage, carCapacity)
        self.file = open("File.txt", "w")

    def get_dimensions_data(self):
        self.file.write("House Area: " + str(self.dimensions.get_area()) + " sq.m\n")
        self.file.write("Number of Floors: " + str(self.dimensions.get_floors()) + "\n")
        self.file.write("Number of Rooms: " + str(self.dimensions.get_rooms()) + "\n\n")
        self.file.flush()

    def calculate_total_area(self):
        total_area = self.dimensions.calculate_total_area()
        self.file.write("Total area of all rooms in the house: " + str(total_area) + " sq.m\n\n")
        self.file.flush()

    def add_rooms(self):
        if self.dimensions.get_rooms() / self.dimensions.get_floors() > 5:
            self.file.write("Maximum number of rooms (" + str(self.dimensions.get_rooms()) +
                             ") reached for the given number of floors (" + str(self.dimensions.get_floors()) + ")\n")
        else:
            self.dimensions.add_rooms()
            self.file.write("Room added. New number of rooms: " + str(self.dimensions.get_rooms()) + "\n")
        self.file.write("\n")
        self.file.flush()

    def sub_rooms(self):
        if self.dimensions.get_rooms() / self.dimensions.get_floors() <= 1:
            self.file.write("Minimum number of rooms (" + str(self.dimensions.get_rooms()) +
                             ") reached for the given number of floors (" + str(self.dimensions.get_floors()) + ")\n")
        else:
            self.dimensions.sub_rooms()
            self.file.write("Room subtracted. New number of rooms: " + str(self.dimensions.get_rooms()) + "\n")
        self.file.write("\n")
        self.file.flush()

    def turn_on_gas(self):
        self.communications.turn_on_gas()
        self.file.write("Gas turned on.\n\n")
        self.file.flush()

    def turn_off_gas(self):
        self.communications.turn_off_gas()
        self.file.write("Gas turned off.\n\n")
        self.file.flush()

    def turn_on_cold_water(self):
        self.communications.turn_on_cold_water()
        self.file.write("Cold water turned on.\n\n")
        self.file.flush()

    def turn_on_hot_water(self):
        self.communications.turn_on_hot_water()
        self.file.write("Hot water turned on.\n\n")
        self.file.flush()

    def turn_off_water(self):
        self.communications.turn_off_water()
        self.file.write("Water turned off.\n\n")
        self.file.flush()

    def turn_on_electricity(self):
        self.communications.turn_on_electricity()
        self.file.write("Electricity turned on.\n\n")
        self.file.flush()

    def turn_off_electricity(self):
        self.communications.turn_off_electricity()
        self.file.write("Electricity turned off.\n\n")
        self.file.flush()

    def turn_on_all(self):
        self.communications.turn_on_all()
        self.file.write("Gas turned on - " + str(self.communications.get_gas()) + "\n")
        self.file.write("Water turned on - " + str(self.communications.get_water()) + "\n")
        self.file.write("Electricity turned on - " + str(self.communications.get_electricity()) + "\n\n")
        self.file.flush()

    def turn_off_all(self):
        self.communications.turn_off_all()
        self.file.write("Gas turned off - " + str(self.communications.get_gas()) + "\n")
        self.file.write("Water turned off - " + str(self.communications.get_water()) + "\n")
        self.file.write("Electricity turned off - " + str(self.communications.get_electricity()) + "\n\n")
        self.file.flush()

    def get_communications_data(self):
        self.file.write("Gas state - " + str(self.communications.get_gas()) + "\n")
        self.file.write("Water state - " + str(self.communications.get_water()) + "\n")
        self.file.write("Electricity state - " + str(self.communications.get_electricity()) + "\n\n")
        self.file.flush()

    def open_garage_remote(self):
        self.garage.open_garage_remote()
        self.file.write("Garage opened remotely: " + str(self.garage.is_opened()) + "\n\n")
        self.file.flush()

    def open_garage_by_key(self):
        self.garage.open_garage_by_key()
        self.file.write("Garage opened by key: " + str(self.garage.is_opened()) + "\n\n")
        self.file.flush()

    def close_garage(self):
        self.garage.close_garage()
        self.file.write("Garage closed: " + str(self.garage.is_opened()) + "\n\n")
        self.file.flush()

    def get_garage_data(self):
        self.file.write("Garage state: " + str(self.garage.is_opened()) + "\n")
        self.file.write("Number of parked cars: " + str(self.garage.get_cars_in_the_garage()) + "\n")
        self.file.write("Maximum car capacity: " + str(self.garage.get_car_capacity()) + "\n\n")
        self.file.flush()

    def park_car(self):
        if not self.garage.is_opened():
            self.file.write("Garage is closed. Unable to park a car.\n")
        elif self.garage.get_cars_in_the_garage() + 1 > self.garage.get_car_capacity():
            self.file.write("No space in the garage. Parked " + str(self.garage.get_cars_in_the_garage()) +
                            " cars out of possible " + str(self.garage.get_car_capacity()) + "\n")
        else:
            self.garage.park_car()
            self.file.write("Car parked. New number of parked cars " +
                            str(self.garage.get_cars_in_the_garage()) + " cars out of possible " +
                            str(self.garage.get_car_capacity()) + "\n")
        self.file.write("\n")
        self.file.flush()

    def take_car(self):
        if not self.garage.is_opened():
            self.file.write("Garage is closed. Unable to take a car.\n")
        elif self.garage.get_cars_in_the_garage() <= 0:
            self.file.write("No cars in the garage.\n")
        else:
            self.garage.take_car()
            self.file.write("Car taken from the garage. New number of cars: " +
                            str(self.garage.get_cars_in_the_garage()) + " cars out of possible " +
                            str(self.garage.get_car_capacity()) + "\n")
        self.file.write("\n")
        self.file.flush()

    def add_car_capacity(self):
        self.garage.add_car_capacity()
        self.file.write("New garage car capacity: " +
                        str(self.garage.get_car_capacity()) + "\n\n")
        self.file.flush()

    def get_dimensions(self):
        return self.dimensions

    def close_file(self):
        self.file.close()