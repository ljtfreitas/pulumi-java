// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs;
import io.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionOidcMemberDefinitionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkteamMemberDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkteamMemberDefinitionGetArgs Empty = new WorkteamMemberDefinitionGetArgs();

    /**
     * The Amazon Cognito user group that is part of the work team. See Cognito Member Definition details below.
     * 
     */
    @InputImport(name="cognitoMemberDefinition")
    private final @Nullable Input<WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs> cognitoMemberDefinition;

    public Input<WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs> getCognitoMemberDefinition() {
        return this.cognitoMemberDefinition == null ? Input.empty() : this.cognitoMemberDefinition;
    }

    /**
     * A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a single private work team. See Cognito Member Definition details below.
     * 
     */
    @InputImport(name="oidcMemberDefinition")
    private final @Nullable Input<WorkteamMemberDefinitionOidcMemberDefinitionGetArgs> oidcMemberDefinition;

    public Input<WorkteamMemberDefinitionOidcMemberDefinitionGetArgs> getOidcMemberDefinition() {
        return this.oidcMemberDefinition == null ? Input.empty() : this.oidcMemberDefinition;
    }

    public WorkteamMemberDefinitionGetArgs(
        @Nullable Input<WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs> cognitoMemberDefinition,
        @Nullable Input<WorkteamMemberDefinitionOidcMemberDefinitionGetArgs> oidcMemberDefinition) {
        this.cognitoMemberDefinition = cognitoMemberDefinition;
        this.oidcMemberDefinition = oidcMemberDefinition;
    }

    private WorkteamMemberDefinitionGetArgs() {
        this.cognitoMemberDefinition = Input.empty();
        this.oidcMemberDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamMemberDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs> cognitoMemberDefinition;
        private @Nullable Input<WorkteamMemberDefinitionOidcMemberDefinitionGetArgs> oidcMemberDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamMemberDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cognitoMemberDefinition = defaults.cognitoMemberDefinition;
    	      this.oidcMemberDefinition = defaults.oidcMemberDefinition;
        }

        public Builder setCognitoMemberDefinition(@Nullable Input<WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs> cognitoMemberDefinition) {
            this.cognitoMemberDefinition = cognitoMemberDefinition;
            return this;
        }

        public Builder setCognitoMemberDefinition(@Nullable WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs cognitoMemberDefinition) {
            this.cognitoMemberDefinition = Input.ofNullable(cognitoMemberDefinition);
            return this;
        }

        public Builder setOidcMemberDefinition(@Nullable Input<WorkteamMemberDefinitionOidcMemberDefinitionGetArgs> oidcMemberDefinition) {
            this.oidcMemberDefinition = oidcMemberDefinition;
            return this;
        }

        public Builder setOidcMemberDefinition(@Nullable WorkteamMemberDefinitionOidcMemberDefinitionGetArgs oidcMemberDefinition) {
            this.oidcMemberDefinition = Input.ofNullable(oidcMemberDefinition);
            return this;
        }
        public WorkteamMemberDefinitionGetArgs build() {
            return new WorkteamMemberDefinitionGetArgs(cognitoMemberDefinition, oidcMemberDefinition);
        }
    }
}
