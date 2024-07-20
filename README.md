# CALAMP

The objective of this task is to calculate the quantity and power of lamps needed for the illumination of each type of room.

To calculate the number of lamps needed for each room, we must obtain some information such as the type of room, length, width, and type of lamp. The room is chosen by the user, and the area is calculated by multiplying the length by the width, as shown in formula 1.1. After obtaining the area value, the illuminance value of the chosen room is used, according to table 1.1. Now, we obtain the total lumen value by multiplying the area value by the illuminance of the room, as shown in formula 1.2. Finally, the type of lamp is chosen, according to table 1.2. The calculation of the number of lamps is obtained by dividing the total lumen by the lumen of the lamp. The result will give the user the number of lamps needed for the room according to ABNT 5413 and the lumen of the lamp that will be used.

1.3 Formulas and Tables

Formula 1.1
Area of the room (A)
𝐴 =length × width
//////////////////////////////////////////////////////////////

Table 1.1 – Ideal Illuminance Level

Room	Illuminance (Lux)
Living Room	- 150
Bedroom	- 100
Kitchen	- 400
Bathroom	- 150
//////////////////////////////////////////////////////////////

Formula - 1.2

Total Lumen of the room (L)
𝐿 = illuminance × area of the room
L = illuminance×area of the room
/////////////////////////////////////////////////////////////

Table 1.2 – Comparison between types of lamps

Lumen	CFL (W)	LED (W)
800 - Lumen	13-15 W	8-12 W
1,600 - Lumen	25-30 W	16-20 W
/////////////////////////////////////////////////////////////

Table 1.3 – Predefined Lumen per Room for Better Lamp Performance

Room	Predefined Lumen (Lux)
Living Room	- 1600
Bedroom	- 800
Kitchen	- 1600
Bathroom	- 800
/////////////////////////////////////////////////////////////


