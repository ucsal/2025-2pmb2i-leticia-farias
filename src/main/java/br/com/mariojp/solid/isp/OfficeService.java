package br.com.mariojp.solid.isp;

public class OfficeService {
    private final PrintDevice device;
    public OfficeService(PrintDevice device){ this.device = device; }
    public void printReport(String content){
        device.print(content);
    }
}
