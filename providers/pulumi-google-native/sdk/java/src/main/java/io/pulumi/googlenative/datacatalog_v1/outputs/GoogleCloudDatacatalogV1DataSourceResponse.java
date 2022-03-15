// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1DataSourceResponse {
    /**
     * Full name of a resource as defined by the service. For example: `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * 
     */
    private final String resource;
    /**
     * Service that physically stores the data.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1DataSourceResponse(
        @CustomType.Parameter("resource") String resource,
        @CustomType.Parameter("service") String service) {
        this.resource = resource;
        this.service = service;
    }

    /**
     * Full name of a resource as defined by the service. For example: `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * 
    */
    public String getResource() {
        return this.resource;
    }
    /**
     * Service that physically stores the data.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resource;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.service = defaults.service;
        }

        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GoogleCloudDatacatalogV1DataSourceResponse build() {
            return new GoogleCloudDatacatalogV1DataSourceResponse(resource, service);
        }
    }
}
