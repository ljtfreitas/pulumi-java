// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Table view specification.
 * 
 */
public final class GoogleCloudDatacatalogV1beta1ViewSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1beta1ViewSpecResponse Empty = new GoogleCloudDatacatalogV1beta1ViewSpecResponse();

    /**
     * The query that defines the table view.
     * 
     */
    @InputImport(name="viewQuery", required=true)
      private final String viewQuery;

    public String getViewQuery() {
        return this.viewQuery;
    }

    public GoogleCloudDatacatalogV1beta1ViewSpecResponse(String viewQuery) {
        this.viewQuery = Objects.requireNonNull(viewQuery, "expected parameter 'viewQuery' to be non-null");
    }

    private GoogleCloudDatacatalogV1beta1ViewSpecResponse() {
        this.viewQuery = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1ViewSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String viewQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1ViewSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        public Builder setViewQuery(String viewQuery) {
            this.viewQuery = Objects.requireNonNull(viewQuery);
            return this;
        }
        public GoogleCloudDatacatalogV1beta1ViewSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1ViewSpecResponse(viewQuery);
        }
    }
}
