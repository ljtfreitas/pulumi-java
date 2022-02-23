// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataCollectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataCollectorArgs Empty = new GetDataCollectorArgs();

    @InputImport(name="datacollectorId", required=true)
      private final String datacollectorId;

    public String getDatacollectorId() {
        return this.datacollectorId;
    }

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetDataCollectorArgs(
        String datacollectorId,
        String organizationId) {
        this.datacollectorId = Objects.requireNonNull(datacollectorId, "expected parameter 'datacollectorId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetDataCollectorArgs() {
        this.datacollectorId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datacollectorId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacollectorId = defaults.datacollectorId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setDatacollectorId(String datacollectorId) {
            this.datacollectorId = Objects.requireNonNull(datacollectorId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetDataCollectorArgs build() {
            return new GetDataCollectorArgs(datacollectorId, organizationId);
        }
    }
}
