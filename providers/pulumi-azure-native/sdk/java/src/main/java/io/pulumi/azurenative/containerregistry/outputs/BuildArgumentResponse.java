// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BuildArgumentResponse {
    /**
     * Flag to indicate whether the argument represents a secret and want to be removed from build logs.
     * 
     */
    private final @Nullable Boolean isSecret;
    /**
     * The name of the argument.
     * 
     */
    private final String name;
    /**
     * The type of the argument.
     * 
     */
    private final String type;
    /**
     * The value of the argument.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private BuildArgumentResponse(
        @CustomType.Parameter("isSecret") @Nullable Boolean isSecret,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.isSecret = isSecret;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * Flag to indicate whether the argument represents a secret and want to be removed from build logs.
     * 
    */
    public Optional<Boolean> getIsSecret() {
        return Optional.ofNullable(this.isSecret);
    }
    /**
     * The name of the argument.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of the argument.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The value of the argument.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSecret;
        private String name;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildArgumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSecret = defaults.isSecret;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder isSecret(@Nullable Boolean isSecret) {
            this.isSecret = isSecret;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public BuildArgumentResponse build() {
            return new BuildArgumentResponse(isSecret, name, type, value);
        }
    }
}
