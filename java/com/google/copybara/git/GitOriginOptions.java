/*
 * Copyright (C) 2016 Google Inc.
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

package com.google.copybara.git;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.google.copybara.Option;

/**
 * Options for {@link GitOrigin}.
 */
@Parameters(separators = "=")
public class GitOriginOptions implements Option {

  @Parameter(names = "--git-origin-checkout-hook",
      description = "A command to be executed when a checkout happens for a git origin."
          + " DON'T USE IT. The only intention is to run tools that gather dependencies"
          + " after the checkout.", hidden = true)
  String originCheckoutHook = null;

  @Parameter(names = "--git-origin-rebase-ref",
      description = "When importing a change from a Git origin ref, it will be rebased to this ref,"
          + " if set. A common use case: importing a Github PR, rebase it to the main branch "
          + "(usually 'master'). Note that, if the repo uses submodules, they won't be rebased.")
  String originRebaseRef = null;

  @Parameter(names = "--git-origin-visit-changes-page-size",
      description = "Size of the git log page used for visiting changes.", hidden = true)
  int visitChangePageSize = 100;
}
