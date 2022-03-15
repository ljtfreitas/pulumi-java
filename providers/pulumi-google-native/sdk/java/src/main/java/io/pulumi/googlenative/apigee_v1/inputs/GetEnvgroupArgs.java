// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvgroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvgroupArgs Empty = new GetEnvgroupArgs();

    @Import(name="envgroupId", required=true)
      private final String envgroupId;

    public String getEnvgroupId() {
        return this.envgroupId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetEnvgroupArgs(
        String envgroupId,
        String organizationId) {
        this.envgroupId = Objects.requireNonNull(envgroupId, "expected parameter 'envgroupId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetEnvgroupArgs() {
        this.envgroupId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvgroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String envgroupId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvgroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envgroupId = defaults.envgroupId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder envgroupId(String envgroupId) {
            this.envgroupId = Objects.requireNonNull(envgroupId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetEnvgroupArgs build() {
            return new GetEnvgroupArgs(envgroupId, organizationId);
        }
    }
}
