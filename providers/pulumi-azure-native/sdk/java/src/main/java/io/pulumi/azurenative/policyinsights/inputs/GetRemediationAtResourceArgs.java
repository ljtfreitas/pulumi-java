// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRemediationAtResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRemediationAtResourceArgs Empty = new GetRemediationAtResourceArgs();

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName", required=true)
      private final String remediationName;

    public String getRemediationName() {
        return this.remediationName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    public GetRemediationAtResourceArgs(
        String remediationName,
        String resourceId) {
        this.remediationName = Objects.requireNonNull(remediationName, "expected parameter 'remediationName' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private GetRemediationAtResourceArgs() {
        this.remediationName = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRemediationAtResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String remediationName;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRemediationAtResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.remediationName = defaults.remediationName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder remediationName(String remediationName) {
            this.remediationName = Objects.requireNonNull(remediationName);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public GetRemediationAtResourceArgs build() {
            return new GetRemediationAtResourceArgs(remediationName, resourceId);
        }
    }
}
