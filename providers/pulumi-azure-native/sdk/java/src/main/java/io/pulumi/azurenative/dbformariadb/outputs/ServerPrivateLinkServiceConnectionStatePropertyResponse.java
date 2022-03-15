// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServerPrivateLinkServiceConnectionStatePropertyResponse {
    /**
     * The actions required for private link service connection.
     * 
     */
    private final String actionsRequired;
    /**
     * The private link service connection description.
     * 
     */
    private final String description;
    /**
     * The private link service connection status.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private ServerPrivateLinkServiceConnectionStatePropertyResponse(
        @CustomType.Parameter("actionsRequired") String actionsRequired,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("status") String status) {
        this.actionsRequired = actionsRequired;
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
    public String getDescription() {
        return this.description;
    }
    /**
     * The private link service connection status.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPrivateLinkServiceConnectionStatePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPrivateLinkServiceConnectionStatePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ServerPrivateLinkServiceConnectionStatePropertyResponse build() {
            return new ServerPrivateLinkServiceConnectionStatePropertyResponse(actionsRequired, description, status);
        }
    }
}
