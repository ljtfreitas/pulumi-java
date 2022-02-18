// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The mapping content.
 * 
 */
public final class IotMappingPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IotMappingPropertiesResponse Empty = new IotMappingPropertiesResponse();

    /**
     * The mapping.
     * 
     */
    @InputImport(name="content")
    private final @Nullable Object content;

    public Optional<Object> getContent() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    public IotMappingPropertiesResponse(@Nullable Object content) {
        this.content = content;
    }

    private IotMappingPropertiesResponse() {
        this.content = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotMappingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object content;

        public Builder() {
    	      // Empty
        }

        public Builder(IotMappingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(@Nullable Object content) {
            this.content = content;
            return this;
        }

        public IotMappingPropertiesResponse build() {
            return new IotMappingPropertiesResponse(content);
        }
    }
}
