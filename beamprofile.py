# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
# Libraries
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

# First
df1 = pd.read_csv('C:/Users/rzala/Documents/Graphs/Beam_Profiles/INV-D-000523- F7-R_25um-10.csv')
startlabel = df1.index[df1['Theta / °'] == 90].tolist()  # finding the values at which theta = 90
endlabel = df1.index[df1['Theta / °'] == -90].tolist()  # finding the values at which theta = -90

# theta1 = np.deg2rad(df1.iloc[0:37,2])
# r1 = df1.iloc[0:37,7]

# theta2 = np.deg2rad(df1.iloc[37:74,2])
# r2 = df1.iloc[37:74,7]

theta3 = np.deg2rad(df1.iloc[startlabel[2]:endlabel[2], 2])
r3 = df1.iloc[startlabel[2]:endlabel[2], 7]

# Second
df2 = pd.read_csv('C:/Users/rzala/Documents/Graphs/Beam_Profiles/870-Raw Data - G6-R-25um-10-1.csv')
startlabel2 = df2.index[df2['Theta / °'] == 90].tolist()  # finding the values at which theta = 90
endlabel2 = df2.index[df2['Theta / °'] == -90].tolist()  # finding the values at which theta = -90

theta3metal = np.deg2rad(df2.iloc[startlabel2[2]:endlabel2[2], 2])
r3metal = df2.iloc[startlabel2[2]:endlabel2[2], 7]

ax = plt.subplot(111, projection='polar')
ax.plot(theta3, r3, label='INV-D-523_25um-10 - Phi average')
ax.plot(theta3metal, r3metal, label='INV-D-870_25um-10 - Phi average')

ax.grid(True)
legend = ax.legend()
ax.set_xlabel('Photometric (lx)', labelpad=-40, fontsize=11)
ax.set_title('Theta (°)', pad=-36, fontsize=11)
ax.set_theta_zero_location("N")
plt.tick_params(axis='y', which='major', labelsize=7)
plt.legend(loc=(0.7, 0.9))
ax.set_thetamin(-90)
ax.set_thetamax(90)
plt.show()
