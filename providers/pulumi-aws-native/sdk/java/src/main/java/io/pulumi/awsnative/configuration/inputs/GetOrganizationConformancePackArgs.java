// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationConformancePackArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationConformancePackArgs Empty = new GetOrganizationConformancePackArgs();

    /**
     * The name of the organization conformance pack.
     * 
     */
    @Import(name="organizationConformancePackName", required=true)
      private final String organizationConformancePackName;

    public String getOrganizationConformancePackName() {
        return this.organizationConformancePackName;
    }

    public GetOrganizationConformancePackArgs(String organizationConformancePackName) {
        this.organizationConformancePackName = Objects.requireNonNull(organizationConformancePackName, "expected parameter 'organizationConformancePackName' to be non-null");
    }

    private GetOrganizationConformancePackArgs() {
        this.organizationConformancePackName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationConformancePackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String organizationConformancePackName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationConformancePackArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationConformancePackName = defaults.organizationConformancePackName;
        }

        public Builder organizationConformancePackName(String organizationConformancePackName) {
            this.organizationConformancePackName = Objects.requireNonNull(organizationConformancePackName);
            return this;
        }
        public GetOrganizationConformancePackArgs build() {
            return new GetOrganizationConformancePackArgs(organizationConformancePackName);
        }
    }
}
