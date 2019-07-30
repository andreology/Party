# Party
Java Application to solve "Party" problem for any size N, using a dynamic programming approach. 

Alice wants to throw a party and is deciding whom to call. She has N people to
choose from, and she has made up a list of which pairs of these people know each
other. She wants to pick as many people as possible, subject to two constraints:
at the party, each person should have at least k1 other people whom they know
and k2 other people whom they don’t know. (Note that you can’t know or not
know yourself. You don’t count in your own computation.)
Example input: 




10
7
00001110100000110000010100111010101000110000010110000010011100001110011111101101110101100011110111001010110001000101111001000100001110000001111001000111101101011001011100110100111011000010111010111000000110100000100110111001100000101101001100100111010110110001001111100001010111000100101100100101011010101010011010100101101000010111110000010111110111111100001110100111000101001010101010000110011101010010010001010111000110001010000001000010111001111011000011011010000001001101100101111101001101110010
00000000100000010000010100001000100000010000010010000010000100001000010100101001100101100001100000000010010000000101011011000000001010000000000000000100000000011000000100000000101011000010101010001001000110000000100000000001100000000000000000001010000010100001001110000001010101000000101000000000000010101000010010100000000000000010100000010111000101010000000100100000000001001000001010000100010001000000010001010000000100001000000011000010100001110010000010001110000000001000000000000000000001100000
00000100100000010100000100011010101000110010010110000010000100001000011101101001100101100011110011001010010001000101011001000100001110000001001001000101000101011000011100100100101011000010111010011000000110000000110000000001100000100001000000000110000010110001001111000001010111000100101000000101000010101010010010100000000000010000100000010111000101011100000100100100000001001000001010000110010001010010010001010000100100001000000001000110100001110010000010001110000001001001000000100000000001110010
00001110100000110100000111111010101000110000010110000011001100001111011101101001110111001011110111011010110001000101111101010100001110000001111000000111101101011001111100100100111111000010111011111011000110100001100110111001100000101101001100100111111110110001101111010101011111000100101100110101011010101010011010100101101000010111110100010111010111111100101110110111000111001010111010000110011101010010110001010110001100101110000001000110111011111010000011001110100101001101110101111101001101111010
10010110100001110100110111011010101100110100010110000011001100011111011111101001110011101011110111011010110001010101111101010100001110000001111011001111101101011001111100100110111111000010111011111011111110101001100110111011101000101111101100110111111110111011001111010111011111100100101110110101011011101110011010100101101001111111110100011111010111111100001110110111000111001010111111010110011101110011010001010111001100111110101101100110111111111011000011001110100101011101010101111101001101111011
10111010101111111100110111111010101110110110011111000011111101011111011111111111110111111011110111111110110001010101111101101100111111011011110011011111101101011101111101110110111111000011111011111011111110101001110111111111111100111111101100111111111110111011101111111111111111101101101110111111011111111010011011111101101001111111111101011111111111111110011111111111101111011110111011110110011101110011110011110111101111111111101111101111111111111011110011111111101101111101110101111101101101111111
10011100101111110100110011111010101110110100010110000011011101011011011111101101110111101011110111111010110001010101111101010100011110001001111011001111101101011001111101100110111111001011111011111011111110101001100110111111101000111111101100100111111110111011001111011111111111100100101110111101011011101110011010110101101001111111110100011111011111111100001110110111000101001110111011010110011101110011110001010111101110111111101111101110111110111011000011011110100101011101110001111101101101101010
00000000100000000000000100001000000000010000010010000010000000000000010100101001100101000001100000000010010000000100010001000000001010000000000000000100000000000000000100000000000011000000001010000000000100000000100000000000100000100000000000000010000010100001000100000001010100000000101000000000000010100000010000100010000000000000100000010010000000010000000100100000000001000000000000000100010001000000000000010000000100000000000001000000100001110000000010001110000000001000000000000000000001100000
11111111011111111101111111111110101111110111011111001011111111011111011111111111110111111011111111111111111101111101111111111101111111011011111111111111101111011101111111110111111111001111111111111011111110111011111111111111111100111111111100111111111111111011111111111111111111110111101111111111011111111110011011111101111011111111111111111111111111111110011111111111111111011110111111111111111111110111111111110111101111111111111111101011111111111011110111111111101111111101110111111101101101111111
00000000100000000000000100001010000100010000010010000010000000000000010100101001100101000001100000000010010000000100010001000000001010000000000000000100000000010000000100000000000011000000001010000000000100000000100000000000100000100000000000000010000010100001000100000001010100000000101000000000000010000000110000100000000000000000100000010110000000010000000100100000000001000000000000000100010001000000000000010000000100000000000001000000100001110000000010001110000000001000000000000000000001100000
00000110100000110100010100111010101000110000010110100010001100001110010101101001100101100011110111001010110001000101011001000100001110000001011000000111100111011010011100100100101011000010111010011000000110100000100000010001100000101001000000100111010110110001001111000001010111000000101100001101000010101010010010100111100000010100110000011111010111111100001110100110000001001000101010000110011001010000010001010110000100001010000001000010110001111010000010001110000001001101000100110001001001110010
00000110100000010100010100111010101000110000010110000010001100011010011101101001100101100011110111011010010001000101011001000100001110000001011010000111000101011000011100100100101011000010111010011000000110100000100000010001100000101001000000100110010110110001001111000001010111000100101000000101000010101010011010100101100000010100110000010111010111111000001110100110000001001000101010000110011001010000010001010110000100001010000001000010110011111010000010001110000001001101000100110001001001100010
00000110100000110100010100011010101000110000010110000011001100001110011101101001100101100011110111001010110001000101011001000100001110000001001000000111100101011000011100100100101011000010101010011000000110100000100000010001100010101011000000100111010110111001001111000001010111000100101110011101000010101010011010100101101000010100110000010111010111111100001110100110000001001000101010000110011001010000010001010110000100001010000001000010110011111010000010001110000001001101000100110001001001110110
00001110100000110100110111111010101000110100010110000010011100001111011111101101110101101011110111011010110001000101111001000000001110000001111001000111101101011001011100100110111111000010111011111011001110100001100110011001101000101101001100100111110110111001001111010101011111000100101110110101011011101010011010100001101000011111110000010111010111111100001110100111000111001010111010000110011101110010110001010111001100101010100001000110111011111010000011001110000101001101100101111101001101110010
10011110101011010100110111111010101110110100010110000011011101011111011111101101110111101011110111111010110001010101111101010100011110000001111011001111101101011001111101100110111111000011111011111011111110101001100110111011101000111111001100110111111110111011001111011111111111100100101110111101011011101110011010100101101001111101110100011110011111111100001110110111000111001110111011010110011101110011110001010011001110111111101011101100111111111011000011011110100101011101110101111101101101111011
11111110101111101100111111111010101110110111011111001011111101011111011111111111110111111011111111111110110101110101111101111101111111011011111111111111101111011101111101110111111111001011111111111011111110101011110111111111111100111111111100101111111111111011111111111111111111100111101110111111011111111110011011111101111011111111111101111111111111111110011110110111101111011110111011111111111111110011111011110111101111111111111111101111111111111011110011111111101111111101110101111101101101111111
00000100100000010000100100001010101000110000010010000010000100001000010100101001100101100011100001100010010000000101011001000000001110000101011000000100000100011000001100100100100011000010111010001000000110000000100000000001100010100000000000000010000010100001001110000001010101000100101000000001000010101010010010100000000000010000100000010111000101010100000100100000010001001000001110000100010001000000010001010001000100101010001001000010100001110010000010001110000101001000000000100000000001110010
00111110101111110010110111111010101110110110011111000011111101011111011111111111110111111011110111111110110001010101111101110100111111011011111011011111101101011101111101110110111111000011111011111011111110101001110111111111111100111111101100111111111110111011100111111111111111100101101110111111011111111110011011111101101001111111111101011111111111111110011110110111101111011110111011010110011101110011110011110111101111111111101111101011111111111011110011111111101101111101110101111101101101111111
00000000000000000100000100001000000000010000000010000010000000000000010000001001100101000011100000000010010000010100010000000000001010000000000000000000000000000000000100000000000011000000001000000000000000000000100000000000100000100000000001000000000010100001000100000001010100000000101000000000000010100000010000100000000000000000100000000010000000010000000100100000000000000000000000000100010001000000000000010000000000000000000001000000100001110000000010001110000000001000000000000000000001100000
00000000100000000000000100001000100000010000010010000010000000000000010100101001100101000001100000000010010000000100011001000000001010000000000000000100000000010000000100000000000011000000101010001000000100000000100000000001100000101000000000000010000010100001000100000001010100000000101000000000000010100000010100100000000000000000100000010110000100010000000100100000000001000000000000000100010001000000010001010000000100000000000001000000110001110000000010001110000100001000000000000001000001100000
00001110100001111100010110111010101000110100010110000010011100001110011101101001110111111011110111011010110001000101111101000100001110000001111010001111101101011001111100100100111111000010111011111000101110110001100110011001101000101101001100100111110110111001001111010101010111000100101110100101011011101110011010100111101001010101110100010111010111111100001110110111000111001010101011000110011101010010110001010111000100001110000101000010111111111010000011001110000001001101110101110101000101110011
11001110101111110100100111111000101110110100010110000011011101011111011111101101110111101011110111111010110001010101111101110100011110000001111011001111101101011001011101100110111011000011111011111011111110101001100111111111101000111111101100110111111110111011001111111111111111100100101110111111011011101110011010111101100001111111110100011111011111111100011110110111001111011100111011000110011101110011110011110111101110111111101111101110111111111011000011011110100101011101110101111101101101111011
00000000100000010000000100001000100000010000010010000010000100001000010100101000100101000001100000000010010000000100011001000000001010000000000000000100000000011000000100000000100011000000101010001000000110000000100000000001100000100001000000000010000010100101000110000001010101000000101000000000000010100000010010100000000000000000100000010111000100010000000100100000000001001000000000000100010001000000010001010000000100000000000001000000100001110010000010001110000000001000000000000000000001100000
11111101111111111111111011111111111111110111011111101111111111011111011111111111110111111111111111111111111111111101111111111101111111011111111111111111101111111111111111111111111111111111111111111111111111111111111111111111111111111111111110111111111111111111111111111111111111111111101111111101111111111110011011111111111111111111111111111111111011111111111111111111111111010110111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110111111111111101111111
00011110100001110100110101111010101000110100010110000011011100001111011111101001110111101111110111011010110001000101111101010100001110000001111011000111100101011001111100100100111111000010111011111011111110100001100110111011101000101101101100100111011110111001001111010101011111100100101110100101011011101110011010100101101001011101110100010111010111111100001110110111000111001010111011010110011101110011110001010111101100001110100001000110111111111010000011001110100101001101110101111101001101111010
00011110100001110100010110111010101000110100010110000010011100001111011101101001110111101011110111011010110001000101111001010100001110000001111011000111101101011001111100100100111111000010111011111001101110100001100110111001101000101101101100100111110110110001001111011001001111000100101110100101011010101110011010100101101001010111110100010111010111111110001110110111010101001010111010000110011101110010010001010110000100011110101001000010111001111010000011001110100001001101100101111101001101110010
10010110101101110100110111011010101100110100010110000011011101011111011111101101110111101011110111111010110001010101111101010100011110000001111011001111101101111001111101100110111111000011111011111011111110101001100110111111101000111111101100110111111110111011001111011111111111100100101110111101011011101110011010110101101001111110110100011111011111111100001111110111000111001110111011010110011101110011110001010111001100110111101111101110111111111011000011011110100101011101110101111001101101111011
10111110101111110100110111101010101110110100010110000011011101011111011111101101110111101011110111111010110001010101111101110100011110000011111011011111101101011001111101100110111111000011111011111011111110101001110111111110101100111111101100110111111110111011001111111111111111100100101110111111011011101110011010111101101001111111110100011111011111101110011110110111001111011110111011010110011101110011110011010111101110111111101111101110111111111011000011011110100101011101110101111101101101111011
11111111111111111111111111110111111111110111011111101111111111011111011111111111110111111111111111111111111111111101111111111101111111011111111111111111101111111111111111111111111111111111111111111111111111101111111111111111111111111111111110111111111111111111111111111111111111111111101111111111110111111111011111111111111111111111111111111111111111111111110111111111111111011110111111111111111111111111111111111111111111101111111111111111111111111111111111111111111111111111110111111011111111111111
00000000100000000000000100001000100000010000010010000010000000000000010100101001100101010001100000000010010000000100011011000000001010000000000000000100000000010000000100000000000011000000101010001000000100000000100000000001100000100000000000000010000010100001000100000001010100000000101000000000000010100000010000100000000000000000100000010110000000010000000100100000000001000000000000000100010001000000010000010000000100000000000001000000100001110000000010001110000000001000000000100000000001100001
10111110111111111100100111111000101110110111011111001011111101011111011111111111110101111011110111111110110101110101111101101101111111011011111111011111101111011101111101110111111111000011111111111011111110101011110111111111111100111110101100110111111110110011111111111111111111100101101110111111011111111110011011111101101011111111111101011101111111111110011110110111101111011110111011111111011101110011110011110111101111111111101111101111111111111011110011111111101111111101110101111101101101111111
00000000000000000000000100001000000000000000000000000000000000000000000000001000100001000000100000000010010000000100010000000000001010000000000000000000000000000000000000000000000010000100001000000000000000000000000000000000000000100000000000000000000010100001000010000000010100000000000000000000000010000100000000100000000000000000100000010010000000010000000000100000000000000000000000000100000000000000000000000000000000000000000000000000000000110000000010000000000000000000000000000000000000000000
11111110101111111101111111111110001110110111011111001011111101011111011111111111110111111011111111111110110101110101111111111101111111011011111111111111101111011101111101110111111111001011111111111011111110101011111111111111111100101111111100111111111111111011111111111111111111110111101110111111011111110110011011111101111011111111111111111111111111111110011110110111101111011110111011111111111111110111111011110111111111111111111111101111111111111011110011101111101111111101110101111101101101111111
00000000000000000000000100001000000000010000000010000010000000000000010000001001100101000001100000100010010000000100010000000000101010000000000000000010000000000000000100000000000011000000011000010000000000000000100000000000000000100000000000000000000010100001100000000001110100000000000000100000000010100000010000100010000000000000100000000010000000010000000100100000000000000000000000000100000001000000000000010000000000000000000001000000000001110000000010000110000000001000000000000000000001000000
10111110101111111100110111111010100110110110011111001011111101011111011111111111110111111011110111111110110101010101111101111100111111011011111011011111101011011101111101110110111111000011111011111011111110101011110111111111111100111111101100111111111110011011101111101111111111100101101110111111011111111110011011111101101011111111111111011111111111111110011110110111101111001110111011111111011101110011110011110111101111111111101111101111111111110011110011111111101111111101110101011101101101111111
00001110110000110100010100111010101000110000010110000010011100001111011101101001110101100011110011001010110001000101011001000100001110000001001000000111101101011000011100100100101011000010111010111000000110100000100110010001100000101101001000100111011110110001101111000001010111000100101100110101011010101010011010100101100000010101111000010111010111111100001110100111000001001000101010000110011101010010010001011111000000001010000000000010111001110011000011001110000001001101100101011101001101110010
00000110100000110100010100
