from OfficeCenter import OfficeCenter

def main():
    my_office_center = OfficeCenter(
    area=100.0,
    floors=2,
    rooms=10,
    gas=True,
    water="HOT",
    electricity=True,
    isOpened="OPEN",
    carsInTheGarage=5,
    carCapacity=10,
    numberOfOffices=3,
    name="My Office Center"
)
    
    my_office_center.get_office_center_data()
    my_office_center.set_name("ABC")
    my_office_center.get_office_center_data()
    
    my_office_center.set_number_of_offices(5)
    my_office_center.get_office_center_data()
    my_office_center.add_office()
    my_office_center.get_office_center_data()
    my_office_center.remove_office()
    my_office_center.get_office_center_data()
    
    my_office_center.close_file()

if __name__ == "__main__":
    main()
