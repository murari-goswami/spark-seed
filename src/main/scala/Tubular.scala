import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._


class Tubular {

  def withGoodVibes()(df: DataFrame): DataFrame = {
    df.withColumn(
      "chi",
      lit("happy")
    )
  }
}
