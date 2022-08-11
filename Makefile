CC = clang

# Make sure to use the full CFLAGS before turning in. Uncomment this for lax
# checking during development, if you need to.
# CFLAGS =

# You can comment this out and use the above CFLAGS instead if you need to,
# during development.
CFLAGS = -g -Wall -Wpedantic -Werror -Wextra


all: wordle

wordle: wordle.c
	$(CC) $(CFLAGS) wordle.c -o wordle

clean:
	rm -f wordle

format:
	clang-format -i -style=file *.[c,h]
