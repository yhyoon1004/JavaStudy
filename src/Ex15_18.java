import java.io.*;

public class Ex15_18 {
	public static void main(String[] args) { 						// main
		
		if (args.length != 1) {								//args�� ũ�Ⱑ 1�� �ƴҶ�
			System.out.println("Usage:  java Ex15_18 DIRECTORY");	
			System.exit(0);									//���� ���, ����
		}

		File dir = new File(args[0]);					//args[0]�� ��������� dir���� ����

		if (!dir.exists() || !dir.isDirectory()) {		//dir�� �������� �ʰų� dir�� ������ ���
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");	
			System.exit(0);								//����� ����
		}

		File[] list = dir.listFiles();				//dir�� ������� �ϴ� ���Ϲ迭 ����

		for (int i = 0; i < list.length; i++) {		//���Ϲ迭�� ũ�⸸ŭ �ݺ�
			String fileName = list[i].getName();	//���ڿ��� �ش� ���Ϲ迭 ����� �����̸��� ����

			String newFileName = "0000" + fileName;		//���� ���ڿ� �տ� ���ڿ� 0000�� �߰��� ���ڿ� �ʱ�ȭ
			newFileName = newFileName.substring(newFileName.length() - 7);//�ش� ���ڿ����� ������ 7°�ڸ���ŭ ������ ����
			list[i].renameTo(new File(dir, newFileName));//���ϸ��� �ٲٴ� �޼���
		} // end of for
	}// end of main
}
