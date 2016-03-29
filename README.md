# devideIMG
png画像を複数のファイルに分割する  

実行ファイルと0.pngは同じディレクトリに置く。


## 実行

実行時に以下の形式で入力を与える。  

>"M P"  
M : 分割方式（横に分割 : 0 / 縦に分割 : 1）  


P : 座標（横分割ならx座標、縦分割ならy座標）

## 実行例

>javac Main.java  

>java Main  

>input:1 32  
  
画像をy座標32の位置で分割する。