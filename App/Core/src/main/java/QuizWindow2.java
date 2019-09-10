
import static java.lang.System.exit;
import javax.swing.JOptionPane;

//Author  : S.Hareendran , ID : 19508409
//Purpose : Window for one word answer questions

public class QuizWindow2 extends javax.swing.JFrame {

    QuestionType b1,c1;
    
    public QuizWindow2() {
        initComponents();
        
//Purpose : Get instances of created Question-Type Plugins and store in  reference variables 
        b1= QuizMap.QuestionTypePluginMap.get("MCQ");
        c1= QuizMap.QuestionTypePluginMap.get("OneWord");
         
        
//Purpose : Remove One Word question from queue and display
        label_question.setText(c1.removeQuestions());
        
        
//Purpose : Preview of next Question         
        if(b1.peekQuestion() != "MCQEND"){
             label_nextQuestion.setText(b1.peekQuestion()); 
        }
        
        else {
            label_nextQuestion.setText(c1.peekQuestion()); 
        }
        
//Purpose : Counter to maintain no of questions displayed
        Score.noOfQuestions++;
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_question = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        txt_answer = new javax.swing.JTextField();
        label_nextQuestion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_question.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        btn_next.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        txt_answer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_answerActionPerformed(evt);
            }
        });

        label_nextQuestion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Next Question :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 589, Short.MAX_VALUE))
                    .addComponent(label_question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_nextQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label_question, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(txt_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        
//Purpose : Check for correct answer and increase score  
       String g1 = txt_answer.getText();
       String d1 = c1.removeCorrectAnswer();
       
       if(g1.equals(d1)) {
      
            Score.count++;
       }
 
//Purpose : Remove MCQ/One Word question from queue and display or display score at end       
        if(b1.peekQuestion() != "MCQEND"){
           
            QuizWindow d2 = new QuizWindow();
            d2.setVisible(true);
            this.setVisible(false);
        }
        
        else if(c1.peekQuestion() == "OneWordEND"){
            
            JOptionPane.showMessageDialog(null, "Quiz Completed , Score: "+Score.count+" / "+Score.noOfQuestions);
            this.setVisible(false);
            exit (1);
        }
        else{
            
            label_question.setText(c1.removeQuestions());
            Score.noOfQuestions++;
        }
        
        
//Purpose : Preview of next Question  
        if(c1.peekQuestion() != "OneWordEND")
             label_nextQuestion.setText(c1.peekQuestion()); 
               
        else
            label_nextQuestion.setText(" ");

    }//GEN-LAST:event_btn_nextActionPerformed

    private void txt_answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_answerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_answerActionPerformed

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
            java.util.logging.Logger.getLogger(QuizWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizWindow2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_nextQuestion;
    private javax.swing.JLabel label_question;
    private javax.swing.JTextField txt_answer;
    // End of variables declaration//GEN-END:variables
}
