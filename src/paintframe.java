import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.Random;

////////////////////////////////////////////// MASSIMO ALBANESE | ICS4U | 03/23/2015

public class paintframe extends JFrame{
	static int shape = 1; // Choix de figure
	static int diametreint = 10; // Choix de diam�tre de la figure 
	private JPanel contentPane; 
	static paintarea drawpad = new paintarea(); // Frame de peint
	private JTextField diametre;
	static Random randcolour = new Random();
	static boolean random = false;
	
	public static void main(String[] args) {
					paintframe frame = new paintframe();
					frame.setVisible(true);
					frame.getContentPane().add(drawpad, BorderLayout.CENTER);}
	
	public paintframe(){
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 537);
		
		JMenuBar menuBar = new JMenuBar(); // Nouveau instance de menu
		setJMenuBar(menuBar);
		
		////////////////////////////////////////////Fichier
		JMenu jmFichier = new JMenu("Fichier");
		menuBar.add(jmFichier);
		
		JMenuItem jmEffacer = new JMenuItem("Effacer"); // Bouton pour effacer qui appelle la fonction clear dans la classe paintarea
		jmFichier.add(jmEffacer);
		jmEffacer.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        drawpad.clear();}});
		
		JMenuItem jmQuitter = new JMenuItem("Quitter"); // Ferme le syst�me 
		jmFichier.add(jmQuitter);
		jmQuitter.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  System.exit(0);}});
		
		/////////////////////////////////////////////////// Ajout du jmenu Edition
		
		JMenu jmEdition = new JMenu("Edition");
		menuBar.add(jmEdition);
		
        /////////////////////////////////////////////////// Forme jmenu
		JMenu jmPointeur = new JMenu("Forme du pointeur");
		jmEdition.add(jmPointeur);
		
		JMenuItem jmCarre = new JMenuItem("Carre"); // D�signe le nombre de forme
		jmPointeur.add(jmCarre);
		jmCarre.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 1;}});
		
		JMenuItem jmRond = new JMenuItem("Cercle");
		jmPointeur.add(jmRond);
		jmRond.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 2;}});
		
		JMenuItem jmLigne = new JMenuItem("Ligne");
		jmPointeur.add(jmLigne);
		jmLigne.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 3;}});
		
		JMenuItem jmLoopy = new JMenuItem("Loopy");
		jmPointeur.add(jmLoopy);
		jmLoopy.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 4;}});
		
		JMenuItem jmJoie = new JMenuItem("Joie");
		jmPointeur.add(jmJoie);
		jmJoie.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 5;}});
		
		/////////////////////////////////////////////////// Couleur jmenu
		JMenu jmCouleur = new JMenu("Couleur du pointeur");
		jmEdition.add(jmCouleur);
		
		JMenuItem jmRed = new JMenuItem("Rouge");
		jmCouleur.add(jmRed);
		jmRed.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.red); 
		    	  random = false;}});
		
		JMenuItem jmBlue = new JMenuItem("Bleu");
		jmCouleur.add(jmBlue);
		jmBlue.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.blue); 
		    	  random = false;}});
		
		JMenuItem jmGreen = new JMenuItem("Vert");
		jmCouleur.add(jmGreen);
		jmGreen.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.green);
		    	  random = false;}});
		
		JMenuItem jmNoir = new JMenuItem("Noir");
		jmCouleur.add(jmNoir);
		jmNoir.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.black);
		    	  random = false;}});
		
		JMenuItem jmBlanc = new JMenuItem("Blanc");
		jmCouleur.add(jmBlanc);
		jmBlanc.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.white); 
		    	  random = false;}});
		
		
		JMenuItem jmRandom = new JMenuItem("Random");
		jmCouleur.add(jmRandom);
		jmRandom.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  random = true;}});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setBounds(0, 0, 734, 37);
		contentPane.add(buttonpanel);
		buttonpanel.setLayout(null);
		
		/////////////////////////////////////////////////////// Shapes
		
		JButton btnCarre = new JButton("Carr�");
		btnCarre.setBounds(7, 7, 75, 23);
		buttonpanel.add(btnCarre);
		btnCarre.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 1;}});
		
		JButton btnCercle = new JButton("Cercle");
		btnCercle.setBounds(92, 7, 75, 23);
		buttonpanel.add(btnCercle);
		btnCercle.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 2;}});
		
		JButton btnLigne = new JButton("Ligne");
		btnLigne.setBounds(177, 7, 75, 23);
		buttonpanel.add(btnLigne);
		btnLigne.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  shape = 3;}});
		
		//////////////////////////////////////////////////////// Couleurs
		
		JButton btnRouge = new JButton("Rouge");
		btnRouge.setBounds(267, 7, 70, 23);
		btnRouge.setForeground(Color.RED);
		btnRouge.setBackground(Color.RED);
		buttonpanel.add(btnRouge);
		btnRouge.addActionListener(new ActionListener() { // Change le couleur du graphique � rouge 
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.red); 
		    	  random = false;}});
		
		JButton btnBleu = new JButton("Bleu");
		btnBleu.setBounds(342, 7, 70, 23);
		btnBleu.setForeground(Color.BLUE);
		btnBleu.setBackground(Color.BLUE);
		buttonpanel.add(btnBleu);
		btnBleu.addActionListener(new ActionListener() { // Change le couleur du graphique � bleu 
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.blue); 
		    	  random = false;}});
		
		JButton btnVert = new JButton("Vert");
		btnVert.setBounds(417, 7, 70, 23);
		btnVert.setForeground(Color.GREEN);
		btnVert.setBackground(new Color(0, 128, 0));
		buttonpanel.add(btnVert);
		btnVert.addActionListener(new ActionListener() { // Change le couleur du graphique � vert
		      public void actionPerformed(ActionEvent e) {
		    	  drawpad.graphic.setPaint(Color.green); 
		    	  random = false;}});
		
		JButton btnNoir = new JButton("Noir");
		btnNoir.setForeground(Color.BLACK);
		btnNoir.setBackground(Color.BLACK);
		btnNoir.setBounds(492, 7, 70, 23);
		buttonpanel.add(btnNoir);
		btnNoir.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) { // Change le couleur du graphique � noir 
		    	  drawpad.graphic.setPaint(Color.black); 
		    	  random = false;}});
		
		JButton btnBlanc = new JButton("Blanc");
		btnBlanc.setForeground(Color.BLACK);
		btnBlanc.setBackground(Color.WHITE);
		btnBlanc.setBounds(567, 7, 70, 23);
		buttonpanel.add(btnBlanc);
		btnBlanc.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) { // Change le couleur du graphique � blanc
		    	  drawpad.graphic.setPaint(Color.white);
		    	  random = false;}});
		
		diametre = new JTextField();
		diametre.setBounds(647, 18, 86, 19);
		buttonpanel.add(diametre);
		diametre.setColumns(10);
		diametre.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent arg0){ 
						    try {diametreint = (Integer.parseInt(diametre.getText())/2); // Try catch pour assurer que le diam�tre est un int 
						    } catch (java.lang.NumberFormatException e){}}});
		JLabel lbldiametre = new JLabel("Diam\u00E8tre");
		lbldiametre.setBounds(646, 2, 87, 14);
		buttonpanel.add(lbldiametre);}	
}

class paintarea extends JComponent { // Le peinteur 
	  Image drawingimage; // La plane de l'image 
	  Graphics2D graphic; // Le component graphique qui dessine 
	  
	  int presentX, presentY, oldX, oldY; // Coordon�es du peinteur 
	  public paintarea() {
		  setBounds(0, 37, 750, 500); // Grandeur du image (place de peinture)
	    setDoubleBuffered(false);
	    addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent mouseclick) { // Prend les coordonn�es quand la souris �tait cliqu�
	        oldX = mouseclick.getX(); // Prend les coordonn�es pr�sents et le d�signe comme le point de commencement 
	        oldY = mouseclick.getY();
	        presentX = mouseclick.getX(); // Prend les coordonn�es 
	        presentY = mouseclick.getY();
	        if (paintframe.random == true){
	        	float R = paintframe.randcolour.nextFloat();
	    		float G = paintframe.randcolour.nextFloat();
	    		float B = paintframe.randcolour.nextFloat();
	    		Color randomColor = new Color(R, G, B);
	    		paintframe.drawpad.graphic.setPaint(randomColor);}
	        painter();}}); // Appelle le peinteur 
	    
	    addMouseMotionListener(new MouseMotionAdapter() { // Prend les coordonn�es quand la souris �tait boug�
	      public void mouseDragged(MouseEvent mouseclick) {
	        presentX = mouseclick.getX();
	        presentY = mouseclick.getY();
	        if (paintframe.random == true){
	        	float R = paintframe.randcolour.nextFloat();
	    		float G = paintframe.randcolour.nextFloat(); //////////////// PER CIRCLE
	    		float B = paintframe.randcolour.nextFloat();
	    		Color randomColor = new Color(R, G, B);
	    		paintframe.drawpad.graphic.setPaint(randomColor);}
	        painter();}});} // Appelle le peinteur

	  public void paintComponent(Graphics drawer) { // Cr�e l'espace de peinture, ou l'image (drawingimage)
	    if (drawingimage == null) {
	      drawingimage = createImage(getSize().width, getSize().height);
	      graphic = (Graphics2D) drawingimage.getGraphics();
	      graphic.setRenderingHint(RenderingHints.KEY_ANTIALIASING, // Ajoute l'anti-aliasing
	          RenderingHints.VALUE_ANTIALIAS_ON);
	      clear();}
	    drawer.drawImage(drawingimage, 0, 0, null);
	  }

	  public void clear() { 
	    graphic.setPaint(Color.white);
	    graphic.fillRect(0, 0, getSize().width, getSize().height); // Repeint tout le carr� en blanc pour "effacer"
	    graphic.setPaint(Color.black); // Change la peinture � noire
	    repaint();}
	  
	  public void painter(){ // Choisi la forme pour peinturer avec 
		  switch (paintframe.shape){
	        case(1):{
	        	graphic.fillRect(oldX, oldY, paintframe.diametreint, paintframe.diametreint); // Prend le diam�tre en consid�ration
	        	break;}
	        case(2):{
	        	graphic.fillOval(oldX, oldY, paintframe.diametreint, paintframe.diametreint); // Prend le diam�tre en consid�ration
	        	break;}
	        case(3):{
	        	graphic.drawLine(oldX, oldY, presentX, presentY); // Dessine une ligne au coordonn�es pr�sents 
	        	break;}
	        case(4):{
	        	graphic.drawOval(oldX, oldY, presentX, presentY);
	        	break;}
	        case(5):{
	        	graphic.drawRect(oldX, oldY, presentX, presentY);
	        	break;}}
	        repaint();
	        oldX = presentX; // Reset les coordonn�es 
	        oldY = presentY;}}

