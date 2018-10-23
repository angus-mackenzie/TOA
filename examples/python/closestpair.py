import math
#Angus Mackenzie

# Brute Force Closest Pair
def BruteForceClosestPair(p):
    minDistance = 10000000
    indexOne = -1
    indexTwo = -1
    for i in range(len(points)-1):
        for j in range(i+1,len(points)):
            distance = math.sqrt((p[i][1]-p[j][1])**2 + (p[i][0]-p[j][0])**2)
            if(distance < minDistance):
                minDistance = distance
                indexOne = i
                indexTwo = j
    return  {'dist':minDistance,'i1':indexOne,'i2':indexTwo}

if __name__ == '__main__':
    points = [[2, 3], [12, 30], [40, 50], [5, 1], [12, 10], [3, 4]]
    d = BruteForceClosestPair(points)
    print(d['dist'])
    print(points[d['i1']])
    print(points[d['i2']])