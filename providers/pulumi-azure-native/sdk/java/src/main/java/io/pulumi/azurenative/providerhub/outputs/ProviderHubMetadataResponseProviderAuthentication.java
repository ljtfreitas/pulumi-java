// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ProviderHubMetadataResponseProviderAuthentication {
    private final List<String> allowedAudiences;

    @OutputCustomType.Constructor({"allowedAudiences"})
    private ProviderHubMetadataResponseProviderAuthentication(List<String> allowedAudiences) {
        this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
    }

    public List<String> getAllowedAudiences() {
        return this.allowedAudiences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderHubMetadataResponseProviderAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderHubMetadataResponseProviderAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
        }

        public Builder setAllowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }

        public ProviderHubMetadataResponseProviderAuthentication build() {
            return new ProviderHubMetadataResponseProviderAuthentication(allowedAudiences);
        }
    }
}
