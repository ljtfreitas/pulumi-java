// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.extendedlocation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is optional input that contains the authentication that should be used to generate the namespace.
 * 
 */
public final class CustomLocationPropertiesResponseAuthentication extends io.pulumi.resources.InvokeArgs {

    public static final CustomLocationPropertiesResponseAuthentication Empty = new CustomLocationPropertiesResponseAuthentication();

    /**
     * The type of the Custom Locations authentication
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public CustomLocationPropertiesResponseAuthentication(@Nullable String type) {
        this.type = type;
    }

    private CustomLocationPropertiesResponseAuthentication() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLocationPropertiesResponseAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLocationPropertiesResponseAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public CustomLocationPropertiesResponseAuthentication build() {
            return new CustomLocationPropertiesResponseAuthentication(type);
        }
    }
}
