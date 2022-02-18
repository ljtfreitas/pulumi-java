// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectionStatePropertiesResponse {
    /**
     * The actions required on the managed private endpoint
     * 
     */
    private final String actionsRequired;
    /**
     * The managed private endpoint description
     * 
     */
    private final String description;
    /**
     * The approval status
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"actionsRequired","description","status"})
    private ConnectionStatePropertiesResponse(
        String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired);
        this.description = Objects.requireNonNull(description);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * The actions required on the managed private endpoint
     * 
     */
    public String getActionsRequired() {
        return this.actionsRequired;
    }
    /**
     * The managed private endpoint description
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The approval status
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStatePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStatePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public ConnectionStatePropertiesResponse build() {
            return new ConnectionStatePropertiesResponse(actionsRequired, description, status);
        }
    }
}
