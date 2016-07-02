package mypipe.snapshotter.splitter

import mypipe.api.data.ColumnMetadata

trait Splitter[T] {
  def split(splitByCol: ColumnMetadata, minValue: Option[T], maxValue: Option[T]): List[InputSplit]
}
