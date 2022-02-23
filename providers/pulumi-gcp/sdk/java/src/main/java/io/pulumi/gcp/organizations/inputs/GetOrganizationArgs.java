// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationArgs Empty = new GetOrganizationArgs();

    /**
     * The domain name of the Organization.
     * 
     */
    @InputImport(name="domain")
        private final @Nullable String domain;

    public Optional<String> getDomain() {
        return this.domain == null ? Optional.empty() : Optional.ofNullable(this.domain);
    }

    /**
     * The Organization's numeric ID, including an optional `organizations/` prefix.
     * 
     */
    @InputImport(name="organization")
        private final @Nullable String organization;

    public Optional<String> getOrganization() {
        return this.organization == null ? Optional.empty() : Optional.ofNullable(this.organization);
    }

    public GetOrganizationArgs(
        @Nullable String domain,
        @Nullable String organization) {
        this.domain = domain;
        this.organization = organization;
    }

    private GetOrganizationArgs() {
        this.domain = null;
        this.organization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String organization;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.organization = defaults.organization;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setOrganization(@Nullable String organization) {
            this.organization = organization;
            return this;
        }
        public GetOrganizationArgs build() {
            return new GetOrganizationArgs(domain, organization);
        }
    }
}
