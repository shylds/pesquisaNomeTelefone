
package javaapplication5;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class SemEspeciais extends PlainDocument {
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^0-9|^a-z|^A-Z|^ |^.]", ""), attr);
    
    }
    public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^0-9|^a-z|^A-Z|^ |^.]", ""), attr);
    
    }
    
}

