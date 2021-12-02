import java.io.*;

public class Ex15_18 {
	public static void main(String[] args) { 						// main
		
		if (args.length != 1) {								//args의 크기가 1이 아닐때
			System.out.println("Usage:  java Ex15_18 DIRECTORY");	
			System.exit(0);									//문자 출력, 종료
		}

		File dir = new File(args[0]);					//args[0]를 기반으로한 dir파일 생성

		if (!dir.exists() || !dir.isDirectory()) {		//dir이 존재하지 않거나 dir이 파일일 경우
			System.out.println("유효하지 않은 디렉토리입니다.");	
			System.exit(0);								//출력후 종료
		}

		File[] list = dir.listFiles();				//dir을 기반으로 하는 파일배열 생성

		for (int i = 0; i < list.length; i++) {		//파일배열의 크기만큼 반복
			String fileName = list[i].getName();	//문자열에 해당 파일배열 요소의 파일이름을 저장

			String newFileName = "0000" + fileName;		//위의 문자열 앞에 문자열 0000을 추가해 문자열 초기화
			newFileName = newFileName.substring(newFileName.length() - 7);//해당 문자열에서 끝에서 7째자리만큼 추출해 저장
			list[i].renameTo(new File(dir, newFileName));//파일명을 바꾸는 메서드
		} // end of for
	}// end of main
}
