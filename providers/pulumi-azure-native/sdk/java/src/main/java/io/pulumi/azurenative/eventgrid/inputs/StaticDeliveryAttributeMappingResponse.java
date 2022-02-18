// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Static delivery attribute mapping details.
 * 
 */
public final class StaticDeliveryAttributeMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final StaticDeliveryAttributeMappingResponse Empty = new StaticDeliveryAttributeMappingResponse();

    /**
     * Boolean flag to tell if the attribute contains sensitive information .
     * 
     */
    @InputImport(name="isSecret")
    private final @Nullable Boolean isSecret;

    public Optional<Boolean> getIsSecret() {
        return this.isSecret == null ? Optional.empty() : Optional.ofNullable(this.isSecret);
    }

    /**
     * Name of the delivery attribute or header.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Type of the delivery attribute or header name.
     * Expected value is 'Static'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Value of the delivery attribute.
     * 
     */
    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public StaticDeliveryAttributeMappingResponse(
        @Nullable Boolean isSecret,
        @Nullable String name,
        String type,
        @Nullable String value) {
        this.isSecret = isSecret == null ? false : isSecret;
        this.name = name;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = value;
    }

    private StaticDeliveryAttributeMappingResponse() {
        this.isSecret = null;
        this.name = null;
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticDeliveryAttributeMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSecret;
        private @Nullable String name;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticDeliveryAttributeMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSecret = defaults.isSecret;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setIsSecret(@Nullable Boolean isSecret) {
            this.isSecret = isSecret;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public StaticDeliveryAttributeMappingResponse build() {
            return new StaticDeliveryAttributeMappingResponse(isSecret, name, type, value);
        }
    }
}
