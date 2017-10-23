import os
import sys

class RotatingFile(object):
    def __init__(self, directory='', filename='filename', max_files=sys.maxint, max_file_size=10000):
        self.count = 1
        self.directory, self.filename = directory, filename
        self.max_file_size, self.max_files = max_file_size, max_files
        self.finished, self.fh = False, None
        self.open()

    def rotate(self):
        """Rotate the file, if necessary"""
        if (os.stat(self.filename_template).st_size > self.max_file_size):
            self.close()
            self.count += 1
            if (self.count <= self.max_files):
                self.open()
            else:
                self.close()
                self.finished = True

    def open(self):
        self.fh = open(self.filename_template, 'w')

    def write(self, text=""):
        self.fh.write(text)
        self.fh.flush()
        self.rotate()

    def close(self):
        self.fh.close()

    @property
    def filename_template(self):
        return self.directory + self.filename + "_%0.2d" % self.count