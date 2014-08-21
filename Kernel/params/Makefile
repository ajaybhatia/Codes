ifeq ($(KERNELVERSION),)

KDIR ?= /lib/modules/$(shell uname -r)/build/

build:
	$(MAKE) -C $(KDIR) M=$(PWD) modules
	
clean:
	$(MAKE) -C $(KDIR) M=$(PWD) clean
	
else

$(info Building with KERNELRELEASE = ${KERNELRELEASE})
obj-m := helloparams.o

endif	
