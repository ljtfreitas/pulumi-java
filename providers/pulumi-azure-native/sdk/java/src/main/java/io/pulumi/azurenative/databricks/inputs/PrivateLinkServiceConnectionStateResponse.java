// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The current state of a private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    /**
     * Actions required for a private endpoint connection
     * 
     */
    @InputImport(name="actionRequired")
    private final @Nullable String actionRequired;

    public Optional<String> getActionRequired() {
        return this.actionRequired == null ? Optional.empty() : Optional.ofNullable(this.actionRequired);
    }

    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The status of a private endpoint connection
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionStateResponse(
        @Nullable String actionRequired,
        @Nullable String description,
        String status) {
        this.actionRequired = actionRequired;
        this.description = description;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PrivateLinkServiceConnectionStateResponse() {
        this.actionRequired = null;
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
        private @Nullable String actionRequired;
        private @Nullable String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRequired = defaults.actionRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionRequired(@Nullable String actionRequired) {
            this.actionRequired = actionRequired;
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
            return new PrivateLinkServiceConnectionStateResponse(actionRequired, description, status);
        }
    }
}
