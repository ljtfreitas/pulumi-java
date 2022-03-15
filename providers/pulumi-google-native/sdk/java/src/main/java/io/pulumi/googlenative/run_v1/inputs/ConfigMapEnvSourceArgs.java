// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run ConfigMapEnvSource selects a ConfigMap to populate the environment variables with. The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
 * 
 */
public final class ConfigMapEnvSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigMapEnvSourceArgs Empty = new ConfigMapEnvSourceArgs();

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    @Import(name="localObjectReference")
      private final @Nullable Output<LocalObjectReferenceArgs> localObjectReference;

    public Output<LocalObjectReferenceArgs> getLocalObjectReference() {
        return this.localObjectReference == null ? Output.empty() : this.localObjectReference;
    }

    /**
     * The ConfigMap to select from.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * (Optional) Specify whether the ConfigMap must be defined
     * 
     */
    @Import(name="optional")
      private final @Nullable Output<Boolean> optional;

    public Output<Boolean> getOptional() {
        return this.optional == null ? Output.empty() : this.optional;
    }

    public ConfigMapEnvSourceArgs(
        @Nullable Output<LocalObjectReferenceArgs> localObjectReference,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> optional) {
        this.localObjectReference = localObjectReference;
        this.name = name;
        this.optional = optional;
    }

    private ConfigMapEnvSourceArgs() {
        this.localObjectReference = Output.empty();
        this.name = Output.empty();
        this.optional = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapEnvSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LocalObjectReferenceArgs> localObjectReference;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapEnvSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder localObjectReference(@Nullable Output<LocalObjectReferenceArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }

        public Builder localObjectReference(@Nullable LocalObjectReferenceArgs localObjectReference) {
            this.localObjectReference = Output.ofNullable(localObjectReference);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder optional(@Nullable Output<Boolean> optional) {
            this.optional = optional;
            return this;
        }

        public Builder optional(@Nullable Boolean optional) {
            this.optional = Output.ofNullable(optional);
            return this;
        }
        public ConfigMapEnvSourceArgs build() {
            return new ConfigMapEnvSourceArgs(localObjectReference, name, optional);
        }
    }
}
