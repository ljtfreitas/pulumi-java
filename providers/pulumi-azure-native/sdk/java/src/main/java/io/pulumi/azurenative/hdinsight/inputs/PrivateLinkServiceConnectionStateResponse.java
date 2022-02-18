// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private link service connection state.
 * 
 */
public final class PrivateLinkServiceConnectionStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    /**
     * Whether there is further actions.
     * 
     */
    @InputImport(name="actionsRequired")
    private final @Nullable String actionsRequired;

    public Optional<String> getActionsRequired() {
        return this.actionsRequired == null ? Optional.empty() : Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The optional description of the status.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The concrete private link service connection.
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionStateResponse(
        @Nullable String actionsRequired,
        @Nullable String description,
        String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PrivateLinkServiceConnectionStateResponse() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
