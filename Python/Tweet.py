print('*' * 25)
tweet = input('enter your tweet: ')
max_chars = 140
if len(tweet) > max_chars:
    print(f'Your {len(tweet) } char tweet is {len(tweet) - 140} too long.')
else:
    print(f'That {len(tweet)} char will work!')