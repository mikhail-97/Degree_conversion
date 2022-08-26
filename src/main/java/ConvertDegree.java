import java.util.Scanner;

interface Converter {
    double getConvertedValue (double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
public class ConvertDegree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Температура в градусах Цельсия: ");
        double temperature = in.nextDouble();
        in.close();

        System.out.println("Температура в градусах Цельсия= " + new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("Температура в Кельвинах= " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("Температура по Фаренгейту= " + new FahrenheitConverter().getConvertedValue(temperature));
    }
}
