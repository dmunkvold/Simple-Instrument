import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Piano { 

	/*
	 * In this program, in which I begin to experiment with producing sounds with 
	 * Java, I am making a GUI with 12 buttons, one for each note. When these buttons
	 * are pressed, the corresponding note is played. It is similar to a piano, but
	 * the buttons cannot be played on the keyboard, and the layout does not look like
	 * a piano. For this program I needed to initialize a synthesizer, a midi channel array,
	 * an instrument array, a jframe, a jpanel, and 12 jbuttons, one for each note.
	 */
	
	
	static Synthesizer synth;
	static MidiChannel[] mc;
	static Instrument[] instr;
	static JFrame frame = new JFrame("Piano");                
	static JPanel pane = new JPanel();                         
	static JButton button1 = new JButton("C");
	static JButton button2 = new JButton("C#");
	static JButton button3 = new JButton("D");
	static JButton button4 = new JButton("D#");
	static JButton button5 = new JButton("E");
	static JButton button6 = new JButton("F");
	static JButton button7 = new JButton("F#");
	static JButton button8 = new JButton("G");
	static JButton button9 = new JButton("G#");
	static JButton button10 = new JButton("A");
	static JButton button11= new JButton("A#");
	static JButton button12= new JButton("B");
	
	
	public static void main(String[]args) throws MidiUnavailableException{
		
		/*
		 * within this main method, I implement the synth (which doesn't need to be
		 * instantiated, not really sure why), open the synth, implement the midi channel,
		 * implement the instrument, and then load the instrument into the synth. 
		 */
		
		
		synth = MidiSystem.getSynthesizer();
		synth.open();
		mc = synth.getChannels();
		instr  = synth.getDefaultSoundbank().getInstruments(); 
		synth.loadInstrument(instr[35]);
		
		
		/*
		 * at this point I add a pane for all of the jbuttons, set the siz of the 
		 * frame, and set the default close operation
		 */
		
		
		frame.getContentPane().add(pane);                   
		pane.add(button1);
		pane.add(button2);
		pane.add(button3);
		pane.add(button4);
		pane.add(button5);
		pane.add(button6);
		pane.add(button7);
		pane.add(button8);
		pane.add(button9);
		pane.add(button10);
		pane.add(button11);
		pane.add(button12);
		frame.pack();                                       
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.show();  

		/*
		 * Here, I am creating a new action listener for each button and telling each
		 * button to play the corresponding note through the midi channel (I  picked
		 * 4 arbitrarily) 
		 */
		
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(50,500);
			}});
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(51,500);
			}});
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(52,500);
			}});
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(53,500);
			}});
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(54,500);
			}});
		button6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(55,500);
			}});
		button7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(56,500);
			}});
		button8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(57,500);
			}});
		button9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(58,500);
			}});
		button10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(59,500);
			}});
		button11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(60,500);
			}});
		button12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mc[4].noteOn(61,500);
			}});
	}

}

/*
 * code written by 
 * David Munkvold
 * 6/29/15
 */
