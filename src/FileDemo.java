import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
// 第一种
import java.io.FileWriter;
import java.io.FileReader;
// 第二种
import java.io.FileOutputStream;
import java.io.FileInputStream;
// 第三种
import java.io.BufferedWriter;
import java.io.BufferedReader;
// 第四种
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;


/**
 * Create by xuefeng on 2023.2.1
 */

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Operate operate = new Operate();

        FileOperation fileExample = new FileExample("fileExample.txt");
        operate.operate(fileExample);
        FileOperation fileStreamExample = new FileStreamExample("fileStreamExample.txt");
        operate.operate(fileStreamExample);
        FileOperation bufferExample = new BufferExample("bufferExample.txt");
        operate.operate(bufferExample);
        FileOperation bufferStreamExample = new BufferStreamExample("bufferStreamExample.txt");
        operate.operate(bufferStreamExample);
    }
}

class Operate {
    void operate(FileOperation fileOperation) throws FileNotFoundException {
        fileOperation.createNewFile();
        fileOperation.writeSomeToFile();
        fileOperation.readSomeFromFile();
    }
}

interface FileOperation {
    void createNewFile();
    void writeSomeToFile() throws FileNotFoundException;
    void readSomeFromFile();
}

class BaseFile {
    String path;
    File file;

    public BaseFile(String path) {
        this.path = path;
        this.file = new File(this.path);
    }

    private void createFile() {
        try {
            boolean result = file.createNewFile();
            if (result) {
                System.out.println("文件已成功创建！");
            } else {
                System.out.println("文件未成功创建！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createNewFile() {
        if (!this.file.exists()) {
            this.createFile();
        } else {
            System.out.println("文件已存在，进行覆盖！");
            boolean result = file.delete();
            if (result) {
                this.createFile();
            } else {
                System.out.println("覆盖失败...");
                System.exit(0);
            }
        }
    }
}

class FileExample extends BaseFile implements FileOperation {

    public FileExample(String path) {
        super(path);
    }

    public void writeSomeToFile() {
        String content = "Java纯面向对象语言，非常纯粹！";
        if (this.file.exists()) {
            try (FileWriter fileWriter = new FileWriter(this.file)) {
                fileWriter.write(content);
                System.out.println("数据已成功写入！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法写入！");
            System.exit(0);
        }
    }

    public void readSomeFromFile() {
        char[] readContent = new char[1024];
        if (this.file.exists()) {
            try (FileReader fileReader = new FileReader(this.file)) {
                int length = fileReader.read(readContent);
                System.out.println("文件中的信息是：" + new String(readContent, 0, length));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法读取！");
            System.exit(0);
        }
    }
}

class FileStreamExample extends BaseFile implements FileOperation {

    public FileStreamExample(String path) {
        super(path);
    }

    public void writeSomeToFile() {
        String content = "从C -> Python -> Java 循序渐进";
        byte[] byteContent = content.getBytes();
        if (this.file.exists()) {
            try (FileOutputStream out = new FileOutputStream(this.file)) {
                out.write(byteContent);
                System.out.println("数据已成功写入！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法写入！");
            System.exit(0);
        }
    }

    public void readSomeFromFile() {
        byte[] byteRead = new byte[1024];
        if (this.file.exists()) {
            try (FileInputStream in = new FileInputStream(this.file)) {
                int length = in.read(byteRead);
                System.out.println("读取数据为：" + new String(byteRead, 0, length));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法读取！");
            System.exit(0);
        }
    }
}

class BufferExample extends BaseFile implements FileOperation {

    public BufferExample(String path) {
       super(path);
    }

    public void writeSomeToFile() {
        String content = "Java纯面向对象这一点非常纯粹";
        if (this.file.exists()) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.file))) {
                bufferedWriter.write(content);
                System.out.println("数据已成功写入！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法写入！");
            System.exit(0);
        }
    }

    public void readSomeFromFile() {
        if (this.file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.file))) {
                String readResult = bufferedReader.readLine();
                System.out.println("文件中的数据为：" + readResult);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法读取！");
            System.exit(0);
        }
    }
}

class BufferStreamExample extends BaseFile implements FileOperation {

    public BufferStreamExample(String path) {
        super(path);
    }

    public void writeSomeToFile() {
        String content = "Python体现着简洁，优雅，快速";
        byte[] byteContent = content.getBytes();
        if (this.file.exists()) {
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(this.file))) {
                bos.write(byteContent);
                System.out.println("数据已写入！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法写入！");
            System.exit(0);
        }
    }

    public void readSomeFromFile() {
        byte[] byteRead = new byte[1024];
        if (this.file.exists()) {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(this.file))) {
                int length = bis.read(byteRead);
                System.out.println("文件数据为：" + new String(byteRead, 0, length));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在，无法读取！");
            System.exit(0);
        }
    }
}
