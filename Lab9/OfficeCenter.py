from enum import Enum
import os
from House import House
    
class OfficeCenterOperations:
    def add_office(self):
        pass

    def remove_office(self):
        pass

class OfficeCenter(House, OfficeCenterOperations):
    def __init__(self, area, floors, rooms, gas, water, electricity, isOpened, carsInTheGarage, carCapacity, numberOfOffices, name):
        super().__init__(area, floors, rooms, gas, water, electricity, isOpened, carsInTheGarage, carCapacity)
        self.numberOfOffices = numberOfOffices
        self.name = name
        self.file = open("File.txt", "w")

    def set_number_of_offices(self, number_of_offices):
        self.numberOfOffices = number_of_offices

    def get_number_of_offices(self):
        return self.numberOfOffices

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name

    def calculate_total_office_area(self):
        total_office_area = self.get_dimensions().get_area() * self.get_number_of_offices()
        self.file.write(f"Total office area: {total_office_area}\n\n")
        self.file.flush()

    def add_office(self):
        self.set_number_of_offices(self.get_number_of_offices() + 1)
        self.file.write(f"Added a new office. New number of offices: {self.get_number_of_offices()}\n\n")
        self.file.flush()

    def remove_office(self):
        if self.get_number_of_offices() > 0:
            self.set_number_of_offices(self.get_number_of_offices() - 1)
        self.file.write(f"Removed one office. New number of offices: {self.get_number_of_offices()}\n\n")
        self.file.flush()

    def change_name(self, name):
        self.set_name(name)
        self.file.write(f"New name of the office center: {name}\n\n")
        self.file.flush()

    def get_office_center_data(self):
        self.file.write(f"Name of the office center: {self.get_name()}\n")
        self.file.write(f"Number of offices: {self.get_number_of_offices()}\n\n")
        self.file.flush()
