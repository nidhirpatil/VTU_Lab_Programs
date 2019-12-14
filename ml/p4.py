import numpy as np
X = np.array(([2, 9], [1, 5], [3, 6]), dtype=float)# featues (hrs slept/hrs studied)
y = np.array(([92], [86], [89]), dtype=float)#label marks obtained
X = X/np.amax(X,axis=0) # maximum of X array longitudinally used to normalize
y = y/100

#Sigmoid Function to transfer neuron activation during forward propagation
def sigmoid (x):
    return (1/(1 + np.exp(-x)))
#Derivative of Sigmoid Function to Calculate the derivative of an neuron output
def derivatives_sigmoid(x):
    return x * (1 - x)

#intialize network
epoch=7000 #Setting training iterations
lr=0.2 #Setting learning rate
inputlayer_neurons = 2 #number of features in data set
hiddenlayer_neurons = 3 #number of hidden layers neurons
output_neurons = 1 #number of neurons at output layer

#weight and bias initialization
wh=np.random.uniform(size=(inputlayer_neurons,hiddenlayer_neurons))
bh=np.random.uniform(size=(1,hiddenlayer_neurons))
wout=np.random.uniform(size=(hiddenlayer_neurons,output_neurons))
bout=np.random.uniform(size=(1,output_neurons))

#Forward Propagation
for i in range(epoch):
    hinp=np.dot(X,wh)+bh  # this function returns a dot product of two arrays
    hlayer_act = sigmoid(hinp)
    outinp=np.dot(hlayer_act,wout)+bout
    output = sigmoid(outinp)

#Backpropagation
#Error at output layer
EO = y-output   # error at the output
outgrad = derivatives_sigmoid(output)
d_output = EO* outgrad

#error at hidden layer
EH = d_output.dot(wout.T)   #transpose 
hiddengrad = derivatives_sigmoid(hlayer_act)

#how much hidden layer wts contributed to error
d_hiddenlayer = EH * hiddengrad

#weight update
wout += hlayer_act.T.dot(d_output) *lr
wh += X.T.dot(d_hiddenlayer) *lr

print("Input: \n" + str(X))
print("Actual Output: \n" + str(y))
print("Predicted Output: \n" ,output)
