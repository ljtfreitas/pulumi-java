// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions Empty = new ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions();

    @InputImport(name="optInHeaders")
        private final @Nullable String optInHeaders;

    public Optional<String> getOptInHeaders() {
        return this.optInHeaders == null ? Optional.empty() : Optional.ofNullable(this.optInHeaders);
    }

    public ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions(@Nullable String optInHeaders) {
        this.optInHeaders = optInHeaders;
    }

    private ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions() {
        this.optInHeaders = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optInHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optInHeaders = defaults.optInHeaders;
        }

        public Builder setOptInHeaders(@Nullable String optInHeaders) {
            this.optInHeaders = optInHeaders;
            return this;
        }
        public ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions build() {
            return new ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions(optInHeaders);
        }
    }
}
