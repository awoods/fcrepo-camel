/**
 * Copyright 2014 DuraSpace, Inc.
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

package org.fcrepo.camel;

/**
 * @author acoburn
 */
public final class Namespaces {

    public static final String REPOSITORY = "http://fedora.info/definitions/v4/repository#";

    public static final String INDEXING = "http://fedora.info/definitions/v4/indexing#";

    public static final String RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

    public static final String LDP = "http://www.w3.org/ns/ldp#";

    private Namespaces() {
        // Prevent instantiation
    }

}
