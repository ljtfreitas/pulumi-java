// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceConnectionStateResponse {
    /**
     * The actions required for private link service connection.
     * 
     */
    private final String actionsRequired;
    /**
     * The private link service connection description.
     * 
     */
    private final @Nullable String description;
    /**
     * The private link service connection status.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"actionsRequired","description","status"})
    private PrivateLinkServiceConnectionStateResponse(
        String actionsRequired,
        @Nullable String description,
        @Nullable String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired);
        this.description = description;
        this.status = status;
    }

    /**
     * The actions required for private link service connection.
     * 
     */
    public String getActionsRequired() {
        return this.actionsRequired;
    }
    /**
     * The private link service connection description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The private link service connection status.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
