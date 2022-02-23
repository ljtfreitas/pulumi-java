// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkteamMemberDefinitionCognitoMemberDefinition {
    /**
     * An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * 
     */
    private final String clientId;
    /**
     * An identifier for a user group.
     * 
     */
    private final String userGroup;
    /**
     * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
     * 
     */
    private final String userPool;

    @OutputCustomType.Constructor({"clientId","userGroup","userPool"})
    private WorkteamMemberDefinitionCognitoMemberDefinition(
        String clientId,
        String userGroup,
        String userPool) {
        this.clientId = Objects.requireNonNull(clientId);
        this.userGroup = Objects.requireNonNull(userGroup);
        this.userPool = Objects.requireNonNull(userPool);
    }

    /**
     * An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * 
     */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * An identifier for a user group.
     * 
     */
    public String getUserGroup() {
        return this.userGroup;
    }
    /**
     * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
     * 
     */
    public String getUserPool() {
        return this.userPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamMemberDefinitionCognitoMemberDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String userGroup;
        private String userPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamMemberDefinitionCognitoMemberDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.userGroup = defaults.userGroup;
    	      this.userPool = defaults.userPool;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setUserGroup(String userGroup) {
            this.userGroup = Objects.requireNonNull(userGroup);
            return this;
        }

        public Builder setUserPool(String userPool) {
            this.userPool = Objects.requireNonNull(userPool);
            return this;
        }
        public WorkteamMemberDefinitionCognitoMemberDefinition build() {
            return new WorkteamMemberDefinitionCognitoMemberDefinition(clientId, userGroup, userPool);
        }
    }
}
