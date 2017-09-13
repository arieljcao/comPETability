
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame implements Petable {

    ArrayList <Animal> animals=new ArrayList <Animal>();
    ArrayList <String> names = new ArrayList <String>();
    
    String breed="";
    int add=0;
    String me="";
    
    //dog
    boolean shed=true;
    boolean barkALot=true;
    //cat
    String coatColour="";
    String coatPattern="";
    //bird
    String colour="";
    //fish
    String bodyColour="";
    boolean isTropical=false;
    //reptile
    boolean killed=true;
    boolean dragon=false;
    //imafriend
    boolean skinColour=true;
    boolean isHuman= true;
    
    public JFrame() {
        initComponents();
        //enabling
        //matchList selections + label
        nameLabel.setEnabled(false);
        nameText.setEnabled(false);
        addMatchButton.setEnabled(false);
        matchList.setEnabled(false);
        delMatchButton.setEnabled(false);
        //info selections
        ageText.setEnabled(false);
        heightText.setEnabled(false);
        genderComboBox.setEnabled(false);
        eyeComboBox.setEnabled(false);
        hobbyText.setEnabled(false);
        matchButton.setEnabled(false);
        //info labels
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel6.setEnabled(false);
        jLabel7.setEnabled(false);
        jLabel8.setEnabled(false);
        //breed labels
        jLabel9.setEnabled(false);
        jLabel10.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        jLabel13.setEnabled(false);
        jLabel14.setEnabled(false);
        jLabel15.setEnabled(false);
        jLabel16.setEnabled(false);
        jLabel17.setEnabled(false);
        jLabel18.setEnabled(false);
        jLabel19.setEnabled(false);
        jLabel20.setEnabled(false);
        jLabel21.setEnabled(false);
        jLabel22.setEnabled(false);
        jLabel23.setEnabled(false);
        jLabel24.setEnabled(false);
        
        //comboBoxes
        genderComboBox.removeAllItems();
        genderComboBox.addItem("female");
        genderComboBox.addItem("male");
        genderComboBox.addItem("other");
        eyeComboBox.removeAllItems();
        eyeComboBox.addItem("brown");
        eyeComboBox.addItem("blue");
        eyeComboBox.addItem("green");
        eyeComboBox.addItem("black");
        eyeComboBox.addItem("yellow");
        eyeComboBox.addItem("red");
        eyeComboBox.addItem("gray");
        
        //dog
        shedComboBox.removeAllItems();
        shedComboBox.addItem("shed");
        shedComboBox.addItem("doesn't shed");
        shedComboBox.setEnabled(false);
        barkALotComboBox.removeAllItems();
        barkALotComboBox.addItem("bark a lot");
        barkALotComboBox.addItem("doesn't bark a lot");
        barkALotComboBox.setEnabled(false);
        
        //cat
        coatColourComboBox.removeAllItems();
        coatColourComboBox.addItem("yellow");
        coatColourComboBox.addItem("white");
        coatColourComboBox.addItem("gray");
        coatColourComboBox.addItem("black");
        coatColourComboBox.setEnabled(false);
        coatPatternComboBox.removeAllItems();
        coatPatternComboBox.addItem("spots");
        coatPatternComboBox.addItem("stripes");
        coatPatternComboBox.addItem("plain");
        coatPatternComboBox.setEnabled(false);
        
        //bird
        wingSpanTextField.setEnabled(false);
        colourComboBox.removeAllItems();
        colourComboBox.addItem("green");
        colourComboBox.addItem("white");
        colourComboBox.addItem("yellow");
        colourComboBox.addItem("brown");
        colourComboBox.addItem("gray");
        colourComboBox.setEnabled(false);
        
        //fish
        bodyColourComboBox.removeAllItems();
        bodyColourComboBox.addItem("silver");
        bodyColourComboBox.addItem("blue");
        bodyColourComboBox.addItem("red");
        bodyColourComboBox.addItem("gold");
        bodyColourComboBox.addItem("purple");
        bodyColourComboBox.addItem("green");
        bodyColourComboBox.setEnabled(false);
        isTropicalComboBox.removeAllItems();
        isTropicalComboBox.addItem("tropical");
        isTropicalComboBox.addItem("not tropical");
        isTropicalComboBox.setEnabled(false);
        
        //reptile
        legsTextField.setEnabled(false);
        killedComboBox.removeAllItems();
        killedComboBox.addItem("kills things");
        killedComboBox.addItem("friendly");
        killedComboBox.setEnabled(false);
        dragonComboBox.removeAllItems();
        dragonComboBox.addItem("dragon");
        dragonComboBox.addItem("not dragon");
        dragonComboBox.setEnabled(false);
        
        //imaginary friend
        skinColourComboBox.removeAllItems();
        skinColourComboBox.addItem("normal");
        skinColourComboBox.addItem("weird");
        skinColourComboBox.setEnabled(false);
        isHumanComboBox.removeAllItems();
        isHumanComboBox.addItem("human");
        isHumanComboBox.addItem("not human");
        isHumanComboBox.setEnabled(false);
        numLegsTextField.setEnabled(false);
        weightTextField.setEnabled(false);
    }
    
    public void receivedIdealTypeInfo(int age, double height, String gender, 
            String breed, String eyeColour, String hobby){
        //print out match results
        System.out.println("match: "+age+" "+height+"cm "+gender+" "+breed+" "+eyeColour+" "+hobby);
        if((age>=0)&&(age<=100)&&(height>=0)&&(height<=1000)&&(gender!=null)&&
                (breed!=null)&&(eyeColour!=null)&&(hobby!=null))
            matchLabel.setText("I prefer: age "+age+", "+height+"cm tall, "+
                    gender+", "+breed+", "+eyeColour+" eyes, hobby - "+hobby);
        
        //count max matches
        int max=0;
        for (int k=0;k<animals.size();k++){
            int count=0;
            if ((animals.get(k).name.equals(me) == false)&&(animals.get(k).gender.equals(gender) == true)
                    && (animals.get(k).getBreed().equals(breed) == true)){
                if (animals.get(k).age==age)
                    count++;
                if (animals.get(k).height==height)
                    count++;
                if (animals.get(k).eyeColour.equals(eyeColour)==true)
                    count++;
                if (animals.get(k).getHobby().equals(hobby)==true)
                    count++;
            }
            if (count>max)
                max=count;
        }
        
        //adding names of max counts to temp 
        ArrayList <String> temp = new ArrayList <String>();
        ArrayList <Animal> tempA = new ArrayList <Animal>();
        for (int k=0;k<animals.size();k++){
            int count=0;
            if ((animals.get(k).name.equals(me) == false)&&(animals.get(k).gender.equals(gender) == true)
                    && (animals.get(k).getBreed().equals(breed) == true)){
                if (animals.get(k).age==age)
                    count++;
                if (animals.get(k).height==height)
                    count++;
                if (animals.get(k).eyeColour.equals(eyeColour)==true)
                    count++;
                if (animals.get(k).getHobby().equals(hobby)==true)
                    count++;
            }
            if ((count==max)&&(count!=0)){
                temp.add(animals.get(k).name);
                tempA.add(animals.get(k));
            }
        }
        
        commentLabel.setText("You are MOST comPETable with: "+temp+" in "+max+"/4 features");
        
        String stats=new String();
        for(int k=0;k<tempA.size();k++){
            stats=stats+tempA.get(k).toString()+"\n";
        }
        jTextArea1.setText(stats);
        
        if (max==0)
            commentLabel.setText("You are NOT comPETable with anyone! Good luck matching!");
        if (breed==null)
            commentLabel.setText("Matching session cancelled.");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        shedComboBox = new javax.swing.JComboBox();
        barkALotComboBox = new javax.swing.JComboBox();
        dogButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        coatColourComboBox = new javax.swing.JComboBox();
        coatPatternComboBox = new javax.swing.JComboBox();
        catButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        colourComboBox = new javax.swing.JComboBox();
        wingSpanTextField = new javax.swing.JTextField();
        birdButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bodyColourComboBox = new javax.swing.JComboBox();
        isTropicalComboBox = new javax.swing.JComboBox();
        fishButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        legsTextField = new javax.swing.JTextField();
        killedComboBox = new javax.swing.JComboBox();
        dragonComboBox = new javax.swing.JComboBox();
        reptileButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        skinColourComboBox = new javax.swing.JComboBox();
        isHumanComboBox = new javax.swing.JComboBox();
        numLegsTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        imaFriendButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        addMatchButton = new javax.swing.JButton();
        matchList = new java.awt.List();
        delMatchButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        ageText = new javax.swing.JTextField();
        heightText = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox();
        eyeComboBox = new javax.swing.JComboBox();
        hobbyText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        rmbrLabel = new javax.swing.JLabel();
        matchButton = new javax.swing.JButton();
        matchLabel = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("comPETability chart (program works with minimum 4 pets)");

        shedComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        barkALotComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dogButton.setText("DOG");
        dogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("shed?");

        jLabel10.setText("bark?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dogButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addComponent(shedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barkALotComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogButton)
                    .addComponent(shedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barkALotComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        coatColourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        coatPatternComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        catButton.setText("CAT");
        catButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("coat colour?");

        jLabel12.setText("coat pattern?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(catButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coatColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coatPatternComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coatColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catButton)
                    .addComponent(coatPatternComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        colourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        birdButton.setText("BIRD");
        birdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birdButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("wingspan (int)?");

        jLabel14.setText("colour?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(birdButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wingSpanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wingSpanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birdButton)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyColourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        isTropicalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        fishButton.setText("FISH");
        fishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishButtonActionPerformed(evt);
            }
        });

        jLabel15.setText("colour?");

        jLabel16.setText("tropical?");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fishButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isTropicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fishButton)
                    .addComponent(isTropicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        killedComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dragonComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        reptileButton.setText("REPTILE");
        reptileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reptileButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("# legs (int)?");

        jLabel18.setText("killed things?");

        jLabel19.setText("dragon?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reptileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(legsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(killedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dragonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dragonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(killedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reptileButton)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        skinColourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        isHumanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        numLegsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numLegsTextFieldActionPerformed(evt);
            }
        });

        imaFriendButton.setText("IMAGINARY FRIEND");
        imaFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imaFriendButtonActionPerformed(evt);
            }
        });

        jLabel20.setText("skin colour?");

        jLabel21.setText("human?");

        jLabel22.setText("# legs (int)?");

        jLabel23.setText("weight (double)?");

        jLabel24.setText("kg");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imaFriendButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numLegsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(skinColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isHumanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isHumanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imaFriendButton)
                    .addComponent(skinColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numLegsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Insert names here:");

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        addMatchButton.setText("add to database");
        addMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMatchButtonActionPerformed(evt);
            }
        });

        matchList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchListActionPerformed(evt);
            }
        });

        delMatchButton.setText("delete from database");
        delMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delMatchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameText)
                        .addComponent(addMatchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addComponent(matchList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(delMatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMatchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matchList, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delMatchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        eyeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Age (int):");

        jLabel3.setText("Height (double):");

        jLabel4.setText("Gender:");

        jLabel5.setText("Eye colour:");

        jLabel6.setText("Hobby(s):");

        jLabel7.setText("(commas allowed)");

        jLabel8.setText("cm");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hobbyText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eyeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eyeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(hobbyText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        rmbrLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rmbrLabel.setText(" ");

        matchButton.setText("enter ideal type");
        matchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchButtonActionPerformed(evt);
            }
        });

        matchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matchLabel.setText(" ");

        commentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        commentLabel.setText(" ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(rmbrLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matchButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matchLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rmbrLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void addMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMatchButtonActionPerformed
        String name = nameText.getText();
        String gender;
        String eye;
        String hobby=hobbyText.getText();
        
        //nameText restr. prevent from entering same name
        for(int k=0;k<names.size();k++){
            if(names.get(k).equals(name)){
                nameText.setText("name already exists!");
                return;
            }
        }
        
        //nameText restr. prevent from not entering anything
        if(name.equals("")==true)
            return;
        
        //ageText restr. prevent from entering non-int
        String num="1234567890 ";
        String ageS=ageText.getText();
        if(ageS.equals("")==true)
            return;
        for(int k=0;k<ageS.length();k++){
            if(num.indexOf(ageS.substring(k, k+1)) == -1){
                nameText.setText("");
                ageText.setText("");
                heightText.setText("");
                hobbyText.setText("");
                return;
            }
        }
        int age=Integer.parseInt(ageText.getText());
        if((age<0)||(age>100))
            return;
        
        //heightText restr. prevent from entering non-double
        String num2="1234567890. ";
        String heightS=heightText.getText();
        if(heightS.equals("")==true)
            return;
        for(int k=0;k<heightS.length();k++){
            if(num2.indexOf(heightS.substring(k, k+1)) == -1){
                nameText.setText("");
                ageText.setText("");
                heightText.setText("");
                hobbyText.setText("");
                return;
            }
        }
        double height=Double.parseDouble(heightText.getText());
        if((height<0)||(height>1000))
            return;
        
        //hobbyText restr. prevent from entering non-string
        String alpha="abcdefghijklmnopqrstuvwxyz ,ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(hobby.equals("")==true)
            return;
        for(int k=0;k<hobby.length();k++){
            if(alpha.indexOf(hobby.substring(k, k+1)) == -1){
                nameText.setText("");
                ageText.setText("");
                heightText.setText("");
                hobbyText.setText("");
                return;
            }
        }
        
        if (genderComboBox.getSelectedItem().equals("female")==true){
            gender="female";
        } else if (genderComboBox.getSelectedItem().equals("male")==true){
            gender="male";
        } else {
            gender="other";
        }
        
        if(eyeComboBox.getSelectedItem().equals("brown")==true){
            eye="brown";
        } else if (eyeComboBox.getSelectedItem().equals("blue")==true) {
            eye="blue";
        } else if (eyeComboBox.getSelectedItem().equals("green")==true) {
            eye="green";
        } else if (eyeComboBox.getSelectedItem().equals("black")==true) {
            eye="black";
        } else if (eyeComboBox.getSelectedItem().equals("yellow")==true) {
            eye="yellow";
        } else if (eyeComboBox.getSelectedItem().equals("red")==true) {
            eye="red";
        } else {
            eye="gray";
        }
        
        if (breed.equals("dog")==true){
            if (shedComboBox.getSelectedItem().equals("doesn't shed")){
                shed=false;
            }
            if (barkALotComboBox.getSelectedItem().equals("doesn't bark a lot")==true){
                barkALot=false;
            }
            Dog n=new Dog(name, age, height, gender, "dog", eye, hobby, shed, barkALot);
            animals.add(n);
            names.add(name);
        }
        
        if(breed.equals("cat")==true){
            if (coatColourComboBox.getSelectedItem().equals("yellow")==true){
                coatColour="yellow";
            } else if (coatColourComboBox.getSelectedItem().equals("white")==true) {
                coatColour="white";
            } else if (coatColourComboBox.getSelectedItem().equals("gray")==true) {
                coatColour="gray";
            } else {
                coatColour="black";
            }
            if (coatPatternComboBox.getSelectedItem().equals("spots")==true){
                coatPattern="spots";
            } else if (coatPatternComboBox.getSelectedItem().equals("stripes")==true) {
                coatPattern="stripes";
            } else {
                coatPattern="plain";
            }
            Cat n=new Cat(name, age, height, gender, "cat", eye, hobby, 
                    coatColour, coatPattern);
            animals.add(n);
            names.add(name);
            
            System.out.println(n.name+" "+n.age+" "+n.height+" "+n.gender+" "+
                    n.breed+" "+n.eyeColour+" "+n.hobby);
        }
        
        if(breed.equals("bird")==true){
            if(colourComboBox.getSelectedItem().equals("green")==true){
                colour="green";
            } else if (colourComboBox.getSelectedItem().equals("white")==true) {
                colour="white";
            } else if (colourComboBox.getSelectedItem().equals("yellow")==true) {
                colour="yellow";
            } else if (colourComboBox.getSelectedItem().equals("brown")==true) {
                colour="brown";
            } else {
                colour="gray";
            }
            //prevent from entering non-int
            String wingSpanS=wingSpanTextField.getText();
            for(int k=0;k<wingSpanS.length();k++){
                if(num.indexOf(wingSpanS.substring(k, k+1)) == -1){
                    wingSpanTextField.setText(""); 
                return;
                }
            }
            if(wingSpanS.equals("")==true)
                return;
            Bird n=new Bird(name, age, height, gender, "bird", eye, hobby, 
                    Integer.parseInt(wingSpanTextField.getText()), colour);
            animals.add(n);
            names.add(name);
        }
        
        if(breed.equals("fish")==true){
            if(bodyColourComboBox.getSelectedItem().equals("silver")==true){
                bodyColour="silver";
            } else if (bodyColourComboBox.getSelectedItem().equals("blue")==true) {
                bodyColour="blue";
            } else if (bodyColourComboBox.getSelectedItem().equals("red")==true) {
                bodyColour="red";
            } else if (bodyColourComboBox.getSelectedItem().equals("gold")==true) {
                bodyColour="gold";
            } else if (bodyColourComboBox.getSelectedItem().equals("purple")==true) {
                bodyColour="purple";
            } else {
                bodyColour="green";
            }
            if(isTropicalComboBox.getSelectedItem().equals("tropical")==true){
                isTropical=true;
            }
            Fish n= new Fish(name, age, height, gender, "fish", eye, hobby, 
                    bodyColour, isTropical);
            animals.add(n);
            names.add(name);
        }
        
        if(breed.equals("reptile")==true){
            if(killedComboBox.getSelectedItem().equals("friendly")==true){
                killed=false;
            }
            if(dragonComboBox.getSelectedItem().equals("dragon")==true){
                dragon=true;
            }
            //prevent from entering non-int
            String legsS=legsTextField.getText();
            for(int k=0;k<legsS.length();k++){
                if(num.indexOf(legsS.substring(k, k+1)) == -1){
                    legsTextField.setText(""); 
                return;
                }
            }
            if(legsS.equals("")==true)
                return;
            Reptile n=new Reptile(name, age, height, gender, "reptile", eye, 
                    hobby,Integer.parseInt(legsTextField.getText()),killed,dragon);
            animals.add(n);
            names.add(name);
        }
        
        if(breed.equals("imaginary friend")==true){
            if(skinColourComboBox.getSelectedItem().equals("weird")==true){
                skinColour=false;
            }
            if(isHumanComboBox.getSelectedItem().equals("not human")==true){
                isHuman=false;
            }
            //prevent from entering non-int
            String legsS=numLegsTextField.getText();
            for(int k=0;k<legsS.length();k++){
                if(num.indexOf(legsS.substring(k, k+1)) == -1){
                    numLegsTextField.setText(""); 
                return;
                }
            }
            if(legsS.equals("")==true)
                return;
            //prevent from entering non-double
            String weightS=weightTextField.getText();
            for(int k=0;k<weightS.length();k++){
                if(num2.indexOf(weightS.substring(k, k+1)) == -1){
                    weightTextField.setText("");
                return;
                }
            }
            if(weightS.equals("")==true)
                return;
            ImaginaryFriend n=new ImaginaryFriend(name, age, height, gender, 
                    "imaginary friend", eye, hobby, skinColour, isHuman, 
                    Integer.parseInt(numLegsTextField.getText()), 
                    Double.parseDouble(weightTextField.getText()));
            animals.add(n);
            names.add(name); 
        }
        showMatchList(); 
        
        nameText.setText("");
        ageText.setText("");
        heightText.setText("");
        hobbyText.setText("");
        
        nameLabel.setEnabled(false);
        nameText.setEnabled(false);
        addMatchButton.setEnabled(false);
        matchList.setEnabled(false);
        
        ageText.setEnabled(false);
        heightText.setEnabled(false);
        genderComboBox.setEnabled(false);
        eyeComboBox.setEnabled(false);
        hobbyText.setEnabled(false);
        
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel6.setEnabled(false);
        jLabel7.setEnabled(false);
        jLabel8.setEnabled(false);
        
        jLabel9.setEnabled(false);
        jLabel10.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        jLabel13.setEnabled(false);
        jLabel14.setEnabled(false);
        jLabel15.setEnabled(false);
        jLabel16.setEnabled(false);
        jLabel17.setEnabled(false);
        jLabel18.setEnabled(false);
        jLabel19.setEnabled(false);
        jLabel20.setEnabled(false);
        jLabel21.setEnabled(false);
        jLabel22.setEnabled(false);
        jLabel23.setEnabled(false);
        jLabel24.setEnabled(false);
        
        add++;
        if (add>=4){
            rmbrLabel.setText("double click name on list to select");
            matchList.setEnabled(true);
        }
        if(add<=4){
            delMatchButton.setEnabled(false);
        } else {
            delMatchButton.setEnabled(true);
        }
        
        dogButton.setEnabled(true);
        catButton.setEnabled(true);
        birdButton.setEnabled(true);
        fishButton.setEnabled(true);
        reptileButton.setEnabled(true);
        imaFriendButton.setEnabled(true);
        //dog
        shedComboBox.setEnabled(false);
        barkALotComboBox.setEnabled(false);
        //cat
        coatColourComboBox.setEnabled(false);
        coatPatternComboBox.setEnabled(false);
        //bird
        wingSpanTextField.setEnabled(false);
        colourComboBox.setEnabled(false);
        //fish
        bodyColourComboBox.setEnabled(false);
        isTropicalComboBox.setEnabled(false);
        //reptile
        legsTextField.setEnabled(false);
        killedComboBox.setEnabled(false);
        dragonComboBox.setEnabled(false);
        //imaginary friend
        skinColourComboBox.setEnabled(false);
        isHumanComboBox.setEnabled(false);
        numLegsTextField.setEnabled(false);
        weightTextField.setEnabled(false);
    }//GEN-LAST:event_addMatchButtonActionPerformed

    private void matchListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchListActionPerformed
        int mindex=matchList.getSelectedIndex();
        me=matchList.getSelectedItem();
        
        //prevent from not clicking on index
        if(mindex==-1)
            return;
        
        //show name
        rmbrLabel.setText("My name is: "+matchList.getSelectedItem());
        
        matchButton.setEnabled(true);
    }//GEN-LAST:event_matchListActionPerformed

    private void delMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delMatchButtonActionPerformed
        int mindex=matchList.getSelectedIndex();
        
        //prevent from not clicking on index
        if(mindex==-1)
            return;
        
        int response=JOptionPane.showConfirmDialog(null,"Are you sure?", 
                "Confirmation",JOptionPane.YES_NO_OPTION);
        if(response==JOptionPane.YES_OPTION){
            //delete value on friend list
            names.remove(mindex);
            for(int k=0;k<animals.size();k++){
                if(animals.get(k).name.equals(matchList.getSelectedItem()))
                    animals.remove(k);
            }
            add--;
            if(add<=4){
                delMatchButton.setEnabled(false);
            } else {
                delMatchButton.setEnabled(true);
            }
        
            showMatchList();
        } else {
            return;
        }
    }//GEN-LAST:event_delMatchButtonActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void matchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchButtonActionPerformed
        preferencesJFrame temp = new preferencesJFrame(this);
        
        temp.setVisible(true);
    }//GEN-LAST:event_matchButtonActionPerformed

    private void reptileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reptileButtonActionPerformed
        breed="reptile";
        
        nameLabel.setEnabled(true);
        nameText.setEnabled(true);
        addMatchButton.setEnabled(true);
        
        ageText.setEnabled(true);
        heightText.setEnabled(true);
        genderComboBox.setEnabled(true);
        eyeComboBox.setEnabled(true);
        hobbyText.setEnabled(true);
        
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        
        dogButton.setEnabled(false);
        catButton.setEnabled(false);
        birdButton.setEnabled(false);
        fishButton.setEnabled(false);
        reptileButton.setEnabled(false);
        imaFriendButton.setEnabled(false);
        
        legsTextField.setEnabled(true);
        killedComboBox.setEnabled(true);
        dragonComboBox.setEnabled(true);
    }//GEN-LAST:event_reptileButtonActionPerformed

    private void dogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogButtonActionPerformed
        breed="dog";
        
        nameLabel.setEnabled(true);
        nameText.setEnabled(true);
        addMatchButton.setEnabled(true);
        
        ageText.setEnabled(true);
        heightText.setEnabled(true);
        genderComboBox.setEnabled(true);
        eyeComboBox.setEnabled(true);
        hobbyText.setEnabled(true);
        
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        
        jLabel9.setEnabled(true);
        jLabel10.setEnabled(true);
        
        dogButton.setEnabled(false);
        catButton.setEnabled(false);
        birdButton.setEnabled(false);
        fishButton.setEnabled(false);
        reptileButton.setEnabled(false);
        imaFriendButton.setEnabled(false);
        
        shedComboBox.setEnabled(true);
        barkALotComboBox.setEnabled(true);
    }//GEN-LAST:event_dogButtonActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void numLegsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numLegsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numLegsTextFieldActionPerformed

    private void catButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catButtonActionPerformed
        breed="cat";
        
        nameLabel.setEnabled(true);
        nameText.setEnabled(true);
        addMatchButton.setEnabled(true);

        ageText.setEnabled(true);
        heightText.setEnabled(true);
        genderComboBox.setEnabled(true);
        eyeComboBox.setEnabled(true);
        hobbyText.setEnabled(true);
        
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);
        
        dogButton.setEnabled(false);
        catButton.setEnabled(false);
        birdButton.setEnabled(false);
        fishButton.setEnabled(false);
        reptileButton.setEnabled(false);
        imaFriendButton.setEnabled(false);
        
        coatColourComboBox.setEnabled(true);
        coatPatternComboBox.setEnabled(true);
    }//GEN-LAST:event_catButtonActionPerformed

    private void birdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birdButtonActionPerformed
        breed="bird";
        
        nameLabel.setEnabled(true);
        nameText.setEnabled(true);
        addMatchButton.setEnabled(true);

        ageText.setEnabled(true);
        heightText.setEnabled(true);
        genderComboBox.setEnabled(true);
        eyeComboBox.setEnabled(true);
        hobbyText.setEnabled(true);
        
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        
        jLabel13.setEnabled(true);
        jLabel14.setEnabled(true);
        
        dogButton.setEnabled(false);
        catButton.setEnabled(false);
        birdButton.setEnabled(false);
        fishButton.setEnabled(false);
        reptileButton.setEnabled(false);
        imaFriendButton.setEnabled(false);
        
        wingSpanTextField.setEnabled(true);
        colourComboBox.setEnabled(true);
    }//GEN-LAST:event_birdButtonActionPerformed

    private void fishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishButtonActionPerformed
        breed="fish";
        
        nameLabel.setEnabled(true);
        nameText.setEnabled(true);
        addMatchButton.setEnabled(true);
        
        ageText.setEnabled(true);
        heightText.setEnabled(true);
        genderComboBox.setEnabled(true);
        eyeComboBox.setEnabled(true);
        hobbyText.setEnabled(true);
        
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        
        dogButton.setEnabled(false);
        catButton.setEnabled(false);
        birdButton.setEnabled(false);
        fishButton.setEnabled(false);
        reptileButton.setEnabled(false);
        imaFriendButton.setEnabled(false);
        
        bodyColourComboBox.setEnabled(true);
        isTropicalComboBox.setEnabled(true);
    }//GEN-LAST:event_fishButtonActionPerformed

    private void imaFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imaFriendButtonActionPerformed
        breed="imaginary friend";
        
        nameLabel.setEnabled(true);
        nameText.setEnabled(true);
        addMatchButton.setEnabled(true);
        
        ageText.setEnabled(true);
        heightText.setEnabled(true);
        genderComboBox.setEnabled(true);
        eyeComboBox.setEnabled(true);
        hobbyText.setEnabled(true);
        
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        
        dogButton.setEnabled(false);
        catButton.setEnabled(false);
        birdButton.setEnabled(false);
        fishButton.setEnabled(false);
        reptileButton.setEnabled(false);
        imaFriendButton.setEnabled(false);
        
        skinColourComboBox.setEnabled(true);
        isHumanComboBox.setEnabled(true);
        numLegsTextField.setEnabled(true);
        weightTextField.setEnabled(true);
    }//GEN-LAST:event_imaFriendButtonActionPerformed

    public void showMatchList(){
        matchList.removeAll();
        for(int k=0;k<names.size();k++){
            String slot=names.get(k);
            matchList.add(slot);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMatchButton;
    private javax.swing.JTextField ageText;
    private javax.swing.JComboBox barkALotComboBox;
    private javax.swing.JButton birdButton;
    private javax.swing.JComboBox bodyColourComboBox;
    private javax.swing.JButton catButton;
    private javax.swing.JComboBox coatColourComboBox;
    private javax.swing.JComboBox coatPatternComboBox;
    private javax.swing.JComboBox colourComboBox;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JButton delMatchButton;
    private javax.swing.JButton dogButton;
    private javax.swing.JComboBox dragonComboBox;
    private javax.swing.JComboBox eyeComboBox;
    private javax.swing.JButton fishButton;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JTextField heightText;
    private javax.swing.JTextField hobbyText;
    private javax.swing.JButton imaFriendButton;
    private javax.swing.JComboBox isHumanComboBox;
    private javax.swing.JComboBox isTropicalComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox killedComboBox;
    private javax.swing.JTextField legsTextField;
    private javax.swing.JButton matchButton;
    private javax.swing.JLabel matchLabel;
    private java.awt.List matchList;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField numLegsTextField;
    private javax.swing.JButton reptileButton;
    private javax.swing.JLabel rmbrLabel;
    private javax.swing.JComboBox shedComboBox;
    private javax.swing.JComboBox skinColourComboBox;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField wingSpanTextField;
    // End of variables declaration//GEN-END:variables
}
