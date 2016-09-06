/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.aospextended.extensions;

import android.content.Context;

/**
 * Interface for classes whose instances can provide the availability of the preference.
 */
public interface SelfAvailablePreference {
    /**
     * @return the availability of the preference. Please make sure the availability in managed
     * profile is taken into account.
     */
    boolean isAvailable(Context context);
}
