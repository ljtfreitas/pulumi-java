// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkedInfoResponse {
    /**
     * LinkedId id.
     * 
     */
    private final @Nullable String linkedId;
    /**
     * Linked resource name.
     * 
     */
    private final @Nullable String linkedResourceName;
    /**
     * Datastore origin
     * 
     */
    private final @Nullable String origin;

    @CustomType.Constructor
    private LinkedInfoResponse(
        @CustomType.Parameter("linkedId") @Nullable String linkedId,
        @CustomType.Parameter("linkedResourceName") @Nullable String linkedResourceName,
        @CustomType.Parameter("origin") @Nullable String origin) {
        this.linkedId = linkedId;
        this.linkedResourceName = linkedResourceName;
        this.origin = origin;
    }

    /**
     * LinkedId id.
     * 
    */
    public Optional<String> getLinkedId() {
        return Optional.ofNullable(this.linkedId);
    }
    /**
     * Linked resource name.
     * 
    */
    public Optional<String> getLinkedResourceName() {
        return Optional.ofNullable(this.linkedResourceName);
    }
    /**
     * Datastore origin
     * 
    */
    public Optional<String> getOrigin() {
        return Optional.ofNullable(this.origin);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkedId;
        private @Nullable String linkedResourceName;
        private @Nullable String origin;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedId = defaults.linkedId;
    	      this.linkedResourceName = defaults.linkedResourceName;
    	      this.origin = defaults.origin;
        }

        public Builder linkedId(@Nullable String linkedId) {
            this.linkedId = linkedId;
            return this;
        }

        public Builder linkedResourceName(@Nullable String linkedResourceName) {
            this.linkedResourceName = linkedResourceName;
            return this;
        }

        public Builder origin(@Nullable String origin) {
            this.origin = origin;
            return this;
        }
        public LinkedInfoResponse build() {
            return new LinkedInfoResponse(linkedId, linkedResourceName, origin);
        }
    }
}
