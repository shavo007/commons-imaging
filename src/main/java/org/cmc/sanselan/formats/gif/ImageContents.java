/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cmc.sanselan.formats.gif;

import java.util.Vector;

class ImageContents
{
	public final GIFHeaderInfo gifHeaderInfo;

	public final Vector blocks;
	public final byte globalColorTable[];

	public ImageContents(GIFHeaderInfo gifHeaderInfo, byte globalColorTable[],
			Vector blocks)
	{
		this.gifHeaderInfo = gifHeaderInfo;
		this.globalColorTable = globalColorTable;
		this.blocks = blocks;
	}
}