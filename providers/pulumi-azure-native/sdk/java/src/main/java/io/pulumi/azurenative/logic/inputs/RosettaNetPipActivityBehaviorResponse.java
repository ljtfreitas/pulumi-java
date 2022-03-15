// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The integration account RosettaNet ProcessConfiguration activity behavior.
 * 
 */
public final class RosettaNetPipActivityBehaviorResponse extends io.pulumi.resources.InvokeArgs {

    public static final RosettaNetPipActivityBehaviorResponse Empty = new RosettaNetPipActivityBehaviorResponse();

    /**
     * The value indicating whether the RosettaNet PIP is used for a single action.
     * 
     */
    @Import(name="actionType", required=true)
      private final String actionType;

    public String getActionType() {
        return this.actionType;
    }

    /**
     * The value indicating whether authorization is required.
     * 
     */
    @Import(name="isAuthorizationRequired", required=true)
      private final Boolean isAuthorizationRequired;

    public Boolean getIsAuthorizationRequired() {
        return this.isAuthorizationRequired;
    }

    /**
     * The value indicating whether secured transport is required.
     * 
     */
    @Import(name="isSecuredTransportRequired", required=true)
      private final Boolean isSecuredTransportRequired;

    public Boolean getIsSecuredTransportRequired() {
        return this.isSecuredTransportRequired;
    }

    /**
     * The value indicating whether non-repudiation is for origin and content.
     * 
     */
    @Import(name="nonRepudiationOfOriginAndContent", required=true)
      private final Boolean nonRepudiationOfOriginAndContent;

    public Boolean getNonRepudiationOfOriginAndContent() {
        return this.nonRepudiationOfOriginAndContent;
    }

    /**
     * The persistent confidentiality encryption scope.
     * 
     */
    @Import(name="persistentConfidentialityScope", required=true)
      private final String persistentConfidentialityScope;

    public String getPersistentConfidentialityScope() {
        return this.persistentConfidentialityScope;
    }

    /**
     * The value indicating whether the RosettaNet PIP communication is synchronous.
     * 
     */
    @Import(name="responseType", required=true)
      private final String responseType;

    public String getResponseType() {
        return this.responseType;
    }

    /**
     * The value indicating retry count.
     * 
     */
    @Import(name="retryCount", required=true)
      private final Integer retryCount;

    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * The time to perform in seconds.
     * 
     */
    @Import(name="timeToPerformInSeconds", required=true)
      private final Integer timeToPerformInSeconds;

    public Integer getTimeToPerformInSeconds() {
        return this.timeToPerformInSeconds;
    }

    public RosettaNetPipActivityBehaviorResponse(
        String actionType,
        Boolean isAuthorizationRequired,
        Boolean isSecuredTransportRequired,
        Boolean nonRepudiationOfOriginAndContent,
        String persistentConfidentialityScope,
        String responseType,
        Integer retryCount,
        Integer timeToPerformInSeconds) {
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.isAuthorizationRequired = Objects.requireNonNull(isAuthorizationRequired, "expected parameter 'isAuthorizationRequired' to be non-null");
        this.isSecuredTransportRequired = Objects.requireNonNull(isSecuredTransportRequired, "expected parameter 'isSecuredTransportRequired' to be non-null");
        this.nonRepudiationOfOriginAndContent = Objects.requireNonNull(nonRepudiationOfOriginAndContent, "expected parameter 'nonRepudiationOfOriginAndContent' to be non-null");
        this.persistentConfidentialityScope = Objects.requireNonNull(persistentConfidentialityScope, "expected parameter 'persistentConfidentialityScope' to be non-null");
        this.responseType = Objects.requireNonNull(responseType, "expected parameter 'responseType' to be non-null");
        this.retryCount = Objects.requireNonNull(retryCount, "expected parameter 'retryCount' to be non-null");
        this.timeToPerformInSeconds = Objects.requireNonNull(timeToPerformInSeconds, "expected parameter 'timeToPerformInSeconds' to be non-null");
    }

    private RosettaNetPipActivityBehaviorResponse() {
        this.actionType = null;
        this.isAuthorizationRequired = null;
        this.isSecuredTransportRequired = null;
        this.nonRepudiationOfOriginAndContent = null;
        this.persistentConfidentialityScope = null;
        this.responseType = null;
        this.retryCount = null;
        this.timeToPerformInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipActivityBehaviorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private Boolean isAuthorizationRequired;
        private Boolean isSecuredTransportRequired;
        private Boolean nonRepudiationOfOriginAndContent;
        private String persistentConfidentialityScope;
        private String responseType;
        private Integer retryCount;
        private Integer timeToPerformInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipActivityBehaviorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.isAuthorizationRequired = defaults.isAuthorizationRequired;
    	      this.isSecuredTransportRequired = defaults.isSecuredTransportRequired;
    	      this.nonRepudiationOfOriginAndContent = defaults.nonRepudiationOfOriginAndContent;
    	      this.persistentConfidentialityScope = defaults.persistentConfidentialityScope;
    	      this.responseType = defaults.responseType;
    	      this.retryCount = defaults.retryCount;
    	      this.timeToPerformInSeconds = defaults.timeToPerformInSeconds;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder isAuthorizationRequired(Boolean isAuthorizationRequired) {
            this.isAuthorizationRequired = Objects.requireNonNull(isAuthorizationRequired);
            return this;
        }

        public Builder isSecuredTransportRequired(Boolean isSecuredTransportRequired) {
            this.isSecuredTransportRequired = Objects.requireNonNull(isSecuredTransportRequired);
            return this;
        }

        public Builder nonRepudiationOfOriginAndContent(Boolean nonRepudiationOfOriginAndContent) {
            this.nonRepudiationOfOriginAndContent = Objects.requireNonNull(nonRepudiationOfOriginAndContent);
            return this;
        }

        public Builder persistentConfidentialityScope(String persistentConfidentialityScope) {
            this.persistentConfidentialityScope = Objects.requireNonNull(persistentConfidentialityScope);
            return this;
        }

        public Builder responseType(String responseType) {
            this.responseType = Objects.requireNonNull(responseType);
            return this;
        }

        public Builder retryCount(Integer retryCount) {
            this.retryCount = Objects.requireNonNull(retryCount);
            return this;
        }

        public Builder timeToPerformInSeconds(Integer timeToPerformInSeconds) {
            this.timeToPerformInSeconds = Objects.requireNonNull(timeToPerformInSeconds);
            return this;
        }
        public RosettaNetPipActivityBehaviorResponse build() {
            return new RosettaNetPipActivityBehaviorResponse(actionType, isAuthorizationRequired, isSecuredTransportRequired, nonRepudiationOfOriginAndContent, persistentConfidentialityScope, responseType, retryCount, timeToPerformInSeconds);
        }
    }
}
