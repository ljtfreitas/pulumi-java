// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LBBackendAddressPoolResourceSettingsResponse {
    /**
     * Gets or sets the backend address pool name.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"name"})
    private LBBackendAddressPoolResourceSettingsResponse(@Nullable String name) {
        this.name = name;
    }

    /**
     * Gets or sets the backend address pool name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LBBackendAddressPoolResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(LBBackendAddressPoolResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public LBBackendAddressPoolResourceSettingsResponse build() {
            return new LBBackendAddressPoolResourceSettingsResponse(name);
        }
    }
}
