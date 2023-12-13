class Dimensions:
    def __init__(self, area=0, floors=0, rooms=0):
        self.area = area
        self.floors = floors
        self.rooms = rooms

    def get_area(self):
        return self.area

    def get_floors(self):
        return self.floors

    def get_rooms(self):
        return self.rooms

    def calculate_total_area(self):
        total_area = self.area * self.rooms
        return total_area

    def add_rooms(self):
        self.rooms += 1

    def sub_rooms(self):
        self.rooms -= 1