
This program executes the Diffie Hellman protocol while encypting  and transferring a file between a client and a server application.
Both the client and server have 2 modes. That is, debug mode and normal mode.

To run the Server in debug mode using cmd line type:

	java Sever <port> debug  ----------------------> where <port> is an acceptable TCP port value (greater than 1024, less than 65535)

	To run the server in regular mode using cmd line type:

	java Server <port>  ----------------------> where <port> is an acceptable TCP port value (greater than 1024, less than 65535)

To run the Client in debug mode, using cmd line type:

	java Client 0.0.0.0 <port> debug <bits>  ----> where <bits> is the number of bits to use when calculating the sophie germain prime, (1023 is suggested, 512 for debugging), <port> is described above.

	To run the server in regular mode using cmd line type:

	java Client 0.0.0.0 <port> <bits>  ----> where <bits> is the number of bits to use when calculating the sophie germain prime, (1023 is suggested, 512 for debugging), <port> is described above.
	
The port number and number of bits must be set on the client side, otherwise an error will occur.

The utility file, PrimeUtil has been added and is used to calculate large prime values.
