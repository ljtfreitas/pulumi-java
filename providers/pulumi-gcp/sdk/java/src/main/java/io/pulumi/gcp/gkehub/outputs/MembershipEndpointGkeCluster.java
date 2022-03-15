// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MembershipEndpointGkeCluster {
    private final String resourceLink;

    @CustomType.Constructor
    private MembershipEndpointGkeCluster(@CustomType.Parameter("resourceLink") String resourceLink) {
        this.resourceLink = resourceLink;
    }

    public String getResourceLink() {
        return this.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointGkeCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointGkeCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }
        public MembershipEndpointGkeCluster build() {
            return new MembershipEndpointGkeCluster(resourceLink);
        }
    }
}
