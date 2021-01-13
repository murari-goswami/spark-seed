import scala.util.Failure
import org.apache.spark.sql.{AnalysisException, SparkSession}
import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.functions.lit

object MainApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .master("local")
      .appName("SparkSample")
      .getOrCreate()


  }
}