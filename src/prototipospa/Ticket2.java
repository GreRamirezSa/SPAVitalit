package prototipospa;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel
 */
public class Ticket2 {
    public Ticket2(String texto) {
        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        DocPrintJob docPrintJob = printService.createPrintJob();
        Doc doc = new SimpleDoc(texto.getBytes(), flavor, null);
        try {
            docPrintJob.print(doc, null);
        } catch (PrintException e) {
        }
    }
}
