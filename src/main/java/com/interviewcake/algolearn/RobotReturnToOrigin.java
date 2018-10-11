package com.interviewcake.algolearn;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;

        for (char c : moves.toCharArray()) {
            switch (c){
                case 'L': {
                    if(right>0){
                        right--;
                    }else {
                        left++;
                    }
                    break;
                }case 'R': {
                    if(left>0){
                        left--;
                    }else{
                        right++;
                    }
                    break;
                }case 'U': {
                    if(down>0){
                        down--;
                    }else{
                        up++;
                    }
                    break;
                }case 'D':{
                    if(up>0){
                        up--;
                    }else {
                        down++;
                    }
                    break;
                }
            }
        }
        if(left+right+up+down == 0){
            return true;
        }

        return false;
    }

    public boolean judgeCircle2(String moves) {
        if(moves == null || moves.length() == 0) {
            return true;
        }
        int[] arr = new int[4];
        for(char c : moves.toCharArray()) {
            if(c == 'R') {
                arr[0]++;
            } else if(c == 'L') {
                arr[1]++;
            } else if(c == 'U') {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
        if(arr[0] == arr[1] && arr[2] == arr[3]) {
            return true;
        }
        return false;
    }



}
