// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFHIRDatastoreArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFHIRDatastoreArgs Empty = new GetFHIRDatastoreArgs();

    @Import(name="datastoreId", required=true)
      private final String datastoreId;

    public String getDatastoreId() {
        return this.datastoreId;
    }

    public GetFHIRDatastoreArgs(String datastoreId) {
        this.datastoreId = Objects.requireNonNull(datastoreId, "expected parameter 'datastoreId' to be non-null");
    }

    private GetFHIRDatastoreArgs() {
        this.datastoreId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFHIRDatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datastoreId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFHIRDatastoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
        }

        public Builder datastoreId(String datastoreId) {
            this.datastoreId = Objects.requireNonNull(datastoreId);
            return this;
        }
        public GetFHIRDatastoreArgs build() {
            return new GetFHIRDatastoreArgs(datastoreId);
        }
    }
}
