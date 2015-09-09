/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.dividers.selector;

import com.karumi.dividers.Direction;
import com.karumi.dividers.Position;
import java.util.EnumSet;

/**
 * Selector that applies to a single item.
 */
public class SingleItemSelector implements Selector {

  private final int column;
  private final int row;

  public SingleItemSelector(int column, int row) {
    this.column = column;
    this.row = row;
  }

  @Override public boolean isPositionSelected(Position position) {
    return position.getColumn() == column && position.getRow() == row;
  }

  @Override public EnumSet<Direction> getDirectionsByPosition(Position position) {
    return EnumSet.allOf(Direction.class);
  }
}
