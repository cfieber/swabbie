/*
 * Copyright 2018 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.swabbie.exclusions

import com.netflix.spinnaker.config.Exclusion
import com.netflix.spinnaker.config.ExclusionType
import org.springframework.stereotype.Component

@Component
class LiteralExclusionPolicy : ResourceExclusionPolicy {
  override fun getType(): ExclusionType = ExclusionType.Literal
  override fun apply(excludable: Excludable, exclusions: List<Exclusion>): String? {
    return byPropertyMatchingResult(exclusions, excludable)
  }
}
