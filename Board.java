����   6 q  Practica02/Board  javax/swing/JPanel aBalls [LPractica02/Ball; 	LEFTBOARD I ConstantValue   
 
RIGHTBOARD TOPBOARD BOTTOMBOARD <clinit> ()V Code	    Practica02/Billiards   Width	    	     Height	     LineNumberTable LocalVariableTable <init>
  !  
  # $ % setFocusable (Z)V	 ' ) ( java/awt/Color * + BLACK Ljava/awt/Color;
  - . / setBackground (Ljava/awt/Color;)V
  1 2 % setDoubleBuffered this LPractica02/Board; paint (Ljava/awt/Graphics;)V
  8 5 6 : java/awt/Graphics2D	  <  
 > @ ? Practica02/Ball A B getImage ()Ljava/awt/Image;
 > D E F getX ()I
 > H I F getY
 9 K L M 	drawImage 3(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z	 ' O P + white
 9 R S / setColor
 9 U V W drawLine (IIII)V
 Y [ Z java/awt/Toolkit \ ] getDefaultToolkit ()Ljava/awt/Toolkit;
 Y _ `  sync
 b d c java/awt/Graphics e  dispose g Ljava/awt/Graphics; g2d Ljava/awt/Graphics2D; i StackMapTable setBalls ([LPractica02/Ball;)V balls 
SourceFile 
Board.java !               	    
          	    
              7      � d� � Pd� �       
     	               P     *�  *� "*� &� ,*� 0�              	              3 4    5 6          �*+� 7+� 9M*� ;� 5>� ',*� ;2� =*� ;2� C*� ;2� G*� JW�*� ;����,� N� Q,� � � � T,

� � T,
� 
� T,� � � � T� X� ^+� a�       B       
       ) ! 3   7  C $ J % X & d ' p ( ~ ) � * � +    *    � 3 4     � f g  
  h i   0 j   k    �  9#�   l m     >     *+� ;�       
    .  /         3 4      n    o    p