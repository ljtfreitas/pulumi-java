// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.LocalObjectReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Not supported by Cloud Run Selects a key from a ConfigMap.
 * 
 */
public final class ConfigMapKeySelectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigMapKeySelectorResponse Empty = new ConfigMapKeySelectorResponse();

    /**
     * The key to select.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    @Import(name="localObjectReference", required=true)
      private final LocalObjectReferenceResponse localObjectReference;

    public LocalObjectReferenceResponse getLocalObjectReference() {
        return this.localObjectReference;
    }

    /**
     * The ConfigMap to select from.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * (Optional) Specify whether the ConfigMap or its key must be defined
     * 
     */
    @Import(name="optional", required=true)
      private final Boolean optional;

    public Boolean getOptional() {
        return this.optional;
    }

    public ConfigMapKeySelectorResponse(
        String key,
        LocalObjectReferenceResponse localObjectReference,
        String name,
        Boolean optional) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.localObjectReference = Objects.requireNonNull(localObjectReference, "expected parameter 'localObjectReference' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.optional = Objects.requireNonNull(optional, "expected parameter 'optional' to be non-null");
    }

    private ConfigMapKeySelectorResponse() {
        this.key = null;
        this.localObjectReference = null;
        this.name = null;
        this.optional = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapKeySelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private LocalObjectReferenceResponse localObjectReference;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapKeySelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder localObjectReference(LocalObjectReferenceResponse localObjectReference) {
            this.localObjectReference = Objects.requireNonNull(localObjectReference);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder optional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }
        public ConfigMapKeySelectorResponse build() {
            return new ConfigMapKeySelectorResponse(key, localObjectReference, name, optional);
        }
    }
}
