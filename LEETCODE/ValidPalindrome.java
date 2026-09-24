class Solution {
    public boolean isPalindrome(String s) {
        String t=s.toLowerCase();
String n="";
for(int i=0;i<t.length();i++){
  if((t.charAt(i)!=',')&&(t.charAt(i)!=' ')&&(t.charAt(i)!=':')){
n=n+t.charAt(i);
  }

}

String m="";
for(int j=n.length()-1;j>=0;j--){
m=m+n.charAt(j);
}

if(n.equals(m)){
 
return true;
}
else{
  
  return false;
}
    }
}