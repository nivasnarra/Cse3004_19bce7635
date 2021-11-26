import math
def distance_calc(points, total_points):
final = {}
for i in range(total_points):
dist = {}
for j in range(total_points):
if i == j:
continue
else:
dist[j] = math.dist(points[i], points[j])
final[i] = dist
red_final = {}
# d contains the set of nearest points
# finding index of the minimum in dict
# reducing the final dict to only one key-value pair
for k, v in final.items():
temp = min(v.values())
min_key = [key for key in v if v[key] == temp]
d = {
min_key[0]: temp
}
red_final[k] = d
print("Minimum distance from points: ", red_final)
min_key1 = 0
min_key2 = 0
c = 1
min_val = 0
min_k1 = 0
for key, val in red_final.items():
for x in val.values():
if c == 1:
min_val = x
min_key1 = val.keys()
min_key2 = key
else:
if x < min_val:
min_val = x
min_key1 = val.keys()
min_key2 = key
c = 100
for x in min_key1:
min_k1 = x
print("Nearest Neighbours: ", points[min_k1], points[min_key2])
if __name__ == '__main__':
points = {}
temp = []
axis = ['x', 'y']
total_points = int(input("Total no.of points: "))
for i in range(total_points):
temp = []
for j in range(2):
temp.append((int(input("Point-" + axis[j] + ": "))))
points[i] = temp
print("Points: ", points)
distance_calc(points, total_points)