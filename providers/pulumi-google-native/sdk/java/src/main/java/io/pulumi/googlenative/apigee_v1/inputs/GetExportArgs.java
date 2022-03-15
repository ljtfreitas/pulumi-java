// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExportArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExportArgs Empty = new GetExportArgs();

    @Import(name="environmentId", required=true)
      private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @Import(name="exportId", required=true)
      private final String exportId;

    public String getExportId() {
        return this.exportId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetExportArgs(
        String environmentId,
        String exportId,
        String organizationId) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.exportId = Objects.requireNonNull(exportId, "expected parameter 'exportId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetExportArgs() {
        this.environmentId = null;
        this.exportId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentId;
        private String exportId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.exportId = defaults.exportId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder exportId(String exportId) {
            this.exportId = Objects.requireNonNull(exportId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetExportArgs build() {
            return new GetExportArgs(environmentId, exportId, organizationId);
        }
    }
}
