// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1.outputs.LocalObjectReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecretEnvSourceResponse {
    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    private final LocalObjectReferenceResponse localObjectReference;
    /**
     * The Secret to select from.
     * 
     */
    private final String name;
    /**
     * (Optional) Specify whether the Secret must be defined
     * 
     */
    private final Boolean optional;

    @OutputCustomType.Constructor({"localObjectReference","name","optional"})
    private SecretEnvSourceResponse(
        LocalObjectReferenceResponse localObjectReference,
        String name,
        Boolean optional) {
        this.localObjectReference = Objects.requireNonNull(localObjectReference);
        this.name = Objects.requireNonNull(name);
        this.optional = Objects.requireNonNull(optional);
    }

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    public LocalObjectReferenceResponse getLocalObjectReference() {
        return this.localObjectReference;
    }
    /**
     * The Secret to select from.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) Specify whether the Secret must be defined
     * 
     */
    public Boolean getOptional() {
        return this.optional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretEnvSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalObjectReferenceResponse localObjectReference;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretEnvSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setLocalObjectReference(LocalObjectReferenceResponse localObjectReference) {
            this.localObjectReference = Objects.requireNonNull(localObjectReference);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }
        public SecretEnvSourceResponse build() {
            return new SecretEnvSourceResponse(localObjectReference, name, optional);
        }
    }
}
