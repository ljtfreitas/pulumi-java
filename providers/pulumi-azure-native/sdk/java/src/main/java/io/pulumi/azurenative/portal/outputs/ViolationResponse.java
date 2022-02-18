// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ViolationResponse {
    /**
     * Error message.
     * 
     */
    private final String errorMessage;
    /**
     * Id of the item that violates tenant configuration.
     * 
     */
    private final String id;
    /**
     * Id of the user who owns violated item.
     * 
     */
    private final String userId;

    @OutputCustomType.Constructor({"errorMessage","id","userId"})
    private ViolationResponse(
        String errorMessage,
        String id,
        String userId) {
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.id = Objects.requireNonNull(id);
        this.userId = Objects.requireNonNull(userId);
    }

    /**
     * Error message.
     * 
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Id of the item that violates tenant configuration.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Id of the user who owns violated item.
     * 
     */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViolationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorMessage;
        private String id;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ViolationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.id = defaults.id;
    	      this.userId = defaults.userId;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public ViolationResponse build() {
            return new ViolationResponse(errorMessage, id, userId);
        }
    }
}
