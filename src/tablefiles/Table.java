package tablefiles;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.awt.FontFormatException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Table extends JTable {
    private int hoveredRow = -1;
    private Font customFont;

    public Table() {
        // Load the custom font
        try {
            File fontFile = new File("src/resources/CircularSpotifyText-Medium.otf");
            if (fontFile.exists()) {
                customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(14f);
            } else {
                customFont = getFont();
            }
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            customFont = getFont();
        }

        setShowHorizontalLines(false); // Disable horizontal lines
        setShowVerticalLines(false);   // Disable vertical lines
        setGridColor(new Color(18, 18, 18));
        setRowHeight(48); // Set row height as in the picture

        setBackground(new Color(18, 18, 18)); // Set background color

        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setResizingAllowed(false); // Disable resizing
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(o + "");
                header.setFont(customFont);
                header.setOpaque(true);  // Make header opaque
                return header;
            }
        });

        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(jtable, o, isSelected, hasFocus, row, column);
                com.setFont(customFont);
                com.setBackground(new Color(18, 18, 18)); // Set cell background color
                if (com instanceof DefaultTableCellRenderer) {
                    ((DefaultTableCellRenderer) com).setOpaque(true); // Ensure renderer is opaque
                }
                setBorder(noFocusBorder);
                if (isSelected) {
                    com.setForeground(new Color(255, 255, 255)); // Selected text color
                    com.setBackground(new Color(30, 30, 30)); // Selected row background color
                } else if (row == hoveredRow) {
                    com.setForeground(new Color(255, 255, 255)); // Hover text color
                    com.setBackground(new Color(45, 45, 45)); // Hover row background color
                } else {
                    com.setForeground(new Color(179, 179, 179)); // Default text color
                }
                return com;
            }
        });

        // Add mouse listener to handle row hover effect
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int row = rowAtPoint(e.getPoint());
                if (row != hoveredRow) {
                    hoveredRow = row;
                    repaint();
                }
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                hoveredRow = -1;
                repaint();
            }
        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

//    public void fixTable(JScrollPane scroll) {
//        scroll.setBorder(null);
//        ScrollBar sc = new ScrollBar();
//        scroll.setVerticalScrollBar(sc);
//        scroll.getVerticalScrollBar().setBackground(new Color(18, 18, 18)); // Set scrollbar background color
//        scroll.getViewport().setOpaque(false);  // Make viewport transparent
//        scroll.getViewport().setBackground(new Color(18, 18, 18)); // Set viewport background color
//        JPanel p = new JPanel();
//        p.setBackground(new Color(18, 18, 18)); // Set corner panel background color
//        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
//    }

    public void setColumnWidths(int[] widths) {
        TableColumnModel columnModel = getColumnModel();
        for (int i = 0; i < widths.length; i++) {
            if (i < columnModel.getColumnCount()) {
                TableColumn column = columnModel.getColumn(i);
                column.setPreferredWidth(widths[i]);
                column.setMinWidth(widths[i]);
                column.setMaxWidth(widths[i]);
            }
        }
    }
}
