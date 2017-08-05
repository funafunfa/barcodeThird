//package testing;
//
//import sun.awt.image.codec.JPEGImageEncoderImpl;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.awt.image.BufferedImage;
//import java.awt.print.*;
//import java.io.FileOutputStream;
//
//public class printingGraphics implements Printable, ActionListener {
//
//    static JFrame f;
//    public int print(Graphics g, PageFormat pf, int page) throws
//            PrinterException {
//
//        if (page > 0) { /* We have only one page, and 'page' is zero-based */
//            return NO_SUCH_PAGE;
//        }
//
//        /* User (0,0) is typically outside the imageable area, so we must
//         * translate by the X and Y values in the PageFormat to avoid clipping
//         */
//        Graphics2D g2d = (Graphics2D)g;
//        g2d.translate(pf.getImageableX(), pf.getImageableY());
//
//        /* Now we perform our rendering */
//        f.getGraphics()
//
//        BufferedImage output = new BufferedImage();
//
//        Graphics2D g2 = output.createGraphics();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//                RenderingHints.VALUE_ANTIALIAS_ON);
//        g2.setColor(Color.WHITE);
//        g2.fillRect(0, 0, output.getWidth(), output.getHeight());
//        g2.setColor(Color.BLUE);
//        g2.fillRect(0, 0, 100, 100);
//
//        JOptionPane.showMessageDialog(null, new ImageIcon(output));
//
//        /* tell the caller that this page is part of the printed document */
//        return PAGE_EXISTS;
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        PrinterJob job = PrinterJob.getPrinterJob();
//        job.setPrintable(this);
//        try {
//            job.print();
//        } catch (PrinterException e1) {
//            e1.printStackTrace();
//        }
//    }
//
//    public static void main(String args[]) {
//
//        UIManager.put("swing.boldMetal", Boolean.FALSE);
//        f = new JFrame("Hello World Printer");
//        f.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {System.exit(0);}
//        });
//        JButton printButton = new JButton("Print Hello World");
//        printButton.addActionListener(new printingGraphics());
//        f.add("Center", printButton);
//        f.pack();
//        f.setVisible(true);
//
//
//    }
//
//
//}

