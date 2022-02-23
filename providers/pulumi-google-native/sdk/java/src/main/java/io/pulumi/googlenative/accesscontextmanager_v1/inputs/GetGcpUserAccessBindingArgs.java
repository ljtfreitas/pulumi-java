// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGcpUserAccessBindingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGcpUserAccessBindingArgs Empty = new GetGcpUserAccessBindingArgs();

    @InputImport(name="gcpUserAccessBindingId", required=true)
      private final String gcpUserAccessBindingId;

    public String getGcpUserAccessBindingId() {
        return this.gcpUserAccessBindingId;
    }

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetGcpUserAccessBindingArgs(
        String gcpUserAccessBindingId,
        String organizationId) {
        this.gcpUserAccessBindingId = Objects.requireNonNull(gcpUserAccessBindingId, "expected parameter 'gcpUserAccessBindingId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetGcpUserAccessBindingArgs() {
        this.gcpUserAccessBindingId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGcpUserAccessBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcpUserAccessBindingId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGcpUserAccessBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpUserAccessBindingId = defaults.gcpUserAccessBindingId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setGcpUserAccessBindingId(String gcpUserAccessBindingId) {
            this.gcpUserAccessBindingId = Objects.requireNonNull(gcpUserAccessBindingId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetGcpUserAccessBindingArgs build() {
            return new GetGcpUserAccessBindingArgs(gcpUserAccessBindingId, organizationId);
        }
    }
}
