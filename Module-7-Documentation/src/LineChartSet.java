import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
/**
 * This is the LineChartSet where the class FibonacciRecursive and FibonacciIterative are setup 
 * and will ultimately be run to display to the user.
 * The graph maximum x is 30 by 5 intervals starting at 0
 * The graph maximum y is 1000000 by 100000 starting at 0
 * 
 *
 */
public class LineChartSet extends Application{

	/**
	 * This Start method essentially graphs the Fibonacci Recursive and Iterative
	 * through the use of a loop limited at 31 where it records each point
	 * displaying each point to the user.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Defining Axis
		NumberAxis xAxis = new NumberAxis (0, 30, 5);
		xAxis.setLabel("N Sequence");
		
		NumberAxis yAxis = new NumberAxis (0, 1000000, 100000);
		yAxis.setLabel("Nanosecond");
		
		LineChart lineChart = new LineChart(xAxis, yAxis);
		
		//Prepare XYCharts.Series objects by setting data
		
		XYChart.Series series = new XYChart.Series();
		series.setName("Recursive");
		int x = 0;
		while(x!=31)
		{
			long tempA = FibonacciRecursive.finalTime(x);
			series.getData().add(new XYChart.Data(x, tempA));
			x++;
		}
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("Iterative");
		int z = 0;
		while(z!=31)
		{
			long tempA = FibonacciIterative.finalTime(z);
			series2.getData().add(new XYChart.Data(z, tempA));
			z++;
		}
		
		
		
		//setting the data to LineChart
		lineChart.getData().addAll(series, series2);
		
		Group root = new Group(lineChart);
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setTitle("Line Chart");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
		
	}

}
