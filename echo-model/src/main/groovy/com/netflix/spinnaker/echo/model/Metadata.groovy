/*
 * Copyright 2015 Netflix, Inc.
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

package com.netflix.spinnaker.echo.model

import org.springframework.http.HttpHeaders

/**
 * Represents event metadata
 */
@SuppressWarnings('PropertyName')
class Metadata {
    String source
    String type
    String created = new Date().time
    String organization
    String project
    String application
    String _content_id
    Map attributes
    HttpHeaders requestHeaders = new HttpHeaders()

    @Override
    public String toString() {
        return """\
Metadata{
    source='$source',
    type='$type',
    created='$created',
    organization='$organization',
    project='$project',
    application='$application',
    _content_id='$_content_id',
    attributes=$attributes,
    requestHeaders=$requestHeaders
}"""
    }
}
