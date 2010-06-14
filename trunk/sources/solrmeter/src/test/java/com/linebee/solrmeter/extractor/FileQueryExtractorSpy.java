/**
 * Copyright Linebee. www.linebee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linebee.solrmeter.extractor;

import java.util.List;

import com.linebee.solrmeter.model.FileUtils;
import com.linebee.solrmeter.model.extractor.FileQueryExtractor;

public class FileQueryExtractorSpy extends FileQueryExtractor {

	public FileQueryExtractorSpy(String string) {
		super(string);
	}

	public List<String> getParsedQueries() {
		return this.queries;
	}
	
	@Override
	protected void loadQueries(String filePath) {
		queries = FileUtils.loadStringsFromFile(filePath);
	}
}
