package lessons1829;
// �Է� : ��, �� , 2�����迭
// ��� : ������ ������ ���� , ������� ������ ����
class Solution {
	
    public boolean checkSameColor(int[][] array, int index1, int index2) {
  	  int currentColor = array[index1][index2];
  	  if( array[index1+1][index2] == currentColor ) {
  		  return true;
  	  }
  	  else if ( array[index1][index2+1] == currentColor ) {
  		  return true;
  	  }
  	  else if ( array[index1-1][index2] == currentColor ) {
  		  return true;
  	  }
  	  else if ( array[index1][index2-1] == currentColor ) {
  		  return true;
  	  }
  	  else 
  		  return false;
    }
	
	
	  public int[] solution(int m, int n, int[][] picture) {
	      int numberOfArea = 0;
	      int maxSizeOfOneArea = 0;
	      
	      
	      
	      int[] answer = new int[2];
	      answer[0] = numberOfArea;
	      answer[1] = maxSizeOfOneArea;
	      return answer;
	  }
	}