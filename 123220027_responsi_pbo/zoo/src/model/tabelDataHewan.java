package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tabelDataHewan extends AbstractTableModel{
    
    List<zoo> dz;
    
    public Tabel(List<zoo>dz){
        this.dz = dz;
    }

    @Override
    public int getRowCount() {
        return dz.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "NAMA";
            case 2:
                return "KELAS";
            case 3:
                return "JENIS MAKANAN";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dz.get(row).getId();
            case 1:
                return dz.get(row).getNama();
            case 2:
                return dz.get(row).getKelas();
            case 3:
                return dz.get(row).getJenisMakanan();
            default:
                return null;
        }
    }
    
}
