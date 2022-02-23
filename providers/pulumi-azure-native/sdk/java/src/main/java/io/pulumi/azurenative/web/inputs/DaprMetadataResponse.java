// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App Dapr component metadata.
 * 
 */
public final class DaprMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final DaprMetadataResponse Empty = new DaprMetadataResponse();

    /**
     * Metadata property name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Name of the Container App secret from which to pull the metadata property value.
     * 
     */
    @InputImport(name="secretRef")
        private final @Nullable String secretRef;

    public Optional<String> getSecretRef() {
        return this.secretRef == null ? Optional.empty() : Optional.ofNullable(this.secretRef);
    }

    /**
     * Metadata property value.
     * 
     */
    @InputImport(name="value")
        private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public DaprMetadataResponse(
        @Nullable String name,
        @Nullable String secretRef,
        @Nullable String value) {
        this.name = name;
        this.secretRef = secretRef;
        this.value = value;
    }

    private DaprMetadataResponse() {
        this.name = null;
        this.secretRef = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String secretRef;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DaprMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secretRef = defaults.secretRef;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSecretRef(@Nullable String secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public DaprMetadataResponse build() {
            return new DaprMetadataResponse(name, secretRef, value);
        }
    }
}
