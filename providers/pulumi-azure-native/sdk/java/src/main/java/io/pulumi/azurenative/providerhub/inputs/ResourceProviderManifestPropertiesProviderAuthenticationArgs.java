// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResourceProviderManifestPropertiesProviderAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceProviderManifestPropertiesProviderAuthenticationArgs Empty = new ResourceProviderManifestPropertiesProviderAuthenticationArgs();

    @InputImport(name="allowedAudiences", required=true)
        private final Input<List<String>> allowedAudiences;

    public Input<List<String>> getAllowedAudiences() {
        return this.allowedAudiences;
    }

    public ResourceProviderManifestPropertiesProviderAuthenticationArgs(Input<List<String>> allowedAudiences) {
        this.allowedAudiences = Objects.requireNonNull(allowedAudiences, "expected parameter 'allowedAudiences' to be non-null");
    }

    private ResourceProviderManifestPropertiesProviderAuthenticationArgs() {
        this.allowedAudiences = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesProviderAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> allowedAudiences;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesProviderAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
        }

        public Builder setAllowedAudiences(Input<List<String>> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }

        public Builder setAllowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Input.of(Objects.requireNonNull(allowedAudiences));
            return this;
        }
        public ResourceProviderManifestPropertiesProviderAuthenticationArgs build() {
            return new ResourceProviderManifestPropertiesProviderAuthenticationArgs(allowedAudiences);
        }
    }
}
