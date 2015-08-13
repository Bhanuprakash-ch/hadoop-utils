/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trustedanalytics.hadoop.config;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

public interface ConfigurationHelper {

  Map<String, String> getConfigurationFromJson(String jsonConf, ConfigurationLocator location)
      throws IOException;

  Map<String, String> getConfigurationFromEnv(String envVariableName, ConfigurationLocator location)
      throws IOException;

  Map<String, String> getConfigurationFromEnv(ConfigurationLocator location)
      throws IOException;

  Optional<String> getPropertyFromJson(String jsonConf, PropertyLocator location)
      throws IOException;

  Optional<String> getPropertyFromEnv(String jsonConf, PropertyLocator location)
      throws IOException;

  Optional<String> getPropertyFromEnv(PropertyLocator location)
      throws IOException;

}
