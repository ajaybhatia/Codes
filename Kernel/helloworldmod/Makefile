## KDIR: placeholder for kernel build directory
KDIR=/lib/modules/$(shell uname -r)/build/

## Creating the module object file
obj-m += helloworld.o

## Change the directory to KDIR and then build the module in the current working directory
all:
	make -C $(KDIR) M=$(PWD) modules
	
clean:
	make -C $(KDIR) M=$(PWD) clean	
