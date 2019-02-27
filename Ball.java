����   6 �  Practica02/Ball  java/lang/Object Ball Ljava/lang/String; x D y dx dy v fi image Ljava/awt/Image; 	IMG_TAM_X I 	IMG_TAM_Y <init> ()V Code
      Ball.png	      javax/swing/ImageIcon
     ! getClass ()Ljava/lang/Class;
 # % $ java/lang/Class & ' getResource "(Ljava/lang/String;)Ljava/net/URL;
  )  * (Ljava/net/URL;)V
  , - . getImage ()Ljava/awt/Image;	  0  	  2  	  4  	 6 8 7 Practica02/Billiards 9  Width	  ;  	 6 = >  Height	  @ 	 @      	  D  
 F H G java/lang/Math I J random ()D@	!�TD-@       	  P   LineNumberTable LocalVariableTable this LPractica02/Ball; ii Ljavax/swing/ImageIcon; move@�@     
 F [ \ ] exp (D)D
 F _ ` ] cos	  b 
 
 F d e ] sin	  g  
 F i j ] abs
  l m  reflect StackMapTable	 p r q Practica02/Board s  
RIGHTBOARD	 p u v  BOTTOMBOARD@$       getX ()I getY getFi getdr
 F  � ] sqrt setX (D)V setY 
SourceFile 	Ball.java !     
            	     
                                  
        �     b*� *� � Y*� *� � "� (L*+� +� /* � 1* � 3*� 5ld�� :*� <ld�� ?* A� C*� E Kk Mk� O�    Q   .       
    %  +  1  >  K  R  a  R       b S T    E U V   W      �     v*Y� C*� Cw Xo� Zk� C**� C*� O� ^k� a**� C*� O� ck� f*� a� h�� *� f� h�� *� a*� f*Y� :*� ac� :*Y� ?*� fc� ?*� k�    Q   * 
      %   5 ! M " R # W % d & q ( u + R       v S T   n    � W  m      �     �*� :*� 1�c� o�g� h*� a� h�� * K*� Og� O*� ?*� 3�c� t�g� h*� f� h�� **� Ow� O*� : wg� h*� a� h�� * K*� Og� O*� ? wg� h*� f� h�� **� Ow� O�    Q   & 	   .  / ) 1 F 2 O 4 e 5 q 7 � 8 � : R       � S T   n    )%!  y z     0     *� :��    Q       = R        S T    { z     0     *� ?��    Q       A R        S T    | J     /     *� O�    Q       E R        S T    } J     A     *� a*� ak*� f*� fkc� ~�    Q       I R        S T    � �     >     *'� :�    Q   
    M  N R        S T          � �     >     *'� ?�    Q   
    Q  R R        S T      	    - .     /     *� /�    Q       U R        S T    �    �