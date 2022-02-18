// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListRemediationDeploymentsAtResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListRemediationDeploymentsAtResourceArgs Empty = new ListRemediationDeploymentsAtResourceArgs();

    /**
     * The name of the remediation.
     * 
     */
    @InputImport(name="remediationName", required=true)
    private final String remediationName;

    public String getRemediationName() {
        return this.remediationName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Maximum number of records to return.
     * 
     */
    @InputImport(name="top")
    private final @Nullable Integer top;

    public Optional<Integer> getTop() {
        return this.top == null ? Optional.empty() : Optional.ofNullable(this.top);
    }

    public ListRemediationDeploymentsAtResourceArgs(
        String remediationName,
        String resourceId,
        @Nullable Integer top) {
        this.remediationName = Objects.requireNonNull(remediationName, "expected parameter 'remediationName' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.top = top;
    }

    private ListRemediationDeploymentsAtResourceArgs() {
        this.remediationName = null;
        this.resourceId = null;
        this.top = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRemediationDeploymentsAtResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String remediationName;
        private String resourceId;
        private @Nullable Integer top;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRemediationDeploymentsAtResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.remediationName = defaults.remediationName;
    	      this.resourceId = defaults.resourceId;
    	      this.top = defaults.top;
        }

        public Builder setRemediationName(String remediationName) {
            this.remediationName = Objects.requireNonNull(remediationName);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setTop(@Nullable Integer top) {
            this.top = top;
            return this;
        }

        public ListRemediationDeploymentsAtResourceArgs build() {
            return new ListRemediationDeploymentsAtResourceArgs(remediationName, resourceId, top);
        }
    }
}
